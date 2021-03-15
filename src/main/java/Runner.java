import entity.Mineral;
import entity.gems.Diamond;
import entity.gems.Gem;
import entity.gems.Sapphire;
import entity.semiprecious.Amethyst;
import entity.semiprecious.SemipreciousStone;
import entity.semiprecious.Topaz;
import service.MineralService;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //Create minerals with definite weight in carat and necklace
        List<Mineral> necklace = new ArrayList<>();
        Mineral diamond = new Diamond(new Gem());
        Mineral sapphire = new Sapphire(new Gem());
        Mineral topaz = new Topaz(new SemipreciousStone());
        Mineral amethyst = new Amethyst(new SemipreciousStone());

        diamond.setCarat(2);
        sapphire.setCarat(4);
        topaz.setCarat(3);
        amethyst.setCarat(5);

        necklace.add(diamond);
        necklace.add(sapphire);
        necklace.add(topaz);
        necklace.add(amethyst);

        //Sorting minerals and calculating necklace cost
        MineralService mineralService=new MineralService();
        mineralService.sortMineral(necklace);
        double cost = mineralService.calculateCost(necklace);

        System.out.println(necklace);
        System.out.println(cost);

        //Write results in file
        try {
            try (FileWriter myWriter = new FileWriter("filename.txt")) {
                myWriter.write(String.valueOf(cost));
                myWriter.write(System.getProperty("line.separator"));
                myWriter.write(necklace.toString());
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

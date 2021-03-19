import java.io.File;
import java.util.*;

public class Main {
    private File currentDirectoryFile;
    private LinkedList<File> beforeDirectories = new LinkedList<>();

    public Main(String start) {
        currentDirectoryFile = new File(start);
        beforeDirectories.add(currentDirectoryFile);
    }

    class FileComparator implements Comparator<File> {
        public int compare(File one, File two) {
            String oneString = one.getName();
            String twoString = two.getName();
            return oneString.compareTo(twoString);
        }
    }

    private class TreeInfo {
        private List<File> files = new ArrayList<>();
        private List<File> dirs = new ArrayList<>();
    }

    private TreeInfo addAll() {
        // Save all the files and folders in the currentDirectoryFile directory and sort them in ascending order.
        TreeInfo tInfo = new TreeInfo();
        File[] allFiles = currentDirectoryFile.listFiles();
        Arrays.sort(allFiles, new FileComparator());
        for(File elem: allFiles) {
            if(elem.isFile())
                tInfo.files.add(elem);
            else
                tInfo.dirs.add(elem);
        }
        return tInfo;
    }

    private String filesPrint(File f) {
        String s = "";
        for(int i = 0; i < beforeDirectories.size(); i++) {
            int spaceLength;
            if (i == 0) {
                spaceLength = beforeDirectories.get(i).getAbsolutePath().length();
            } else {
                spaceLength = beforeDirectories.get(i).getName().length() + 2;
            }
            s = String.format(s + "%" + spaceLength + "s|", "");
        }
        s += "_ %s";
        return String.format(s, f.getName());
    }

    private void printTreeInfoInSingleDirectory() {
        TreeInfo tInfo = addAll();
        for(File f: tInfo.files) {
            System.out.println(filesPrint(f));
        }
        for(File d: tInfo.dirs) {
            System.out.println(filesPrint(d));
            beforeDirectories.addLast(d);
            currentDirectoryFile = d;
            printTreeInfoInSingleDirectory();
            beforeDirectories.removeLast();
        }
    }

    public void walk(){
        System.out.println(currentDirectoryFile.getAbsolutePath());
        printTreeInfoInSingleDirectory();

    }

    public static void main(String[] args) {
        Main t = new Main("C:\\web");
        try {
            t.walk();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

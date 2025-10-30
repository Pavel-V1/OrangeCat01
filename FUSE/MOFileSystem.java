package FUSE;

public class MOFileSystem {
    private final int sizeOfCluster = 2^9;
    private byte getNode(int i) {

        return 0;
    }

    public void createMOFile(String pathString) {
        byte path = getPathFromString(pathString);

    }

    public void createMOFDirectory(String pathString) {
        byte path = getPathFromString(pathString);
    }

    public byte readMOFile(String pathString) {
        byte path = getPathFromString(pathString);

        return 0;
    }

    public void updateMOFile(String pathString, data mdata) {
        byte path = getPathFromString(pathString);
        MLinkedList mlist = new MLinkedList();

    }

    public boolean deleteMOFile(String pathString) {
        byte path = getPathFromString(pathString);

        return false;
    }

    public boolean deleteMOFDirectory(String pathString) {
        byte path = getPathFromString(pathString);

        return false;
    }

    private byte getPathFromString(String pathString) {
        for (int i = 0; i < pathString.length(); i++) {
            char ch = pathString.charAt(i);

            if (ch == (char) 92) {

            }
        }
        byte path = 0;
        return path;
    }
}
// https://habr.com/ru/articles/260801/
// https://github.com/SerCeMan/jnr-fuse/tree/master

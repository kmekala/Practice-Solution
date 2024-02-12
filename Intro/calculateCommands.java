import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};

        int[] commandCounts = calculateCommands(fileNames);
        System.out.println("Command Counts: " + Arrays.toString(commandCounts));
    }

    public static int[] calculateCommands(String[] fileNames) {
        int[] commandCounts = new int[3]; // Index 0: cp count, Index 1: ls count, Index 2: mv count

        for (int i = 0; i < fileNames.length; i++) {
            // Run cp command
            cpCommand(fileNames[i]);
            commandCounts[0]++;

            // Run ls command
            lsCommand();
            commandCounts[1]++;

            // Run mv command
            mvCommand(fileNames[i]);
            commandCounts[2]++;
        }

        return commandCounts;
    }

    public static void cpCommand(String fileName) {
        // Perform cp command logic
        System.out.println("Copying file: " + fileName);
    }

    public static void lsCommand() {
        // Perform ls command logic
        System.out.println("Listing files...");
        // Print the files in the directory
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};
        System.out.println(Arrays.toString(files));
    }

    public static void mvCommand(String fileName) {
        // Perform mv command logic
        System.out.println("Moving file: " + fileName);
    }
}

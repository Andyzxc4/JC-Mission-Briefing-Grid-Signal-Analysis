package org.example;


import java.util.Arrays;

public class GridSignalAnalyzer {
    public static void main(String[] args) {

        // Mission Data: The Scrambled Communications Grid
        char[][] scrambledGrid = {
                {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
                {'A', 'L', 'P', 'H', 'A'},
                {'T', 'A', 'N', 'G', 'O', '7'},
                {'B', 'R', 'A', 'V', 'O'}
        };

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzeWithForLoop(scrambledGrid);

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzeWithForEachLoop(scrambledGrid);

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzeWithHybridLoop(scrambledGrid);

    }

    //  phase 2
    public static void analyzeWithForLoop(char[][] scrambleGrid) {
        for(int i = 0; i < scrambleGrid.length; i++) {
            for(int j = 0; j < scrambleGrid[i].length; j++) {
                System.out.print(scrambleGrid[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // phase 3
    public static void analyzeWithForEachLoop(char[][] scrambleGrid) {
        for (char[] rowArray : scrambleGrid) {
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char aChar : rowArray) {
                System.out.println("-> " + aChar);
            }
        }
    }

    // phase 4
    public static void analyzeWithHybridLoop(char[][] scrambleGrid) {
        for (char[] outerArr : scrambleGrid) {
            for(int i = 0; i < outerArr.length; i++) {
                System.out.print(outerArr[i] + " ");
            }
            System.out.println(" ");
        }
    }

}
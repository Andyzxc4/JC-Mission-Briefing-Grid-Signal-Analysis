package org.example;


public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    //  main method
    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();

    }

    //  phase 2
    public void analyzeWithForLoop() {
        for(int i = 0; i < this.scrambledGrid.length; i++) {
            for(int j = 0; j < this.scrambledGrid[i].length; j++) {
                System.out.print(this.scrambledGrid[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // phase 3
    public void analyzeWithForEachLoop() {
        for(char[] rowArray : this.scrambledGrid) {
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char aChar : rowArray) {
                System.out.println("-> " + aChar);
            }
        }
    }

    // phase 4
    public void analyzeWithHybridLoop() {
        for(char[] outerArr : this.scrambledGrid) {
            for(int i = 0; i < outerArr.length; i++) {
                System.out.print(outerArr[i] + " ");
            }
            System.out.println(" ");
        }
    }

}
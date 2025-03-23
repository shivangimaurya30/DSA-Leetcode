class Spreadsheet {
     private int[][] grid;

    public Spreadsheet(int rows) {
                grid = new int[rows][26]; 
    }
    
    public void setCell(String cell, int value) {
        int[] ind = getCellIndices(cell);
        grid[ind[0]][ind[1]] = value; 
    }
    
    public void resetCell(String cell) {
        int[] ind = getCellIndices(cell);
        grid[ind[0]][ind[1]] = 0;   
    }
    
    public int getValue(String formula) {
        if (!formula.startsWith("=")) {
            return Integer.parseInt(formula); 
    }
        String[] parts = formula.substring(1).split("\\+");
        int sum = 0;

        for (String part : parts) {
            sum += isNumeric(part) ? Integer.parseInt(part) : getCellValue(part);
        }

        return sum;
    }

    private int[] getCellIndices(String cell) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1; 
        return new int[]{row, col - 'A'};
    }

    private int getCellValue(String cell) {
        int[] ind = getCellIndices(cell);
        return grid[ind[0]][ind[1]];
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
}
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */

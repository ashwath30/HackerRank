public class Solution {
        /* These 2 arrays are used to get row and column numbers of 8 neighbours of a given cell.
        Suppose current cell number is matrix[2][3]
        So, we have to look into all the possible neighbors,
        matrix[2-1][3-1] // rowNbr[0] = -1 , colNbr[0] = -1 =>matrix[1][2]
        matrix[2-1][3-0] // rowNbr[1] = -1 , colNbr[1] = 0 =>matrix[1][3]
        matrix[2-1][3+1] // rowNbr[2] = -1 , colNbr[2] = 1 =>matrix[1][4]
        ...
        ...
        // For the 7th index,
        matrix[2+1][3+1] // rowNbr[7] = 1 , colNbr[7] = 1 =>matrix[3][4]*/
        
	static final int[] rowNbr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static final int[] colNbr = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();//get row
		int m = scanner.nextInt();//get col
        
		int[][] matrix = new int[n][m];
        
		for (int row = 0; row < matrix.length; row++) 
			for (int col = 0; col < matrix[0].length; col++) 
				matrix[row][col] = scanner.nextInt(); //get input matrix
			
		

		boolean[][] visited = new boolean[n][m];
		int maxRegion = 0; //initially maxRegion is 0
		for (int row = 0; row < matrix.length; row++) 
			for (int col = 0; col < matrix[0].length; col++) 
				if (!visited[row][col] && matrix[row][col] == 1) //if a 1 is not visited yet
					maxRegion = Math.max(maxRegion, countRegion(matrix, visited, row, col));
				
			
		
		System.out.println(maxRegion);

		scanner.close();
	}

	static int countRegion(int[][] matrix, boolean[][] visited, int r, int c) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		if (!(r >= 0 && r < rows && c >= 0 && c < cols) || !(matrix[r][c] == 1 && !visited[r][c])) //(if r and c are not within limits) or (if the position is not an unvisited 1)
			return 0;
		
        
		visited[r][c] = true; //mark the 1 as visited

		int region = 1; //include it in the region
        
		for (int i = 0; i < rowNbr.length; i++) 
			region += countRegion(matrix, visited, r + rowNbr[i], c + colNbr[i]); //check for all its 8 neighbours, recursively.
		
		return region;
	}
}
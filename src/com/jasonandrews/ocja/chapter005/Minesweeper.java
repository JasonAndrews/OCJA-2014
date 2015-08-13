public class Minesweeper {

	private boolean[][] mines;

	public static void main(String[] args) {

		Minesweeper ms = new Minesweeper();

		ms.createMines();

	}
	public void createMines() {
		
		this.mines = new boolean[15][15];
				
		int totalMinesToCreate = (mines.length * 2);

		int totalMinesCreated = 0;

		int first = 0;
		int second = 0;
		do {
			first = (int) (Math.random() * this.mines.length);
			second = (int) (Math.random() * this.mines.length);
			if(!mines[first][second]) {
				mines[first][second] = true;
				++totalMinesCreated;
			}

		} while(totalMinesCreated < totalMinesToCreate);

		int totalMinesCounted = 0;
		for(boolean[] rows : mines) {
			for(int i = 0; i < rows.length; ++i) {
				if(rows[i]) {
					System.out.println("A mine is here! Number : " + ++totalMinesCounted);
				}
			}
						

		}		

	}
}
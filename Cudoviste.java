public class Cudoviste{

	private int[] ans;
	private Truck truck;


	private int freeSpace(int lim){
		truck.reset();
		for(int i = 0; i< truck.mapSize[0]; i++){
			for(int j=0; j< truck.mapSize[1]; j++){
				if(truck.testSpace()<=lim) ans[lim] ++;
				truck.move();
			}
		}
	}


	public Cudoviste(char[][] matrix, int[] head){
		truck = new Truck(matrix, head);

		ans = new int[5];
		map = head;
		//calculate data
		for(int i=0; i< 5 ; i++) ans[i] = freeSpace(i+1);
	}

	public int[] getAns(){
		for(int i=0; i<5; i++) System.out.println(ans[i]);
	}


	int public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int[] head = new int[2];
		head[0] = io.getInt();
		head[1] = io.getInt();
		char[][] matrix = new char[head[0]][head[1]];

		for(int i=0; i< head[0] ; i++){
			for(int j=0; j < head[1]; j++){
				matrix[i][j] = io.getChar();
			}
		}

		Cudoviste controller = new Cudoviste(matrix, head);
		controller.getAns();


	}
}

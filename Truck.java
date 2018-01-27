public class Truck{

  private int[][] pos;
  private int[] mapSize;
  private char[][] map;

  public Truck (char[][] map, int[] mapSize){
    this.map = map;
    this.mapSize = mapSize;
    pos = new int[4][2];
  }

  public void move(){

  }

  public int testSpace(){

  }


  public void reset(){
    //starting position for truck in xy coords, for its 2x2 body
    //upper left
		pos[0][0] = 0;
    pos[0][1] = 0;

    //upper right
    pos[1][0] = 1;
    pos[1][1] = 0;

    //lower left
    pos[2][0] = 0;
    pos[2][1] = 1;

    //lower right
    pos[3][0] = 1;
    pos[3][1] = 1;

  }

}

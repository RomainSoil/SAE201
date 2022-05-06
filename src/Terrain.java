public class Terrain extends Secteur{

     private boolean occupe;

     public Terrain(int x, int y, boolean occupe) {
          super(x, y);
          this.occupe = occupe;
     }

     public Terrain(int x, int y) {
          super(x, y);
          this.occupe= false;
     }
}

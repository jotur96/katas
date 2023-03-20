public class BuildingBlocks {

    public static void main(String[] args) {


        Block b = new Block(new int[]{2,2,2});
        
        b.getWidth();
        b.getLength();
        b.getHeight();
        b.getVolume();
        b.getSurfaceArea();
        
    }


    public static class Block{
        // Good Luck!
      private int width;
      private int length;
      private int height;
      
      public Block(int[] props){
        this.width = props[0];
        this.length = props[1];
        this.height = props[2];
        for(int i = 0; i < props.length; i++){
          System.out.println(props[i]);
        }
      }
      
      public Block(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
      }
      
      public int getWidth(){
        return this.width;
      }
      
      public int getLength(){
        return this.length;
      }
      
      public int getHeight(){
        return this.height;
      }
      
      public int getVolume(){
        return this.width * this.length * this.height;
      }
      
      public int getSurfaceArea(){
        int result = ((2*(this.width * this.height)) + (2*(this.height * this.length)) + (2*(this.length * this.width))); 
        System.out.println(result);
        return result;
      }
    }
    
}

public class Rectangle{
    
    private  int length;
    private int width;
    
     public Rectangle(int length, int width){
            this.length=length;
            this.width=width;
     }
    
    public double getPerimeter(){
          return 2*(length * width);
    }
    public double getArea(){
            return length * width;
    }
    
    public static void main(String[] args){
          Rectangle rect=new Rectangle(20,50);
          
          System.out.println(rect.getPerimeter());
    }
}

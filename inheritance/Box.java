public class Box extends Rectangle{
    private int height;
    public Box(){
        super();
        height=0;
    }
    public Box(int l, int w, int h){
        super(l, w);
        height=h;
    }
    public void print(){
        super.print();
        System.out.println(" Height = "+ height);
    }
    public int area(){
        return 2*(super.area() + getlength()*height+ getwidth()*height);
    }
    public void setDimension(int l, int w, int h){
        super.setDimension(l , w);
        if(h>=0) height=h; else height=0;
        
    }

    public static void main(String[] args){
        Rectangle myRectangle= new Rectangle(5,4);
        Box myBox = new Box(5,6,6);

        System.out.println(myRectangle.area());

        myRectangle.print();
        System.out.println(myBox.area());
        myBox.print();
    }
}

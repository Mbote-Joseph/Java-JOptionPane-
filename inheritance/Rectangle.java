public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        length=0;
        width=0;
    }
    public Rectangle(int l, int w){
        setDimension(l,w);
    }
    public void print(){
        System.out.println("Width = "+ width+ "Length = "+length);
    }
    public void setDimension(int len, int wid){
        if(len>=0) length=len; else length=0;
        if(wid>=0) width=wid; else width=0;
    }
    public int area(){
        return length*width;
    }
    public int getlength(){
        return length;
    }
    public int getwidth(){
        return width;
    }
    
}

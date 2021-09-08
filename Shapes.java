class Shapes{
    static int area(int s){
        return s*s;
    }
    static int area(int l, int w){
        return l*w;
    }
    public static void main(String[] args){
        int areaSquare=area(4);
        int areaRect=area(2,6);
        System.out.println("Square = "+areaSquare);
        System.out.println("Rectangle = "+areaRect);
    }
}
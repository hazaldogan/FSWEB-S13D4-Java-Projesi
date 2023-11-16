package model;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
    }

    public double distance(Point p){
        if(p != null){
            return distance(p.x,p.y);
        }
        System.out.println("model.Point cant be null");
        return -1;
//       return Math.sqrt(Math.pow(getX()-p.x,2)+ Math.pow(getY()-p.y,2));
    }

    public double distance(int a,int b){
        return Math.sqrt(Math.pow(getX()-a,2)+Math.pow(getY()-b,2));
    }
}

package ss6_inheritance.bai_tap.point_and_movable_point;

public class Point {
    private float x=1.0f;
    private float y=1.0f;
    public Point(){}
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{getX(),getY()}   ;
    }

    @Override
    public String toString() {
        return "( "+ x +","+y+")";
    }
}

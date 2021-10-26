public class square extends Shape {

    float length;



    @Override
    public float getArea() {
        return length * length;

    }

    @Override
    public float getParameter() {
        return length*4;
    }
}

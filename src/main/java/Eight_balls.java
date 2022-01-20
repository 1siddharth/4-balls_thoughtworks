
import processing.core.PApplet;

public class Eight_balls extends PApplet
{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x1 =0 ,x2 =0 ,x3 =0,x4 =0;

    public static void main(String[] args) {
        PApplet.main("Eight_balls" ,args);

    }
    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
      //  ellipse(dmouseX,240,100,100);
    }

    @Override
    public void draw() {


        ellipse(x1,HEIGHT/5,10,10);
        x1+=1;
        ellipse(x2,2*HEIGHT/5,10,10);
        x2+=2;
        ellipse(x3,3*HEIGHT/5,10,10);
        x3+=3;
        ellipse(x4,4*HEIGHT/5,10,10);
        x4+=4;
    }
}

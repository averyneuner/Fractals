import processing.core.PApplet;
import java.util.Random;

public class Main extends PApplet{
    public static PApplet app; //creates our static variable
    private int red;
    private int blue;
    private int green;
    private boolean click;
    private static int WIDTH = 1000;
    private static int HEIGHT = 1000;
    private static int RADIUSPATTERN = 10;
    private static int RADIUSFILL = 1000;
    private static int CONSTANT = 10;


    public static void main(String[] args){
        PApplet.main("Main");
    }

    public Main(){
        super();
        app = this;
        red = 0;
        blue = 100;
        green = 0;
        click = false;
    }

    public void settings(){
        size(WIDTH, HEIGHT);
    }

    public void setup(){
        background(255);
    }

    public void draw(){
        if(click == false){
            background(255);
            drawPattern(WIDTH/2, HEIGHT/2, RADIUSPATTERN, red, green, blue);
        }else{
            background(255);
            drawLayer(100, 100, RADIUSFILL, red, green, blue);
        }
        noLoop();
    }

    public void mouseClicked() {
        super.mouseClicked();
        click = !click;
        redraw();
    }

    public void keyPressed() {
        if(key == 'a'){
            //aubergine
            red = 174;
            green = 113;
            blue = 240;
        }else if(key == 'b'){
            //blue
            red = 172;
            green = 204;
            blue = 250;
        }else if(key == 'c'){
            //cyan
            red = 172;
            green = 250;
            blue = 232;
        }else if(key == 'd'){
            //dandelion
            red = 243;
            green = 250;
            blue = 172;
        }else if(key == 'e'){
            //emerald
            red = 161;
            green = 250;
            blue = 160;
        }else if(key == 'f'){
            //fuchsia
            red = 240;
            green = 113;
            blue = 221;
        }else if(key == 'g'){
            //green
            red = 157;
            green = 242;
            blue = 131;
        }else if(key == 'h'){
            //hot pink
            red = 235;
            green = 108;
            blue = 184;
        }else if(key == 'i'){
            // indigo
            red= 133;
            green = 108;
            blue = 235;
        }else if(key == 'j'){
            //jade
            red = 107;
            green = 204;
            blue = 96;
        }else if(key == 'k'){
            //khaki
            red = 230;
            green = 207;
            blue = 108;
        }else if(key == 'l'){
            //lemon
            red = 247;
            green = 247;
            blue = 101;
        }else if(key == 'm'){
            //mint
            red = 159;
            green = 252;
            blue = 192;
        }else if(key == 'n'){
            //navy
            red = 128;
            green = 163;
            blue = 242;
        }else if(key == 'o'){
            //orange
            red = 252;
            green = 183;
            blue = 114;
        }else if(key == 'p'){
            //purple
            red = 214;
            green = 137;
            blue = 250;
        }else if(key == 'q'){
            //quail
            red = 149;
            green = 111;
            blue = 214;
        }else if(key == 'r'){
            //red (kinda pink)
            red = 250;
            blue = 172;
            green = 172;
        }else if(key == 's'){
            //sapphire
            red = 106;
            green = 102;
            blue = 232;
        }else if(key == 't'){
            //teal
            red = 160;
            green = 242;
            blue = 219;
        }else if(key == 'u'){
            //ultraviolet
            red = 196;
            green = 117;
            blue = 235;
        }else if(key == 'v'){
            //vermilion
            red = 235;
            green = 103;
            blue = 103;
        }else if(key == 'w'){
            //watermelon
            red = 247;
            green = 131;
            blue = 164;
        }else if(key == 'x'){
            //x-ray (dentist office greeny blue)
            red = 167;
            green = 252;
            blue = 248;
        }else if(key == 'y'){
            //yellow
            red =  245;
            green = 236;
            blue = 115;
        }else if(key == 'z'){
            //zealot (yellow)
            red = 245;
            green = 218;
            blue = 122;
        }else{
            //sage (because I like it)
            red = 190;
            green = 252;
            blue = 159;
        }
        redraw();
    }
    public void drawPattern(int x, int y, int radius, int red, int green, int blue){
        strokeWeight(2);
        stroke(Math.abs(red), Math.abs(green), Math.abs(blue));
        noFill();
        ellipse(x, y, radius, radius);
        if(radius < WIDTH){
            drawPattern(x, y + radius * 8, radius * 2, red - 30, green - 30, blue - 30);
            drawPattern(x, y - radius * 8, radius * 2, red - 30, green - 30, blue - 30);
            drawPattern(x + radius * 8, y, radius*2, red - 30, green - 30, blue - 30);
            drawPattern(x - radius * 8, y, radius*2, red - 30, green - 30, blue - 30);

        }
    }

    public void drawLayer(int x, int y, int radius, int red, int green, int blue){
        strokeWeight(2);
        fill(red, green, blue);
        ellipse(x, y, radius, radius);
        if(radius > 1){
            drawLayer(x + 50, y + 50,radius/2, green, blue, red);
        }
    }

}

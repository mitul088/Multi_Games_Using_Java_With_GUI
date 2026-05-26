package demogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(int row,int col) {

        map=new int[row][col];

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                map[i][j]=1;
            }
        }

        brickWidth=540/col;
        brickHeight=150/row;
    }

    public void setBrick(int value,int r,int c) {
        map[r][c]=value;
    }

    public void draw(Graphics2D g) {
//        Random rand = new Random();
//        int color = rand.nextInt(0,10);
//        Color []select = {Color.RED,Color.MAGENTA,Color.pink,Color.green,Color.CYAN,Color.BLUE,Color.YELLOW,Color.ORANGE,Color.WHITE};
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                if(map[i][j]>0) {

                    //color for the bricks or fill rect
                    g.setColor(Color.green);
//                    g.setColor(select[color]);
                    g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);

                    g.setColor(Color.black);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);

                }
            }
        }
    }

}


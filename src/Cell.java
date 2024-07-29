import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cell {
    public Cell(Graphics g, int x, int y, Point p){
        if(contains(p,x,y))
            g.setColor(Color.GREEN);
        else 
            g.setColor(Color.WHITE);
                g.fillRect(x, y, 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, 35, 35);
    }
    Boolean contains(Point p, int x, int y){
        if(p!=null)
            return (x < p.x && x+35 >p.x && y < p.y && y+35 > p.y);
        else
        return false;
    }
}

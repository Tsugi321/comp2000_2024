import java.awt.Graphics;
import java.awt.Point;

public class Grid {
    Cell[][] cells = new Cell[20][20];
    public Grid(Graphics g, Point p){
        for(int i = 0; i < cells.length; i++)
                for(int j = 0 ; j < cells[i].length; j++){
                    cells[i][j] = new Cell(g, 10+i*35, 10+j*35, p);
                }
            }
}

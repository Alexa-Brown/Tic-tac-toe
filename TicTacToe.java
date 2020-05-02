import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner lulu = new Scanner(System.in);

        StdDraw.setScale(-0.2,3.2);
        StdDraw.line(0,0, 0, 3);
        StdDraw.line(1, 0, 1, 3);
        StdDraw.line(0,2,3,2);
        StdDraw.line(0,1,3,1);
        StdDraw.line(0,3,3,3);
        StdDraw.line(2,0,2,3);
        StdDraw.line(3,0,3,3);
        StdDraw.line(0,0,3,0);

        StdDraw.setPenRadius(0.009);

        int moves = 0;
        double x;
        double y;
        char restartGame = 'y';

        while (restartGame == 'y'){

            while (moves < 9){
                if ((moves == 0) || (moves == 2) || (moves ==4) || (moves ==6) || (moves ==8)){
                    StdDraw.setPenColor(StdDraw.CYAN);
                    if (StdDraw.isMousePressed()) {
                        x = (int) StdDraw.mouseX();
                        y = (int) StdDraw.mouseY();
                        //to draw an O
                        StdDraw.circle(x + 0.5, y + 0.5, 0.5);
                        moves++;
                        System.out.println("mouse was pressed: " + moves);
                        StdDraw.pause(250);
                    }

                }
                else {
                    StdDraw.setPenColor(StdDraw.MAGENTA);
                    if (StdDraw.isMousePressed()) {
                        x = (int) StdDraw.mouseX();
                        y = (int) StdDraw.mouseY();
                        //to draw an X
                        StdDraw.line(x , y , x+1, y+1 );
                        StdDraw.line(x , y+1 , x+1, y );
                        moves++;
                        System.out.println("mouse was pressed: " + moves);
                        StdDraw.pause(250);
                    }
                }
            }
            System.out.println("Restart game? (y/n): ");
            restartGame= lulu.next().charAt(0);
            if (restartGame == 'n') {
                break;
            }
            else {
                continue;
            }
            }

        }
    }



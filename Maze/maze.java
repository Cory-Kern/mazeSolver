import java.util.Scanner;

public class maze
{
    static inter F = new inter(false, false, false, false, true);
    static inter E = new inter(false, false, false, true, false);
    static inter W = new inter(false, false, true, false, false);
    static inter WE = new inter(false, false, true, true, false);
    static inter S = new inter(false, true, false, false, false);
    static inter SE = new inter(false, true, false, true, false);
    static inter SW = new inter(false, true, true, false, false);
    static inter SWE = new inter(false, true, true, true, false);
    static inter N = new inter(true, false, false, false, false);
    static inter NE = new inter(true, false, false, true, false);
    static inter NW = new inter(true, false, true, false, false);
    static inter NWE = new inter(true, false, true, true, false);
    static inter NS = new inter(true, true, false, false, false);
    static inter NSE = new inter(true, true, false, true, false);
    static inter NSW = new inter(true, true, true, false, false);
    static inter NSWE = new inter(true, true, true, true, false);
    
    /*
     * use an inter[][] to create a maze
     * every element should be a inter from above
     * an inter is made up of possible directions
     * so a NWE inter has one wall south
     * Mazes can be any size
     */
    public static inter[][] mazeLarge =
                            {
                                {E, WE, WE, SWE, SW, SE, WE, WE, W, S, S},
                                {E, WE, SWE, NSW, NE, NW, E, SWE, WE, NSW, NS},
                                {SE, WE, NSW, NE, WE, W, SE, NWE, SW, N, NS},
                                {NSE, W, NS, S, SE, WE, NW, S, NS, SE, NW},
                                {NS, SE, NWE, NW, NS, S, SE, NSWE, NWE, NSW, S},
                                {N, NS, SE, WE, NSWE, NSW, NS, NE, SW, N, NS},
                                {SE, NSW, NS, E, SW, N, NS, S, NE, WE, NW},
                                {NS, NS, NE, SW, NS, SE, NWE, NE, SE, WE, SW},
                                {NS, NSE, WE, NW, NS, NS, S, SE, NW, E, NW},
                                {NS, NS, SE, W, NE, NSW, NE, NSWE, SWE, WE, F},
                                {N, NE, NW, E, WE, NWE, WE, NW, NE, WE, W}
                            };
                            
    public static inter[][] mazeSmall = 
                {
                {S, SE, SW, S},
                {NSE, NSW, NE, NSW},
                {NS, NE, SW, NS},
                {NE, W, F, N}
                };
    
    //you must set the start using the current function
    //you then have to set the maze to the maze you made or my 2 default
    //currently it is set to the mazeSmall with the starting position (0,0)
    //note the coordinates are (y,x) where the top left is (0,0)
    
    static int[] current = {1, 0};
    public static inter[][] maze = mazeSmall;

    public static void Main()
    {
        
        //you can call manualSolve() to manually solve the maze using directions
        //you can call autoSolve(maze() automatically solve the configured maze
        manualSolve();

        
    }
    
    public static void manualSolve()
    {
        while(maze[current[0]][current[1]].isFinish() == false)
        {
            System.out.println("you are at " + "(" + current[0] + ", " + current[1] + ")");
            System.out.println("North, South, East, West");
            Scanner s = new Scanner(System.in);
            String input = s.next();
            if(input.equals("North"))
            {
                navigation.goNorth();
            }else if(input.equals("South"))
            {
                navigation.goSouth();
            }else if(input.equals("West"))
            {
                navigation.goWest();
            }else if(input.equals("East"))
            {
                navigation.goEast();
            }
            System.out.println("finished");
        }
    }
    public static void autoSolve(inter[][] maze)
    {

        Solver.Solver(maze, 4);
        System.out.println("Finished");
    }
}
    


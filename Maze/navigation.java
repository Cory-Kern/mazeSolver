


public class navigation
{
    
    public static void setCurrent(int y, int x)
    {
        maze.current[0] = y;
        maze.current[1] = x;
    }
    public static int opposite(int x)
    {
        if(x % 2 == 0)
        {
            return x+1;
        }
        else
        {
            return x-1;
        }
    }
    public static void whereAmI()
    {
        System.out.println("location: " + "(" + maze.current[0] + ", " + maze.current[1] + ")");
    }
    public static void goNorth()
    {
        if(maze.maze[maze.current[0]][maze.current[1]].getNorth() == false)
        {
            System.out.println("hit a wall, try again (NORTH)");
            whereAmI();
        }else
        {
        maze.current[0] -=1;
        System.out.println("new location: " + "(" + maze.current[0] + ", " + maze.current[1] + ")");
        }
    }
    public static void goSouth()
    {
        if(maze.maze[maze.current[0]][maze.current[1]].getSouth() == false)
        {
            System.out.println("hit a wall, try again (SOUTH)");
            whereAmI();
        }else
        {
        maze.current[0] +=1;
        System.out.println("new location: " + "(" + maze.current[0] + ", " + maze.current[1] + ")");
        }
    }
    public static void goWest()
    {
        if(maze.maze[maze.current[0]][maze.current[1]].getWest() == false)
        {
            System.out.println("hit a wall, try again (WEST)");
            whereAmI();
        }else
        {
        maze.current[1] -=1;
        System.out.println("new location: " + "(" + maze.current[0] + ", " + maze.current[1] + ")");
        }
    }
    public static void goEast()
    {
        if(maze.maze[maze.current[0]][maze.current[1]].getEast() == false)
        {
            System.out.println("hit a wall, try again (EAST)");
            whereAmI();
        }else
        {
        maze.current[1] +=1;
        System.out.println("new location: " + "(" + maze.current[0] + ", " + maze.current[1] + ")");
        }
    }
    
    
}

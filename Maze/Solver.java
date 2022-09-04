

public class Solver extends maze
{
    public static void Solver(inter[][] maze, int last)
    {
        if(maze[current[0]][current[1]].isFinish() != true)
        {
            for(int i = 0; i < maze[current[0]][current[1]].getOptions().length; i++)
            {
                if((maze[current[0]][current[1]].getOptions()[i] == true) && (navigation.opposite(i) != last))
                {
                    navigation.whereAmI();
                    System.out.println(i);
                    
                    if(i == 0)
                    {
                        navigation.goNorth();
                        Solver(maze, 0);
                    }
                    if(i == 1)
                    {
                        navigation.goSouth();
                        Solver(maze, 1);
                    }
                    if(i == 2)
                    {
                        navigation.goWest();
                        Solver(maze, 2);
                    }
                    if(i == 3)
                    {
                        navigation.goEast();
                        Solver(maze, 3);
                    }
                }
            }
            if(maze[current[0]][current[1]].isFinish() != true)
                {
                if(last == 0)
                {
                    navigation.goSouth();
                }
                else if(last == 1)
                {
                    navigation.goNorth();
                }
                else if(last == 2)
                {
                    navigation.goEast();
                }
                else if(last == 3)
                {
                    navigation.goWest();
                }
            }
        }
    }
}

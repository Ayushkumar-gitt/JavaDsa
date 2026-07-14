import java.util.ArrayList;

public class Backtracking {
    static int count = 0;
    static ArrayList<String> pList = new ArrayList<>();
    public static void main(String[] args) {
//        mazeQ1(3,3);
//        System.out.println(count);

//        mazeQ2(3,3,"");

//        mazeQ2_Optimized(3,3,new StringBuilder());
//          mazeQ2_diagonal(3,3,"");

        int[][] maze = {
                {0,0},{0,1}
        };
//        maze_obstacles(0,0,maze,"");
        System.out.println(uniquePathsWithObstacles(maze));
        for (int i = 0; i < pList.size(); i++) {
            System.out.println(pList.get(i));
        }

    }

    public static void mazeQ1(int row,int coln) {
        if (row==1 || coln==1) {
            count = count+1;
            return;
        }

        mazeQ1(row-1,coln);
        mazeQ1(row,coln-1);
    }

    public static void mazeQ2(int row, int coln,String processed) {
        if (row==1) {
            while (coln!=1){
                processed = processed+"R";
                coln = coln-1;
            }
            pList.add(processed);
            return;
        }
        if (coln==1) {
            while (row!=1){
                processed = processed+"D";
                row = row-1;
            }
            pList.add(processed);
            return;
        }

        mazeQ2(row-1,coln,processed + "D");
        mazeQ2(row,coln-1,processed + "R");


    }


    public static void mazeQ2_Optimized(int row, int col, StringBuilder processed) {
        if (row == 1 && col == 1) {
            pList.add(processed.toString());
            return;
        }
        if (row == 1) {
            processed.append("R");
            mazeQ2_Optimized(row, col - 1, processed);
            processed.deleteCharAt(processed.length() - 1); // Have to do this because in every function call same string is being used , so when func. call goes to the parent function after returning the new addition in the string stays there also so we have to remove the newly added string so the parent function continues from the old value it was having.
            return;
        }
        if (col == 1) {
            processed.append("D");
            mazeQ2_Optimized(row - 1, col, processed);
            processed.deleteCharAt(processed.length() - 1); // backtrack
            return;
        }

        processed.append("D");
        mazeQ2_Optimized(row - 1, col, processed);
        processed.deleteCharAt(processed.length() - 1);

        processed.append("R");
        mazeQ2_Optimized(row, col - 1, processed);
        processed.deleteCharAt(processed.length() - 1);
    }

    public static void mazeQ2_diagonal(int row, int coln,String processed) {
        if (row==1) {
            while (coln!=1){
                processed = processed+"R";
                coln = coln-1;
            }
            pList.add(processed);
            return;
        }
        if (coln==1) {
            while (row!=1){
                processed = processed+"D";
                row = row-1;
            }
            pList.add(processed);
            return;
        }

        mazeQ2_diagonal(row-1,coln,processed + "D");
        if (row>1 && coln>1) {
            mazeQ2_diagonal(row - 1, coln-1, processed + "Di");
        }
        mazeQ2_diagonal(row,coln-1,processed + "R");
    }

    static public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        maze_obstacles(0,0,obstacleGrid,"");
        return pList.size();
    }
    public static void maze_obstacles(int row, int coln,int[][] maze,String processed) {
        if (maze[0][0] == 1 || maze[maze.length-1][maze[0].length-1]==1) return ;
        if (maze[row][coln] == 1){
            return;
        }
        if (row==maze.length-1) {
            while (coln!=maze[0].length-1){
                if (maze[row][coln] == 1){
                    return;
                }
                processed = processed+"R";
                coln = coln+1;
            }
            pList.add(processed);
            return;
        }
        if (coln==maze[0].length-1) {
            while (row!= maze.length-1){
                if (maze[row][coln] == 1){
                    return;
                }
                processed = processed+"D";
                row = row+1;
            }
            pList.add(processed);
            return;
        }

        maze_obstacles(row+1,coln,maze,processed + "D");

        maze_obstacles(row,coln+1,maze,processed + "R");
    }
}



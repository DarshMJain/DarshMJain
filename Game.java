
public class Game {
    public char[][] main(MyFrame frame,char[][] grid,int chances) {
        int move=frame.move();
        int arr[]=new int[2];
            arr=decoder(move);
            int x=arr[0];
            int y=arr[1];
            if(chances%2==0)
            grid[x][y]='.';
            else
            grid[x][y]='_';
            return grid;
    }
    static int[] decoder(int n){
        int arr[]=new int[2];
             if(n==1){arr[0]=0;arr[1]=0;}
        else if(n==2){arr[0]=0;arr[1]=1;}
        else if(n==3){arr[0]=0;arr[1]=2;}
        else if(n==4){arr[0]=1;arr[1]=0;}
        else if(n==5){arr[0]=1;arr[1]=1;}
        else if(n==6){arr[0]=1;arr[1]=2;}
        else if(n==7){arr[0]=2;arr[1]=0;}
        else if(n==8){arr[0]=2;arr[1]=1;}
        else if(n==9){arr[0]=2;arr[1]=2;}
        return arr;
    }
    static boolean Win(char[][] grid){
        return WinByCoLumn(grid)||WinByDiagonal(grid)||WinByRow(grid);
    }
    static boolean WinByRow(char[][] grid){
        boolean flag=false;
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0]==grid[i][1]&& grid[i][0]==grid[i][2]&& grid[i][0]!=' ')
            {flag=true;
            break;}
        }
        return flag;
    }
    static boolean WinByCoLumn(char[][] grid){
        boolean flag=false;
        for (int i = 0; i < grid.length; i++) {
            if(grid[0][i]==grid[1][i]&& grid[0][i]==grid[2][i]&& grid[0][i]!=' ')
            {flag=true;
            break;}
        }
        return flag;
    }
    static boolean WinByDiagonal(char[][] grid){
        boolean flag=false;
        if(((grid[0][0]==grid[1][1]&& grid[0][0]==grid[2][2])||(grid[0][2]==grid[1][1]&& grid[0][2]==grid[2][0]))&&grid[1][1]!=' ')
        flag=true;
        return flag;
    }
}

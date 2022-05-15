// https://www.geeksforgeeks.org/given-matrix-o-x-replace-o-x-surrounded-x/

public class Main {
    public static void main (String[] args)
    {
        char[][] mat = {{'X', 'O', 'X',
                         'O', 'X', 'X'},
                        {'X', 'O', 'X',
                         'X', 'O', 'X'},
                        {'X', 'X', 'X',
                         'O', 'X', 'X'},
                        {'O', 'X', 'X',
                         'X', 'X', 'X'},
                        {'X', 'X', 'X',
                         'O', 'X', 'O'},
                        {'O', 'O', 'X',
                         'O', 'O', 'O'}};
                         
        replaceSurrounded(mat);
     
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");
                 
            System.out.println("");
        }
    }
}

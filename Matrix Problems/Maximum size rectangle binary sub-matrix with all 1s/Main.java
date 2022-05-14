// { Driver Code Starts
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++ )
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Maximux Area is : "+new Solution().maxArea(arr, n, m));
        t--;
        }
        sc.close();
    }
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        if(n==0 || m==0){
            return 0;
        }
        
        int[] row = M[0];
        int maxArea = maxHisto(row);
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==1){
                    row[j]+=1;
                }else{
                    row[j]=0;
                }
            }
            
            int currArea = maxHisto(row);
            if(currArea>maxArea){
                maxArea = currArea;
            }
        }
        
        return maxArea;
    }
    
    private int maxHisto(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        int[] rb = new int[n];
        st.push(n-1);
        rb[n-1] = n;
        
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            
            if(st.size()==0){
                rb[i] = n;
            }else{
                rb[i] = st.peek();
            }
            
            st.push(i);
        }
        
        int[] lb = new int[n];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        
        for(int i=1;i<n;i++){
            while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            
            if(st.size()==0){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            
            st.push(i);
        }
        
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width = rb[i]-lb[i]-1;
            int area = width*arr[i];
            if(area>maxArea){
                maxArea = area;
            }
        }
        
        return maxArea;
        
    }
}

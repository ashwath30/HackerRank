//Ref https://www.youtube.com/watch?v=_fgjrs570YE
public static long makeChange(int[] coins, int money) {
        
        Arrays.sort(coins);
        long[][] T = new long[coins.length][money+1];
        int i,j;
        
        if(money<=0 || coins.length<=0)
            return 0;
        
        for(i=0;i<coins.length;i++)
            T[i][0]=1; //to fill the 1st column with 1s
        
       
        
        for(j=1;j<=money;j++){ //to fill the 1st row values as either 0 or 1
            if(j % coins[0] == 0)
                T[0][j]=1;
            else
                T[0][j]=0;
        }
        
        
        for(i=1;i<coins.length;i++){
            for(j=1;j<=money;j++){
                
                if(j>=coins[i])
                    T[i][j]=T[i-1][j]+ T[i][j-coins[i]];
                else
                    T[i][j]=T[i-1][j];
            }
        }
            
        return T[coins.length-1][money];//return the element in [last-row][last-colmn]  
    }
public static long countInversions(int[] a,int start, int end){
        
        if(start >= end)
            return 0;
        
        long inversionCount = 0;
        
        int middle = (start+end)/2;
        
        inversionCount += countInversions(a,start,middle);
        inversionCount += countInversions(a,middle+1,end);
        
        int left = start;
        int right = middle+1; 
        
        int[] sortedArray = new int[end - start +1];
        
        for(int i=0; i< sortedArray.length; i++){
            
            if(right>end  || (left <= middle && a[left] <= a[right])){
                
                sortedArray[i]=a[left];
                left++;
            }
            
            else{
                
                inversionCount += middle - left + 1; //because both the arrays are sorted
                
                sortedArray[i]=a[right];
                right++;
            }
                
            
            
        }
        
        
        for(int i=start; i<=end ; i++)
            
            a[i]=sortedArray[i-start]; //copy back the merged elements to original array, if any
        
            
    return inversionCount;
    }
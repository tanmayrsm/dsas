

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    for(int i = 0; i < n; i++) {
	        if(x >= matrix[i][0] && x <= matrix[i][m-1] && bs(matrix[i], 0, m - 1, x)) {
	            return true;
	        }
	    }
	    
	    return false;
	} 
	private static boolean bs(int[] arr, int l, int r, int target) {
	    if(l > r)
	        return false;
	    int mid = (l + r) / 2;
	    if(arr[mid] == target) {
	        return true;
	    }
	    if (arr[mid] < target) {
	        return bs(arr, mid + 1, r, target);
	    }
	    return bs(arr, l, mid - 1, target); 
	}
} 

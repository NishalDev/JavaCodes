package Easy;

public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    int arr[] = {1,2,3,4,5};
	    int even=0;
	    int odd=0;
	    int res;
	    for(int i=0;i<n;i++){
	        if(arr[i] == 1){
	            odd++;
	        }
	        else if(i%2==0){
	            even++;
	        }
	        else{
	        odd++;
	        }
	        }
	        res = odd - even;
	        	
		System.out.println(res);
	}
}
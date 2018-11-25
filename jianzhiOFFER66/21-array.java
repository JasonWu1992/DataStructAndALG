public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        for (int i = 0;i < len; i++){
            for (int j = 0;j < len-1; j++){
                if(array[j] % 2 == 0 && array[j+1] % 2 == 1){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
	public static void main(String[]args){
		Solution sol = new Solution();
		int[]array = {1,2,3,4,5}
		sol.reOrderArray(array);
		for(int x: array){
			System.out.println(x);
		}
	}
}
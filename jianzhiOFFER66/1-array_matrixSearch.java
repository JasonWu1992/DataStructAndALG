public class array_matrixSearch {
    public boolean Find(int target, int [][] array) {
        int length_x = array.length;
        if(length_x==0)
            return false;
        for(int i = 0;i < array.length;i++){
            int low = 0;
            int high = array[i].length-1;
            if(high < 0)
                return false;
            if(array[i][low]>target)
                break;
            while(low <= high){
                if(array[i][low]<target)
                    low += 1;
                else if (array[i][high]>target)
                    high -= 1;
                else
                    return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println();
    }
}
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        int head = 0;
        int tail = len-1;
        while(head < tail){
            int middle = (head + tail)/2;
            int middle_num = array[middle];
            if(middle_num > array[head]){
                head = middle;
            }else if(middle_num < array[head]){
                tail = middle;
            }else
                return array[tail];
        }
        return array[tail];
    }
}
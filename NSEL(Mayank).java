import java.util.*;
class NSEL {
    public static int[] Nearest_Smaller_Element_to_left(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length]; 
        for(int i=0 ; i<arr.length; i++){
                while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                    stack.pop();
                    stack.push(i);
                }
                if (stack.isEmpty()){
                    ans[i]=-1;
                    stack.push(i);
                }
                else{
                    ans[i] = stack.peek(); 
                    stack.push(i);                   
                }
                
            }
        return ans;}
    public static void main(String[] args) {
        int nums[] = {6,6,7,5,4,5,7,9,3,4,0,6,5};
        int ans[] = Nearest_Smaller_Element_to_left(nums);
        for(int a:ans){
            System.out.print(a + " ");
        }
    }
    
}
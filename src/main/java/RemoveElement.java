/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
       int m = 0;
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] != val) {
               nums[m++] = nums[i];
           }
       }
       return m;
    }
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        RemoveElement removeElement = new RemoveElement();
        int n = removeElement.removeElement(a,3);

        System.out.println("--------\n" + n);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
            if(i == n - 1) {
                System.out.print("| ");
            }
        }
    }
}

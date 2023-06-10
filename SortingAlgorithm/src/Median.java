import java.sql.Array;
import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
int[] num1={1,2}, num2={3,4};
System.out.println(findMedianSortedArrays(num1,num2));
    }
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (k<c.length){
            if(nums2.length>j && nums1.length>i) {
                if (nums1[i] < nums2[j]) {
                    c[k++] = nums1[i++];
                }
                else {
                    c[k++] = nums2[j++];
                }
            }else {
                if(i<nums1.length){
                    c[k++]=nums1[i++];
                } else if (j< nums2.length) {
                    c[k++]=nums2[j++];
                }
            }
        }

       if(c.length%2==0){
           return (double) ((c[c.length/2]+c[(c.length/2)-1]))/2;
       }
       return c[c.length/2];
    }
}

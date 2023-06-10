import java.util.Arrays;

public class FlixImage {
    public static void main(String[] args) {
int[][] image=new int[][]
        {
                {1,1,0},
                {0,1,0},
                {0,0,0}
        };
flex(image);
for (int[] arr:image)
        System.out.println(Arrays.toString(arr));
    }

    public static void  flex(int[][] image){
        for (int[] row:image){
        for(int i=0;i<(image[0].length+1)/2;i++) {
            int temp = row[i] ^1;
            row[i]=row[image[0].length-i-1]^1;
            row[image[i].length-i-1]=temp;
           }
        }
    }
}

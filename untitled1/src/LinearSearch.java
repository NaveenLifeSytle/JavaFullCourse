public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,2,34,22,556,33,44};
        System.out.println(linearSearch3(arr,22));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0; i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //return elements
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int element:arr){

        if(element==target){
            return element;
        }
        }
        return Integer.MAX_VALUE;
    }

    //return true or false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int element:arr){

            if(element==target){
                return true;
            }
        }
        return false;
    }
}

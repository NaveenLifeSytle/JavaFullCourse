public class theGreatestNextLetter {
    public static void main(String[] args) {
        char[] arr={'c','d','e','f','l'};
        System.out.println(search(arr,'f'));
    }


    static char search(char[] arr,char target){
        if(target>arr[arr.length-1]){
            return '1';
        }
        int s=0;
        int e=arr.length-1;


        while (s<=e) {
            int mid = s + ((e - s) / 2);

      if (target < arr[mid]) {
                e = mid - 1;
            }
            else  {
                s = mid + 1;
            }
        }
        return arr[s% arr.length];//% arr.length wrap around
    }

}

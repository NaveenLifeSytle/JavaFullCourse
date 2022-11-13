package naveen.string.demo;

public class CountOfFirstCharacter {
    public static void main(String[] args) {
        String words="agilandam";
        int count=1;
        char[] word=words.toCharArray();

        for (int i=1;i<word.length;i++){
            if(word[0]==word[i]){
                count++;
            }

        }

        System.out.println("count of first character="+count);
    }
}

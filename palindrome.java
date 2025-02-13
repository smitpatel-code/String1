package String1;

public class palindrome {
    public static void main(String[] args) {
       String word="ababa";
        String result=word.replace(" ", "").toLowerCase();
        int middle=result.length()/2;
        StringBuilder sl=new StringBuilder();
        StringBuilder sr=new StringBuilder();
        for(int i=0;i<middle;i++){
            sl.append(result.charAt(i));
        }
        for(int i=result.length()-1;i>=result.length()-middle;i--){
            sr.append(result.charAt(i));
        }
        if(sl.toString().equals(sr.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }

    }
}


// print subsequences of strings
// choices of strings
public class subsequences {
public static void subsequence(String str,int idx,String newString){

    if(idx==str.length()){
        System.err.println(newString);
        return;


    }
    char currChar=str.charAt(idx);
    //to be
    subsequence(str,idx+1,newString+currChar);


    //or not 
 

    

        
    }
}
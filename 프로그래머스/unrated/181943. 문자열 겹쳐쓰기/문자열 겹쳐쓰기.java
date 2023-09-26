public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String my_string_ = my_string.substring(0, s);
        
        if(my_string.length()-(s) > overwrite_string.length()){
            answer = my_string_+overwrite_string+my_string.substring(s+overwrite_string.length(), my_string.length());
        }
        else{
            answer = my_string_+ overwrite_string;
        }


        return answer;
    }
}
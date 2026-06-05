class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char chars[] = s.toCharArray();

        int []arr = new int[chars.length];

        int index = -1;

        for(int i=0;i<chars.length;i++){

                if(chars[i] == '('){
                    index++;

                    arr[index]=i;
                }
                else if(chars[i] == ')'){
                    if(index < 0) {
                        chars[i] = '#';
                    }
                    else{
                        index--;
                    }
                }
        }

        for(int i=0;i<=index;i++){
            chars[arr[i]] = '#';
        }

        StringBuilder answer = new StringBuilder();

        for(int i=0;i<chars.length;i++){
                if(chars[i] != '#'){
                    answer.append(chars[i]);
                }
        }
        return answer.toString();
    }
}
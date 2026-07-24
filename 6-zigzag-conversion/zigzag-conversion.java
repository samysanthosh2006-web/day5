class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 0) return s;
        StringBuilder str = new StringBuilder();
        boolean flag = false;

        for(int i = 0; i < numRows; i++) {
            flag = false;
            int j = i;
            while(j < s.length()) {
                str.append(s.charAt(j));

                if (i == 0 || i == numRows-1) {
                    j = j + (numRows -1)*2;
                }
                else {
                    if(!flag) {
                        j = j + (numRows - i - 1)*2;
                        flag = true;
                    }
                    else{
                        j = j + (i*2);
                        flag = false;
                    }
                }
                
            }
        }
        return str.toString();
    }
}
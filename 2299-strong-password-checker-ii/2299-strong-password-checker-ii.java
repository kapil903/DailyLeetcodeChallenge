class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean spChar = false;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        String str = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
            if(str.indexOf(ch) != -1){
                spChar = true;
            }
            if(Character.isDigit(ch)){
                digit = true;
            }
            if(Character.isLowerCase(ch)){
                lower = true;
            }
            if(Character.isUpperCase(ch)){
                upper = true;
            }
        }
        return password.length() >= 8 && upper && lower && spChar && digit;
    }
}
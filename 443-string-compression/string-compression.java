class Solution {
    public int compress(char[] chars) {
        int charindex = 0;
        int storedindex = 0;

        while (charindex < chars.length) {
            char curr = chars[charindex];
            int count = 0;

            
            while (charindex < chars.length && chars[charindex] == curr) {
                charindex++;
                count++;
            }

           
            chars[storedindex] = curr;
            storedindex++;

            
            if (count > 1) {
                String digit = String.valueOf(count);
                for (char value : digit.toCharArray()) {
                    chars[storedindex] = value;
                    storedindex++;
                }
            }
        }
        return storedindex;
    }
}


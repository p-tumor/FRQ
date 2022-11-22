public class FRQMethods {
    public void printNums(int value, int numRounds) {
        int x;
        String str = "";
        for(int y = 0;y<numRounds;y++){
            x = (int)(Math.random()*10);
            while (x != value){
                str += x;
                x = (int)(Math.random()*10);

            }
            str += x;
            System.out.println(str);
            str = "";
        }
    }

    public String longestStreak(String str) {
        String s = str.charAt(0) + "";
        String s2 = "";
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < str.length();i++){
            String c = str.charAt(i)+"";
            if (s.equals(c)){
                count++;
            }else{
                s = c;
                s2 = s;
                if (count2 > count){
                    s = s2;
                }
                count2 = count;
                count = 0;
            }
        }
        if (count2 > count) count = count2;
        return s + " " + count;
    }

}

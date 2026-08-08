class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0)
            return "";
        List<Integer> list = new ArrayList<>();
        String str = "";
        for (String ss : strs) {
            list.add(ss.length());
            str += ss;
        }
        String finalStr = "";
        for (Integer ss : list) {
            finalStr += String.valueOf(ss)+",";
            
        }
        finalStr = finalStr.substring(0,finalStr.length()-1);

        finalStr += "#" + str;
       // System.out.println(finalStr);
        return finalStr;
    }

    public List<String> decode(String str) {
                List<String> list = new ArrayList<>();
        if (str == "") return list;
       int  after_coma = 0;
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (ch == '#') {
                after_coma = i;
                break;
        }
        }
        String[] size = str.substring(0,after_coma).split(",");
       String rem = str.substring(after_coma+1,str.length());
       int start = 0;
       for (int i = 0; i < size.length;i++){
        int num = Integer.parseInt(size[i]);
        String ss = rem.substring(start,start+num);
        start += num;
        list.add(ss);


       }
       

        return list;
    }
}

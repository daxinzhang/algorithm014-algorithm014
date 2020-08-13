/*请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
public class ReplaceTabToString {
    //1.新建新的StringBuffer后一个个插入
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuffer str1=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str1.append("%20");
            }else{
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
    //2.直接使用字符串替换
    public String replaceSpace1(StringBuffer str) {
        if(str==null){
            return null;
        }
        String str1=str.toString();
        return str1.replace(" ","%20");
    }
    /*
    import java.io.*;
    public class Main {
        public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=" ";
        while ((str=br.readLine())!=null){

           System.out.println(str.replaceAll(" ", "%20"));
        }
            br.close();
        }
    }
    * */
}

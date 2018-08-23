
package test;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CutString {
    public static void main(String args[]){
        String str1 = "我ABC";
        String str2 ="我ABC汉DEF";
        Cut(str1,4);
        Cut(str2,6);
    }
    public static void Cut(String str,int len){
        try {
            if(str==null){                          //判断是否为空
                System.out.println("字符串为空！");
                return;
            }
            if(len>str.length()){                   //截取长度检测
                len=str.length();
            }
            byte[] bt = str.getBytes("gbk");
            if(bt[len]<0){
                String subString = new String(bt,0,--len);
                System.out.println(subString);
            }
            else{
                String subString = new String(bt,0,len);
                System.out.println(subString);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CutString.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

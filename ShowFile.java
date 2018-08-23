import java.io.File;
public class ShowFile{
 public static void main(String[] args) {
  String path=args[0];
  File file=new File(path);
  File[] tempList = file.listFiles();
  System.out.println("对象个数："+tempList.length);
  for (int i = 0; i < tempList.length; i++) {
   if (tempList[i].isFile()) {
    System.out.println("文件:"+tempList[i]);
   }
   if (tempList[i].isDirectory()) {
    System.out.println("文件夹："+tempList[i]);
   }
  }
 }
}
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;


public class Draft {

    public static void main(String[] args) throws IOException  {
        /*
         * 创建输出流，将信息写入指定的文件中
         */
        OutputStream os=new FileOutputStream("test.txt");
        PrintWriter pw=new PrintWriter(os);
        pw.write("小帅哥");
        pw.append(" 你真帅~");
        pw.println("我稀罕你");
        pw.write("我爱你");
        //输出流需要在读取之前关闭保存
        pw.close();
        os.close();
    }
}
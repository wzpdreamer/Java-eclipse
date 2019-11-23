import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class myfile {
//	public static void main(String[] args) {//File用来表示文件的名称，或某个目录中一组文件的名称
//		File path = new File("D:\\桌面\\计算机组成原理+数值分析");
//		String [] fileList;
//		fileList = path.list(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				return name.indexOf("总结复习.ppt") != 1;//!=-1与==0只剩自己; !=0与==-1自己被过滤; !=1为全部显示; ==1没有显示
//			}
//		});
//		for(int i = 0;i<fileList.length;i++){
//			System.out.println(fileList[i]);
//		}
//		BufferedReader in = new BufferedReader(
//	             new InputStreamReader(System.in));
//		    String s;
//		    System.out.println("Please input sth:");
//		    try {
//		      while((s = in.readLine()).length() != 0)
//		        System.out.println(s);
//		    } catch(IOException e) {
//		      e.printStackTrace();
//		    }
//
//	}
//	public static void readToBuffer(StringBuffer buffer,InputStream ins)//	读文本文件
//	        throws IOException {
//	        String line; 
//	        BufferedReader reader = 
//	                 new BufferedReader(new InputStreamReader(ins));
//	        line = reader.readLine();
//	        while (line != null) {
//	            buffer.append(line);
//	            buffer.append("\n");
//	            line = reader.readLine();
//	        }
//	    }
//	public static void main(String[] args) throws IOException {
//		InputStream ins = new FileInputStream("D:\\桌面\\武智鹏\\123.txt");
//		StringBuffer buffer = new StringBuffer();
//		readToBuffer(buffer, ins);
//		System.out.println(buffer);
//		ins.close();
//	}
//	public static void writeFromBuffer(StringBuffer buffer, OutputStream os) {//写文本到标准输出/文件
//		PrintStream ps = new PrintStream(os);   
//		ps.print(buffer.toString());
//		}
//
//		public static void main(String[] args) throws IOException {
//		StringBuffer buffer = new StringBuffer("测试：Hello World!\n");
//		writeFromBuffer(buffer, System.out);
//		PrintStream ps  = new PrintStream(new File("D:\\桌面\\武智鹏\\file.txt"));
//		writeFromBuffer(buffer, ps);
//		}
//	public static void copyStream(String inFilename, String outFilename) throws IOException{//拷贝文本文件
//			InputStream ins = new FileInputStream(inFilename);
//			OutputStream os = new FileOutputStream(outFilename);
//			String line;
//			BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
//			PrintWriter writer = new PrintWriter(new OutputStreamWriter(os));
//			line = reader.readLine();
//			while (line != null) {
//			    writer.println(line);
//			    line = reader.readLine();
//			}
//			writer.flush();
//			ins.close();
//			os.close();
//			writer.close();
//		}
//		public static void main(String[] args) throws IOException{
//			copyStream("D:\\桌面\\武智鹏\\a.txt","D:\\桌面\\武智鹏\\file.txt"); 
//		}

}
	

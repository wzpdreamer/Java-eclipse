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
//	public static void main(String[] args) {//File������ʾ�ļ������ƣ���ĳ��Ŀ¼��һ���ļ�������
//		File path = new File("D:\\����\\��������ԭ��+��ֵ����");
//		String [] fileList;
//		fileList = path.list(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				return name.indexOf("�ܽḴϰ.ppt") != 1;//!=-1��==0ֻʣ�Լ�; !=0��==-1�Լ�������; !=1Ϊȫ����ʾ; ==1û����ʾ
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
//	public static void readToBuffer(StringBuffer buffer,InputStream ins)//	���ı��ļ�
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
//		InputStream ins = new FileInputStream("D:\\����\\������\\123.txt");
//		StringBuffer buffer = new StringBuffer();
//		readToBuffer(buffer, ins);
//		System.out.println(buffer);
//		ins.close();
//	}
//	public static void writeFromBuffer(StringBuffer buffer, OutputStream os) {//д�ı�����׼���/�ļ�
//		PrintStream ps = new PrintStream(os);   
//		ps.print(buffer.toString());
//		}
//
//		public static void main(String[] args) throws IOException {
//		StringBuffer buffer = new StringBuffer("���ԣ�Hello World!\n");
//		writeFromBuffer(buffer, System.out);
//		PrintStream ps  = new PrintStream(new File("D:\\����\\������\\file.txt"));
//		writeFromBuffer(buffer, ps);
//		}
//	public static void copyStream(String inFilename, String outFilename) throws IOException{//�����ı��ļ�
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
//			copyStream("D:\\����\\������\\a.txt","D:\\����\\������\\file.txt"); 
//		}

}
	

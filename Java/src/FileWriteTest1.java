import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		 
		String source = "비어 있어야 비로소 가득해지는 사랑";
		System.out.println("파일명을 입력하세요: ");
		
//		String s = stdin.next();
//		stdin.close();
//		
//		FileWriter fw;
//		try {
//			fw = new FileWriter(s+".txt",true);
//			fw.write(" "+source+"\n");
//			fw.close();
//			System.out.println(s + ".txt 파일이 생성되었습니다");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("읽어들일 파일명을 입력하세요");
		String s = stdin.next();
		
		try {
			FileReader fr = new FileReader(s);
			
			int i;
			
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

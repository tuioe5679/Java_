import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		 
		String source = "��� �־�� ��μ� ���������� ���";
		System.out.println("���ϸ��� �Է��ϼ���: ");
		
//		String s = stdin.next();
//		stdin.close();
//		
//		FileWriter fw;
//		try {
//			fw = new FileWriter(s+".txt",true);
//			fw.write(" "+source+"\n");
//			fw.close();
//			System.out.println(s + ".txt ������ �����Ǿ����ϴ�");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("�о���� ���ϸ��� �Է��ϼ���");
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

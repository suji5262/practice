package practice.springEX2_nam.ch2.src.main.java.com.fastcampus.ch2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class ModelController {
	public String main(HashMap map) {
		// �۾� ����� map�� ����
		map.put("id", "asdf");
		map.put("pwd", "1111");
		
		return "txtView1"; //���̸� ��ȯ
//		return "txtView2"; // �䰡 ������ ���� ��, �� �̸��� �ٸ��� ��ȯ�ϸ� �� �信 �°� ������ ä�� ����� ������
	}
}

public class MethodCall {
	public static void main(String[] args) throws Exception{
		HashMap map = new HashMap();
		System.out.println("before:"+map); // map�� ó�� ������ �� �������

		ModelController mc = new ModelController();
		String viewName = mc.main(map); // �۾������ render �ѱ�
		
		System.out.println("after :"+map);
		
		render(map, viewName); // (data, txtView2) - data�� ������ view�� �����ִ� ��
	}
	
	static void render(HashMap map, String viewName) throws IOException {
		String result = "";
		
		// 1. ���� ������ ���پ� �о �ϳ��� ���ڿ��� �����.
		Scanner sc = new Scanner(new File(viewName+".txt"));
		
		while(sc.hasNextLine())
			result += sc.nextLine()+ System.lineSeparator();
		
		// 2. map�� ��� key�� �ϳ��� �о template�� ${key}�� value�ٲ۴�.
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();

			// 3. replace()�� key�� value ġȯ�Ѵ�.
			result = result.replace("${"+key+"}", (String)map.get(key));
		}
		
		// 4.������ ����� ����Ѵ�.
		System.out.println(result);
		// response ��ü�� �̿��� Ŭ���̾�Ʈ�� ����� ���� ����
	}
}

// ��Ʈ�ѷ� ���� ������ �޼��� ȣ��

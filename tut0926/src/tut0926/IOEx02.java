package tut0926;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOEx02 {

	public static void main(String[] args) throws IOException{
		
		String folder = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
		
		File dir = new File("/Users/lth069389/Desktop/leetae/sorce/tut0926/" + folder); //만들 준비
		//mkdir()
		
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println(folder + "가 생성되었습니다.");
			
			//폴더 생성하면서 안에 busan.txt 같이 저장
			File file = new File(dir + "/busan.txt");
			
			//Spring 파일 이름 -> 현재 날짜의 1/1000초로 변경
			//오늘 날짜 폴더
			
			
			//현재 시간을 1/1000
			
			
			
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
			
		}else {
			System.out.println("디렉토리가 존재합니다.");
		}
		
		
		
		
		
		
		
		
	}

}

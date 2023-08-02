package e.io.practice;

import java.io.File;

public class FileSizeSummary {

	public static void main(String[] args) {
		FileSizeSummary sample = new FileSizeSummary();
		String path = "C:\\godofjavaEclipse\\study";
//		String path = "C\\godofjavaEclipse";
		long sum = sample.printFileSize(path);
		System.out.println(path + "'s total size = " + sum);
	}
	
	public long printFileSize(String dirName) {
		File dir = new File(dirName);
		long sum = 0;
		if(dir.isDirectory()) {
			File[] fileList = dir.listFiles();
			for(File file:fileList) {
				if(file.isFile()) {
					String tempFileName = file.getAbsolutePath();
					long fileLength = file.length();
					System.out.println(tempFileName + " = " + fileLength);  //"파일 이름 = 크기" 출력
					sum+=fileLength;  //sum 변수에 fileLength를 하나하나 더해준다.
				} else {
					String tempDirName = file.getAbsolutePath();  
					long fileLength = printFileSize(tempDirName);  //file이 아니라 폴더일 때는 printfileLsize()를 재귀 호출해서 하위 폴더의 파일들의 크기도 조회한다.
					System.out.println("["+tempDirName+"] = "+fileLength);
					sum+=fileLength;
				}
			}
		}
		return sum;
	}

}

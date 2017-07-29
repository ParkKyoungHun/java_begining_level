package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "박경훈,25,서울/";
		data += "김경훈,37,경기/";
		data += "홍길동,31,광주/";
		data += "김길동,22,부산";
		
		String[] datas = data.split("/");
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();
		
		for(int i=0;i<datas.length;i++) {
			String[] inDatas = datas[i].split(",");
			HashMap<String,String> hm = new HashMap<String,String>(); 
			for(int j=0;j<inDatas.length;j++) {
				if(j==0) {
					hm.put("이름", inDatas[j]);
				}else if(j==1) {
					hm.put("나이", inDatas[j]);
				}else if(j==2) {
					hm.put("주소", inDatas[j]);
				}
			}
			dataList.add(hm);
		}
		
		for(HashMap hm : dataList) {
			System.out.println("주소" + hm.get("주소"));
			System.out.println("나이" + hm.get("나이"));
			System.out.println("이름" + hm.get("이름"));
		}
		
	}
}

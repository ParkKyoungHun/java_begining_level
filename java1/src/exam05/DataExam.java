package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "�ڰ���,25,����/";
		data += "�����,37,���/";
		data += "ȫ�浿,31,����/";
		data += "��浿,22,�λ�";
		
		String[] datas = data.split("/");
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();
		
		for(int i=0;i<datas.length;i++) {
			String[] inDatas = datas[i].split(",");
			HashMap<String,String> hm = new HashMap<String,String>(); 
			for(int j=0;j<inDatas.length;j++) {
				if(j==0) {
					hm.put("�̸�", inDatas[j]);
				}else if(j==1) {
					hm.put("����", inDatas[j]);
				}else if(j==2) {
					hm.put("�ּ�", inDatas[j]);
				}
			}
			dataList.add(hm);
		}
		
		for(HashMap hm : dataList) {
			System.out.println("�ּ�" + hm.get("�ּ�"));
			System.out.println("����" + hm.get("����"));
			System.out.println("�̸�" + hm.get("�̸�"));
		}
		
	}
}

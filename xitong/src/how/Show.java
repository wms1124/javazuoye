package how;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Show {
	private static List<Piao> piaos = new ArrayList<Piao>();
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++){
			Piao piao = new Piao();
			piao.setId(i);
			piao.setPiaof(i*10);
			piao.setPiaonum(5);
			piaos.add(piao);
			
		}
		while(true){
			System.out.println("��ӭ�����Զ���Ʊϵͳ���й�Ʊ!");
			System.out.println("ѡ����Ŀ�ĵ�Ϊ 1,2,3,4,5,6,7,8,9,����Ӧ��Ʊ��Ϊ10,20,30,40,50,60,70,80,90");
			System.out.println(",��ʼ��ʱ��ÿ��Ŀ�ĵ���5�ų�Ʊ��");
			Scanner scan = new Scanner(System.in);
			goupiao(scan);
			
		}
		
	}
	public static void goupiao(Scanner scan){
		while(true){
			System.out.println("������ѡ����Ŀ�ĵ�:");
			int target = scan.nextInt();
			System.out.println("��Ͷ��һ��Ǯ�ң�ע:Ǯ�ҵ���ֵ��10Ԫ ��20Ԫ��50Ԫ��100Ԫ��");
			int  mianzhi = scan.nextInt();
			System.out.println("��ȷ����Ʊ��1ȷ��0ȡ��");
			String ln = scan.next();
			if("0".equals(ln)){
				System.out.println("�˻�����Ǯ��Ϊ"+mianzhi);
			}else{
				Piao piaor = null;
				for(Piao piao :piaos){
					if(target==piao.getId()){
						piaor = piao;
					}
				}
		        if(piaor==null||piaor.getPiaof()>mianzhi||piaor.getPiaonum()==0){
		        	System.out.println("Ʊ����û����Ҫ���Ʊ����Ͷ���Ǯ����Ʊ��,���ܽ��й�Ʊ,�˻�����Ǯ��Ϊ"+mianzhi);
		        	
		        }
	             if(piaor!=null&&piaor.getPiaof()<=mianzhi&&piaor.getPiaonum()>0){
		        	System.out.println("���Ѿ����һ�ŵ���"+piaor.getId()+"Ŀ�ĵص�Ʊ,Ӧ�˻�����Ǯ��Ϊ"+(mianzhi*1.0-piaor.getPiaof()));
		        	piaor.setPiaonum(piaor.getPiaonum()-1);
		        	break;
		        }
			}
			
		}
	}
}

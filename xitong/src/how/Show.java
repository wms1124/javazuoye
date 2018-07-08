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
			System.out.println("欢迎您来自动售票系统进行购票!");
			System.out.println("选定的目的地为 1,2,3,4,5,6,7,8,9,所对应的票价为10,20,30,40,50,60,70,80,90");
			System.out.println(",开始的时候每个目的地有5张车票。");
			Scanner scan = new Scanner(System.in);
			goupiao(scan);
			
		}
		
	}
	public static void goupiao(Scanner scan){
		while(true){
			System.out.println("请输入选定的目的地:");
			int target = scan.nextInt();
			System.out.println("请投入一张钱币（注:钱币的面值有10元 、20元、50元、100元）");
			int  mianzhi = scan.nextInt();
			System.out.println("你确定购票？1确定0取消");
			String ln = scan.next();
			if("0".equals(ln)){
				System.out.println("退换您的钱币为"+mianzhi);
			}else{
				Piao piaor = null;
				for(Piao piao :piaos){
					if(target==piao.getId()){
						piaor = piao;
					}
				}
		        if(piaor==null||piaor.getPiaof()>mianzhi||piaor.getPiaonum()==0){
		        	System.out.println("票库中没有所要求的票或您投入的钱不够票价,不能进行购票,退还您的钱币为"+mianzhi);
		        	
		        }
	             if(piaor!=null&&piaor.getPiaof()<=mianzhi&&piaor.getPiaonum()>0){
		        	System.out.println("你已经获的一张到达"+piaor.getId()+"目的地的票,应退还您的钱币为"+(mianzhi*1.0-piaor.getPiaof()));
		        	piaor.setPiaonum(piaor.getPiaonum()-1);
		        	break;
		        }
			}
			
		}
	}
}

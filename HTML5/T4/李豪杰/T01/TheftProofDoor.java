
public class TheftProofDoor extends Door implements Locker {


	public String lock() {
		
		return "���Կ�ף�����ת��Ȧ�������ˣ��γ�Կ��";
	}

	
	public String unlock() {
		
		return "���Կ�ף�����ת��Ȧ���ſ��ˣ��γ�Կ��";
	}
	public String takePhoto(){
		return"����.....��Ƭ�Ѿ����档";
	}
	
	public static void main(String[]args){
		TheftProofDoor tf = new TheftProofDoor();
		System.out.println(tf.close());
		System.out.println(tf.lock());
		System.out.println(tf.takePhoto());
		System.out.println(tf.unlock());
		System.out.println(tf.open());
	}
	
	

}

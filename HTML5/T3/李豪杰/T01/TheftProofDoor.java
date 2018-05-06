
public class TheftProofDoor extends Door implements Locker {


	public String lock() {
		
		return "插进钥匙，向左转三圈，门锁了，拔出钥匙";
	}

	
	public String unlock() {
		
		return "插进钥匙，向右转三圈，门开了，拔出钥匙";
	}
	public String takePhoto(){
		return"咔嚓.....照片已经储存。";
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

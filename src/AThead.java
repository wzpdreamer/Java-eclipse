
public class AThead implements Runnable{
	int count = 1,number;
	public AThead(int num){
		number = num;
		System.out.println("Create thread..." + number);
	}
	@Override
	public void run() {
		synchronized(this) {
			while(count!=6) {
				System.out.println("Thread "+ number + ": Count= " + count);
				count++;
			}
		}
	}
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
        	new Thread(new AThead(i+1)).start();
        }
//        AThead t1 = new AThead(1);
//        Thread ta = new Thread(t1);
//        AThead t2 = new AThead(2);
//    	Thread tb = new Thread(t2);
//    	ta.start();
//    	tb.start();
	}
}

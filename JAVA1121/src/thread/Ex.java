package thread;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 프로그램(Program)
		 * - 디스크에 설치되어 있는 실행되기 전 상태의 소프트웨어
		 * 
		 * 프로세스(Process)
		 * - 설치된 프로그램을 실행하여 메모리에 로딩된 상태(= 실행중인 프로그램)
		 * - 멀티 태스킹(Multi Tasking)
		 *   => 프로세스가 여러 개 일 때 해당 프로세스들이 동시에 수행되는 것
		 *      (정확히는 CPU가 빠른 속도로 프로세스를 번갈아가면서 실행)
		 *   ex) 동영상을 재생하면서 웹페이지 표시, 음악 재생하는 것
		 *   
		 * 쓰레드(Thread)
		 * - 프로세스 내에서 작업의 최소 단위
		 * - 하나의 프로세스 내에는 최소 한 개의 쓰레드가 동작함(= Single Thread)
		 *   => 동시에 수행 가능한 작업은 단 하나뿐이다.
		 * - 하나의 프로세스 내에서 동시에 수행 가능한 작업을 늘리려면
		 *   멀티 쓰레드(Multi Thread)로 구현해야 한다!  
		 *   ex) 메신저 내에서 파일 전송과 메세지 송, 수신하는 것
		 */
		
		NoThread nt1 = new NoThread("★A작업★", 1000000);
		NoThread nt2 = new NoThread("○B작업○", 500000);
		NoThread nt3 = new NoThread("→C작업←", 1000000);
		
		nt1.run(); // A작업이 100만번 실행이 끝나면
		nt2.run(); // B작업이 실행되고, B작업이 50만번 실행이 끝나면
		nt3.run(); // C작업이 실행됨
		// => 일반적인 프로그램은 싱글쓰레드(Single Thread)이며
		//    앞의 코드가 실행이 끝나야만 다음 코드가 실행된다.
		
		

	}

}

class NoThread {
	String name;
	int count;
	
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}






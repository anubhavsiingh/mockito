package streamdemo;

import java.util.stream.IntStream;

/*
 * ava Parallel Streams is a feature of Java 8 and higher, meant for
 * utilizing multiple cores of the processor.

Normally any java code has one stream of processing, where it is executed sequentially.
Whereas by using parallel streams, we can divide the code into multiple
 streams that are executed in parallel on separate cores and the final
  result is the combination of the individual outcomes.
The order of execution, however, is not under our control.
 * 
 */

public class ParallelStreamDemo {

	public static void main(String[] args) {
		System.out.println("Seqeuntially");
		
		IntStream range = IntStream.rangeClosed(1, 2000);
		long t1= System.currentTimeMillis();
		//range.forEach(i->System.out.println(i+ "Thread:"+ Thread.currentThread().getName()));
		System.out.println(range.filter(i-> i%2==0).count());
		long t2= System.currentTimeMillis();
		System.out.println(t2-t1);
		//System.out.println("Parallel");
		
		System.out.println("Warmup...");
		
		IntStream range1 = IntStream.rangeClosed(1, 2000);
		long t3= System.currentTimeMillis();
		System.out.println(range1.parallel().filter(i-> i%2==0).count());
		long t4= System.currentTimeMillis();
		//range1.parallel().forEach(i->System.out.println(i+ "Thread:"+ Thread.currentThread().getName()));
		System.out.println(t4-t3);
	}

}

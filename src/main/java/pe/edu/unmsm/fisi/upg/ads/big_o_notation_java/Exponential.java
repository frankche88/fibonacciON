package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		long N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		for (int i = 1; i <= N; i++) {
			try {
				long fibonacci = exponential.fibonacciOnDinamica(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
		System.out.println(String.format("Time elapsed: %d milliseconds", stopwatch.elapsed(TimeUnit.MILLISECONDS)) + "\n");
	}
	
	public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
	
	
	
	
	public long fibonacciOn (int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("No se permiten ceros");
		}
		
		if(n <= 2) {
			return 1;
		}
		long a = 0;
		long b = 1;
		long c;
		
		for(int k=0; k < n; k++) {
			
			c= b +a;
			a = b;
			b = c;
		}
		
		return a;
		
	}
	
	
	public long fibonacciOnDinamica (int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("No se permiten ceros");
		}
		
		if(n <= 2) {
			return 1;
		}
		
		long vector[] = new long[n+1] ;
		vector[0] = 1;
		vector[1] = 0;
		
		for(int k=2; k < n +1; k++) {
			vector[k] = vector[k-1] + vector[k-2];
		}
		
		return vector[n];
		
		
	}
	
	
	
	
	
	
}

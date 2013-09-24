public class Stats {
	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,5,6,7,5,5};
		//max(a);
		//min(a);
		//mean(a);
		//median(a);
		//quartile1(a);
		// quartile3(a);
		//mode(a);
		//standardDeviation(a);
		//max
		//
		//min
		//
		//median
		//
		//quartile1
		//
		//quartile3
		//
		//mode
		//
		//standard deviation
	}
	public static int max(int[] a) {
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i] >max) {
				max = a[i];
			}
		}
		System.out.println(max);
		return max;
	}
	public static int min(int[] a) {
		int min = a[0];
		for (int i=a.length; i<=0; i--) {
			if(a[i] < a[i+1]) {
				min = a[i];
			}
		}
		System.out.println(min);
		return min;
	}
	public static double mean(int[] a) {
		int mean1 = 0;
		double meantot= 0;
		for (int i=0; i<a.length; i++) {
			mean1 = mean1 + a[i];
		}
		meantot = (mean1 / a.length);
		System.out.println(meantot);
		return meantot;
	}
	public static double median(int[] a) {
		int length = 0;
		double median = 0;
		for (int i=0; i<a.length; i++) {
			length++;
		}
		if ((length % 2) ==0) {
			median = (a.length / 2) + 0.5;
		} else {
			median = a[length / 2];
		}
		
		System.out.println(median);
		return median;
	}
	public static double quartile1(int[] a) {
		double quartile1 = 0;
		int length = 0;
		double median = median(a);
		for (int i=0; i<a.length; i++) {
			length++;
		}
		if ((length %2) ==0) {
			quartile1 = (double)a[length - 1] /4 + 0.25;
		} else {
			quartile1 = (double)a[(length - 1) /4];
		}
		
		
		System.out.println(quartile1);
		return quartile1;
	}
	
	public static double quartile3(int[] a) {
		double quartile3 = 0;
		int length = 0;
		double median = median(a);
		int divide = (1/4);

		for (int i=0; i<a.length; i++) {
			length++;
		}
		if ((length % 2) == 0) {
			quartile3 = (double)a[length] / 4;
		} else {
			quartile3 = (double)a[length  / 4];
		}
		System.out.println(quartile3);
		return quartile3;
	}
	public static int mode(int[] a) {
		int counter = 0;
		int maxCount = 0;
		int large = 0;
		for (int i=0; i<a.length; i++) {
			for (int j=a.length; j<=a[0]; j--) {
				if (a[i] == a[j]) {
					counter++;
				}
			}
				if(counter > maxCount) {
					counter = maxCount;
					large = a[i];
				}
				
			}
		System.out.println("A total of: " + maxCount + " times.");
		return maxCount;
	}
	public static double standardDeviation(int[] a) {
		double deviation = 0;
		double average = mean(a);
		for(int i=0;i<a.length;i++) {
			deviation += (a[i] - average) * (a[i] - average);
		}
		deviation = deviation / (a.length - 1);
		deviation = Math.sqrt(deviation);
		
		System.out.println("The Standard Deviation of Array A is: " + deviation);
		return deviation;
	}
	
}

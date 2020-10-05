package assignmentt2;

import acm.program.*;

public class fibonacci extends ConsoleProgram{
	int MAX_TERM_VALUE = 10000;

	public void run() {
		println("This program lists the Fibonacci sequence.");
		int f1 = 0;
		int f2 = 1;
		while (f1 <= MAX_TERM_VALUE) {
		println(f1);
		int f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
		}
	}
}

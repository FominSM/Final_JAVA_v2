package Model.User_input_console_1;

import java.util.Scanner;

import View.Printer;

public class Inputer_for_console {
	private Scanner scanner;
	
	public Inputer_for_console(Scanner scanner) throws RuntimeException {
		if (scanner == null) {
			throw new RuntimeException(Printer.scanner_is_crash);
		}
		this.scanner = scanner;
	}
	
	public String u_input() {
		return scanner.nextLine();
	}
}

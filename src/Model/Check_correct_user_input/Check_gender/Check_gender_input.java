package Model.Check_correct_user_input.Check_gender;

import View.Printer;


public class Check_gender_input {

	public static boolean is_gender(String s) throws RuntimeException{
		if (s == null) throw new RuntimeException(Printer.not_gender_data);
		if (s.replace(" ", "").equals("f") || s.replace(" ","").equals("m"))  return true;
		return false;
	}
}

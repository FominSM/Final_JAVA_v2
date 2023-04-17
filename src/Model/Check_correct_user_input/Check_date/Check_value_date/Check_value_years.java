package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Printer;

import java.time.Year;


public class Check_value_years {
	private static final int max_age = 140;

	public void is_true_year(String[] date) throws Error_date_value {
		int current_year = Year.now().getValue();
		if (Integer.parseInt(date[2]) < current_year-max_age || Integer.parseInt(date[2]) > current_year){
			throw new Error_date_value(Printer.error_age);
		}
	}
}

package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_format_date.Check_format_date;
import Model.Check_correct_user_input.Check_date.Check_format_date.Exception_of_error_enter_date.Error_date_format;
import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Printer;

import java.util.NoSuchElementException;


public class Checker_value_date {
	
	public void run_check(String[] user) throws  NullPointerException, NoSuchElementException, Error_date_value, Error_date_format {
		String[] date = user[3].split("\\.");
		if (date == null) {
			throw new NoSuchElementException(Printer.error_input + "\n" + Printer.not_date);
		}
		if (!Check_format_date.is_date(user[3])) {
			throw new Error_date_format(Printer.error_date + "\n" + Printer.error_date_info);
		}
		new Check_value_years().is_true_year(date);
		new Check_value_month().check_value_days(date);
		new Check_value_day().check_value_days(date);
	}
}

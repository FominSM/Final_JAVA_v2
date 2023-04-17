package Model.Check_correct_user_input.Check_size_data.Exception_of_error_size_array;

/**
 * Класс исключение, возбуждаемое в случае некорректной длины массива пользователя (иными словами, не корректный объём данных, который может быть спровоцирован
 * не правильным вводом разделителя_пробела, либо просто забывчивостью пользователя).
 */
public class Error_size_array extends RuntimeException{
	public Error_size_array(String message) {
		super(message);
	}
}

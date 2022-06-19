public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        // считаем количество нулей
        long countSpace = name.chars().filter(ch -> ch == ' ').count();
        // узнаем индекс пробела в имени
        int indexSpace = name.indexOf(' ');

        // проверка на длину от 3 до 19 символов включительно
        if (name.length() >= 3 && name.length() <= 19) {
            // проверка на то что в имени есть 1 пробел
            if (countSpace == 1) {
                // и этот пробел не в начале и не в конце имени
                if (indexSpace != 0 && indexSpace != name.length() - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
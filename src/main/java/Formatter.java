
public class Formatter {

    // Метод получения слова рубль в правильном падеже
    static String rubles(double sum) {
        if ((11 <= ((int)sum) % 100 ) && (((int)sum) % 100 <= 20)) {
            return "рублей";
        } else {
            switch (((int)sum) % 10) {
                case 1:
                    return "рубль";
                case 2:
                    return "рубля";
                case 3:
                    return "рубля";
                case 4:
                    return "рубля";
                default:
                    return "рублей";
            }
        }
    }

    // Метод для округления
    static String rounding(double num) {
        return String.format("%.2f", num);
    }
}

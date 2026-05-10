package easy_strings;

public class StringToInteger {

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length();

        // 1. Пропускаем пробелы
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // 2. Определяем знак
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // 3. Конвертируем цифры и проверяем на переполнение
        int res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';

            // Проверка на overflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
        }

        return res * sign;
    }

    public static void main(String[] args) {

    }
}

package codewars.sixKu.seven_ku;

/*
Журнал оценок
Доработайте функцию так, чтобы она вычисляла среднее значение трех переданных ей оценок и возвращала буквенное обозначение, соответствующее этой оценке.

Числовой балл	Буквенная оценка
90 <= балл <= 100	«А»
80 <= балл < 90	'Б'
70 <= балл < 80	'С'
60 <= балл < 70	'D'
0 <= балл < 60	'F'
Все проверяемые значения находятся в диапазоне от 0 до 100. Нет необходимости проверять отрицательные значения или значения больше 100.
 */
public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        if (average < 60) {
            return 'F';
        } else if (average < 70) {
            return 'D';
        } else if (average < 80) {
            return 'C';
        } else if (average < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}

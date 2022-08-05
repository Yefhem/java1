import java.util.Scanner;

public class zodiacSign {
    public static void main(String[] args) {
        int day, month;
        Boolean isError = false;
        String zodiacSign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("What day were you born: ");
        day = input.nextInt();

        if (!(day <= 31 && day >= 1)) {
            isError = true;
        }

        System.out.print("What month were you born: ");
        month = input.nextInt();

        if (!(month <= 12 && month >= 1)) {
            isError = true;
        }

            if (month == 1) {
                if (day <= 21) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
            } else if (month == 2) {
                if (day <= 19) {
                    zodiacSign = "Aquarius";
                }else {
                    zodiacSign = "Pisces";
                }
            } else if (month == 3) {
                if (day <= 20) {
                    zodiacSign = "Pisces";
                }else {
                    zodiacSign = "Aries";
                }
            } else if (month == 4) {
                if (day <= 20) {
                    zodiacSign = "Aries";
                }else {
                    zodiacSign = "Taurus";
                }
            } else if (month == 5) {
                if (day <= 21) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
            } else if (month == 6) {
                if (day <=  22) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
            } else if (month == 7) {
                if (day <= 22) {
                    zodiacSign = "Cancer";
                }else {
                    zodiacSign = "Leo";
                }
            } else if (month == 8) {
                if (day <= 22) {
                    zodiacSign = "Leo";
                }else {
                    zodiacSign = "Virgo";
                }
            } else if (month == 9) {
                if (day <= 22) {
                    zodiacSign = "Virgo";
                }else {
                    zodiacSign = "Libra";
                }
            } else if (month == 10) {
                if (day <= 22) {
                    zodiacSign = "Libra";
                }else {
                    zodiacSign = "Scorpio";
                }
            } else if (month == 11) {
                if (day <= 21) {
                    zodiacSign = "Scorpio";
                }else {
                    zodiacSign = "Sagittarius";
                }
            } else if (month == 12) {
                if (day <= 21) {
                    zodiacSign = "Sagittarius";
                }else {
                    zodiacSign = "Capricorn";
                }
            }else {
                isError = true;
            }



        if (isError == true) {
            System.out.println("there's a mistake");
        }else {
            System.out.println("your zodiac Sign: "+ zodiacSign);
        }
    }
}

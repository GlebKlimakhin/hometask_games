package HomeTask3;

import java.util.Random;
import java.util.Scanner;
//угадай число

public class Main {

    public static void main(String[] args) {
        boolean nextTry=true;
        guessTheNumber(nextTry);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessTheWord(words);

    }

    static void guessTheNumber(boolean tryAgain)
            {
            if(tryAgain) {
            int num = (int)(Math.random()*9);
            System.out.println(num);//загаданное число
            System.out.println("Введите целое число");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt())
            {
                    for(int i=0 ; i<3 ; i++)
                    {
                        int guess = scan.nextInt();
                        boolean counter = i<2;
                        if(guess==num)
                       {
                           System.out.println("Вы угадали! Загаданное число - " + num);
                           System.out.println("Хотите сыграть ещё?(да/нет)");
                           callMoreTry();
                           return;

                       }
                       else if (guess>num && counter)
                       {
                           System.out.println("Загаданное число меньше");
                       }
                       else if(guess<num && counter)
                       {
                           System.out.println("Загаданное число больше");
                       }
                       else
                           {
                           System.out.println("Вы проиграли. Загаданное число - " + num);
                           System.out.println("Хотите сыграть ещё? Введите да/нет");
                           callMoreTry();
                           return;
                            }

                        }

                        }
            else
                {
                System.out.println("Перезапустите программу и повторите ввод (целое число от 0 до 9)");
                }

        }
            else
            {
                System.out.println("Игра окончена");
            }
    }

                static void callMoreTry()
                {
                    boolean tryAgain;
                    String yesOrNo;
                    Scanner scan = new Scanner(System.in);
                    yesOrNo = scan.nextLine();
                    if(yesOrNo.equals("да"))
                    {
                        tryAgain=true;
                        guessTheNumber(tryAgain);
                    }
                    else if(yesOrNo.equals("нет"))
                        {
                        tryAgain = false;
                        guessTheNumber(tryAgain);
                    }
                    else
                        System.out.println("Перезапустите программу и в случае переигровки введите да/нет");
                }


                //задание 2
    static void guessTheWord(String words []) {
        String correctWord = words[(int) (Math.random() * words.length)];
        System.out.println(correctWord);
        while (true) {
            Scanner scan = new Scanner(System.in);
            String guess = scan.nextLine();
            if (correctWord.equals(guess)) {
                System.out.println("Вы угадали! Загаданное слово - " + correctWord);
                break;
            }
            else {
                for (int i = 0; i < correctWord.length(); i++) {
                    if (correctWord.charAt(i) == guess.charAt(i)) {
                        System.out.print(correctWord.charAt(i));
                        if (correctWord.charAt(i + 1) != guess.charAt(i + 1)) {
                            System.out.println("###############");
                            break;
                        }
                    }
                }
            }
        }
    }
    }

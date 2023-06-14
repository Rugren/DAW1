package Otros;

import java.util.Random;
public class RandomExaIngles {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

        Random preguntaRandom = new Random();
        
            int aleatorio = preguntaRandom.nextInt(15) + 1;
            
            switch(aleatorio) {
                case 1:
                    System.out.println("1. Can you tell me a little about yourself? ");
                    break;
                case 2:
                    System.out.println("2. How did you hear about the position? ");
                    break;
                case 3:
                    System.out.println("3. What do you know about the company (Everis)? ");
                    break;
                case 4:
                    System.out.println("4. Why do you want this job?  ");
                    break;
                case 5:
                    System.out.println("5. Why should we hire you?  ");
                    break;
                case 6:
                    System.out.println("6. What are your strengths and weaknesses?  ");
                    break;
                case 7:
                    System.out.println("7. What are your salary requirements? ");
                    break;
                case 8:
                    System.out.println("8. Why are you leaving your current job? ");
                    break;
                case 9:
                    System.out.println("9. Where do you see yourself in five years?  ");
                    break;
                case 10:
                    System.out.println("10. What makes you passionate about your profession? ");
                    break;
                case 11:
                    System.out.println("11. What is your experience designing websites?  ");
                    break;
                case 12:
                    System.out.println("12. What programming languages are you proficient in? ");
                    break;
                case 13:
                    System.out.println("13. What was the last project you worked on? ");
                    break;
                case 14:
                    System.out.println("14. Give an example of a website that you don’t like, point out what’s wrong. ");
                    break;
                case 15:
                    System.out.println("15. What are your key responsibilities in your current organisation? ");
                    break;
        }

    }
    }


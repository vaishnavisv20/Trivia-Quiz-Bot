package Quizbot;
import java.util.*;
public class Trivia {
	static class Question {
		
	    String question;
	    String[] options;
	    char answer;
	    Question(String question, String[] options, char answer) {
	            this.question = question;
	            this.options = options;
	            this.answer = answer;
	        }
	    }
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        List<Question> questions = new ArrayList<>();

	        // Coding-related
	        questions.add(new Question("Which data structure uses FIFO order?",
	                new String[]{"A) Stack", "B) Queue", "C) Tree", "D) Graph"}, 'B'));
	        questions.add(new Question("What is the time complexity of binary search?",
	                new String[]{"A) O(n)", "B) O(log n)", "C) O(n^2)", "D) O(1)"}, 'B'));
	        questions.add(new Question("Which language is primarily used for Android development?",
	                new String[]{"A) Java", "B) Python", "C) C#", "D) PHP"}, 'A'));
	        questions.add(new Question("Which of these is not an OOP concept?",
	                new String[]{"A) Inheritance", "B) Encapsulation", "C) Compilation", "D) Polymorphism"}, 'C'));
	        questions.add(new Question("What keyword is used to inherit a class in Java?",
	                new String[]{"A) implements", "B) extends", "C) inherits", "D) superclass"}, 'B'));

	        // Aptitude-related
	        questions.add(new Question("If 12 workers build a wall in 6 days, how many days for 8 workers?",
	                new String[]{"A) 4", "B) 6", "C) 9", "D) 8"}, 'C'));
	        questions.add(new Question("What is 25% of 240?",
	                new String[]{"A) 40", "B) 50", "C) 60", "D) 70"}, 'C'));
	        questions.add(new Question("A train 120m long crosses a man in 6 seconds. Speed?",
	                new String[]{"A) 60 km/h", "B) 72 km/h", "C) 54 km/h", "D) 80 km/h"}, 'B'));
	        questions.add(new Question("Find the next number: 2, 6, 12, 20, ?",
	                new String[]{"A) 28", "B) 30", "C) 32", "D) 34"}, 'A'));
	        questions.add(new Question("Simplify: (15 + 5) × 2 - 10 ÷ 2",
	                new String[]{"A) 30", "B) 35", "C) 40", "D) 25"}, 'C'));

	        // GK-related
	        questions.add(new Question("Who is known as the Father of Computers?",
	                new String[]{"A) Alan Turing", "B) Charles Babbage", "C) John von Neumann", "D) Bill Gates"}, 'B'));
	        questions.add(new Question("Which planet is known as the Red Planet?",
	                new String[]{"A) Mars", "B) Venus", "C) Jupiter", "D) Saturn"}, 'A'));
	        questions.add(new Question("Who wrote the national anthem of India?",
	                new String[]{"A) Mahatma Gandhi", "B) Rabindranath Tagore", "C) Bankim Chandra Chatterjee", "D) Subhash Chandra Bose"}, 'B'));
	        questions.add(new Question("What is the capital of Australia?",
	                new String[]{"A) Sydney", "B) Canberra", "C) Melbourne", "D) Perth"}, 'B'));
	        questions.add(new Question("Which gas is essential for respiration?",
	                new String[]{"A) Nitrogen", "B) Carbon Dioxide", "C) Oxygen", "D) Hydrogen"}, 'C'));
	        questions.add(new Question("Which is the largest ocean in the world?",
	                new String[]{"A) Indian Ocean", "B) Atlantic Ocean", "C) Arctic Ocean", "D) Pacific Ocean"}, 'D'));
	        questions.add(new Question("In which year did India gain independence?",
	                new String[]{"A) 1945", "B) 1947", "C) 1950", "D) 1952"}, 'B'));
	        questions.add(new Question("Which instrument measures atmospheric pressure?",
	                new String[]{"A) Thermometer", "B) Barometer", "C) Hygrometer", "D) Altimeter"}, 'B'));
	        questions.add(new Question("Who developed the theory of relativity?",
	                new String[]{"A) Isaac Newton", "B) Albert Einstein", "C) Galileo Galilei", "D) Nikola Tesla"}, 'B'));
	        questions.add(new Question("Which is the smallest prime number?",
	                new String[]{"A) 0", "B) 1", "C) 2", "D) 3"}, 'C'));

	        Collections.shuffle(questions);
	        int total = Math.min(20, questions.size());
	        int score = 0;

	        System.out.println("===== Welcome to Trivia Quiz Bot =====");
	        System.out.println("Answer using A, B, C, or D.\n");

	        for (int i = 0; i < total; i++) {
	            Question q = questions.get(i);
	            System.out.println("Q" + (i + 1) + ": " + q.question);
	            for (String opt : q.options) {
	                System.out.println(opt);
	            }
	            System.out.print("Your answer: ");
	            char ans = Character.toUpperCase(sc.next().charAt(0));

	            if (ans == q.answer) {
	                System.out.println("✅ Correct!\n");
	                score++;
	            } else {
	                System.out.println("❌ Wrong! Correct answer: " + q.answer + "\n");
	            }
	        }

	        System.out.println("===== Quiz Finished! =====");
	        System.out.println("Your Score: " + score + " out of " + total);

	        if (score >= total * 0.8)
	            System.out.println("🏆 Excellent!");
	        else if (score >= total * 0.5)
	            System.out.println("👍 Good effort!");
	        else
	            System.out.println("📖 Keep practicing!");

	        sc.close();
	    }
	}




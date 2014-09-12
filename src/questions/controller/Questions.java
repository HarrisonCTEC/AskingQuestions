package questions.controller;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;

	public void start()
	{
		//askSomeoneElseQueestions();
		askQuestionsGUI();
	}

	public Questions()
	{
		questionScanner = new Scanner(System.in);
	}

	public void askQuestions()
	{
		System.out.println(System.getProperty("user.name"));
		System.out.println("What is your name?");
		String answer = questionScanner.nextLine();

		System.out.println("Why, hello there " + answer + ". How are you today?");
		answer = questionScanner.nextLine();

		System.out.println("You feel like " + answer + ", uhh that's nice... quietly leaving the room.");

		System.out.println("How old are you?");
		answer = questionScanner.nextLine();

		if (Integer.parseInt(answer) >= 30)
		{
			System.out.println("Wow, thats old..");

		}
		else
		{
			System.out.println("Cool!");
		}

	}
	
	private void askQuestionsGUI()
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog(name + ", how old are you?");
		if (Integer.parseInt(age) >= 50)
		{
			JOptionPane.showMessageDialog(null, "Wow, that's old");
		}
		else if (Integer.parseInt(age) >= 19) {
			JOptionPane.showMessageDialog(null, "Ok.");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You must be in high school.");
			String school = JOptionPane.showInputDialog(null, "What high school do you go to?");
			if (Arrays.asList("alta", "alta high school", "alta high").contains(school.toLowerCase())){
				JOptionPane.showMessageDialog(null, "Alta High School's mascot is the Hawks. Their colors are black and silver.");
			}
			
			
			
		}
		
	}
	
	
	public void askSomeoneElseQuestions()
	{

		String[] myStringArray = {"a","b","c"};
		
		System.out.println("What is your name?");
		String name = questionScanner.nextLine();
		
		System.out.println(name + ", how old are you?");
		String age = questionScanner.nextLine();
		if (Integer.parseInt(age) >= 50)
		{
			System.out.println("Wow, thats old..");
		}
		else
		{
			System.out.println("Cool!");
		}
		
		System.out.println("What high school do you go to?");
		String school = questionScanner.nextLine();
		
	}
}

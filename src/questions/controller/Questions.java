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
		String name = JOptionPane.showInputDialog("123What is your name?");
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
				JOptionPane.showMessageDialog(null, "Alta High School's mascot is the hawks. Their colors are black and silver.");
			}
			else if (Arrays.asList("brighton", "brighton high", "brightong high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "Brighton High School's mascot is the bengal tiger. Their colors are blue, orange, and white.");
			}
			else if (Arrays.asList("hillcrest", "hillcrest high", "hillcrest high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "Hillcrest High School's mascot is the huskies. Their colors are green and white.");
			}
			else if (Arrays.asList("bingham", "bingham high", "bingham high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "Bingham High School's mascot is the Miners. Their colors are blue and white.");
			}
			else if (Arrays.asList("copper hills", "copper hills high", "copper hills high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "Copper Hills High School's mascot is the Grizzlys. Their colors are green and blue.");
			}
			else if (Arrays.asList("herriman", "herriman high", "herriman high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "Herriman High School's mascot is the Mustangs. Their colors are blue, red, and gold.");
			}
			else if (Arrays.asList("riverton", "riverton high", "riverton high school").contains(school.toLowerCase()))
			{
				JOptionPane.showMessageDialog(null, "");
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

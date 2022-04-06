package hello_dialog;

import javax.swing.*;

/**
 * Project:  Java_Programming
 * Module:   Chapter01
 * Package:  hello_dialog
 * File:     HelloDialog
 * Created on: Tue, 05-Apr-2022
 * Created by: Kimberly Henry
 **/
public class HelloDialog
	{
		public static void main(String[] args)
			{
				JOptionPane.showMessageDialog(null, "Hello, world!",
						"First Dialog Box", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
	}

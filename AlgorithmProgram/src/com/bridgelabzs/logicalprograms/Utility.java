package com.bridgelabzs.logicalprograms;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scn;
	Random random;

	public Utility() {
		scn= new Scanner(System.in);
		random = new Random();
	}
	public int integerInput()
    {
  	  return scn.nextInt();
    }
	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public void ticTacToe() {
		int pc = 0;
		int user = 0;
		int[][] a = new int[3][3];
		int t = 0, count = 0, s = 0, u = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = -1;
			}
		}
		while (t == 0) {
			count = 0;
			s = 0;
			u = 0;
			int r = inputRandom(3);
			int c = inputRandom(3);
			int countPcIn = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1)
						countPcIn++;
				}
			}

			while (s == 0 && countPcIn > 0) {
				if (a[r][c] == -1) {
					System.out.println(r + " " + c);
					a[r][c] = 0;
					s = 1;
				} else {
					r = inputRandom(3);
					c = inputRandom(3);
				}
			}

			if (a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0) {
				pc++;
				break;
			} else if (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0) {
				pc++;
				break;
			} else if (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][0] == 0 && a[1][0] == 0 && a[2][0] == 0) {
				pc++;
				break;
			} else if (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0) {
				pc++;
				break;
			} else if (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) {
				pc++;
				break;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] >= 0)
						System.out.print(" " + a[i][j] + " ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("==========\n");
			int countUserIn = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1)
						countUserIn++;
				}
			}

			if (countUserIn > 0)
				System.out.println("Empty cells are");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1) {
						System.out.println(i + " " + j);
					}
				}
			}

			if (countUserIn > 0) {
				System.out.println("Enter the cell");
				r = integerInput();
				c = integerInput();
			}

			while (u == 0 && countUserIn > 0) {
				if (a[r][c] == -1) {
					a[r][c] = 1;
					u = 1;
				} else {
					System.out.println("Enter the cells numbers from\nabove indexes");
					r = integerInput();
					c = integerInput();
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] >= 0)
						System.out.print(" " + a[i][j] + " ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("==========\n");

			if (a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1) {
				user++;
				break;
			} else if (a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1) {
				user++;
				break;
			} else if (a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1) {
				user++;
				break;
			} else if (a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1) {
				user++;
				break;
			} else if (a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) {
				user++;
				break;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1) {
						count++;
					}
				}
			}
			if (count != 0) {
				t = 0;
			} else {
				t = 1;
			}

		}
		System.out.println("==========");
		System.out.println();
		if (pc > 0)
			System.out.println("Computer wins");
		else if (user > 0)
			System.out.println("User wins");
		System.out.println("Ends");
	}
}

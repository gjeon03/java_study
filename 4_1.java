import java.util.Scanner;

class FlowEx1 {
	public static void main(String[] args) {
		try {
			while (true) {
				System.out.println("조건문, 반복문 중 숫자를 하나 입력하세요.");
				System.out.println("1. 조건문");
				System.out.println("2. 반복문");
				System.out.println("(그 외는 종료)");
				System.out.print(" > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();

				int input = Integer.parseInt(tmp);

				switch (input) {
					case 1:
						System.out.println("------------------------------------------");
						System.out.println("조건문");
						conditionalStatement();
						break;
					case 2:
						System.out.println("------------------------------------------");
						System.out.println("반복문");
						repeatStatement();
						break;
					default:
						throw new Exception();
				}
				System.out.println("------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("종료");
		}
	}

	public static void conditionalStatement() {
		try {
			while (true) {
				System.out.println("실행할 Exemple 숫자를 하나 입력하세요.");
				System.out.println("1. if");
				System.out.println("2. if문의 블럭{}");
				System.out.println("3. if - else");
				System.out.println("4. if - else if");
				System.out.println("5. 중첩 if");
				System.out.println("6. switch");
				System.out.println("7. 가위바위보");
				System.out.println("8. 주민등록번호");
				System.out.println("9. if to switch");
				System.out.println("10. 기교");
				System.out.println("11. switch문의 중첩");
				System.out.println("(그 외는 종료)");
				System.out.print(" > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();

				int input = Integer.parseInt(tmp);

				switch (input) {
					case 1: {
						System.out.println("EX1");
						ex_1();
						break;
					}
					case 2:
						System.out.println("EX2");
						ex_2();
						break;
					case 3:
						System.out.println("EX3");
						ex_3();
						break;
					case 4:
						System.out.println("EX4");
						ex_4();
						break;
					case 5:
						System.out.println("EX5");
						ex_5();
						break;
					case 6:
						System.out.println("EX6");
						ex_6();
						break;
					case 7:
						System.out.println("EX7");
						ex_7();
						break;
					case 8:
						System.out.println("EX8");
						ex_8();
						break;
					case 9:
						System.out.println("EX9");
						ex_9();
						break;
					case 10:
						System.out.println("EX10");
						ex_10();
						break;
					case 11:
						System.out.println("EX11");
						ex_11();
						break;
					default:
						throw new Exception();
				}
				System.out.println("------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("종료");
		}
	}

	public static void ex_1() {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x == 0");
		if (x != 0)
			System.out.println("x != 0");
		if (!(x == 0))
			System.out.println("!(x == 0)");
		if (!(x != 0))
			System.out.println("!(x != 0)");

		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x == 0");
		if (x != 0)
			System.out.println("x != 0");
		if (!(x == 0))
			System.out.println("!(x == 0)");
		if (!(x != 0))
			System.out.println("!(x != 0)");
	}

	public static void ex_2() {
		while (true) {
			try {
				int input;

				System.out.print("숫자를 하나 입력하세요. ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);
				String tmp = scanner.nextLine();

				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				input = Integer.parseInt(tmp);

				if (input == 0) {
					System.out.println("입력하신 숫자는 0입니다.");
				}

				if (input != 0)
					System.out.println("입력하신 숫자는 0이 아닙니다.");
				System.out.printf("입력하신 숫자는 %d입니다.%n", input);
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_3() {
		while (true) {
			try {
				System.out.print("숫자를 하나 입력하세요. ('q' 종료) > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				int input = Integer.parseInt(tmp);

				if (input == 0) {
					System.out.println("입력하신 숫자는 0입니다.");
				} else {
					System.out.println("입력하신 숫자는 0이 아닙니다.");
				}
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_4() {
		while (true) {
			try {
				int score = 0;
				char grade = ' ';

				System.out.print("점수를 입력하세요. ('q' 종료) > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				score = Integer.parseInt(tmp);

				if (score >= 90) {
					grade = 'A';
				} else if (score >= 80) {
					grade = 'B';
				} else if (score >= 70) {
					grade = 'C';
				} else {
					grade = 'D';
				}
				System.out.println("당신의 학점은 " + grade + "입니다.");
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_5() {
		while (true) {
			try {
				int score = 0;
				char grade = ' ', opt = '0';

				System.out.print("점수를 입력해주세요. ('q' 종료) > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				score = Integer.parseInt(tmp);

				System.out.printf("당신의 점수는 %d입니다.%n", score);

				if (score >= 90) {
					grade = 'A';
					if (score >= 98) {
						opt = '+';
					} else if (score < 94) {
						opt = '-';
					}
				} else if (score >= 80) {
					grade = 'B';
					if (score >= 88) {
						opt = '+';
					} else if (score < 84) {
						opt = '-';
					}
				} else {
					grade = 'C';
				}

				System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_6() {
		while (true) {
			try {
				System.out.print("현재 월을 입력하세요. ('q' 종료) > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				int month = Integer.parseInt(tmp);

				switch (month) {
					case 3:
					case 4:
					case 5:
						System.out.println("현재의 계절은 봄입니다.");
						break;
					case 6:
					case 7:
					case 8:
						System.out.println("현재의 계절은 여름입니다.");
						break;
					case 9:
					case 10:
					case 11:
						System.out.println("현재의 계절은 가을입니다.");
						break;
					case 12:
					case 1:
					case 2:
						System.out.println("현재의 계절은 겨울입니다.");
				}

			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_7() {
		while (true) {
			try {
				System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. ('q' 종료) > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				int user = Integer.parseInt(tmp);

				if (!(0 < user && user < 4)) {
					throw new Exception();
				}

				int com = (int) (Math.random() * 3) + 1;

				System.out.println("당신은 " + user + "입니다.");
				System.out.println("컴은 " + com + "입니다.");

				switch (user - com) {
					case 2:
					case -1:
						System.out.println("당신은 졌습니다.");
						break;
					case 1:
					case -2:
						System.out.println("당신은 이겼습니다.");
						break;
					case 0:
						System.out.println("비겼습니다.");
				}
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_8() {
		while (true) {
			try {
				System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				} else if (tmp.length() != 14) {
					throw new Exception();
				}

				char gender = tmp.charAt(7);

				switch (gender) {
					case '1':
					case '3':
						System.out.println("당신은 남자입니다.");
						break;
					case '2':
					case '4':
						System.out.println("당신은 여자입니다.");
						break;
					default:
						System.out.println("유효하지 않은 주민등록번호입니다.");
				}
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_9() {
		while (true) {
			try {
				char grade = ' ';

				System.out.print("당신의 점수를 입력하세요. (1~100) ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				int score = Integer.parseInt(tmp);

				switch (score) {
					case 100:
					case 99:
					case 98:
					case 97:
					case 96:
					case 95:
					case 94:
					case 93:
					case 92:
					case 91:
					case 90:
						grade = 'A';
						break;
					case 89:
					case 88:
					case 87:
					case 86:
					case 85:
					case 84:
					case 83:
					case 82:
					case 81:
					case 80:
						grade = 'B';
						break;
					case 79:
					case 78:
					case 77:
					case 76:
					case 75:
					case 74:
					case 73:
					case 72:
					case 71:
					case 70:
						grade = 'C';
						break;
					default:
						grade = 'F';
				}

				System.out.println("당신의 학점은 " + grade + "입니다.");
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_10() {
		while (true) {
			try {
				int score = 0;
				char grade = ' ';

				System.out.print("당신의 점수를 입력하세요. (1~100) ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				score = Integer.parseInt(tmp);

				switch (score / 10) {
					case 10:
					case 9:
						grade = 'A';
						break;
					case 8:
						grade = 'B';
						break;
					case 7:
						grade = 'C';
						break;
					default:
						grade = 'F';
				}

				System.out.println("당신의 학점은 " + grade + "입니다.");
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_11() {
		while (true) {
			try {
				System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				} else if (tmp.length() != 14) {
					throw new Exception();
				}

				char gender = tmp.charAt(7);

				switch (gender) {
					case '1':
					case '3':
						switch (gender) {
							case '1':
								System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
								break;
							case '3':
								System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
						}
						break; // 주의
					case '2':
					case '4':
						switch (gender) {
							case '2':
								System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
								break;
							case '4':
								System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
						}
						break; // 주의
					default:
						System.out.println("유효하지 않은 주민등록번호입니다.");
				}
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void repeatStatement() {
		try {
			while (true) {
				System.out.println("실행할 Exemple 숫자를 하나 입력하세요.");
				System.out.println("1. for_1");
				System.out.println("2. for_2");
				System.out.println("3. for_3");
				System.out.println("4. 다양한 연산자");
				System.out.println("5. 중첩 for문 * 사각형");
				System.out.println("6. 중첩 for문 * 삼각형");
				System.out.println("7. 구구단");
				System.out.println("8. 3개 중첩");
				System.out.println("9. 2중 반복문");
				System.out.println("10. for, if");
				System.out.println("11. 향상된 for문");
				System.out.println("12. while");
				System.out.println("13. 카운트 다운");
				System.out.println("14. 각 자리수의 합");
				System.out.println("15. 누적 합계 100");
				System.out.println("16. 입력값 누적 합계");
				System.out.println("17. 업다운");
				System.out.println("18. 369");
				System.out.println("19. break");
				System.out.println("20. continue");
				System.out.println("21. 메뉴선택");
				System.out.println("22. 이름 붙은 반복문_1");
				System.out.println("23. 이름 붙은 반복문_2");
				System.out.println("(그 외는 종료)");
				System.out.print(" > ");
				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();

				int input = Integer.parseInt(tmp);

				switch (input) {
					case 1:
						System.out.println("EX1");
						ex_2_1();
						break;
					case 2:
						System.out.println("EX2");
						ex_2_2();
						break;
					case 3:
						System.out.println("EX3");
						ex_2_3();
						break;
					case 4:
						System.out.println("EX4");
						ex_2_4();
						break;
					case 5:
						System.out.println("EX5");
						ex_2_5();
						break;
					case 6:
						System.out.println("EX6");
						ex_2_6();
						break;
					case 7:
						System.out.println("EX7");
						ex_2_7();
						break;
					case 8:
						System.out.println("EX8");
						ex_2_8();
						break;
					case 9:
						System.out.println("EX9");
						ex_2_9();
						break;
					case 10:
						System.out.println("EX10");
						ex_2_10();
						break;
					case 11:
						System.out.println("EX11");
						ex_2_11();
						break;
					case 12:
						System.out.println("EX12");
						ex_2_12();
						break;
					case 13:
						System.out.println("EX13");
						ex_2_13();
						break;
					case 14:
						System.out.println("EX14");
						ex_2_14();
						break;
					case 15:
						System.out.println("EX15");
						ex_2_15();
						break;
					case 16:
						System.out.println("EX16");
						ex_2_16();
						break;
					case 17:
						System.out.println("EX17");
						ex_2_17();
						break;
					case 18:
						System.out.println("EX18");
						ex_2_18();
						break;
					case 19:
						System.out.println("EX19");
						ex_2_19();
						break;
					case 20:
						System.out.println("EX20");
						ex_2_20();
						break;
					case 21:
						System.out.println("EX21");
						ex_2_21();
						break;
					case 22:
						System.out.println("EX22");
						ex_2_22();
						break;
					case 23:
						System.out.println("EX23");
						ex_2_23();
						break;
					default:
						throw new Exception();
				}
				System.out.println("------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("종료");
		}
	}

	public static void ex_2_1() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);

		for (int i = 1; i <= 5; i++)
			System.out.print(i);

		System.out.println();
	}

	public static void ex_2_2() {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	}

	public static void ex_2_3() {
		for (int i = 1, j = 10; i < 10; i++, j--)
			System.out.printf("%d \t %d%n", i, j);
	}

	public static void ex_2_4() {
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");

		for (int i = 1; i <= 10; i++)
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
	}

	public static void ex_2_5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void ex_2_6() {
		while (true) {
			try {
				int num = 0;

				System.out.print("*을 출력할 라인의 수를 입력하세요. ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				num = Integer.parseInt(tmp);

				for (int i = 0; i < num; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_2_7() {
		for (int i = 2; i <= 9; i++)
			for (int j = 1; j <= 9; j++)
				System.out.printf("%d x %d = %d%n", i, j, i * j);
		System.out.println("test");

	}

	public static void ex_2_8() {
		for (int i = 0; i < 3; i++)
			for (int j = 1; j <= 3; j++)
				for (int k = 1; k <= 3; k++)
					System.out.println("" + i + j + k);
	}

	public static void ex_2_9() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
	}

	public static void ex_2_10() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else {
					System.out.printf("%6c", ' ');
				}
			}
			System.out.println();
		}
	}

	public static void ex_2_11() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();

		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum=" + sum);

		System.out.println("추가------------------------");
		ex_2_11_1();
	}

	public static void ex_2_11_1() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();

		for (int tmp : arr) {
			tmp = 1;
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println(arr);
		System.out.println("sum=" + sum);
	}

	public static void ex_2_12() {
		int i = 5;

		while (i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
	}

	public static void ex_2_13() {
		int i = 11;

		System.out.println("카운트 다운을 시작합니다.");

		while (i-- != 0) {
			System.out.println(i);

			for (int j = 0; j < 2_000_000_000; j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}

	public static void ex_2_14() {
		while (true) {
			try {
				int num = 0, sum = 0;
				System.out.print("숫자를 입력하세요. (예:12345) ('q' 종료) > ");

				Scanner scanner = new Scanner(System.in);

				String tmp = scanner.nextLine();
				if (tmp.charAt(0) == 'q' && tmp.length() == 1) {
					break;
				}

				num = Integer.parseInt(tmp);

				while (num != 0) {
					sum += num % 10;
					System.out.printf("sum%3d num=%d%n", sum, num);

					num /= 10;
				}

				System.out.println("각 자리수의 합: " + sum);
			} catch (Exception e) {
				System.out.println("조건에 제시된 문자만 입력해주세요.");
			}
		}
	}

	public static void ex_2_15() {
		int sum = 0;
		int i = 0;

		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}

	public static void ex_2_16() {
		try {
			int num;
			int sum = 0;
			boolean flag = true;
			Scanner scanner = new Scanner(System.in);

			System.out.print("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력) > ");

			while (flag) {
				System.out.print(">>");

				String tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);

				if (num != 0) {
					sum += num;
				} else {
					flag = false;
				}
			}

			System.out.println("합계 : " + sum);
		} catch (Exception e) {
			System.out.println("조건에 제시된 문자만 입력해주세요.");
		}
	}

	public static void ex_2_17() {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1; // 1 ~ 100 사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요. > ");
			input = scanner.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);

		System.out.println("정답입니다.");
	}

	public static void ex_2_18() {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;

			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
					System.out.print("짝");
			} while ((tmp /= 10) != 0);
			System.out.println();
		}
	}

	public static void ex_2_19() {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

	public static void ex_2_20() {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}

	public static void ex_2_21() {
		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}

			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
	}

	public static void ex_2_22() {
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1;
				// break;
				// continue Loop1;
				// continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

	public static void ex_2_23() {
		int menu = 0, num = 0;

		Scanner scanner = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}

			for (;;) {
				System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료: 99) >");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0)
					break;
				if (num == 99)
					break outer;
				switch (menu) {
					case 1:
						System.out.println("result=" + num * num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result=" + Math.log(num));
						break;
				}
			}
		}
	}
}
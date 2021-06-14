import java.io.*;

public class BankAccountSystem
{
	public static void main ()throws IOException
	{
		String name[] = {"Rohan Verma", "Rahul Khanna", "Kabir Mehra", "Aisha Kapoor", "Kiara Sharma", "Sumit Verma", "Neha Mahajan", "Maira Rajput"};
		int pin[] = {1234, 9876, 5548, 7534, 4083, 9823, 5634, 9173};
		int bal[] = {67590, 76590, 76965, 123400, 78595, 6785, 76855, 76866};
		int i;
		int accnum[] ={115544, 112233 , 334466, 778899, 181018, 212321, 123432, 123432};

		InputStreamReader isr = new InputStreamReader(System.in) ;
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Your Account Number");
		int s10=Integer.parseInt(br.readLine());

		System.out.println("Enter your name");
		String s1=br.readLine();
		for(i=0;i<=7;i++)
			if(s1.equalsIgnoreCase(name[i]) && s10==accnum[i])
			{
				System.out.printin("Enter your four digit pin");
				int il=Integer.parseInt(br.readLine());
				if(il==pin[i])
				{
					int b=bal[i];
					
					System.out.printin("Choose the operation you want to perform:\nChoose 1 for Withdrawal\nChoose 2 for Deposit\nChoose 3 to Check Balance\nChoose 4 to Display Types Of Cards Availaabe\nChoose 5 for Money Transfer\nChoose 6 to Change Pin\nChoose 7 to Display Investment Options");
					int ch=Integer.parseInt(br.readLine());
					switch(ch)
					{
						case 1:
							System.out.println("Enter the amount you want to withdraw");
							int withdraw=Integer.parseInt(br.readLine());
							if (b>=withdraw)
							{
								b-=withdraw;
								System.out.println("Please collect your Cash");
								System.out.println("The balance left in your account is Rs."+b);
							}
							else
								System.out.println("You cannot withdraw this amount as the balance in your account is less than the amount you want to withdraw. Please try again with a smaller amount.");
							break;
						case 2:
							System.out.println("Enter the amount you want to deposit");
							int deposit=Integer.parseInt(br.readLine());
							System.out.println("Deposit the Cash");
							b+=deposit;
							System.out.printin("The new balance of your account is Rs."+b);
							break;
						case 3:
							System.out.printin("Your balance is Rs."+b);
							break;
						case 4:
							System.out.println("Choose The Below options to know about the cards we provide:\nChoose 1 for Visa/Mastercard Debit Card\nChoose 2 for Visa/Mastercard Debit Card\nChoose 3 for Internatinal Debit/Credit Card\nChoose 4 for Gold Member Credit Card");
							int num=Integer.parseInt(br.readLine());
							num--;
							boolean flag=false;
							String nameC[]={"Visa/Mastercard Debit Card", "Visa/Mastercard Debit Card", "Internatinal Debit/Credit Card", "Gold Member Credit Card"};
							String card[]={"Hassle Free Transactions with your Debit Card Secured by our bank and Mastercard/Visa", "Customised Credit Cards To Match Your needs", "Universally accepted debit and credit cards", "Privelleged services and great offers"};
							for(int q=0; q<4;q++)
							{
								if (num==q)
									flag=true;
							}
							if (flag)
							{
								System.out.println(nameC[num]) ;
								System.out.println("Description of Card:"+card[num]);
								System.out.printin("Do you Want to Apply For the Card ? Type Yes or No Below.");
								String Choice=br.readLine();
								if (Choice.equalsIgnoreCase("yes"))
								{
									System.out.println("Thanks for choosing us "+name[i]);
									System.out.printin("Your request has been sent to our executives! We will get back to you shortly.");
								}
								else if(Choice.equalsIgnoreCase("No"))
									System.out.printin("Feel Free to write to us for any queries");;
								else
									System.out.printin("Error! Wrong Input. Please Try again");
							}
							else
								System.out.println("Error! Wrong Input. Please Try again");	
							break;
						case 5:
							System.out.println("Enter the amount you want to transfer");
							int trans1=Integer.parseInt(br.readLine());
							if (b>=trans1)
							{
								System.out.println("Enter the name of the account in which you want to tranfer the money");
								String n1l=br.readLine();
								System.out.println("Enter the account number in which you want to tranfer the money");
								int s6=Integer .parseInt(br.readLine());
								if (s6!=accnum[i])
								{
									for(int l=0; l<=7;l++)
									{
										if( n1.equalsIgnoreCase(name[l]) && s6==accnum[l] )
										{
											int accbal=bal[l];
											accbal=accbal+trans1;
											bal[1]=accbal;
											b-=trans1;
											bal[i]=b;
											System.out.println("The amount has been tranferred");
											System.out.printin("The balance in your account is Rs." + b);
										}
									}
								}
								else
									System.out.println("You cannot transfer money into your own account");
							}
							else
								System.out.printin("You cannot transfer this amount as the balance in your account is less than the amount you want to transfer. Please try again with a smaller amount.");
							break;
						case 6:
							System.out.println("Enter the new pin");
							int newpin=Integer.parseInt(br.readLine());
							System.out.println("Re-enter the new pin");
								int newpinl=Integer .parseInt(br.readLine());
							if (newpin==newpin1)
								System.out.println("Your pin has been changed");
							else
								System.out.println("An error occured. Please try again.");
							break;
						case 7:
							System.out.println("Choose below to view the Investment Options available");
							System.out.println("Choose 1 for Mutual Funds");
							System.out.println("Choose 2 for Equities & Derivatives");
							System.out.println("Choose 3 for Savings Bonds");
							System.out.println("Choose 4 for Inflation Indexed National Savings Securities-Cumulative(IINSS-C)");
							int c=Integer.parseInt(br.readLine());
							boolean flags=false;
							c--;
							String nameI[]={"Mutual Funds", "Equities & Derivatives", "Savings Bonds", "Inflation Indexed National Savings Securities-Cumulative(IINSS-C)"};
							String invest[]={"Invest in a wide range of Mutual Funds with a complete control over your Mutual Fund investments through NetBanking", "This 4:1 Investment Account is linked to your Bank Demat and Savings/Current/Loan account,\n allows you to seamlessly trade/invest in Equity, Derivatives, Bonds, IPO/FPOs, Gold ETFs, NCDs.", "You will get some exclusive features and benefits with your 7.75% Savings Bonds Minimum investment of Rs.1,908 and no maximum limit on investment", "IINSS-C bonds will offer investors a return that's 1.5% more than inflation based on the consumer-price-index.\n Interest will be compounded half yearly, enhancing effective yield on investments."};
							for(int z=0; z<4;z++)
								if (z==c)
									flags=true;
							if(flags)
							{
								System.out.println("Investment Option: "+nameI[c]);
								System.out.println("Description: "+ invest[c]);
								System.out.println("Do you Want to Apply for investment ? Type Yes or No Below.");
								String Choice=br.readLine();
								if (Choice.equalsIgnoreCase("yes"))
								{
									System.out.printin("Thanks for choosing us "+name[i]);
									System.out.printin("Your request has been sent to our executives, We will get back to you shortly");
								}
								else if(Choice.equalsIgnoreCase("No"))
									System.out.printin("Feel Free to write to us for any queries");;
								else
									System.out.printin("Error! Wrong Input. Please Try again");
							}
							else
								System.out.println("Error! Wrong Input. Please Try again");
							break;

						default:
							System.out.println("Wrong input. Please try again.");
							break;
					}
				}
				else
					System.out.printin("Error! Wrong Pin!");
			}
		}
		System.out.println("*************************************************************************************************");
		System.out.printin("If you could not operate the machine with the details that you input, please try again with a correct username and password.");
		System.out.printin("Thank you for using our services. We hope no inconvenience was caused to you.");
	}
}

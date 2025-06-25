import java.util.Date;
import java.util.Scanner;
public class EVC {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Scanner input = new Scanner(System.in);
        int balance = 2000;
        int bankBalance = 1000;
        int accountNo = 12345678;
        int password, opp, phone;
        double money;
        System.out.println("Fadlan geli codka *770#:");
        String ussdCode = input.nextLine();
        if (ussdCode.equals("*770#")) {
            System.out.println("Fadlan geli pinkaaga:");
            password = input.nextInt();
            if (password == 4321) {
                System.out.println("EVPLus");
                System.out.println("1. Itus Haraagaga");
                System.out.println("2. Karka ku hadalka");
                System.out.println("3. Bixi bill");
                System.out.println("4. U wareeji EVCplus");
                System.out.println("5. Warbixin kooban");
                System.out.println("6. Salaam bank");
                System.out.println("7. Maareynta");
                System.out.println("8. Bill payment");
                System.out.println("9. TAAJ");
                int selection = input.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Haraagaaga waa $" + balance);
                        break;
                    // ---------------------------- CASE 2 ----------------------------
                    case 2:
                        System.out.println("Kaarka hadalka");
                        System.out.println("1. Ku shuba Airtime");
                        System.out.println("2. Ugu dhub airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. Ku shuba internet");
                        System.out.println("5. Ugu shub qof kale (MMT)");
                        opp = input.nextInt();
                        if (opp == 1) {
                            System.out.println("Fadlan geli lacagta:");
                            money = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + money + " ku shubto?\n1. Haa\n2. Maya");
                            int confirm = input.nextInt();
                            if (confirm == 1) {
                                if (money > balance) {
                                    System.out.println("Xisaabtaada kuma filna");
                                } else {
                                    balance -= money;
                                    System.out.println("EVC PLUS: Waxaad ku shubatay $" + money + ", Tar: " + currentDate + ", Haraagaaga waa $" + balance);
                                }
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else if (opp == 2) {
                            System.out.println("Fadlan geli numberka:");
                            phone = input.nextInt();
                            System.out.println("Fadlan geli lacagta:");
                            money = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + money + " ugu shubto " + phone + "?\n1. Haa\n2. Maya");
                            int confirm = input.nextInt();

                            if (confirm == 1) {
                                if (money > balance) {
                                    System.out.println("Xisaabtaada kuma filna");
                                } else {
                                    balance -= money;
                                    System.out.println("EVC PLUS: Waxaad ugu shubtay $" + money + " lambarka " + phone + ", Tar: " + currentDate + ", Haraagaaga waa $" + balance);
                                }
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else if (opp == 3) {
                            System.out.println("Evcplus \n 1: Ku shubo data-da MIFI ");
                            int Mifi = input.nextInt();
                            if (Mifi == 1) {
                                System.out.println("-Internet Bundle Recharge -");
                                System.out.println("1. Isbuucle (weekly)");
                                System.out.println("2. Maalinle (Daily)");
                                System.out.println("3. Bille (Mifi)");
                                int date_Limited = input.nextInt();
                                if (date_Limited == 1) {
                                    System.out.println("1. $0.5 = 800MB");
                                    System.out.println("2. $1 = 1024MB");
                                    int date_Exchange = input.nextInt();
                                    if (date_Exchange == 1 && balance >= 5) {
                                        System.out.print("Fadlan Geli MIFI user. ");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $5 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int xaqiijinta_datada = input.nextInt();
                                        if (xaqiijinta_datada == 1) {
                                            balance -= 5;
                                            System.out.println("Waad ku guuleysatay inaad 10GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("Mahadsanid.");
                                        }
                                    } else if (date_Exchange == 2 && balance >= 10) {
                                        System.out.print("Fadlan Geli MIFI user: ");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $10 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int hubin = input.nextInt();
                                        if (hubin == 1) {
                                            balance -= 10;
                                            System.out.println("Waad ku guuleysatay inaad 25GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("Haraagaga xisaabtaada kuguma filna.");
                                        }
                                    } else if (date_Limited == 2) {
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1. $1 = 2GB");
                                        System.out.println("2. $2 = 5GB");
                                        int daily_option = input.nextInt();
                                        if (daily_option == 1 && balance >= 1) {
                                            System.out.print("Fadlan Geli MIFI user.");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $1 ugu shubtid " + MIFI_user);
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int ans = input.nextInt();
                                            if (ans == 1) {
                                                balance -= 1;
                                                System.out.println("Waad ku guuleysatay inaad 2GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                            } else {
                                                System.out.println("mahadsanid");
                                            }
                                        } else if (daily_option == 2 && balance >= 2) {
                                            System.out.print("Fadlan Geli MIFI user.");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $2 ugu shubtid " + MIFI_user);
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            int ans = input.nextInt();
                                            if (ans == 1) {
                                                balance -= 2;
                                                System.out.println("Waad ku guuleysatay inaad 5GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                            }
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    }
                                } else if (date_Limited == 3) {
                                    System.out.println("Fadlan Dooro bunle Ka");
                                    System.out.println("1.$20 = 40 GB");
                                    System.out.println("2.$40 = 80 GB");
                                    System.out.println("3.$60 = 150 GB");
                                    System.out.println("4.$30 = Unlimited Month");
                                    int monthyl_package = input.nextInt();
                                    if (monthyl_package == 1 && balance >= 20) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            balance -= 20;
                                            System.out.println("Waad ku guuleysatay inaad 40GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 2 && balance >= 40) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $40 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            balance -= 40;
                                            System.out.println("Waad ku guuleysatay inaad 80GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 3 && balance >= 60) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $60 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            balance -= 60;
                                            System.out.println("Waad ku guuleysatay inaad 150GB ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 3 && balance >= 30) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $30 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            balance -= 30;
                                            System.out.println("Waad ku guuleysatay inaad  Unlimited Monthly ugu shubto " + MIFI_user + " Tar:" + currentDate + ". Haraagaga  waa $" + balance);
                                        } else {
                                            System.out.println("mahadsanid.");

                                        }
                                    }
                                }
                            } else {
                                System.out.println("Doorasho khaldan");
                            }
                        }
                        break;

                    // ---------------------------- CASE 3 ----------------------------
                    case 3:
                        System.out.println("Bixi Bill:");
                        System.out.println("1. Post paid");
                        System.out.println("2. Ku iibso");
                        opp = input.nextInt();
                        if (opp == 1) {
                            System.out.println("1. Ogow Biilka");
                            System.out.println("2. Bixi Bill");
                            System.out.println("3. Ka Bixi Bill");
                            int billOption = input.nextInt();
                            switch (billOption) {
                                case 1:
                                    System.out.println("Error occurred, please try again later.");
                                    break;
                                case 2:
                                    System.out.println("Fadlan geli lacagta:");
                                    money = input.nextDouble();
                                    System.out.println("Ma hubtaa inaad bixiso bill ka lacagtiisu tahay $" + money + "?\n1. Haa\n2. Maya");
                                    opp = input.nextInt();

                                    if (opp == 1) {
                                        if (money > balance)
                                            System.out.println("Haraaga kuma filna");
                                        else {
                                            balance -= money;
                                            System.out.println("Waxaad bixisay bill lacagtiisu tahay $" + money + ", Tar: " + currentDate + ", Haraagaaga waa $" + balance);
                                        }
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Fadlan geli numberka:");
                                    phone = input.nextInt();
                                    System.out.println("Fadlan geli lacagta:");
                                    money = input.nextDouble();
                                    System.out.println("Ma hubtaa inaad bixiso $" + money + " oo laga rabo tel No " + phone + "?\n1. Haa\n2. Maya");
                                    opp = input.nextInt();
                                    if (opp == 1) {
                                        if (money > balance)
                                            System.out.println("Haraaga kuma filna");
                                        else {
                                            balance -= money;
                                            System.out.println("Waxaad bixisay bill $" + money + " oo laga rabay tel No " + phone + ", Tar: " + currentDate + ", Haraagaaga waa $" + balance);
                                        }
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                    break;
                                default:
                                    System.out.println("Fadlan dooro number sax ah");
                            }
                        } else if (opp == 2) {
                            System.out.println("Adeegga 'Ku iibso' weli lama hirgelin.");
                        } else {
                            System.out.println("Doorasho khaldan");
                        }
                        break;

                    // ---------------------------- CASE 4 ----------------------------
                    case 4:
                        System.out.println("Fadlan geli numberka:");
                        phone = input.nextInt();
                        System.out.println("Fadlan geli lacagta:");
                        money = input.nextDouble();
                        System.out.println("Ma hubtaa inaad $" + money + " u wareejiso " + phone + "?\n1. Haa\n2. Maya");
                        opp = input.nextInt();

                        if (opp == 1) {
                            if (money > balance)
                                System.out.println("Xisaabtaada kuma filna");
                            else {
                                balance -= money;
                                System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + phone + ", Tar: " + currentDate + ", Haraagaaga waa $" + balance);
                            }
                        } else {
                            System.out.println("Mahadsanid!");
                        }
                        break;

                    // ---------------------------- CASE 5 ----------------------------
                    case 5:
                        System.out.print("Warbixin Kooban\n");
                        System.out.println(" 1. Last Action");
                        System.out.println(" 2. Wareejintii u dambsay");
                        System.out.println(" 3. iibsashadii u dambeysay");
                        System.out.println(" 4. Last 3 Actions");
                        System.out.println(" 5. Email Me My Activity");
                        int WarbixinTa = input.nextInt();
                        String Last_1 = "[-Evcplus-] \nwaxaad $2 ka heshay 0617334455," + "Tar:" + currentDate + "Haraagaagu waa $2.";
                        String Last_2 = "[-Evcplus-] \nwaxaad $15 ka heshay 0615667720," + "Tar:" + currentDate + "Haraagaagu waa $17. ";
                        String Last_3 = "[-Evcplus-] \nwaxaad $2 aad u wareejisay 0615885590," + "Tar:" + currentDate + "Haraagaagu waa $15";
                        String ugu_danbeysay = "[-Evcplus-] \nwaxaad $10 aad u wareejisay 0619669907, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $25.";
                        if (WarbixinTa == 1) {
                            System.out.println(Last_1);
                        } else if (WarbixinTa == 2) {
                            System.out.println(Last_2);
                        } else if (WarbixinTa == 3) {
                            System.out.println(ugu_danbeysay);
                        } else if (WarbixinTa == 4) {
                            System.out.println(Last_1 + "\n" + Last_2 + "\n" + Last_3);
                        } else if (WarbixinTa == 5) {
                            System.out.println("Fadlan gel emalkaga");
                            System.out.println("Invalid  input format (datatype)");
                        }

                        // ---------------------------- CASE 6  qeybtaan ayan loop ku isticmalay----------------------------
                    case 6:
                        do {
                            System.out.println("---- Salaam Bank --------");
                            System.out.println("1. Itus Haraagaaga");
                            System.out.println("2. Lacag dhigasho");
                            System.out.println("3. Lacag qaadasho");
                            System.out.println("4. Ka Wareeji EVCPLUS");
                            System.out.println("5. Ka Wareeji Account-kaga");
                            System.out.println("6. Hubi wareejin account");
                            System.out.println("7. Maareynta bankiga");
                            System.out.print("Dooro ikhtiyaar: ");
                            opp = input.nextInt();
                            switch (opp) {
                                case 1:
                                    System.out.print("Fadlan geli pinkaaga accounkaaga: ");
                                    int pass = input.nextInt();
                                    if (pass == 4321) {
                                        System.out.println("Haraaga account-bangiga waa  $" + bankBalance);
                                    } else {
                                        System.out.println("Pinka waa qalad");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Fadlan geli lacagta: ");
                                    money = input.nextInt();
                                    System.out.print("Fadlan geli numberkaaga sirta ee bangiga: ");
                                    pass = input.nextInt();
                                    if (pass == 4321) {
                                        System.out.println("Ma hubtaa inaad $" + money + " dhigatid bankBalance bangiga?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();
                                        if (confirm == 1) {
                                            bankBalance += money;
                                            System.out.println("Waxaad account-kaaga dhigatay $" + money + ". Haraagaaga waa $" + bankBalance);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    } else {
                                        System.out.println("Numberka sirta waa qalad");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Fadlan geli lacagta: ");
                                    money = input.nextInt();
                                    System.out.print("Fadlan geli numberkaaga sirta ee bangiga: ");
                                    pass = input.nextInt();
                                    if (pass == 4321) {
                                        System.out.println("Ma hubtaa inaad $" + money + " ka qaadatid bankBalance bangiga?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            if (money <= bankBalance) {
                                                bankBalance -= money;
                                                System.out.println("Waxaad account-kaaga ka qaaday $" + money + ". Haraagaaga waa $" + bankBalance);
                                            } else {
                                                System.out.println("Haraagaaga kuguma filna");
                                            }
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    } else {
                                        System.out.println("Numberka sirta waa qalad");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Fadlan dooro xisaabta Bangiga:");
                                    System.out.println("1. Darasalaam Bank");
                                    System.out.println("2. Bank Beeraha");
                                    int Bank_Money = 1000;
                                    int Salaam_Bank = input.nextInt();
                                    if (Salaam_Bank == 1) {
                                        System.out.print("Fadlan soo Geli Account-ka : ");
                                        int Account_user = input.nextInt();
                                        System.out.print("Fadlan Geli Lacagta :");
                                        int Amount_salam = input.nextInt();
                                        System.out.println("Ma hubtaa in aad udirayso Account-ka: " + Account_user +  " " + "$" + Amount_salam );
                                        System.out.println("1: Haa");
                                        System.out.println("2: Maye");

                                        int Check = input.nextInt();
                                        if (Check == 1) {
                                            if (Bank_Money < Amount_salam) {
                                                System.out.println("Haraaga Xisaabtada Kuguma Filna : " + Account_user);
                                            } else {
                                                double Result_salaam = Bank_Money - Amount_salam;
                                                System.out.println("waxa u wareejisay Accoun-ta:" + Account_user +" " + "$"+ Amount_salam + " Haraaga Xisaabtada waa $" + Result_salaam);
                                            }
                                        } else if (Check == 2) {
                                            System.out.println("Mahadsanid !");
                                        }
                                    } else if (Salaam_Bank == 2) {
                                        System.out.print("Fadlan soo Geli Account-ka : ");
                                        int Account_user = input.nextInt();
                                        System.out.print("Fadlan Geli Lacagta :");
                                        int Amount_salam = input.nextInt();
                                        System.out.println("Ma hubtaa in aad udirayso Account-ka:" + Account_user +  " " + "$" + Amount_salam);
                                        System.out.println("1: Haa");
                                        System.out.println("2: Maye");

                                        int Check = input.nextInt();
                                        if (Check == 1) {
                                            if (Bank_Money <= Amount_salam) {
                                                System.out.println("Haraaga Xisaabtada Kuguma Filno 252 : " + Account_user);
                                            } else {
                                                double Result_salaam = Bank_Money - Amount_salam;
                                                System.out.println("waxa u wareejisay Accoun-ta:  "+ Account_user +" " + "$" +  Amount_salam +" Haraaga Xisaabtada waa $" + Result_salaam);

                                            }
                                        } else if (Check == 2) {
                                            System.out.println("Mahadsanid !");
                                        }
                                    }
//                        Qeybta 5 aad :
                                    break;
                                case 5:
                                    System.out.print("Fadlan soo geli account ama mobile: ");
                                    int geli_account = input.nextInt();
                                    if (geli_account < 12345678) {
                                        System.out.println("Invalid Account Number");
                                    } else if (geli_account == 12345678) {
                                        System.out.print("Fadlan geli lacagta: ");
                                        int gei_lacagta = input.nextInt();
                                        input.nextLine();
                                        System.out.print("Fadlan geli macluumaad: ");
                                        String Dial = input.nextLine();
                                        System.out.print("Fadlan geli sirta bangigaaga: ");
                                        int geli_srt = input.nextInt();
                                        if (geli_srt != 4321) {
                                            System.out.println("Sirta bangiga waa qalad");
                                        } else {
                                            System.out.println("Ma hubtaa inaad $" + gei_lacagta + " u wareejiso Bank Account: coffe_restaurent (Janno) (12345678)? \n1. Haa\n2. Maya");
                                            int Check = input.nextInt();
                                            if (Check == 1) {
                                                if (gei_lacagta > bankBalance) {
                                                    System.out.println("Haraaga xisaabta kuguma filna 252: " + geli_account);
                                                } else {
                                                    bankBalance -= gei_lacagta;
                                                    System.out.println("Waxaad u wareejisay account-ka $" + geli_account + ". Haraaga xisaabta waa $" + bankBalance);
                                                }
                                            } else
                                                System.out.println("Mahadsanid");
                                            break;
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.print("Geli OTP: ");
                                    String otp = input.nextLine();
                                    System.out.println("Your otp for log in :" + otp);
                                    break;
                                case 7:
                                    System.out.println("1. Bedal lambarka sirta bankiga");
                                    System.out.println("2. Bedal luqadda");
                                    System.out.println("3. Lacag xirasho");
                                    System.out.println("4. U celi lacag qaldantay");
                                    System.out.println("1. Bedel PIN-ka Bankiga");
                                    System.out.println("2. Bedel Password-ka Bankiga");
                                    int maareynBank = input.nextInt();
                                    break;
                                case 8:
                                    System.out.println("Kala bax menu weli lama dhameystirin");
                                    break;
                                case 9:
                                    System.out.println("Waa lagu laabtay menu-ga weyn.");
                                    break;
                                default:
                                    System.out.println("Fadlan dooro number sax ah");
                            }
                        } while (opp != 9); // Menu-ga wuu soo noqnoqonayaa ilaa user-ka uu 9 ka doorto
                        break;

                    case 7: {
                        ////Maareynta
                        System.out.println("Maareynta");
                        System.out.println("1 Bedel lambarka sirta ah");
                        System.out.println("2 Bedel Luqada");
                        System.out.println("3 Wargeln moble lumay");
                        System.out.println("4 Lacag xirasho");
                        System.out.println("5 U celi lacag qaldantay");
                        int mareyn = input.nextInt();
                        if (mareyn == 1) {
                            System.out.println("Fadlan Geli pinkaga cusub");
                            int pin = input.nextInt();
                            System.out.println("Pinkaaga waa la bedelay  pinkaga cusub waa " + pin);
                        } else if (mareyn == 2) {
                            System.out.println("1 Somali");
                            System.out.println("2 Englsh");
                            System.out.println("3 Arabic");
                            int luqad = input.nextInt();
                            if (luqad == 1) {
                                System.out.println("Luqadadii waa labedelay waxana loo badalay af somali");
                            } else if (luqad == 2) {
                                System.out.println("You are changed your language an dyour language is English ");
                            } else if (luqad == 3) {
                                System.out.println("Naxnu nubadal luqata haatuf");
                            }
                        } else if (mareyn == 3) {
                            System.out.println("Fadlan gel mobleka lumay ");
                            int lumay = input.nextInt();
                            System.out.println("Fadlan geli lambarkiisa sirta ah ");
                            int sir = input.nextInt();
                            System.out.println("Waxaa loo diiwangleiyay " + lumay + "Inuu dhumay Fadlan tag xaruta kugu dhaw ee shrkada mahadsanid");
                        } else if (mareyn == 4) {
                            System.out.println("Fadlan Gel lambarka khaladka ah");
                            int qalad = input.nextInt();
                            System.out.println("Fadlan gelilambarkii loo rabay");
                            int rabid = input.nextInt();
                            System.out.println("Fadlan Geli macluumaad");
                            int macluumad = input.nextInt();
                            System.out.println("Waa laxiray " + qalad + "Fadlan tag xarunta kugu dhaw shirkada hadii wax jawaab ah heli weysid mahadsanid");
                        } else if (mareyn == 5) {
                            System.out.println("Fadlan geli aqoonsiga lacag diriha:");
                            int aqoonsiga_lacagdiraha = input.nextInt();
                            input.nextLine();
                            System.out.println("fadlan gali numberka lacagta loo rabay:");
                            int numerka_lacagtaroobay = input.nextInt();
                            input.nextLine();
                            System.out.println("ma hubtaa in aad lacag u dirtid" + numerka_lacagtaroobay);
                            System.out.println("1. haa");
                            System.out.println("2. maya");
                            int ans = input.nextInt();
                            if (ans == 1) {
                                System.out.println(numerka_lacagtaroobay + "waa la diwaan galiyay.");
                            } else {
                                System.out.println("howl galka wala joojiyay.");
                            }
                        }
                    }

                    // ---------------------------- CASE 8 Bll payment----------------------------
                    case 8: {
                        int biilka_balance=1000;
                        int biilka ;
                        System.out.println("EVCPlus");
                        System.out.println("1. itus Haraaga Bill ka");
                        System.out.println("2. Wada Bixi Bill-ka");
                        System.out.println("3. Qeyb Ka bixi bill-ka");
                        biilka = input.nextInt();
                        if (biilka == 1) {
                            System.out.println(" Haraaga Bill ka waa $" +biilka_balance);
                        } else if (biilka == 2) {
                            System.out.println("Fadlan geli biil referance numberka:");
                            int referance = input.nextInt();
                            if (referance==1234){
                                System.out.print("fadlan so gali biilka aad wada bixineyso:");
                                double withdraw = input.nextDouble();
                                System.out.println("ma hunta in aad bixineyso biilka $" +withdraw);
                                System.out.println("1.haa");
                                System.out.println("2.maya");
                                int ans =input.nextInt();
                                if (ans==1){
                                    bankBalance  -= withdraw;
                                    System.out.println("waad wada bixisay biilka Haragagu waa: $" + bankBalance);
                                }else if (withdraw > balance) {
                                    System.out.println("haragaga kuguma filna.");
                                } else if (withdraw <= 0) {
                                    System.out.println(" ma bixin kartid tiro negative ah iyo zero.");
                                }
                            }else {
                                System.out.println("referenceska wa qalad");
                            }
                        }else if (biilka == 3) {
                            System.out.println("Fadlan geli biil referance numberka:");
                            int referance = input.nextInt();
                            if (referance == 1234) {
                                System.out.print("fadlan so gali biilka aad wada bixineyso:");
                                double withdraw = input.nextDouble();
                                System.out.println("ma hunta in aad bixineyso biilka $" + withdraw);
                                System.out.println("1.haa");
                                System.out.println("2.maya");
                                int ans = input.nextInt();
                                if (ans == 1) {
                                    bankBalance -= withdraw;
                                    System.out.println("qeyb ayad ka bixisay biilka Haragagu waa: $" + bankBalance);
                                } else if (withdraw > balance) {
                                    System.out.println("haragaga kuguma filna.");
                                } else if (withdraw <= 0) {
                                    System.out.println(" ma bixin kartid tiro negative ah iyo zero.");
                                }
                            } else {
                                System.out.println("referenceska wa qalad");
                            }
                        }
                        else {
                            System.out.println("Macsalaamo ");
                        }
                    }
                    //case 9 halkan loop ayan ku isticmalay///
                    case 9: {
                        int taaj;
                        do {
                            System.out.println("\nTAAJ Xawaalad:");
                            System.out.println("1: Dir Gudaha");
                            System.out.println("2: Dir Dibadda");
                            System.out.println("3: Ogoow Khidmada");
                            System.out.println("4: Macluumaadka Xawaaladda");
                            System.out.println("5: Jooji Xawaaladda");
                            System.out.println("6: Furo Xawaalad Cusub");
                            System.out.println("0: Ka bax");
                            System.out.print("Fadlan dooro mid ka mid ah: ");
                            taaj = input.nextInt();
                            input.nextLine();
                            switch (taaj) {
                                case 1:
                                    System.out.print("Fadlan geli numberka qofka lo xawilayo: ");
                                    String gudahaNum = input.nextLine();
                                    System.out.print("Fadlan geli lacagta: ");
                                    double gudahaLacag = input.nextDouble();
                                    double wadartaGudaha = gudahaLacag;
                                    if (wadartaGudaha > balance) {
                                        System.out.println(" haraagaga xisabta kuguma filana. Balance-kaagu waa $" + balance);
                                    } else {
                                        balance -= wadartaGudaha;
                                        System.out.println(" Wadarta laga jarayo waa: $" + wadartaGudaha);
                                        System.out.println(" Waxaad u dirtay $" + gudahaLacag + " mobile number: " + gudahaNum);
                                        System.out.println(" Haraagaaga  waa: $" + balance);
                                    }
                                    break;
                                case 2:
                                    System.out.print("Fadlan geli magaca qofka: ");
                                    String magaca = input.nextLine();
                                    System.out.print("Fadlan dooro waddanka: ");
                                    String wadan = input.nextLine();
                                    System.out.print("Fadlan geli lacagta: ");
                                    double lacagDibadda = input.nextDouble();
                                    double wadartaDibadda = lacagDibadda ;
                                    if (wadartaDibadda > balance) {
                                        System.out.println(" haraagaga xisabta kuguma  filana. Balance-kaagu waa $" + balance);
                                    } else {
                                        balance -= wadartaDibadda;
                                        System.out.println(" Wadarta laga jarayo waa: $" + wadartaDibadda);
                                        System.out.println(" Waxaad u dirtay $" + lacagDibadda + " → " + magaca + " (" + wadan + ")");
                                        System.out.println(" Haraagaaga  waa: $" + balance);
                                    }
                                    break;

                                case 3:
                                    System.out.println("Khidmada TAAJ waa 2% lacagta la dirayo.");
                                    break;

                                case 4:
                                    System.out.println("Macluumaad TAAJ: Xawilooyin dhawaan dhacay:");
                                    System.out.println("- $100 → Ethiopia");
                                    System.out.println("- $50 → Muqdisho");
                                    break;

                                case 5:
                                    System.out.print("Fadlan geli numberka xawaaladda la joojinayo: ");
                                    String cancelNum = input.nextLine();
                                    System.out.println(" Xawaaladda leh lambar " + cancelNum + " waa la joojiyay.");
                                    break;
                                case 6:
                                    System.out.println(" Fadlan booqo xarunta TAAJ ugu dhow si aad u furto xawaalad cusub.");
                                    break;
                                case 0:
                                    System.out.println(" Waad ka baxday adeegga TAAJ Xawaalad.");
                                    break;

                                default:
                                    System.out.println(" invalid option.");
                                    break;
                            }

                        } while (taaj != 0);
                    }


                }
            } else {


                System.out.println("Pin-ka waa qalad");
            }
        }else {


            System.out.println("Code-ka waa qalad");
        }
    }
}
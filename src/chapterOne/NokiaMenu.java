package chapterOne;

import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args){
        String menu = """
                for Phone book press 1
                for Messages press 2
                for Chats press 3
                for Call Register press 4
                for Tones press 5
                for Settings press 6
                for Call Divert press 7
                for Games press 8
                for Calculator book press 9
                for Reminders press 10
                for Clock press 11
                for Profiles press 12
                for SIM Services press 13
                
                """;
        System.out.println(menu);
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        switch (selection){
            case 1:
                String phonebook = """
                for Search press 1
                for Service Nos Press 2
                for Add Name press 3
                for Erase press 4
                for Edit press 5
                for Assign tone press 6
                for Send b'card press 7
                for Options press 8
                for Speed dials press 9
                for Voice tags press 10
                
                
                """;
                System.out.println(phonebook);
                int submenu = input.nextInt();
                switch (submenu) {
                    case 1 -> System.out.print("You are now in the search section ");
                    case 2 -> System.out.print("You are now in the Service Nos section ");
                    case 3 -> System.out.print("You are now in the Add name section ");
                    case 4 -> System.out.print("You are now in the Erase section ");
                    case 5 -> System.out.print("You are now in the Edit section ");
                    case 6 -> System.out.print("You are now in the Assign tone section ");
                    case 7 -> System.out.print("You are now in the Send b'card section ");
                    case 8 -> {
                        String options = """
                                for Type of view press 1
                                for Memory status Press 2
                                """;
                        System.out.println(options);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("You are now in the Type of view section ");
                            case 2 -> System.out.print("You are now in the Memory Status section ");
                        }
                    }
                    case 9 -> System.out.print("You are now in the Send Speed dials section ");
                    case 10 -> System.out.print("You are now in the Send Voice tags section ");
                }

            break;
            case 2: String messages = """
                To write messages press 1
                for Inbox Press 2
                for Outbox press 3
                To send a picture message press 4
                for Templates press 5
                for Smileys  press 6
                for Message Setting press 7
                for Info service press 8
                for Voice mailbox number press 9
                for Service command editor press 10
                
                
                """;
                System.out.println(messages);
                int msg = input.nextInt();
                switch (msg) {
                    case 1 -> System.out.print("Type your message");
                    case 2 -> System.out.print("You Have no new inbox today ");
                    case 3 -> System.out.print("You are now in the Outbox section ");
                    case 4 -> System.out.print("You are now in the Picture Message section ");
                    case 5 -> System.out.print("You are now in the Templates section ");
                    case 6 -> System.out.print("You are now in the Smileys section ");
                    case 7 -> {
                        String msgSet = """
                                for Set 1 press 1
                                for Common Press 2
                                """;
                        System.out.println(msgSet);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> {String set = """
                                for Set 1 press 1
                                for Common Press 2
                                For Message validity press 3
                                """;
                            System.out.println(set);
                            int firstChoice = input.nextInt();
                            switch (firstChoice){
                                case 1 -> System.out.print("Message centre number");
                                case 2 -> System.out.print("Message Sent as ");
                                case 3 -> System.out.print("Message Validity ");
                            }
                            }
                                case 2 -> {String common = """
                                for  press 1
                                for Common Press 2
                                For Message validity press 3
                                """;
                                System.out.println(common);
                                    int firstChoice = input.nextInt();
                                    switch (firstChoice){
                                        case 1 -> System.out.print("Delivery Reports");
                                        case 2 -> System.out.print("Reply via same centre");
                                        case 3 -> System.out.print("Character support ");
                                    }
                                }
                        }
                    }
                    case 8 -> System.out.print("You are now in the Info Service section ");
                    case 9 -> System.out.print("You are now in the Voice mailbox number section ");
                    case 10 -> System.out.print("You are now in the Service command  Editor section ");
                }


                break;
            case 3: System.out.print("Chat");
                break;
            case 4: String callRecord = """
                To write messages press 1
                for Inbox Press 2
                for Outbox press 3
                To send a picture message press 4
                for Templates press 5
                for Smileys  press 6
                for Message Setting press 7
                for Info service press 8
                for Voice mailbox number press 9
                for Service command editor press 10
                
                
                """;
                System.out.println(callRecord);
                int calls = input.nextInt();
                switch (calls) {
                    case 1 -> System.out.print("Missed calls");
                    case 2 -> System.out.print("Received calls ");
                    case 3 -> System.out.print("Dialled numbers ");
                    case 4 -> System.out.print("Erase recent call lists ");
                    case 5 -> {
                        String duration = """
                                for Last call Duration press 1
                                for All calls duration Press 2
                                for Received calls duration press 3
                                for Dialled calls' duration Press 4
                                for Clear timers press 5
                                
                                """;
                        System.out.println(duration);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("Last call duration");
                            case 2 -> System.out.print("All calls duration ");
                            case 3 -> System.out.print("Received calls duration ");
                            case 4 -> System.out.print("Dialled calls' duration");
                            case 5 -> System.out.print("Clear timers ");

                        }
                    }
                    case 6 -> {
                        String callCosts = """
                                for Last call cost press 1
                                for All calls cost Press 2
                                for Clear counters press 3
                                
                                
                                """;
                        System.out.println(callCosts);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("Last call cost");
                            case 2 -> System.out.print("All calls' cost");
                            case 3 -> System.out.print("Clear counters ");

                        }
                    }
                    case 7 -> {
                        String callCostSet = """
                                for Call cost limit press 1
                                to Show costs  Press 2
                                
                             """;
                        System.out.println(callCostSet);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("Call cost");
                            case 2 -> System.out.print("Show costs cost");


                        }
                    }
                    case 8 -> System.out.print("Prepaid credit ");
                }
                    break;
            case 5: String tones = """
                for Ringing tone press 1
                for Ringing volume Press 2
                for Incoming call alert press 3
                For Composer press 4
                for Message alert tone press 5
                for Keypad tones  press 6
                for Warning and game tones press 7
                for Vibrating alert press 8
                for Screen saver press 9
                
                """;
                System.out.println(tones);
                int choose = input.nextInt();
                switch (choose) {
                    case 1 -> System.out.print("Ringing tone");
                    case 2 -> System.out.print("Ringing volume ");
                    case 3 -> System.out.print("Incoming call alert ");
                    case 4 -> System.out.print("Composer press ");
                    case 5 -> System.out.print("Message alert tone ");
                    case 6 -> System.out.print("Keypad tones ");
                    case 7 -> System.out.print("Warning and game tones ");
                    case 8 -> System.out.print("Vibrating alert");
                    case 9 -> System.out.print("Screen saver ");
                }

                break;
            case 6: String settings = """
                for Call settings press 1
                for Phone settings Press 2
                for Security press 3
                To Restore factory settings press 4
                
                """;
                System.out.println(settings);
                int request = input.nextInt();
                switch (request) {
                    case 1 ->  {
                        String callSetting = """
                                for Automatic redial press 1
                                for Speed dialling Press 2
                                for Call waiting options press 3
                                for Own number sending Press 4
                                for Phone line in use press 5
                                for Automatic answer press 6
                                
                                """;
                        System.out.println(callSetting);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("Automatic redial");
                            case 2 -> System.out.print("Speed dialling ");
                            case 3 -> System.out.print("Call waiting options ");
                            case 4 -> System.out.print("Own number sending");
                            case 5 -> System.out.print("Phone line ");
                            case 6 -> System.out.print("Automatic answer ");

                        }
                    }

                    case 2 -> {
                        String phoneSet = """
                                for Language press 1
                                for Cell info display Press 2
                                for Welcome note press 3
                                for Network selection Press 4
                                for Lights press 5
                                for Confirm SIM service actions press 6
                                
                                """;
                        System.out.println(phoneSet);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("Language");
                            case 2 -> System.out.print("Cell info display ");
                            case 3 -> System.out.print("Welcome note  ");
                            case 4 -> System.out.print("Network selection");
                            case 5 -> System.out.print("Lights ");
                            case 6 -> System.out.print("Confirm SIM service actions ");

                        }
                    }
                    case 3 -> {
                        String securitySet = """
                                for PIN code request press 1
                                for Call barring service Press 2
                                for Fixed dialling press 3
                                for Closed user group press 4
                                for Phone security Press 5
                                To Change access codes press 6
                                
                                """;
                        System.out.println(securitySet);
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.print("PIN code request");
                            case 2 -> System.out.print("Call barring service");
                            case 3 -> System.out.print("Fixed dialling ");
                            case 4 -> System.out.print("Closed user group");
                            case 5 -> System.out.print("Phone security");
                            case 6 -> System.out.print("Change access codes ");

                        }
                    }

                    case 4 -> System.out.print("Restore factory settings ");
                }
                break;
            case 7: System.out.print("Call divert");
                break;
            case 8: System.out.print("Games");
                break;
            case 9: System.out.print("Calculator");
                break;
            case 10: System.out.print("Reminders");
                break;
            case 11: String clock = """
                for Alarm clock press 1
                for Clock settings Press 2
                for Date setting press 3
                For Stopwatch press 4
                for Countdown timer press 5
                for Auto update of date and time press 6
                
                """;
                System.out.println(clock);
                int choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.print("Alarm clock");
                    case 2 -> System.out.print("Clock settings ");
                    case 3 -> System.out.print("Date setting ");
                    case 4 -> System.out.print("Stopwatch ");
                    case 5 -> System.out.print("Countdown timer ");
                    case 6 -> System.out.print("Auto update of date and time");

                }
                break;
            case 12: System.out.print("Profiles");
                break;
            case 13: System.out.print("SIM services");
                break;

            default :
                System.out.println("Abeg choose well");
        }
    }
}
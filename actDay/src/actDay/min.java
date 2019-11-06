package actDay;
import java.util.Scanner;
public class min {
	public static Scanner s1;
	public static void main(String[]args)
	{
		s1 = new Scanner(System.in);
		slide1();
	}

	public static void slide1()
	{
		System.out.println("How to play: when you enter in which choice you want,you must enter in the number and only the number.");
		System.out.println("Have fun! Please enter in 1 to continue");
		int s1i = s1.nextInt();
		if (s1i == 1)
		{
			slide2();	
		}
	}
	public static void slide2()
	{
		System.out.println("You are on a ship heading to your new home, the Paradise moon colony. You’ve decided to move to Paradise because you’ve heard that in Paradise everyone is happy and life is perfect. You are sitting in a seat when someone comes over to you holding a syringe");
		System.out.println("Syringe person: Hello. We will be landing in paradise shortly. Before you can enter Paradise you need to get this injection.");
		System.out.println("Do you:");
		System.out.println("	1. Let them give you the injection no questions asked.");
		System.out.println("	2. Ask why you need to take the injection and whats in it");
		int si = s1.nextInt();
		if (si == 1)
		{
			slide3();	
		} else 
		{
			slide4();
		}
	}
	public static void slide3()
	{
		System.out.println("They give you the injection. It feels like nothing. Suddenly you feel very tired. You feel your eyelids closing as you watch the word fade away into nothingness.");
		System.out.println("Press 1 to continue");
		int si = s1.nextInt();
		if (si == 1)
		{
			slide9to13();
		}
	}
	public static void slide4()
	{
		System.out.println("They stutter for a bit and end up saying");
		System.out.println("Syringe person: The small details don't matter, all that matters is that you need to get this injection to enter Paradise!");
		System.out.println("Do you:");
		System.out.println("	1. Refuse to take the injection.");
		System.out.println("	2. You let them give you the injection.");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide3();	
		} else 
		{
			slide5();
		}
	}
	public static void slide5()
	{
		System.out.println("You tell the person that you refuse to get the injection. Suddenly you are held down and the person approaches you and is about to give you the injection.");
		System.out.println("Do you:");
		System.out.println("	1. Try to get out of the restraints .");
		System.out.println("	2. Let them give you the injection.");
		System.out.println("	3. Try to kick the person");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide3();	
		} else if  (si == 1)
		{
			slide6();
		}else
			slide7();
	}
	public static void slide6()
	{
		System.out.println("You try to get out but it's no use.");
		System.out.println("Do you:");
		System.out.println("	1. Try to kick the person");
		System.out.println("	2. Let them give you the injection.");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide3();	
		} else
		{
			slide7();
		}
	}
	public static void slide7()
	{
		System.out.println("The person looks unfazed; I guess you weren't that good of a fighter.");
		System.out.println("Syringe person: That type of attitude has no place in Paradise. Now either stop moving and get the injection or don’t get the injection and suffer the consequences.");
		System.out.println("Do you:");
		System.out.println("	1. Continue to move around and not let them give you the injection");
		System.out.println("	2. Let them give you the injection.");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide3();	
		} else
		{
			slide8();
		}
	}
	public static void slide8()
	{
		System.out.println("The person shakes their head and presses a button on the back of your chair. You feel the ground opening up under you and fall through the ship and into the vast emptiness of space. You feel like you’re being choked. You think about the family and friends you left behind to go to Paradise. You know they’ll never know you’re dead and wonder if they’ll ever think of you or miss you. Your last thoughts are of what your life could’ve been if you’d just taken the injection. How much better life could've been if you’d only just listened to the person");
		System.out.println("you died :`(");
	}
	public static void slide9to13()
	{
		System.out.println("You wake up and feel extremely rested and relaxed. You notice you are in a different place. All you can see is a cheerful girl. She introduces herself and says that she’s only here to tell you a few things about Paradise and give you a map and radio. Then you’ll be able to enter the colony. She tells you her name is Kennedy");
		System.out.println("Kennedy: First I would like to say welcome to Paradise moon colony. You’re almost ready to enter The Society. You’ve come here because you were unsatisfied with the flaws in other societies. In Paradise we require everyone to lend a hand for the greater good. Before you go any further I would like to share with you our most important rules-though that isn’t to say that some rules are inferior to others. They are all equally important. These rules are: always follow all orders, don’t turn off your radio, use proper language, apologize when necessary, be positive, never lie/steal/cheat/etc., ");
		System.out.println("She continues listing rules for what seems like hours. I'd tell you more but you wouldn't remember them or care so youre just gonna have to make do with what you have");
		System.out.println("Kennedy: As you know everyone lends a hand in the community and you are no different. Your job is custodian of all buildings in the L2 sector. The head custodian will explain the rules and job to you. That concludes our talk. You will fall asleep and wake up in your room. It is time to let you into Paradise. Enjoy your new life");
		System.out.println("Press 1 to continue");
		int si = s1.nextInt();
		if (si == 1)
		{
			slide14();
		}
	}
	public static void slide14()
	{
		System.out.println("Do you:");
		System.out.println("	1. Get up and explore");
		System.out.println("	2. Turn off your radio and go back to sleep");

		int si = s1.nextInt();
		if (si == 1)
		{
			slide15();
		} else
			slide17();
	}
	public static void slide15()
	{
		System.out.println("The radio stops humming the moment you get out of bed. You look around the room and see a tablet hanging on the wall with some text on it and a closed door. You look down to see that your clothing has changed to the ones you remember seeing in the Paradise advertisements. The door has a light that is not lit");
		System.out.println("Do you:");
		System.out.println("	1. Read the tablet");
		System.out.println("	2. Inspect the door");
		int si = s1.nextInt();
		if (si == 1)
		{
			slide19to20();
		} else
		{
			System.out.println("The door is locked and you can't open it. There is no switch or anything to turn on the light.");
			System.out.println("press 1 to explore the tablet");
			int si1 = s1.nextInt();
			if (si1 == 1)
			{
				slide19to20();
			} 
		}
	}
	public static void slide16()
	{
		System.out.println("You turn off the radio and throw it across the room. Now you can fall back asleep.");
		System.out.println("A loud voice: A REMINDER TO ALL CITIZENS THAT THE RADIO MUST BE TURNED ON AT ALL TIMES");
		System.out.println("Do you:");
		System.out.println("	1. Get out of the bed and turn back on the radio");
		System.out.println("	2. Tell the random voice exactly where they can shove those stupid ideas");
		System.out.println("	3. Ignore the voice");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide16();	
		} else 
			slide31();
	}
	public static void slide17()
	{
		System.out.println("The radio hum gets louder and more high pitched");
		System.out.println("Do you:");
		System.out.println("	1. turn off the radio");
		System.out.println("	2. get out of bed");
		int si = s1.nextInt();
		if (si == 2)
		{
			slide15();	
		} else 
			slide16();
	}
	public static void slide19to20()
	{
		System.out.println("The tablet reads: Hello, Today you will work in the L2C. Tom, the head custodian of L2 buildings will meet you there.You see that the light on the door is blinking green");
		int si = s1.nextInt();
		if (si == 1)
		{
			slide21();	
		}
	}
	public static void slide21()
	{
		System.out.println("The door opens up and you walk into it. It scans you and then lets you go through to the outside. You go to the food center. You go up to get your breakfast. There is an woman serving you food. ");
		System.out.println("	Do you:");
		System.out.println("	1. Just get your food and leave");
		System.out.println("	2. Talk to her");
		int si = s1.nextInt();
		if(si==1)
		{
			slide22();
		}
		else if(si==2)
		{
			slide23();
		}
	}

	public static void slide22()
	{
		System.out.println("You get your food and sit down at a random table. You finish your meal and are about to leave when everyone stands up and faces a wall with the Paradise flag. Everyone starts to chant. You feel as though you know the words despite never hearing them before.");
		System.out.println("	Do you:");
		System.out.println("	1. Stand up and join in");
		System.out.println("	2. Stay sitting");
		int si = s1.nextInt();
		if(si==1)
		{
			slide25();
		}
		else if(si==2)
		{
			slide26();
		}
	}

	public static void slide23()
	{
		System.out.println("She doesn’t talk to you");
		System.out.println("	Do you:");
		System.out.println("	1. Keep trying to talk to her");
		System.out.println("	2. Just get your food and leave");
		int si = s1.nextInt();
		if(si==1)
		{
			slide24();
		}
		else if(si==2)
		{
			slide22();
		}
	}

	public static void slide24()
	{
		System.out.println("She looks like she is about to speak, but before she can she is interrupted by a loud voice");
		System.out.println("The voice: Reminder to all citizens that talking to members of a higher class is illegal under law 8b.");
		System.out.println("	Do you:");
		System.out.println("	1. Just get your food and leave");
		System.out.println("	2. Keep trying");
		int si = s1.nextInt();
		if(si==1)
		{
			slide22();
		}
		else if(si==2)
		{
			slide36();
		}
	}

	public static void slide25()
	{
		System.out.println("You stand up and chant in time with everybody else. You all sound emotionless, like robots chanting instead of humans. All of these weird rules and customs give you an uneasy feeling. ");
		System.out.println("	Do you:");
		System.out.println("	1. Explore Paradise");
		System.out.println("	2. Go to your job and meet the head custodian");
		int si = s1.nextInt();
		if(si==1)
		{
			slide37();
		}
		else if(si==2)
		{
			slide28();
		}
	}
	public static void slide26()
	{
		System.out.println("You stay sitting. Suddenly everyone quiets and an announcement goes off");
		System.out.println("Announcement voice: Reminder to all citizens that everyone must stand and say the pledge.");
		System.out.println("	Do you:");
		System.out.println("	1. Stand up and join");
		System.out.println("	2. Stay sitting");
		int si = s1.nextInt();
		if(si==1)
		{
			slide25();
		}
		else if(si==2)
		{
			slide27();
		}
	}

	public static void slide27()
	{
		System.out.println("You remain in your seat. Suddenly everyone turns and looks at you. You still don't get up. The people in front of you clear a path that two guards walk down. They grab your arm and inject something into it. You are knocked out instantly.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to continue");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
	}

	public static void slide28()
	{
		System.out.println("You get to the Ministry and see two people, one of which is dressed in the same grey that you are and the other in a green version of your clothing.");
		System.out.println("	Do you:");
		System.out.println("	1. Talk to the man in the grey");
		System.out.println("	2. Talk to the man in the green");
		int si = s1.nextInt();
		if(si==1)
		{
			slide29();
		}
		else if(si==2)
		{
			slide30();
		}
	}
	public static void slide29()
	{
		System.out.println("The man in the grey turns to you and smiles.");
		System.out.println("The man in the grey: Hi, I’m Tom! I’m the head custodian in our sector of buildings. Your job is to clean the first and second floors of whatever building you have been assigned to that day.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to get to work");
		int si = s1.nextInt();
		if(si==1)
		{
			slide32();
		}
	}
	public static void slide30()
	{
		System.out.println("The man in the green looks offended and confused, like you just spit in his face and started speaking in a language he has never heard of.");
		System.out.println("Announcements: Reminder to all citizens that talking to members of a higher class is illegal under law 8b.");
		System.out.println("	Do you:");
		System.out.println("	1. Leave and talk to the other guy ");
		System.out.println("	2. Keep trying to talk to him ");
		int si = s1.nextInt();
		if(si==1)
		{
			slide29();
		}
		else if(si==2)
		{
			slide31();
		}
	}

	public static void slide31()
	{
		System.out.println("Suddenly two guards come forward and take your arm. They inject you with something that knocks you out immediately. You wake up strapped to a chair in a empty dark room. You call for help but no one comes. You lose track of time. You feel thirsty and hungry and plead for food or water but none is given to you. You scream and struggle and plead for someone, anyone, but no one comes. Finally, after what felt like an eternity, the world fades to black and you never wake again.");
		System.out.println("	Do you:");
		System.out.println("	1. Nothing you’re dead.");
		int si = s1.nextInt();
		if(si==1)
		{
			slide31();
		}
	}

	public static void slide32()
	{
		System.out.println("You work for a while and clean the assigned hallways without incident.");
		System.out.println("	Do you:");
		System.out.println("	1. Explore Paradise more ");
		System.out.println("	2. Go to the worship center ");
		int si = s1.nextInt();
		if(si==1)
		{
			slide37();
		}
		else if(si==2)
		{
			slide33();
		}
	}


	public static void slide33()
	{
		System.out.println("You go to the worship center and sit down in the only empty seat. Then a man stands up and starts talking. He says that the gods has spoken to him. You find out later that he is the head priest and one of the three in charge of all of the ministries. As he drones on about how we need to do more work for the greater good you feel your eyelids closing. Suddenly a loud voice wakes you. It’s the priest");
		System.out.println("The priest: I give you permission to speak to me. Now answer my question!");
		System.out.println("	Do you:");
		System.out.println("	1. Ask what the question was ");
		System.out.println("	2. Apologise for falling asleep  ");
		int si = s1.nextInt();
		if(si==1)
		{
			slide34();
		}
		else if(si==2)
		{
			slide38();
		}
	}
	public static void slide34()
	{
		System.out.println("You ask what the question was. Instead of answering you the priest gives you a mean look and reprimands you for not paying attention.");
		System.out.println("	Do you:");
		System.out.println("	1. Lie and say you were paying attention");
		System.out.println("	2. Apologize for not paying attention");
		int si = s1.nextInt();
		if(si==1)
		{
			slide35();
		}
		else if(si==2)
		{
			slide38();
		}
	}

	public static void slide35()
	{
		System.out.println("He looks at you with disgust reminds you that lying is a crime and that lying in a place of worship is an even more severe crime. He gestures to the two guards and they walk closser and inject you with a syringe that knocks you out.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to continue.");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
	}


	public static void slide36()
	{
		System.out.println("You wake up strapped to a chair in a empty dark room. You call for help but no one comes. You lose track of time. You feel thirsty and hungry and plead for food or water but none is given to you. You scream and struggle and plead for someone, anyone, but no one comes. Finally, after what felt like an eternity, the world fades to black, never to wake again");
		System.out.println("	Do you:");
		System.out.println("	1. Die");
		System.out.println("	2. Die ");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
		else if(si==2)
		{
			slide36();
		}
	}
	public static void slide37()
	{
		System.out.println("You are wandering around Paradise observing the brutalist grey architecture when an announcement goes off and reminds “everyone” that they should be on schedule and working. If they have finished their work then they should be at the worship center.");
		System.out.println("	Do you:");
		System.out.println("	1. Keep exploring ");
		System.out.println("	2. Go to work ");
		int si = s1.nextInt();
		if(si==1)
		{
			slide42();
		}
		else if(si==2)
		{
			slide28();
		}
	}
	public static void slide38()
	{
		System.out.println("You apologize and everyone forgives you. The rest of the ceremony goes without incident. You then eat lunch and go back to work.  You’ve cleaned everywhere except these two hallways. ");
		System.out.println("	Do you:");
		System.out.println("	1. Clean the left hallway");
		System.out.println("	2. Clean the right hallway");
		int si = s1.nextInt();
		if(si==1)
		{
			slide39();
		}
		else if(si==2)
		{
			slide39();
		}
	}

	public static void slide39()
	{
		System.out.println("You were cleaning the last room in that hallway when you see a file on the floor. You pick it up and are about to put it away when you see that it has your name and a picture of you along with  the text 1125293g. You also see a picture of Kenedy, the welcome lady with a X next to it. Next to the X it says some text.");
		System.out.println("The file: Did not train 1125293g appropriately ");
		System.out.println("	Do you:");
		System.out.println("	1. Continue reading the file");
		System.out.println("	2. Stop reading it and put it away");
		int si = s1.nextInt();
		if(si==1)
		{
			slide41();
		}
		else if(si==2)
		{
			slide40();
		}
	}

	public static void slide40()
	{
		System.out.println("You close it and put it on the desk quickly. Two security guards come in and grab your arm. Before they do anything you tell them that you didn’t read it. One of them lifts a syringe out of their pocket and injects you with its liquid.");
		System.out.println("The other one: We don’t care whether you read it or not. It is a violation of rule 7b to look at classified information.");
		System.out.println("The world fades from view as you are knocked out by the serum in the syringe.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to continue.");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
	}
	public static void slide41()
	{
		System.out.println("You try to read it but before you can two security guards come in and grab your arm. Then they give you a injection that knocks you out.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to continue.");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
	}
	public static void slide42()
	{
		System.out.println("Two guards come up to you. One restrains you while the other pulls out a syringe and injects you with a serum that knocks you out.");
		System.out.println("	Do you:");
		System.out.println("	1. Press one to continue.");
		int si = s1.nextInt();
		if(si==1)
		{
			slide36();
		}
	}


	}








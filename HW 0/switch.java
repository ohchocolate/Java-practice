public class switch{
    public static void main (String[] args) {
        String choice = "Rock";
        int opt = switch (choice) {
            case "Rock" -> System.out.println("You can win against Scissors.");
            case "Paper" -> System.out.println("You can win against Rock.");
            case "Scissors" -> System.out.println("You can win against Paper.");
            default ->{
        System.out.println("You did not make your choice.");
        }
        }
    }
}
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("let's play Rock, Paper, Scissors!");
//        String name=scanner.nextLine();
//        System.out.print("What's your choice?");
//        string choice=scanner.nextInt();
//        switch(choice){
//        case"Rock"->System.out.println("You can win against Scissors.");
//        case"Paper"->System.out.println("You can win against Rock.");
//        case"Scissors"->System.out.println("You can win against Paper.");
//        }
//default ->System.out.println("You did not make your choice.");
//        }
//        }
//
//        }
//        }
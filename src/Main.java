import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        PhoneBook pb = new PhoneBook();

        for (int i = 0; i < 3; i++) {
            pb.addPhone("Pavel", Integer.toString(new Random().nextInt(2332323, 9324324)));
        }

        for (int i = 0; i < 5; i++) {
            pb.addPhone("Igor", Integer.toString(new Random().nextInt(2332323, 9324324)));
        }

        for (int i = 0; i < 2; i++) {
            pb.addPhone("Anna", Integer.toString(new Random().nextInt(2332323, 9324324)));
        }

        for (int i = 0; i < 6; i++) {
            pb.addPhone("Millina", Integer.toString(new Random().nextInt(2332323, 9324324)));
        }

        //Millin 6
        //Igor 5
        //Pavel 3
        //Anna 2

        System.out.println(pb.toString());

        System.out.println(pb.getPhones("Anna"));

        pb.addPhone("Anna", "111111111");
        pb.addPhone("Rouger", "55555555555");
        System.out.println(pb.toString());

        System.out.println(pb.deletePhone("Anna", "111111111"));
        //System.out.println(pb.deletePhone("Rouger", "55555555555"));
        System.out.println(pb.deletePhone("Rouger", "44444444444"));
        System.out.println(pb.deletePhone("Soma", "44444444444"));
        System.out.println(pb.toString());

        System.out.println(pb.deleteOwner("Rouger"));
        System.out.println(pb.deleteOwner("Soma"));
        System.out.println(pb.toString());

    }
}
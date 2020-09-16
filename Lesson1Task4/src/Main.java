public class Main {
    public static void main(String[] args) {

        Network kievStar = new Network();
        Phone phone1 = new Phone(111111, kievStar);
        Phone phone2 = new Phone(222222, kievStar);
        Phone phone4 = new Phone(333333, kievStar);
        Phone phone5 = new Phone(444444, kievStar);

        phone2.makeCall(444444);
        phone4.makeCall(544444);


    }









}




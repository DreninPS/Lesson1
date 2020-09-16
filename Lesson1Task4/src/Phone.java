public class Phone {

    private int phoneNumber;
    private Network network;

    public Phone() {
    }

    public Phone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(int phoneNumber, Network network) {
        this.phoneNumber = phoneNumber;
        this.network = network;
        registrationInNetwork();
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    void registrationInNetwork(){
        network.registerAbonent(this);
    }

    void makeCall(Integer phoneNumber){
        if (network.isAbonentRegistered(this.phoneNumber)){
            network.connecting(this.phoneNumber, phoneNumber);
        }
        else System.out.println("Number is not in service");


    }
    void incomingCall(int phoneNumber){
        System.out.println("My number: " + this.phoneNumber + " Incoming call from " + phoneNumber);
    }




}

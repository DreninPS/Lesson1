import java.util.ArrayList;

public class Network {
    private ArrayList<Phone> registeredAbonents = new ArrayList<>();


    public void registerAbonent(Phone abonent){
    // TODO: add check registered abonent before it will be added
        registeredAbonents.add(abonent);
    }

    public boolean isAbonentRegistered(int phoneNumber){
        for (Phone abonent: registeredAbonents) {
            if (abonent.getPhoneNumber() == phoneNumber) return true;
        }
        return false;
    }

    public void connecting (int callerNumber, int receivingCallNumber){
        if (!isAbonentRegistered(callerNumber)) {
            System.out.println("number "+callerNumber+" is not reg");
            return;
        }
        if (!isAbonentRegistered(receivingCallNumber)) {
            System.out.println("number "+receivingCallNumber+ " is not reg");
            return;
        }
            for (Phone abonent: registeredAbonents) {
            if (abonent.getPhoneNumber() == receivingCallNumber) {
            abonent.incomingCall(callerNumber);
            }
        }

    }




}

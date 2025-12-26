public class ParticipantInfo{
    //attributes
    private String participantId;
    private String name;
    private String email;
    private long phoneNumber;

    //Getter and setters
    public void setParticipantId(String participantId){
        this.participantId = participantId;
    }
    public String getParticipantId(){
        return this.participantId;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    //parameterised constructor:
    ParticipantInfo(String participantId, String name, String email, long phoneNumber){
        this.participantId = participantId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
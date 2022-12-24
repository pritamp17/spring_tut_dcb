package demo;

public class Doctor implements staff{

    private String qualifiction;

    public String getQualifiction() {
        return qualifiction;
    }

    public void setQualifiction(String qualifiction) {
        this.qualifiction = qualifiction;
    }

    public void assist(){
        System.out.println("Doctor is assiting");
    }
}

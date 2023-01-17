package patterns.ch3;

public class RealEstateAgentProxy {
    private Apartament apartament;
    public RealEstateAgentProxy(){}
    public void represent(Apartament apartament)
    {
        this.apartament=apartament;
    }
    public Apartament rent(Student student)
    {
        if(student.getName().charAt(0)=='P')
        {
            return null;
        }
        else
            return this.apartament;
    }
}

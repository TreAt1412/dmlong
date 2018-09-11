import java.io.Serializable;

public class PTGT implements PT, Serializable {
    protected String model,color,year;
    protected int cost;

    public PTGT(){
        cost = 0;
        model = color = year = "";
    }

    @Override
    public String toString(){
        return (model + "\t " + color + "\t " + cost + "\t " + year);
    }
}

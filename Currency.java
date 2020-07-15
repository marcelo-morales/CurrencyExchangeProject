import java.math.BigDecimal;

public class Currency {
    private int id;
    private String name;
    private BigDecimal rate;

    public int getId() {
        return  this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }







}

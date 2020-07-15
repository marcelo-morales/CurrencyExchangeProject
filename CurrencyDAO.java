import java.math.BigDecimal;

public interface CurrencyDAO {

    public int getId();
    public void setId(int id);

    public void setName(String name);
    public String getName();

    public BigDecimal getRate();
    public void setRate(BigDecimal rate);


    //BigDecimal getCurrency(String currencyTo);
}


package entity;

/**
 * A simple implementation of the FinancialAsset interface.
 */
public class Asset implements FinancialAsset {
    private final String name;
    private final String ticker;
    private final Integer amount;

    public Asset(String name, String ticker, Integer amount) {
        this.name = name;
        this.ticker = ticker;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }

}

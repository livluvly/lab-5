package entity;

/**
 * The representation of a financial asset in our program.
 */
public interface FinancialAsset {

    /**
     * Returns the name of the asset.
     * @return the name of the asset.
     */
    String getName();

    /**
     * Returns the ticker symbol of the asset.
     * @return the ticker symbol of the asset.
     */
    String getTicker();

    /**
     * Returns the amount of the asset.
     * @return the amount of the asset.
     */
    Integer getAmount();

}

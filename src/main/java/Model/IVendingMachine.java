package Model;

public interface IVendingMachine {

    void addCurrency(AcceptedAmount x);
    Product productRequest(int productNumber );
    boolean endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();






}

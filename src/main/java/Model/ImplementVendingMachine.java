package Model;

public class ImplementVendingMachine implements IVendingMachine {

    private Product[] ProductArrayList;
    private int saldo;

    public ImplementVendingMachine(Product[] productArrayList) {
        ProductArrayList = productArrayList;
        this.saldo = 0;
    }


    @Override
    public void addCurrency(AcceptedAmount ammount) {
        saldo += ammount.getAmounts();

    }

    @Override
    public Product productRequest(int productNumber) {
        for(Product product : ProductArrayList){
            if(productNumber == product.getProductNumber()){
                System.out.println(product.getProcuctName());
                saldo -= product.getPrice();

            }return product;
        }
        System.out.println("enter a valid product number");
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {

        return new String[0];
    }
}

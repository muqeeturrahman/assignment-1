import figure1_isp.*;
import figure2_composition.*;
import figure3_company.*;
import figure4_strategy.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== Figure 1: Interface Segregation =====");
        Amazon amazon = new Amazon();
        amazon.hostVirtualServer("Server1");
        amazon.hostVirtualServer("Server2");
        amazon.listVirtualServers();
        System.out.println(amazon.getCDNAddress());
        
        Dropbox dropbox = new Dropbox();
        dropbox.storeFile("file1.txt");
        System.out.println(dropbox.getFile("file1.txt"));
        
        System.out.println("\n===== Figure 2: Composition =====");
        Transport transport1 = new Transport(new CombustionEngine(), new Human());
        transport1.deliver("New York", "Packages");
        
        System.out.println("\n===== Figure 3: Company Structure =====");
        Company company = new Company();
        company.addEmployee(new Designer());
        company.addEmployee(new GameDevCompany());
        company.addEmployee(new OutsourcingCompany());
        company.createSoftware();
        
        System.out.println("\n===== Figure 4: Strategy Pattern =====");
        Order order1 = new Order();
        order1.setShipping(new Ground());
        System.out.println("Ground shipping: $" + order1.getShippingCost());
        
        Order order2 = new Order();
        order2.setShipping(new Air());
        System.out.println("Air shipping: $" + order2.getShippingCost());
    }
}

package controller;

import Exceptii.IdStatusException;
import model.SalesPerson;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerSalesPerson {
    private ArrayList<SalesPerson> salesPeople;

    public ControllerSalesPerson() {
        salesPeople = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\salesperson");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                this.salesPeople.add(new SalesPerson(scanner.nextLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare(){
        for(SalesPerson x:salesPeople){
            System.out.println(x);
        }
    }

    public SalesPerson findSalesPersonById(int id){
        for(SalesPerson x:salesPeople){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }


    public void addSalesPerson(SalesPerson x)throws IdStatusException{
        SalesPerson t=findSalesPersonById(x.getId());
        if(t==null){
            this.salesPeople.add(x);
        }else{
            throw new IdStatusException("This Sale Person exist!");
        }
    }


    public void eraseSalesPerson(int id) throws IdStatusException{
        SalesPerson t=findSalesPersonById(id);
        if(t!=null){
            this.salesPeople.remove(t);
        }else{
            throw new IdStatusException("This Sale Person doesn't exist!");
        }
    }

    public void updateSalesPerson(int id,String lastname) throws IdStatusException{
        SalesPerson t =findSalesPersonById(id);
        if(t!=null){
            t.setLastName(lastname);
        }else {
            throw  new IdStatusException("This  Sale Person doesn't exist! ");
        }
    }
}

package com.venky;

public class Bank {
    private int accountNumber;
    private String name;
    private String email;
    private int phone;
    private int bal;;

    public Bank(int accountNumber,String name, String email, int phone, int bal){
        this.accountNumber=accountNumber;
        this.name= name;
        this.email=email;
        this.phone=phone;
        this.bal = bal;

    }

    public Bank(String email, int phone, int bal) {
        this.email = email;
        this.phone = phone;
        this.bal = bal;
    }

    public void setacoountNumber(int accountNumber) {

        this.accountNumber = accountNumber;

    }

    public void setname(String name) {
        this.name = name;

    }

    public void setemail(String email) {
        this.email = email;

    }

    public void setphone(int phone) {

        this.phone = phone;

    }

    public void setbal(int bal) {
        this.bal = bal;
    }

    public void Withdraw(int withdrawam) {
        if (this.bal - withdrawam < 0) {
            System.out.println("no can  do");
        } else {
            this.bal -= withdrawam;
            System.out.println("withdraw after " +this.bal);

        }
    }
    public void balace(int amount){
        this.bal+=amount;
        System.out.println("balkce == " +this.bal);
    }
        public int getaccountNumber () {


            return this.accountNumber;
        }
        public String getname () {

            return this.name;
        }
        public int getbal () {

            return this.bal;
        }
        public String getemail () {

            return this.email;
        }
        public int getphone () {

            return this.phone;
        }



}

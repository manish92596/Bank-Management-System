import java.util.Scanner;
import java.util.ArrayList;

class Account
{
    private int accountNumber, customerID;
    private float minimumBalance, availableBalance;
    private String accountType, serviceBranchIFSC, customerName,branch;
    private static int totalAccountCreated=0;

    Account()
    {
        totalAccountCreated++;
    }

    public void setDetails(int acno, int custid, float bal, String actype, String ifsc, String name,String branchhh)
    {
        accountNumber = acno;
        customerID = custid;
        minimumBalance = 1000;
        availableBalance = bal;
        accountType = actype;
        serviceBranchIFSC = ifsc;
        customerName = name;
        branch=branchhh;
    }

    public String getDetails(int accountNo)
    {
        if(accountNo==accountNumber)
        {
            return "Customer ID: "+ Integer.toString(customerID) +
            "\nCustomer Name: "+ customerName +
            "\nAccount Type: "+ accountType +
            "\nIFSC CODE: "+ serviceBranchIFSC +
            "\nMinimum Balance: "+ Float.toString(minimumBalance) +
            "\nAvailable Balance: "+ Float.toString(availableBalance)+
            "\nBranch name: "+branch;
        }
        else
            return "NIL";
    }

    public void updateDetails(int accountNo)
    {
        if(accountNo == accountNumber)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Update:\n1. Minimum Balance" +
            "\n2. Customer ID\n3. Customer Name\n4. Account Type"+
            "\n5. IFSC code\n6. Available Balance\n7. Branch name\nEnter your choice: ");
            int choice = sc.nextInt();
            while(choice<1 || choice>7)
            {
                System.out.print("Please Enter a Valid Choice: ");
                choice = sc.nextInt();
            }
            
            if(choice==1)
            {
                System.out.print("Enter new Minimum Balance: ");
                float val = sc.nextFloat();
                if(val<=availableBalance)
                    minimumBalance = val;
                else
                    System.out.println("Minimum balance cannot be greater than Available Balance.");
            }
            else if(choice==2)
            {
                System.out.print("Enter New Customer ID: ");
                int id = sc.nextInt();
                customerID = id;
            }
            else if(choice ==3)
            {
                System.out.print("Enter New Customer Name: ");
                String name = sc.next();
                customerName = name;
            }
            else if(choice==4)
            {
                System.out.print("Enter Account Type: ");
                String acc = sc.next();
                accountType = acc;
            }
            else if(choice==5)
            {
                System.out.print("Enter New IFSC code: ");
                String ifsc = sc.next();
                serviceBranchIFSC = ifsc;
            }
            else if(choice==6)
            {
                System.out.print("Enter New Balance: ");
                float bal = sc.nextFloat();
                if(bal>=minimumBalance)
                    availableBalance = bal;
                else
                    System.out.println("New Balance cannot be lesser than minimum balance.");
            }
            else if(choice==7){
                System.out.println("Enter new branch : ");
                String branchh=sc.next();
                branch=branchh;


            }
        }
    }

    public float getBalance(int accountNo)
    {
        if(accountNo == accountNumber)
            return availableBalance;
        else
            return -1;
    }

    public void deposit(int accountNo, float amount)
    {
        if(accountNo==accountNumber)
        {
            availableBalance+=amount;
            System.out.println("Amount deposited.");
            System.out.println("Available Balance: "+ availableBalance);
        }
    }

    public void withdraw(int accountNo, float amount)
    {
        if(accountNo==accountNumber)
        {
            if(availableBalance-amount>=minimumBalance)
            {
                availableBalance-=amount;
                System.out.println("Amount Withdrawn.");
                System.out.println("Available Balance: "+ availableBalance);
            }
            else
                System.out.println("Insufficient Balance Amount.");
        }
    }

    public static int totalAccount()
    {
        return totalAccountCreated;
    }

    public int acno()
    {
        return accountNumber;
    }

    public static void deleteAcount()
    {
        totalAccountCreated--;
    }


}

class Bankingsystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();*/
        //int k=0;
        ArrayList<Account> arr = new ArrayList<Account>();
        int n=0;

        while(true)
        {
            System.out.printf("***********Banking System***********\n1. Create Account\n2. Update Details\n3. Get Details\n4. Deposit\n5. Withdraw\n6. Total Accounts\n7. Delete Account\n8. Exit\n\nEnter your choice: ");
            int choice = sc.nextInt();

            if(choice==1)
            {
                //int acno, int custid, float bal, String actype, String ifsc, String name
                Account x = new Account();
                n++;
                System.out.print("Enter Account Number: ");
                int acno = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Customer ID: ");
                int custid = sc.nextInt();
                System.out.print("Enter Available Balance: ");
                float bal = sc.nextFloat();
                System.out.print("Enter Account Type: ");
                String actype = sc.next();
                System.out.print("Enter Branch : ");
                String branch = sc.next();
                System.out.print("Enter IFSC Code: ");
                String ifsc = sc.next();
                x.setDetails(acno, custid, bal, actype, ifsc, name,branch);
                arr.add(x);
            }
            else if(choice==2)
            {
                System.out.print("Enter Account Number: ");
                int acno = sc.nextInt();
                for(int i=0;i<n;i++)
                    (arr.get(i)).updateDetails(acno);
            }
            else if(choice==3)
            {
                System.out.print("Enter Account Number: ");
                int acno = sc.nextInt();
                for(int i=0;i<n;i++)
                    if((arr.get(i)).getDetails(acno)!="NIL")
                        System.out.println((arr.get(i)).getDetails(acno));
            }
            else if(choice==4)
            {
                System.out.print("Enter Account Number: ");
                int acno = sc.nextInt();
                System.out.print("Enter Amount to deposit: ");
                float val = sc.nextFloat();
                for(int i=0;i<n;i++)
                    (arr.get(i)).deposit(acno, val);
            }
            else if(choice==5)
            {
                System.out.print("Enter Account Number: ");
                int acno = sc.nextInt();
                System.out.print("Enter Amount to withdraw: ");
                float val = sc.nextFloat();
                for(int i=0;i<n;i++)
                    (arr.get(i)).withdraw(acno, val);                
            }
            else if(choice==6)
            {
                System.out.println("Total Accounts: " + (arr.get(0)).totalAccount());
            }
            
            else if(choice==7)
            {
                if(n>0)
                {
                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();
                    int flag =0;
                    for(int i=0;i<n;i++)
                        if((arr.get(i)).acno()==acc)
                        {
                            arr.remove(i);
                            n--;
                            flag = 1;
                            (arr.get(0)).deleteAcount();
                            System.out.println("Account Number "+ acc + " Deleted.\n");
                            break;
                        }
                
                        if(flag==0)
                            System.out.println("Account Does not exist.\n");
                }
                else
                {
                    System.out.println("There are no accounts in the bank.\n");
                }
                
            }
            else if(choice==8)
                break;
            else
                System.out.println("Enter a valid Choice.");
            
            System.out.println();
        }
        sc.close();

    }
}
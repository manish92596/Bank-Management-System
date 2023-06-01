# Bank-Management-System

<p align="center">
  <img src="https://github.com/manish92596/Bank-Management-System/assets/98229122/8c5bc5e0-ec3d-4405-8754-4f5160450175"/>
</p>

<p align="center">
  <img src="https://github.com/manish92596/Bank-Management-System/assets/98229122/8426a03b-6be5-44e0-8c31-7817e7eff675"/>
</p>

<p align="center">
  <img src="https://github.com/manish92596/Bank-Management-System/assets/98229122/7fb6d59d-3563-41a8-b574-83a5f368028c"/>
</p>



### The given code represents a basic banking system implemented in Java. Here are a few key points about the bank management system based on this code:

1. The system allows the creation of multiple bank accounts using the Account class. Each account has attributes such as account number, customer ID, available balance, account type, IFSC code, customer name, and branch.

2. The Account class provides methods to set and retrieve account details, update account information, check the available balance, deposit and withdraw funds, and delete an account.

3. The main class Bankingsystem acts as the driver program, interacting with the user through a menu-based system.

4. The system utilizes an ArrayList to store and manage multiple Account objects dynamically. Each created account is added to the list, and operations are performed on the accounts based on user input.

5. The system offers options such as creating an account, updating account details, retrieving account information, depositing and withdrawing funds, checking the total number of accounts, and deleting an account.

6. The Account class maintains a static variable totalAccountCreated to keep track of the total number of accounts created
<br/>
<br/>

### Few technical points highlight the utilization of Java and OOP concepts in the provided code. 

### 1. Class and Object: 
The Account class represents a bank account and encapsulates its properties and behaviors. Objects of the Account class are created to instantiate individual bank accounts.

### 2. Encapsulation: 
The Account class encapsulates its data members by declaring them as private and provides public methods (setDetails, getDetails, updateDetails, etc.) to access and modify the data. This ensures data privacy and enables controlled access to the account details.

### 3. Data Hiding: 
The private access modifiers used in the Account class hide the internal implementation details from external code. External code can only interact with the class through its public methods, promoting encapsulation.

### 4. Method Overloading: 
The Account class demonstrates method overloading by providing multiple versions of the setDetails method that accept different parameters. Method overloading allows methods with the same name but different parameter lists to be defined within a class.

### 5. Constructors: 
The Account class has a default constructor Account() that increments the totalAccountCreated variable whenever a new Account object is created. Constructors are special methods used to initialize objects when they are created.

### 6. ArrayList: 
The Bankingsystem class utilizes the ArrayList<Account> to store and manage multiple Account objects dynamically. The ArrayList class provides resizable arrays and convenient methods for adding, removing, and accessing elements.

### 7. User Input: 
The Scanner class is used to obtain user input from the console. It allows the program to interact with the user by reading input values for creating accounts, updating details, performing transactions, etc.


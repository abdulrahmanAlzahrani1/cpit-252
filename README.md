# cpit-252
here I will submit the assignments and anything related to the course 


## Q1 [How would you fix this code to print the correct total quanitity, 3?](https://cpit252.gitlab.io/labs/lab-1/#1-instance-and-class-variables)

by adding a `static` keyword will make this variable a class varibale not an object  
![Screenshot_229](https://user-images.githubusercontent.com/120954979/227757480-2f2dc413-127a-4863-bd27-cfcde84f4bab.png)


you may find it here as will [here](cpit-252-assignment-1/src/main/java/Q1/Product.java)

or if you want just to copy and not to see the whole file


```java
private int id;
private double price;
private String name;
private static int quantity;
```
---
note that the static is only for `quantuty` we do not want all object to have same price or id, so it is logical to make it an instance variables


---
## Q2 [complate the code](https://cpit252.gitlab.io/labs/lab-1/#2-testing)


![Screenshot_232](https://user-images.githubusercontent.com/120954979/227857241-22688dc4-6321-45c5-9fc3-e2ab0a568023.png)

---
note that you need to check every method alone othrwise you will be ending having 5 in quantity not what you excpected.

---
this screeen has been taking after finshing Q3, I have took pic before but I lost it, I think I did not save changed I made to README file.


---




## Q3 [What changes would you make  so only concrete classes should be instantiated?](https://cpit252.gitlab.io/labs/lab-1/#3-inhertiance)


First we need to change the product class to abstract

![Screenshot_230](https://user-images.githubusercontent.com/120954979/227859021-9333a222-8a4b-4261-8f4f-d6c9a7c5fc8f.png)



then change what is nessery 


note that we need to use the children constracter and that it is not nesseary to use FoodProdect because all of them are product you need to do it in testing as well

![Screenshot_235](https://user-images.githubusercontent.com/120954979/227859833-841ec080-7c45-481a-80dd-751ee08b8cfc.png)

---
![Screenshot_236](https://user-images.githubusercontent.com/120954979/227860643-6ea4e192-5955-4e62-a8cb-681939458242.png)
---


## Q4 [Polymorphism](https://cpit252.gitlab.io/labs/lab-1/#4-polymorphism-many-forms)


we just need to make an array and store the objects in


---

```java
        Product p4 = new FoodProduct(1234, 9.99, "water",LocalDate.parse("2027-07-07"));
        FoodProduct p5 = new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07"));
        ElectricProduct p6 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");

        Product [] products = {p4,p5,p6};
        for (Product p:
             products) {
            System.out.println(p.toString());
        }
```

---


## Q5 [What would you do to prevent subclasses from overriding the addToShoppingCart() method of the Product class without changing its visibility?](https://cpit252.gitlab.io/labs/lab-1/#5-controlling-changes)



```java 
    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

```
---



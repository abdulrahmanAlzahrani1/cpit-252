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


**this screeen has been taking after finshing Q3, I have take pic before but I lost it, I think I did not save changed I made to README file.**


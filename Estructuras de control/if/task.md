
Lo puedes escribir igual que en Java: 

# `if` simple

![img_1.png](img_1.png)

![img.png](img.png)

````kotlin

fun main() {
    val trafficLightColor = "Red"

    if (trafficLightColor == "Red") {
        
        println("Stop")
      
    }
}

````


# `if ... else ...`
![img_2.png](img_2.png)
![img_3.png](img_3.png)

````kotlin
fun main() {
    
    val trafficLightColor = "Red"

    if (trafficLightColor == "Red") {
        
        println("Stop")
      
    } else {
        
        println("Go")
      
    }
  
}

````

# 'if ... else if ... else ...'
![img_4.png](img_4.png)
![img_5.png](img_5.png)

````kotlin
fun main() {
    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        
        println("Stop")
      
    } else if (trafficLightColor == "Yellow") {
        
        println("Slow")
      
    } else {
        
        println("Go")
      
    }
  
}

````
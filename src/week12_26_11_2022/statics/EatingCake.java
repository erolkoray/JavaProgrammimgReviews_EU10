package week12_26_11_2022.statics;

public class EatingCake {
    public static void main(String[] args) {



/*
        EatCake.eatCake(1); // result 9
        EatCake.eatCake(2); // result 7
        EatCake.eatCake(3); // result 4
 */
        EatCake person1 = new EatCake();
        EatCake person2 = new EatCake();
        EatCake person3 = new EatCake();

// BECAUSE THE EATCAKE WAS CREATED AS A STATIC METHOD, EVERY TIME SOMEONE TAKES A SLICE FROM THE CAKE, THE CAKE REDUCES 1 IN SIZE.
        // It's the same cake everyone is taking a slice from, because its a static cake. (if it was not static, everyone would have their own full cakes)
        person1.eatCake(1);
        person2.eatCake(1);
        person3.eatCake(1);



    }
}

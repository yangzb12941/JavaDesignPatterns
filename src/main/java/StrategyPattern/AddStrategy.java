package StrategyPattern;

public class AddStrategy implements Strategy {

    @Override
    public int calc(int num1, int num2) {
        // TODO Auto-generated method stub
        return num1 + num2;
    }

}

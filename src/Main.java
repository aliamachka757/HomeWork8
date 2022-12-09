public class Main {
    public static void main(String[] args) {


/////Problem1
        System.out.println("Problem 1.1");


        int weights[];
        weights = new int[12];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        {
            System.out.println(weights[0] + "," + weights[1] + "," + weights[2] + ",");


            double number[] = new double[]{1.57, 7.654, 9.986};
            number[0] = 1.57;
            number[1] = 7.654;
            number[2] = 9.986;
            System.out.println(number[0] + "," + number[1] + "," + number[2]);
        }


        int MyNumbers[] = {11, 12, 13};
        MyNumbers[0] = 10;
        MyNumbers[1] = 11;
        MyNumbers[2] = 12;
        System.out.println(MyNumbers[0] + ", " + MyNumbers[1] + ", " + MyNumbers[2] + ", ");


        ////Problem1.2
        System.out.println("Problem 1.2");

        int weightsK[];
        weightsK = new int[12];
        weightsK[0] = 3;
        weightsK[1] = 2;
        weightsK[2] = 1;

        {
            System.out.println(weightsK[0] + "," + weightsK[1] + "," + weightsK[2] + ",");

        }
        double number[] = new double[]{1.57, 7.654, 9.986};
        number[2] = 1.57;
        number[1] = 7.654;
        number[0] = 9.986;
        System.out.println(number[0] + "," + number[1] + "," + number[2]);

        int MyNumbersF[] = {11, 12, 13};
        MyNumbersF[2] = 12;
        MyNumbersF[1] = 11;
        MyNumbersF[0] = 10;
        System.out.println(MyNumbersF[0] + "," + MyNumbersF[1] + "," + MyNumbersF[2] + "");


        ////Problem2
        System.out.println("Problem2");




        weights = new int []{1,2,3,4,5,6,7,8,9,10,11,12};


        int count=0;
        for (int x : weights) {
            x *= 2;
            System.out.println(x);
            count++;
        }
    }
}











































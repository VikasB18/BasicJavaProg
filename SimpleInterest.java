class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        int time = 5;
        int rate = 5;

        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Simple interest: " + simpleInterest);
    }
}
public class Gol {


    public static void main(String[] args) {
        Car car = new Car(){
            @Override
            public void run(int km) {
                super.run(100);
            }
        };
    }
}

package Pizza;

public class AppTest {
    // Create 4 variables
    // 2 or 3 constructor
    // 2 or 3 Create methods

    int var;
    int val;
    String vendor;
    String model;

    public AppTest(int var, int val, String vendor, String model) {
        this.var = var;
        this.val = val;
        this.vendor = vendor;
        this.model = model;
        System.out.println("AppTest constructor with 4 parameters ");
    }

    public AppTest(int var, int val) {
        this.var = var;
        this.val = val;
        this.vendor = vendor;
        this.model = model;
        System.out.println("AppTest constructor with 2 parameters ");
    }

    public AppTest(int var) {
        this.var = var;
        this.val = val;
        this.vendor = vendor;
        this.model = model;
        System.out.println("AppTest constructor  with 1 parameters ");
    }

    public AppTest() {
        System.out.println("Empty  constructor no parameters  ");
    }

    public static void display() {
        System.out.println("display method");
    }

    public static String computer(String model) {
        System.out.println("computer  with 1 parameters , your model is " + model);
        return model;
    }

    public static String laptop(String model, int version) {
        System.out.println("laptop with 2 parameters " + model + "Version " + version);
        return model;
    }

    public static String phone(String model) {
        System.out.println("phone with 1 parameters " + model);
        return model;
    }
}

public class Circle implements Shape {
    @Override
    public void draw() {
        int radius = 5;
        int diameter = 2 * radius + 1;
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                int x = i - radius;
                int y = j - radius;
                if (x * x + y * y <= radius * radius + radius * 0.8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
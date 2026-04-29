public class ShippingCalculator {

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }

        // Sửa lỗi so sánh an toàn: "VALUE".equals(variable)
        if (type.equals("EXPRESS")) {
            return weight * 5000 + 20000;
        }
        if ("STANDARD".equals(type)) {
            return weight * 3000;
        }

        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
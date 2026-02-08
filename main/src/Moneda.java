public record Moneda(double conversion_rate, double conversion_result) {
    @Override
    public double conversion_result() {
        return conversion_result;
    }

    @Override
    public double conversion_rate() {
        return conversion_rate;
    }
}

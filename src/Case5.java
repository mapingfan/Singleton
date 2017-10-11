public class Case5 {
    private static class Case5Holder {
        private static final Case5 instance = new Case5();
    }

    private Case5() {

    }

    public static Case5 getInstance() {
        return Case5Holder.instance;
    }
}

class Businesses {
    private int count = 0;
    private double upgradeCost = 0;
    private double moneyOutput = 0;

    public int getCount() {
        return this.count;
    }

    public void setCount(int inCount) {
        this.count = inCount;
    }

    public double getUpgradeCost() {
        return this.upgradeCost;
    }

    public void setUpgradeCost(double inUpgradeCost) {
        this.upgradeCost = Math.round(inUpgradeCost);
    }

    public double getMoneyOutput() {
        return this.moneyOutput;
    }

    public void setMoneyOutput(double inMoneyOutput) {
        this.moneyOutput = Math.round(inMoneyOutput);
    }
}

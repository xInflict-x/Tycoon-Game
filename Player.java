class Player {
    private double money = 5;
    private int prestigeLevel = 1;
    private double prestigeMultiplier = 0;
    private int totalBusinesses;

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double inMoney) {
        this.money = inMoney;
    }

    public int getPrestigeLevel() {
        return this.prestigeLevel;
    }

    public void setPrestigeLevel(int inPrestigeLevel) {
        this.prestigeLevel = inPrestigeLevel;
    }

    public double getPrestigeMultiplier() {
        return this.prestigeMultiplier;
    }

    public void setPrestigeMultiplier(double inPrestigeMultiplier) {
        this.prestigeMultiplier = inPrestigeMultiplier;
    }

    public int getTotalBusinesses() {
        return this.totalBusinesses;
    }

    public void setTotalBusinesses(int inTotalBusinesses) {
        this.totalBusinesses = inTotalBusinesses;
    }
}
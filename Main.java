import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Businesses lemonadeStand = new Businesses();
        Businesses newspaperDelivery = new Businesses();
        Businesses carWash = new Businesses();
        Businesses pizzaDelivery = new Businesses();
        Businesses donutShop = new Businesses();
        Businesses shrimpBoat = new Businesses();
        Businesses hockeyTeam = new Businesses();
        Businesses movieStudio = new Businesses();
        Businesses bank = new Businesses();
        Businesses oilCompany = new Businesses();
        Player jack = new Player();

        gameMenu(jack, lemonadeStand, newspaperDelivery, carWash, pizzaDelivery, donutShop, shrimpBoat, hockeyTeam, movieStudio, bank, oilCompany);
    }

    public static void prestige(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        Scanner prestigeConfirmInput = new Scanner(System.in);
        int prestigeConfirm = prestigeConfirmInput.nextInt();
        System.out.println("Are you sure you want to prestige? This will reset all your businesses and stats. It will increase your prestige multiplier.\n1) Prestige\n2) Cancel");
        if (prestigeConfirm == 1 & player.getMoney() >= 1000000 * player.getPrestigeMultiplier()) {
            business1.setCount(0);
            business2.setCount(0);
            business3.setCount(0);
            business4.setCount(0);
            business5.setCount(0);
            business6.setCount(0);
            business7.setCount(0);
            business8.setCount(0);
            business9.setCount(0);
            business10.setCount(0);
            player.setMoney(5);

            player.setPrestigeLevel(player.getPrestigeLevel() + 1);
            updateAll(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
            System.out.println("Congratulations! Your new prestige level is: " + player.getPrestigeLevel());
        }
        gameMenu(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
    }

    public static void cycle(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        updateAll(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        if (business1.getCount() >= 1) {
            player.setMoney(player.getMoney() + business1.getMoneyOutput());
            if (business2.getCount() >= 1) {
                player.setMoney(player.getMoney() + business2.getMoneyOutput());
                if (business3.getCount() >= 1) {
                    player.setMoney(player.getMoney() + business3.getMoneyOutput());
                    if (business4.getCount() >= 1) {
                        player.setMoney(player.getMoney() + business4.getMoneyOutput());
                        if (business5.getCount() >= 1) {
                            player.setMoney(player.getMoney() + business5.getMoneyOutput());
                            if (business6.getCount() >= 1) {
                                player.setMoney(player.getMoney() + business6.getMoneyOutput());
                                if (business7.getCount() >= 1) {
                                    player.setMoney(player.getMoney() + business7.getMoneyOutput());
                                    if (business8.getCount() >= 1) {
                                        player.setMoney(player.getMoney() + business8.getMoneyOutput());
                                        if (business9.getCount() >= 1) {
                                            player.setMoney(player.getMoney() + business9.getMoneyOutput());
                                            if (business10.getCount() >= 1) {
                                                player.setMoney(player.getMoney() + business10.getMoneyOutput());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        gameMenu(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
    }

    public static void gameStats(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        updateAll(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        System.out.println("-------");
        System.out.println("Money: [" + player.getMoney() + "]");
        System.out.println("Total Businesses: [" + player.getTotalBusinesses() + "]");
        System.out.println("Prestige Level: [" + player.getPrestigeLevel() + "]");
        System.out.println("Prestige Multiplier: [" + player.getPrestigeMultiplier() + "]");
        System.out.println("\n");
        System.out.println("-------");
        gameMenu(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
    }


    public static void gameMenu(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        updateAll(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        System.out.println("\n");
        System.out.println("1) Shop");
        System.out.println("2) Stats");
        System.out.println("3) Cycle");
        System.out.println("4) Quit");

        Scanner gameMenuInput = new Scanner(System.in);
        int menuChoice = gameMenuInput.nextInt();

        if (menuChoice == 1) {
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (menuChoice == 2) {
            gameStats(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (menuChoice == 3) {
            cycle(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (menuChoice == 4) {
            //Quit
        } else {
            System.out.println("That's not an option.");
            gameMenu(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }


    }

    public static void gameShop(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        System.out.println("\n");
        System.out.println("Must buy in order to receive payment.");
        System.out.println("\n");
        updateAll(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        System.out.println("--------");
        System.out.println("Money: [" + player.getMoney() + "]");
        System.out.println("Total Businesses: [" + player.getTotalBusinesses() + "]");
        System.out.println("-------");
        System.out.println("\n");
        System.out.println("0) Exit\n");
        System.out.println("1) " + "Lemonade Stand\n" + "Upgrade Cost: " + business1.getUpgradeCost() + "\nOwned: " + business1.getCount() + "\n");
        System.out.println("2) " + "Newspaper Delivery\n" + "Upgrade Cost: " + business2.getUpgradeCost() + "\nOwned: " + business2.getCount() + "\n");
        System.out.println("3) " + "Car Wash\n" + "Upgrade Cost: " + business3.getUpgradeCost() + "\nOwned: " + business3.getCount() + "\n");
        System.out.println("4) " + "Pizza Delivery\n" + "Upgrade Cost: " + business4.getUpgradeCost() + "\nOwned: " + business4.getCount() + "\n");
        System.out.println("5) " + "Donut Shop\n" + "Upgrade Cost: " + business5.getUpgradeCost() + "\nOwned: " + business5.getCount() + "\n");
        System.out.println("6) " + "Shrimp Boat\n" + "Upgrade Cost: " + business6.getUpgradeCost() + "\nOwned: " + business6.getCount() + "\n");
        System.out.println("7) " + "Hockey Team\n" + "Upgrade Cost: " + business7.getUpgradeCost() + "\nOwned: " + business7.getCount() + "\n");
        System.out.println("8) " + "Movie Studio\n" + "Upgrade Cost: " + business8.getUpgradeCost() + "\nOwned: " + business8.getCount() + "\n");
        System.out.println("9) " + "Bank\n" + "Upgrade Cost: " + business9.getUpgradeCost() + "\nOwned: " + business9.getCount() + "\n");
        System.out.println("10) " + "Oil Company\n" + "Upgrade Cost: " + business10.getUpgradeCost() + "\nOwned: " + business10.getCount() + "\n");
        System.out.println("-------------");

        Scanner gameShopInput = new Scanner(System.in);
        int shopChoice = gameShopInput.nextInt();

        if (shopChoice == 1) {
            if (player.getMoney() >= business1.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business1.getUpgradeCost());
                updateLemonadeStand(player, business1, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 2) {
            if (player.getMoney() >= business2.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business2.getUpgradeCost());
                updateNewspaperDelivery(player, business2, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 3) {
            if (player.getMoney() >= business3.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business3.getUpgradeCost());
                updateCarWash(player, business3, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 4) {
            if (player.getMoney() >= business4.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business4.getUpgradeCost());
                updatePizzaDelivery(player, business4, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }


        if (shopChoice == 5) {
            if (player.getMoney() >= business5.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business5.getUpgradeCost());
                updateDonutShop(player, business5, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 6) {
            if (player.getMoney() >= business6.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business6.getUpgradeCost());
                updateShrimpBoat(player, business6, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 7) {
            if (player.getMoney() >= business7.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business7.getUpgradeCost());
                updateHockeyTeam(player, business7, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 8) {
            if (player.getMoney() >= business8.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business8.getUpgradeCost());
                updateMovieStudio(player, business8, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 9) {
            if (player.getMoney() >= business9.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business9.getUpgradeCost());
                updateBank(player, business9, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 10) {
            if (player.getMoney() >= business10.getUpgradeCost()) {
                player.setMoney(player.getMoney() - business10.getUpgradeCost());
                updateOilCompany(player, business10, 1);
            } else {
                System.out.println("You do not have enough money.");
            }
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }

        if (shopChoice == 0) {
            gameMenu(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        } else {
            System.out.println("That's not an option.");
            gameShop(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        }
    }

    public static void updateAll(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        updateTotalBusinesses(player, business1, business2, business3, business4, business5, business6, business7, business8, business9, business10);
        updatePrestige(player, 0);
        updateLemonadeStand(player, business1, 0);
        updateNewspaperDelivery(player, business2, 0);
        updateCarWash(player, business3, 0);
        updatePizzaDelivery(player, business4, 0);
        updateDonutShop(player, business5, 0);
        updateShrimpBoat(player, business6, 0);
        updateHockeyTeam(player, business7, 0);
        updateMovieStudio(player, business8, 0);
        updateBank(player, business9, 0);
        updateOilCompany(player, business10, 0);
    }

    public static void updateTotalBusinesses(Player player, Businesses business1, Businesses business2, Businesses business3, Businesses business4, Businesses business5, Businesses business6, Businesses business7, Businesses business8, Businesses business9, Businesses business10) {
        player.setTotalBusinesses(business1.getCount() + business2.getCount() + business3.getCount() + business4.getCount() + business5.getCount() + business6.getCount() + business7.getCount() + business8.getCount() + business9.getCount() + business10.getCount());
    }

    public static void updatePrestige(Player player, int level) {
        player.setPrestigeLevel(player.getPrestigeLevel() + level);
        player.setPrestigeMultiplier(0.3 * player.getPrestigeLevel());
    }

    public static void updateLemonadeStand(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round(1.3 * business.getCount() + 15) + 0.4) * player.getPrestigeMultiplier());
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 0.5));
    }

    public static void updateNewspaperDelivery(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((1.6 * business.getCount() + 15) + 2.4) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 0.8));
    }

    public static void updateCarWash(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((1.9 * business.getCount() + 15) + 5.4) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 1.1));
    }

    public static void updatePizzaDelivery(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((2.2 * business.getCount() + 15) + 9.4) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 1.4));
    }

    public static void updateDonutShop(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((2.5 * business.getCount() + 15) + 14.6) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 1.7));
    }

    public static void updateShrimpBoat(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((2.8 * business.getCount() + 15) + 20.9) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 2.0));
    }

    public static void updateHockeyTeam(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((3.1 * business.getCount() + 15) + 27.2) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 2.3));
    }

    public static void updateMovieStudio(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((3.4 * business.getCount() + 15) + 35.5) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 2.6));
    }

    public static void updateBank(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((3.7 * business.getCount() + 15) + 44.8) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 2.9));
    }

    public static void updateOilCompany(Player player, Businesses business, int count) {
        business.setCount(business.getCount() + count);
        business.setUpgradeCost((Math.round((4.0 * business.getCount() + 15) + 54.1) * player.getPrestigeMultiplier()));
        business.setMoneyOutput((Math.round(business.getCount() + 15) * player.getPrestigeMultiplier() * 3.2));
    }
}

//    lemonadeStand
//    newspaperDelivery
//    carWash
//    pizzaDelivery
//    donutShop
//    shrimpBoat
//    hockeyTeam
//    movieStudio
//    bank
//    oilCompany
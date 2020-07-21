package ru.geekbrains.lesson7;

public class Cat {
    protected final String name;
    private boolean satiety;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println( name +" имеет аппетит "+ appetite + " ед.");

        String hungry = satiety ? " сыт ": " голоден, так как в миске не хватило еды";
        System.out.println(name + hungry);
        System.out.println();
    }

    public void eat(Plate plate){
        System.out.println(name+ " собирается есть из миски!");
            if (plate.getFood() >= appetite) {
                satiety = true;
                plate.decreaseFood(appetite);
            }else {
                System.out.println("В миске недостаточно корма для кота! Надо добавить корм!");
                plate.addFood(2);
                plate.info();
            }
    }
}

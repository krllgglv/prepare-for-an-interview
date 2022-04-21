package ru.kgogolev.task3;

import ru.kgogolev.task3.figures.Figure;
import ru.kgogolev.task3.figures.Round;
import ru.kgogolev.task3.figures.Square;
import ru.kgogolev.task3.figures.Triangle;

public class TaskRunner {
    public static void main(String[] args) {
        Figure figure1 = new Round();
        Figure figure2 = new Square();
        Figure figure3 = new Triangle();

        figure1.whoAmI();
        figure2.whoAmI();
        figure3.whoAmI();
    }





}

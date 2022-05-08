package lesson_two.methods;

import helper.robot.Direction;
import helper.robot.Robot;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * <p>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * <p>
 * public class Robot {
 * <p>
 * public Direction getDirection() {
 * // текущее направление взгляда
 * }
 * <p>
 * public int getX() {
 * // текущая координата X
 * }
 * <p>
 * public int getY() {
 * // текущая координата Y
 * }
 * <p>
 * public void turnLeft() {
 * // повернуться на 90 градусов против часовой стрелки
 * }
 * <p>
 * public void turnRight() {
 * // повернуться на 90 градусов по часовой стрелке
 * }
 * <p>
 * public void stepForward() {
 * шаг в направлении взгляда
 * за один шаг робот изменяет одну свою координату на единицу
 * }
 * }
 * Direction, направление взгляда робота,  — это перечисление:
 * public enum Direction {
 * UP,
 * DOWN,
 * LEFT,
 * RIGHT
 * }
 *
 * Пример
 *
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 *
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 *
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MoveRobot {

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        if ((toX != robot.getX()) || (toY != robot.getY())) {
            moveRobot(robot, toX, toY);
        }
    }
}


/**
    int howMuchUp = toY - robot.getY();
    int howMuchRight = toX - robot.getX();
    int howMuchDown = robot.getY() - toY;
    int howMuchLeft = robot.getX() - toX;

        if (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
                }
                for (int i = 0; i < howMuchRight; i++) {
        robot.stepForward();
        }
        }
        if (toX < robot.getX()) {
        while (robot.getDirection() != Direction.LEFT) {
        robot.turnRight();
        }
        for (int i = 0; i < howMuchLeft; i++) {
        robot.stepForward();
        }
        }
        if (toY > robot.getY()) {
        while (robot.getDirection() != Direction.UP) {
        robot.turnRight();
        }
        for (int i = 0; i < howMuchUp; i++) {
        robot.stepForward();
        }
        }
        if (toY < robot.getY()) {
        while (robot.getDirection() != Direction.DOWN) {
        robot.turnRight();
        }
        for (int i = 0; i < howMuchDown; i++) {
        robot.stepForward();
        }
        }
**/
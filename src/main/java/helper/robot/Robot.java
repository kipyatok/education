package helper.robot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static helper.robot.Direction.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Robot {
    int x;
    int y;
    Direction direction;

    public void turnLeft() {
        if (direction == UP) {
            direction = LEFT;
        } else if (direction == DOWN) {
            direction = RIGHT;
        } else if (direction == LEFT) {
            direction = DOWN;
        } else if (direction == RIGHT) {
            direction = UP;
        }
    }

    public void turnRight() {
        if (direction == UP) {
            direction = RIGHT;
        } else if (direction == DOWN) {
            direction = LEFT;
        } else if (direction == LEFT) {
            direction = UP;
        } else if (direction == RIGHT) {
            direction = DOWN;
        }
    }

    public void stepForward() {
        if (direction == UP) {
            y++;
        }
        if (direction == DOWN) {
            y--;
        }
        if (direction == LEFT) {
            x--;
        }
        if (direction == RIGHT) {
            x++;
        }
    }
}

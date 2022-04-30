package lesson_two.methods;

import helper.robot.Direction;
import helper.robot.Robot;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveRobotTest {

    @Test
    public void testMoveRobot() {
        Robot one = new Robot(0, 0, Direction.UP);

        MoveRobot.moveRobot(one, 3, 7);

        assertThat(one.getX()).isEqualTo(3);
        assertThat(one.getY()).isEqualTo(7);

        Robot two = new Robot(-10, 10, Direction.RIGHT);

        MoveRobot.moveRobot(two, 0, 0);

        assertThat(two.getX()).isZero();
        assertThat(two.getY()).isZero();
    }
}
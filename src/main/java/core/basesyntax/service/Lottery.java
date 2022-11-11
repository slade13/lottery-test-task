package core.basesyntax;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    NumberSupplier numberSupplier = new NumberSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(numberSupplier.getRandomNumber());
        return ball;
    }
}

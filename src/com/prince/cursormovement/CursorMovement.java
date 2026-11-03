
package com.prince.cursormovement;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursorMovement {

    private static final Logger LOGGER =
            Logger.getLogger(CursorMovement.class.getName());

    private static final DateTimeFormatter TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private static final int MOVEMENT_DISTANCE = 2;
    private static final int MOVEMENT_DELAY_MS = 1000;
    private static final int INTERVAL_MS = 60000;

    public static void main(String[] args) {

        LOGGER.info("Cursor Movement Utility started.");
        LOGGER.info("Press Ctrl + C to stop the application.");

        try {
            Robot robot = new Robot();

            while (!Thread.currentThread().isInterrupted()) {
                moveCursor(robot);
                Thread.sleep(INTERVAL_MS);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.info("Cursor Movement Utility stopped.");

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE,
                    "Failed to execute cursor movement.", e);
        }
    }

    private static void moveCursor(Robot robot)
            throws InterruptedException {

        Point currentPosition =
                MouseInfo.getPointerInfo().getLocation();

        int x = currentPosition.x;
        int y = currentPosition.y;

        // Move cursor slightly
        robot.mouseMove(x + MOVEMENT_DISTANCE, y);

        Thread.sleep(MOVEMENT_DELAY_MS);

        // Restore original cursor position
        robot.mouseMove(x, y);

        String timestamp =
                LocalDateTime.now().format(TIME_FORMATTER);

        LOGGER.info("Cursor movement completed at: " + timestamp);
    }
}

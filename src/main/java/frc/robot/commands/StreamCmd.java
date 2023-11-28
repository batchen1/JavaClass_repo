package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class StreamCmd extends CommandBase {

    private Printer printer;
    private char character;
    private int seconds;
    private Timer timer = new Timer();

    public StreamCmd(Printer p, char c, int s) {
        printer = p;
        character = c;
        seconds = s;
    }

    @Override
    public void initialize() {
        timer.reset();
        timer.start();
    }

    @Override
    public void execute() {
        printer.printChar(character);
    }

    @Override
    public boolean isFinished() {
        return (timer.hasElapsed(seconds));
    }

    @Override
    public void end(boolean interrupted) {
    }

}

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class PrintCmd extends CommandBase {

    private Printer printer;
    private char character;

    public PrintCmd(Printer p, char c) {
        printer = p;
        character = c;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        printer.printChar(character);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}

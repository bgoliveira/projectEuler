package me.brunogomes.projecteuler.common;

import static java.lang.System.out;

public abstract class ConsoleOutputProblem implements Problem
{
    public abstract String getAnswer();

    public void printAnswer()
    {
        out.println(getAnswer());
    }
}

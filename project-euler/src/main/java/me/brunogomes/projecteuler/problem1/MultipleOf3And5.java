package me.brunogomes.projecteuler.problem1;

import me.brunogomes.projecteuler.common.ConsoleOutputProblem;
import org.springframework.stereotype.Component;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

@Component
public class MultipleOf3And5 extends ConsoleOutputProblem
{

    @Override
    public String getAnswer()
    {
        Integer sum = IntStream.rangeClosed(1, 999)
            .filter(isMultipleOf3Or5())
            .sum();

        return sum.toString();
    }

    private static IntPredicate isMultipleOf3Or5()
    {
        return p -> (p % 3 == 0) || (p % 5 == 0);
    }
}

package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

// Sum of two fractional numbers
    @Override
    public double plus(double num1, double num2) {

        return num1 + num2;
    }

//Difference of two fractional numbers    
    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

//Multiplication of two fractional numbers    
    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

//Division of two fractional numbers    
    @Override
    public double divide(double num1, double num2) {
        return num1 / num2;
    }


}

package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String Welcome() {
        return "Привет, это мой первый калькулятор ";
    }

// Sum of two fractional numbers
    @GetMapping("/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

//Difference of two fractional numbers 
    @GetMapping("/minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

//Multiplication of two fractional numbers
    @GetMapping("/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

//Division of two fractional numbers 
    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {

        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        }
        return "Делить на 0 нельзя";
    }
}

package com.example.swagger.controllers;

import com.example.swagger.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/math")
@RestController
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "Message", notes = "Print a welcome message")
    public String welcomeMathMsg() {
        return "Welcome in this Math controller";
    }

    @GetMapping(value = "/division-info")
    @ApiOperation(value = "Division", notes = "Print the characteristics of the division")
    public ArithmeticOperation divisionDetails() {
        return new ArithmeticOperation(
                "division",
                2,
                "Division Definition Division is the opposite of multiplication." +
                        " If 3 groups of 4 make 12 in multiplication, 12 divided into" +
                        " 3 equal groups give 4 in each group in division." +
                        " The main goal of dividing is to see how many equal" +
                        " groups are formed or how many are in each group when sharing fairly",
                new String[]{
                        "invariant", "distributive"
                }
        );
    }

    @GetMapping(value = "/multiplication")
    @ApiOperation(value = "Multiplication", notes = "It takes two numbers, and calculates their multiplication")
    public int getMultiplication(
            @RequestParam(
                    required = true,
                    name = "First Factor",
                    defaultValue = "Insert  first factor")
            int a,
            @RequestParam(
                    defaultValue = "Insert second factor",
                    name = "Second Factor",
                    required = true)
            int b
    ) {
        return a * b;
    }

    @GetMapping(value = "/square/{n}")
    @ApiOperation(value = "Square", notes = "It takes in input one number and calculate your square")
    public int getSquare(
            @PathVariable(
                    value = "Base",
                    required = true)
            int n
    ) {
        int square = n * n;
        return square;
    }
}

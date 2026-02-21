package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;
    private Boolean dividedByZero=false;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("I subtract {int} and {int}")
    public void iSubtractAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the subtraction should be {int}")
    public void theSubtractionShouldBe(int arg0) {
        this.calculator.subtract();
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the multiplication should be {int}")
    public void theMultiplicationShouldBe(int arg0) {
        this.calculator.multiply();
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }

    @When("I divide {int} and {int}")
    public void iDivideAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.dividedByZero=true;
    }

    @Then("the division should be {int}")
    public void theDivisionShouldBe(int arg0) {
        try {
            this.calculator.divide();
        }catch (ArithmeticException e){
            this.dividedByZero=true;
        }
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }
    
    @Then("it is {word} that an error occurred")
    public void itIsThatAnErrorOccurred(String arg0) {
        boolean expected = Boolean.parseBoolean(arg0);
        if (this.dividedByZero!=expected) {
            throw new IllegalStateException();
        }
    }
}

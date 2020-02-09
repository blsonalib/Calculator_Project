package com.calculator.service;
import org.springframework.stereotype.Service;
import com.calculator.model.NumberDTO;

@Service
public class CalculatorService implements ICalculatorService {
	@Override
	public int calculate(NumberDTO numberDTO) {
		System.out.println("CalculatorService.calculate()");
		int baseValue = numberDTO.getBaseValue();
		int exponentValue = numberDTO.getExponentValue();

		System.out.println(baseValue);
		System.out.println(exponentValue);

		int resultValue = 1;
        for (int i = 1; i <= exponentValue; i++) {
			resultValue = resultValue * baseValue;
		}
		System.out.println(resultValue);
		return resultValue;
	}
}

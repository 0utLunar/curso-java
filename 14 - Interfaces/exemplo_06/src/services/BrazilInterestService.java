package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

    private double InterestRate;

    public BrazilInterestService(double interestRate) {
        InterestRate = interestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

}

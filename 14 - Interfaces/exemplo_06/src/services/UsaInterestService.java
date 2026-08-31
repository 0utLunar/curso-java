package services;

public class UsaInterestService implements InterestService {

    private double InterestRate;

    public UsaInterestService(double interestRate) {
        InterestRate = interestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

}

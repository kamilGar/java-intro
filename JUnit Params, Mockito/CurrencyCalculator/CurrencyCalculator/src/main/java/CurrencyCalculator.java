// import com.example.demo.service.KursNBPService;

public class CurrencyCalculator implements ExchangeRate {

    double value;
    double exchangeRateEUR = 4.52;
    double exchangeRateUSD = 3.74;
    double exchangeRateGBP  = 5.21; // nie wiem skąd aktualny kurs

    CurrencyCalculator(double value) {
        this.value = value;
    }

    @Override
    public double getExchangeRate(Currency currency) {
        double result = 1.0;

        if (currency == Currency.EUR) {
            result = exchangeRateEUR;
        } else if (currency == Currency.USD) {
            result = exchangeRateUSD;
        } else if (currency == Currency.GBP)
            result = exchangeRateGBP;

        return result;
    }

    public double calculateResult(double value, double exchangeRate) {
        return value * exchangeRate;
    }

}

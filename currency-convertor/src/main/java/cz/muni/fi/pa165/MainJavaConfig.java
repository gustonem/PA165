package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

public class MainJavaConfig {

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
        CurrencyConvertor currencyConvertor = ctx.getBean(CurrencyConvertor.class);
        System.out.println(String.format("1 EUR -> CZK : " +
                currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), new BigDecimal("1"))));

    }

}

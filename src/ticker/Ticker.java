package ticker;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class Ticker {
	
	public static String ticker() throws IOException {
	
		String[] symbols = {"AAPL", "VNQ", "BLV", "BSV", "SPY"};
		String name;
		String symbol;
		BigDecimal price;
		BigDecimal change;
		String ticker = "";
		
		for(String sbl : symbols)
		{		
			Stock stock = YahooFinance.get(sbl);
		 
			name = stock.getName();
			symbol = sbl;
			price = stock.getQuote().getPrice();
			change = stock.getQuote().getChangeInPercent();
			ticker += "   " + name + " (" + symbol + ") " + price + " " + change + "%";
		}
		return ticker;	
	}
	
}

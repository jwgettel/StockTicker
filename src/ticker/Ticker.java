package ticker;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class Ticker {
	
	public static void main(String[] args) throws IOException {
	
		String[] symbols = {"JNK", "VNQ", "BLV", "BSV", "SPY", "^GSPC"};
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
			ticker += name + " (" + symbol + ") " + price + " " + change + "%   ";
		}
		System.out.print(ticker);
	
	}
	
}

import java.util.TimerTask;

public class Task extends TimerTask{

	double trgRate=0;
	public String symbol="";
	Parser prsr=new Parser();
	@Override
	public void run() {
		Double currentRate=prsr.getCurrentBid(this.symbol);
		if(currentRate==null){
			System.out.println("Please check the currency pair.");
			System.exit(0);
		}
		if(currentRate==this.trgRate){
			System.out.println("Target Reached as the current bid rate: "+currentRate+" has reached the target rate: "
					+this.trgRate+" for currency pair: "+symbol);
			System.exit(0);
		}
	}
}

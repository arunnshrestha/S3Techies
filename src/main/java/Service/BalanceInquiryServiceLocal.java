package Service;

import Config.CurrentBalanceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("local")
@Service
public class BalanceInquiryServiceLocal implements CurrentBalanceProvider {

    @Value("${savings.startingBalance}")
    private int startingBalance = 0;

    public int getCurrentBalance(){
        return startingBalance;
    }
}

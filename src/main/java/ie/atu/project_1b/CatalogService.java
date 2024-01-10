package ie.atu.project_1b;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class CatalogService {
    public String ackMessage(CatalogUser info_1)
    {
        String message = " here is catalog info";
        return message;

    }


}

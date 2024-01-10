package ie.atu.project_1b;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
    private final CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {

    this.catalogService = catalogService;
}
@PostMapping("/catalog")
public  String User(@RequestBody User user) {
    return catalogService.ackMessage(User);

}

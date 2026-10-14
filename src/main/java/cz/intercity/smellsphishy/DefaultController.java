package cz.intercity.smellsphishy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    private static final Logger log =
            LoggerFactory.getLogger(DefaultController.class);

    @GetMapping("/")
    public String landingPage() {
        log.debug("Landing page invoked");
        return "index";
    }
}

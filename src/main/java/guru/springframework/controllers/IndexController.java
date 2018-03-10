package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mapring
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }
}

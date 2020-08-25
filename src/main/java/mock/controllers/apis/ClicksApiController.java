package mock.controllers.apis;

import java.util.List;
import mock.data.models.Click;
import mock.data.services.ClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/api/clicks")
public class ClicksApiController {
    @Autowired
    ClickService clickService;

    @GetMapping("")
    public List<Click> getAllClicks() {
        return clickService.findAll();
    }

    @PostMapping("")
    public String addClick(@RequestBody Click click) {
        if (click != null) {
            clickService.insert(click);
            return "Added a click";
        } else {
            return "Request does not contain a body";
        }

    }
}

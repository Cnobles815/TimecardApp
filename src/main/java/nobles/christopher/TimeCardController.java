package nobles.christopher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by christophernobles on 10/25/16.
 */
@Controller
public class TimeCardController {

    @Autowired
    TimeCardDAO DAO;

    @RequestMapping(value="/TimeCard", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody List<TimeCard> getTimeCard() { return DAO.findAll();}

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("timecard", DAO.findAll());
        return "index";
    }

}

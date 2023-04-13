import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Index {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("gearEstimator", new Gear());
        return "index"; 

    }
    @PostMapping("/Gear")
    public String newGear(){
        return "index"; 
    }
}
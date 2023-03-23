package gymhum.de;
import java.lang.reflect.Array;
import java.util.ArrayList;
d
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gymhum.de.model.Option;

@Controller
public class SpielController {

    public SpielController(){
    }
    
    @GetMapping("/spiel")
    public String showSpiel(@RequestParam(name="activePage", required = false, defaultValue = "spiel") String activePage, Model model){ 
        model.addAttribute("activePage", "spiel");
        return "index.html";
    }
    @GetMapping("/start")
    public String start(@RequestParam(name="activePage", required = false, defaultValue = "start") String activePage, Model model){
        model.addAttribute("activePage", "start");
        return "index.html";
    }
    @GetMapping("/alleyway")
    public String alleyway(@RequestParam(name="activePage", required = false, defaultValue = "alleyway") String activePage, Model model){
        model.addAttribute("activePage", "alleyway");
        return "index.html";
    }
    @GetMapping("/market")
    public String market(@RequestParam(name="activePage", required = false, defaultValue = "market") String activePage, Model model){
        model.addAttribute("activePage", "market");
        return "index.html";
    }
    @GetMapping("/boringend")
    public String boringend(@RequestParam(name="activePage", required = false, defaultValue = "boringend") String activePage, Model model){
        model.addAttribute("activePage", "boringend");
        return "index.html";
    }
    //CD (The Slaughter)
    @GetMapping("/cd")
    public String cd(@RequestParam(name="activePage", required = false, defaultValue = "cd") String activePage, Model model){
        model.addAttribute("activePage", "cd");
        return "index.html";
    }
    @GetMapping("/partycd")
    public String partycd(@RequestParam(name="activePage", required = false, defaultValue = "partycd") String activePage, Model model){
        model.addAttribute("activePage", "partycd");
        return "index.html";
    }
    @GetMapping("/play")
    public String play(@RequestParam(name="activePage", required = false, defaultValue = "play") String activePage, Model model){
        model.addAttribute("activePage", "play");
        return "index.html";
    }
    @GetMapping("/reason")
    public String reason(@RequestParam(name="activePage", required = false, defaultValue = "reason") String activePage, Model model){
        model.addAttribute("activePage", "reason");
        return "index.html";
    }
    @GetMapping("/take")
    public String take(@RequestParam(name="activePage", required = false, defaultValue = "take") String activePage, Model model){
        model.addAttribute("activePage", "take");
        return "index.html";
    }
    @GetMapping("/slaughterdesc")
    public String slaughterdesc(@RequestParam(name="activePage", required = false, defaultValue = "slaughterdesc") String activePage, Model model){
        model.addAttribute("activePage", "slaughterdesc");
        return "index.html";
    }
    @GetMapping("/resist")
    public String resist(@RequestParam(name="activePage", required = false, defaultValue = "resist") String activePage, Model model){
        model.addAttribute("activePage", "resist");
        return "index.html";
    }
    @GetMapping("/retaliate")
    public String retaliate(@RequestParam(name="activePage", required = false, defaultValue = "retaliate") String activePage, Model model){
        model.addAttribute("activePage", "retaliate");
        return "index.html";
    }
    @GetMapping("/stab")
    public String stab(@RequestParam(name="activePage", required = false, defaultValue = "stab") String activePage, Model model){
        model.addAttribute("activePage", "stab");
        return "index.html";
    }
    @GetMapping("/horrordesc")
    public String horrordesc(@RequestParam(name="activePage", required = false, defaultValue = "horrordesc") String activePage, Model model){
        model.addAttribute("activePage", "horrordesc");
        return "index.html";
    }
    @GetMapping("/freeze")
    public String freeze(@RequestParam(name="activePage", required = false, defaultValue = "freeze") String activePage, Model model){
        model.addAttribute("activePage", "freeze");
        return "index.html";
    }
    @GetMapping("/freeze2")
    public String freeze2(@RequestParam(name="activePage", required = false, defaultValue = "freeze2") String activePage, Model model){
        model.addAttribute("activePage", "freeze2");
        return "index.html";
    }
    @GetMapping("/songend")
    public String songend(@RequestParam(name="activePage", required = false, defaultValue = "songend") String activePage, Model model){
        model.addAttribute("activePage", "songend");
        return "index.html";
    }

    @GetMapping("/music")
    public String music(@RequestParam(name="activePage", required = false, defaultValue = "music") String activePage, Model model){
        model.addAttribute("activePage", "music");
        return "index.html";
    }
    @GetMapping("/stop")
    public String stop(@RequestParam(name="activePage", required = false, defaultValue = "stop") String activePage, Model model){
        model.addAttribute("activePage", "stop");
        return "index.html";
    }
    @GetMapping("/stop2")
    public String stop2(@RequestParam(name="activePage", required = false, defaultValue = "stop2") String activePage, Model model){
        model.addAttribute("activePage", "stop2");
        return "index.html";
    }
    @GetMapping("/notgoodend")
    public String notgoodend(@RequestParam(name="activePage", required = false, defaultValue = "notgoodend") String activePage, Model model){
        model.addAttribute("activePage", "notgoodend");
        return "index.html";
    }

    @GetMapping("/resetgame")
    public String show(@RequestParam(name="activePage", required = true, defaultValue = "resetgame") String activePage, Model model){ 
        model.addAttribute("activePage", "resetgame");
        return "redirect:/spiel";
    }

test

} 

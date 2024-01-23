package com.casino.andarbahar1;
//GameController.java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {
 private AndarBaharGame game = new AndarBaharGame();

 @GetMapping("/")
 public String home(Model model)
 {
	 game.startGame();
	 return "home";
 }
 
 @GetMapping("/play")
 public String startPlay(Model model) {
	 model.addAttribute("jokerCard", game.getJoker());
     return "gameConsole";
 }

 @PostMapping("/choose")
 public String chooseSide(int side, int betAmount, Model model) {
     String result = game.determineWinner(side, betAmount);
     model.addAttribute("jokerCard", game.getJoker());
     model.addAttribute("andarCard", game.getAndarCard());
     model.addAttribute("baharCard", game.getBaharCard());
     model.addAttribute("reward", game.getReward());
     model.addAttribute("result", result);
     return "result";
 }
 
}


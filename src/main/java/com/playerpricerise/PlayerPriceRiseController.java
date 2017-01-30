package com.playerpricerise;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/playerpricerise")
public class PlayerPriceRiseController {

	private PlayerPriceRiseRepository pprRepo;

	@Autowired
	public PlayerPriceRiseController(PlayerPriceRiseRepository pprRepo) {

		this.pprRepo = pprRepo;
	}

	@ResponseBody
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<PlayerPriceRise> all() {
		return pprRepo.findAll();

	}

	@ResponseBody
	@RequestMapping(value="/max", method=RequestMethod.GET)
	public PlayerPriceRise max() {
		return pprRepo.findMax();

	}
	@ResponseBody
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public PlayerPriceRise playerByName(@PathVariable("name") String name) {
		return pprRepo.findPlayerByName(name);

	}
}
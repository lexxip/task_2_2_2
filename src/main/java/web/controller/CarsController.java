package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {

	private final CarDao carDao;

	public CarsController(CarDao carDao) {
		this.carDao = carDao;
	}

	@GetMapping(value = "/cars")
	public String listCars(ModelMap model, @RequestParam(value = "count", required = false) int count) {
		model.addAttribute("messages", carDao.listCars(count));
		return "cars";
	}
	
}
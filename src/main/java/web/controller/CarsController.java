package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {

	@Autowired
	private CarDao carDao;

	@GetMapping(value = "/cars")
	public String listCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
		int countI = -1;

		if (count != null) {
			try {
				countI = Integer.parseInt(count);
			} catch (NumberFormatException e) {
			}
		}

		model.addAttribute("messages", carDao.listCars(countI));
		return "cars";
	}
	
}
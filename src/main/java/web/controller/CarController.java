package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("car", carService.show(CarServiceImpl.getCars(), count));
        return "car";
    }
}
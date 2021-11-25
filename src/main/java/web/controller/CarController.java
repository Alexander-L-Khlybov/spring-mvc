package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.LinkedList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    private String tableName = "Cars list";
    private List<String> columns = new LinkedList<>();
    {
        columns.add("Owner");
        columns.add("Model");
        columns.add("Series");
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false)Integer count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCarsByCount(count));
        }

        model.addAttribute("tableName", tableName);
        model.addAttribute("cols", columns);

        return "cars";
    }
}

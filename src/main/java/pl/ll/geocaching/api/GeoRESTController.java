package pl.ll.geocaching.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.ll.geocaching.model.Point;
import pl.ll.geocaching.model.PointCRUDRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 24.03.2018.
 */
@Controller
public class GeoRESTController {

    private static final Logger log = LoggerFactory.getLogger(GeoRESTController.class);

    @Autowired
    private PointCRUDRepository pointCRUDRepository;

    @GetMapping(value = "/api/points" )
    @ResponseBody
    public List<Point> getAllPoints() {
        List<Point> points = new ArrayList<>();
        log.info("Full points list requested");
        for (Point iterPoint : pointCRUDRepository.findAll()) {
            points.add(iterPoint);
        }
        return points;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "api/point")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void savePoint(@RequestBody Point point) throws IllegalAccessException {
        log.info("New point added {}",point);
        pointCRUDRepository.save(point);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "api/point/{id}")
    @ResponseBody
    public void deletePoint(@PathVariable Long id) throws IllegalAccessException {
        log.info("Point deleted {}",id);
        pointCRUDRepository.delete(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "api/point/{id}")
    @ResponseBody
    public void putPoint(@RequestBody Point point, @PathVariable Long id) throws IllegalAccessException {
        log.info("Point edited {}",id);
        pointCRUDRepository.save(point);
    }
}

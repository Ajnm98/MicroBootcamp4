package ntt.com.example.webfluxappmicro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class Controller {

    @Autowired
    Service service;
    public String personList(final Model model){

        final Flux<Person> personlist = service.allPersons();
        model.addAttribute("personlist", personlist);
        return "personlist";

    }


}

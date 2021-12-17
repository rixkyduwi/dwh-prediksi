package tab.php.prediksi.controller
import org.springframework.steoreotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import tab.php.prediksi.model.Parameter
import javax.swing.AbstractSpinnerModel

@Controller
class AppController {

    @RequestMapping(value = "/")
    fun home(model:Model):String {
        model.addAttribute("param", Parameter())
        return "home"
    }
    @RequestMapping(value = "/proses"),method[RequestMethod.POST]
    fun home(model:Model):String {
        model.addAttribute("param", Parameter())
        return "home"
    }
}
package pl.maku.angular.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 15.04.14
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/users")
public class UserService {

        @RequestMapping(method = RequestMethod.GET)
        public @ResponseBody String printWelcome() {
            return "hello";
        }
}

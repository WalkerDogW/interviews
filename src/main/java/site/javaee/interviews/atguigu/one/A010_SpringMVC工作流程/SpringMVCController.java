package site.javaee.interviews.atguigu.one.A010_SpringMVC工作流程;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author shkstart
 * @create 2020-08-15 22:35
 */
@Controller
public class SpringMVCController {
//    处理模型数据方式一：将方法返回值设置为ModelAndView
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        //数据会被放到request域中
        modelAndView.addObject("user","admin");
        modelAndView.setViewName("success");
        return modelAndView;
    }


    //    处理模型数据方式二：返回值为String类型，方法参数中传入Map、Model或ModelMap，
//    SpringMVC会自动将其转换成一个ModelAndView对象
    @RequestMapping("/testModelAndView2")
    public String testModelAndView2(Map<String,Object> map){
        map.put("user","admin");
        return "success";
    }



}

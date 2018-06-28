@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {
    
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}

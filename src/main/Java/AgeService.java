import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;

@WebService (serviceName = "getAge")
public class AgeService implements generated.ageservice.AgeService {


    @WebMethod
    public String getAge(Integer naissance) {
        return "Votre âge est " + (LocalDate.now().getYear() - naissance) + " ans";
    }
}

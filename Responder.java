import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private  ArrayList<String> a;
    private HashMap<String, String> respuesta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        this.rnd=new Random();
        this.a= new ArrayList<>();
        respuesta = new HashMap<>();
        respuesta.put("hola", "buenos días");
        respuesta.put("enfadado", "tranquilicese por favor");
        respuesta.put("gracias", "siempre es un placer servir a nuestros clientes");
        respuesta.put("problema", "cuentame el problema");
        a.add("That sounds interesting. Tell me more...");
        a.add("Tell me more...");
        a.add("incredible i need more information");
        a.add("it´s not good");
        a.add("such a pity");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String pregunta)
    {
        String answer = null;
        if(respuesta.get(pregunta) != null)
        {
            answer = respuesta.get(pregunta);
        }
        
        else{
            int num= (rnd.nextInt(5));
            answer=(a.get(num));   
        }
        return answer;
    }

}
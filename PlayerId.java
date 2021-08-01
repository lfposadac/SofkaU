
/**
 * Creación del id del Jugador
 * 
 * @author (Luis Fernando Posada Cano) 
 * @version (01/08/2021)
 */
import java.util.UUID;
/*
 * La manera más sencilla de generar un UUID (Universally Unique Identifier) es 
mediante la clase randomUUID que le encontre en el paquete java.util.UUID
 */
public class PlayerId
{
    private UUID id;
    
    public PlayerId(UUID id) { this.id = id;}
    public String getId() { return id.toString(); }
    
   }

package alex2;

import java.time.LocalDateTime;

public class Fecha_Hora {
public static void main(String[] args) {
	LocalDateTime ahora= LocalDateTime.now();
	int anio=ahora.getYear();
	int mes=ahora.getMonthValue();

}
}

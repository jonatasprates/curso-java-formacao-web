
public class ComandoSwitCase {

	public static void main(String[] args) {

		/*
		 * Switch Case: Operações exatas
		 */
		String mes = "Janeiro";
		
		switch (mes) {
		case "Janeiro":
			System.out.println("Mês é Janeiro");
			break;
		case "Fevereiro":
			System.out.println("Mês é Fevereiro");
			break;
		default:
			System.out.println("Não existe este mês = " + mes);
			break;
		}
	}

}


public class ComandoSwitCase {

	public static void main(String[] args) {

		/*
		 * Switch Case: Opera��es exatas
		 */
		String mes = "Janeiro";
		
		switch (mes) {
		case "Janeiro":
			System.out.println("M�s � Janeiro");
			break;
		case "Fevereiro":
			System.out.println("M�s � Fevereiro");
			break;
		default:
			System.out.println("N�o existe este m�s = " + mes);
			break;
		}
	}

}

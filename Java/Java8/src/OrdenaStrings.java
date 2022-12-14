import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("aula online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Collections.sort(palavras);
		System.out.println(palavras);

		ComparadorPorTamanho c = new ComparadorPorTamanho();

		palavras.sort(c); // Collections.sort(palavras, c);

		System.out.println(palavras);

		palavras.forEach((s) -> System.out.println(s)

		);

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}
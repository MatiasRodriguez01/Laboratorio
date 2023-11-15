import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MutantDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mutants = 0;  // Mueve la declaración de mutants fuera del bucle

        while (true) {
            System.out.println(" ");
            System.out.println("MAGNETO NECESITA TU AYUDA PARA RECLUTAR MUTANTES!!");
            System.out.println("INGRESE EL ADN DEL INDIVIDUO PARA SABER SI ES MUTANTE O NO:");

            String[] adn = fillAdn();
            showMatrix(adn);

            if (isMutant(adn)) {
                System.out.println("El ADN es mutante");
                mutants++;
            } else {
                System.out.println("El ADN no es mutante");
            }

            System.out.print("Desea reclutar más mutantes <<<s/n>>>: ");
            String exit = scanner.next().toLowerCase();

            if (!exit.equals("s")) {
                break;
            }
        }

        if (mutants != 0) {
            System.out.println("Felicidades, el equipo está conformado por " + mutants + " mutantes!!");
        } else {
            System.out.println("No se reclutaron mutantes!!");
        }

    }


    private static String[] fillAdn() {
        String[] listLetter = new String[6];
        Set<Character> letters = Set.of('A', 'C', 'G', 'T');
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------");
        System.out.println("INGRESE EL ADN INDIVIDUO: ");

        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.println("Ingrese la palabra N°" + (i + 1) + ":");
                String word = scanner.next().toUpperCase();

                if (word.length() == 6 && word.chars().allMatch(ch -> letters.contains((char) ch))) {
                    listLetter[i] = word;
                    break;
                }
            }
        }

        System.out.println("-------");
        return listLetter;
    }

    private static boolean isMutant(String[] array) {
        int total = 0;
        Set<Character> listLetter = new HashSet<>();

        for (String row : array) {
            for (int columns = 0; columns < 6; columns++) {
                char letter = row.charAt(columns);
                int sequence = theSequences(array, letter);

                if (!listLetter.contains(letter)) {
                    if (sequence > 0) {
                        System.out.println("El gen " + letter + " se encontró " + sequence + " veces!!");
                        listLetter.add(letter);
                        total += sequence;

                        if (total > 1) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    private static int theSequences(String[] array, char element) {
        return horizontally(array, element) + vertically(array, element) + diagonally1(array, element) + diagonally2(array, element);
    }

    private static int horizontally(String[] array, char element) {
        int counter = 0;

        for (String word : array) {
            for (int columns = 0; columns < 6; columns++) {
                if (word.charAt(columns) == element) {
                    counter++;

                    if (counter >= 4) {
                        return counter;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return counter;
    }

    private static int vertically(String[] array, char element) {
        int counter = 0;

        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 0; columns < 6; columns++) {
                if (array[columns].charAt(rows) == element) {
                    counter++;

                    if (counter >= 4) {
                        return counter;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return counter;
    }

    private static int diagonally1(String[] array, char element) {
        int counter = 0;

        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 0; columns < 6; columns++) {
                if (array[rows].charAt(columns) == element) {
                    counter = d1(array, element, rows, columns);

                    if (counter >= 4) {
                        return counter;
                    }
                }
            }
        }

        return counter;
    }

    private static int d1(String[] array, char element, int rows, int columns) {
        int counter = 0;

        for (int i = rows, j = columns; i < 6 && j < 6; i++, j++) {
            if (array[i].charAt(j) == element) {
                counter++;

                if (counter >= 4) {
                    return counter;
                }
            } else {
                counter = 0;
            }
        }

        return counter;
    }

    private static int diagonally2(String[] array, char element) {
        int counter = 0;

        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 5; columns >= 0; columns--) {
                if (array[rows].charAt(columns) == element) {
                    counter = d2(array, element, rows, columns);

                    if (counter >= 4) {
                        return counter;
                    }
                }
            }
        }

        return counter;
    }

    private static int d2(String[] array, char element, int rows, int columns) {
        int counter = 0;

        for (int i = rows, j = columns; i < 6 && j >= 0; i++, j--) {
            if (array[i].charAt(j) == element) {
                counter++;

                if (counter >= 4) {
                    return counter;
                }
            } else {
                counter = 0;
            }
        }

        return counter;
    }

    private static void showMatrix(String[] array) {
        System.out.println("ADN:");

        for (String row : array) {
            for (int columns = 0; columns < 6; columns++) {
                System.out.print("[" + row.charAt(columns) + "]");
            }
            System.out.println();
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;


public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        int menu;
        HashMap<String, String> ar = new HashMap<String, String>();

        do {
            System.out.println("-----------MENÚ-----------");
            System.out.println("1.Crear fichero TXT");
            System.out.println("2.Crear fichero CSV");
            System.out.println("3.Crear fichero JSON");
            System.out.println("4.Ver lista de ficheros creados");
            System.out.println("5.Salir");
            System.out.print("Seleccione una opción: ");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    creaTxt(ar);
                    break;
                case 2:
                    creaCsv(ar);
                    break;
                case 3:
                    creaJson(ar);
                    break;
                case 4:
                    listaFicheros(ar);
                    break;
                case 5:
                    System.out.println("Has salido del programa");
                    break;
            }
        }while(menu!=5);
    }

    public static void creaTxt (HashMap<String, String> ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CREACIÓN DE FICHERO TXT-----");
        String tipoSalida = ".txt";
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = sc.next();

        ar.put(tipoSalida, nombreFichero);
        String filePath = nombreFichero + tipoSalida;
        LocalDate y = LocalDate.parse("2022-01-01");

        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= 12; i++) {
                bw.write(y.getYear() + " " + y.getMonth() + " " + y.lengthOfMonth() + " " + y.getDayOfWeek() + "\n");
                y = y.plusMonths(1);
            }

            bw.close();
            System.out.println("Ha sido creado el fichero " + nombreFichero + tipoSalida + " y su contenido es: ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("El fichero no ha podido ser creado.");
        }

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String linea = " ";
            while(linea!=null) {
                linea = br.readLine();
                if(linea!=null) {
                    System.out.println(linea);
                }
            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se ha encontrado el archivo");
        }

    }

    public static void creaCsv (HashMap<String, String> ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CREACIÓN DE FICHERO CSV-----");
        String tipoSalida = ".csv";
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = sc.next();
        ar.put(tipoSalida, nombreFichero);

        String filePath = nombreFichero + tipoSalida;
        LocalDate y = LocalDate.parse("2022-01-01");

        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= 12; i++) {
                bw.write(y.getYear() + ";" + y.getMonth() + ";" + y.lengthOfMonth() + ";" + y.getDayOfWeek() + "\n");
                y = y.plusMonths(1);
            }

            bw.close();
            System.out.println("Ha sido creado el fichero " + nombreFichero + tipoSalida + " y su contenido es: ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("El fichero no ha podido ser creado.");
        }

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String linea = " ";
            while(linea!=null) {
                linea = br.readLine();
                if(linea!=null) {
                    System.out.println(linea);
                }
            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se ha encontrado el archivo");
        }

    }

    public static void creaJson (HashMap<String, String> ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CREACIÓN DE FICHERO JSON-----");
        String tipoSalida = ".json";
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = sc.next();
        ar.put(tipoSalida, nombreFichero);

        String filePath = nombreFichero + tipoSalida;
        LocalDate ld = LocalDate.parse("2022-01-01");
        JSONObject months = new JSONObject();
        JSONObject json = new JSONObject();
        System.out.println("Ha sido creado el fichero " + nombreFichero + tipoSalida);

        try {
            json.put("year: ", ld.getYear());
            json.put("name: ", ld.getMonth());
            json.put("numberofdays: ", ld.lengthOfMonth());
            json.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json2 = new JSONObject();
        try {
            json2.put("year: ", ld.getYear());
            json2.put("name: ", ld.getMonth());
            json2.put("numberofdays: ", ld.lengthOfMonth());
            json2.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json3 = new JSONObject();
        try {
            json3.put("year: ", ld.getYear());
            json3.put("name: ", ld.getMonth());
            json3.put("numberofdays: ", ld.lengthOfMonth());
            json3.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json4 = new JSONObject();
        try {
            json4.put("year: ", ld.getYear());
            json4.put("name: ", ld.getMonth());
            json4.put("numberofdays: ", ld.lengthOfMonth());
            json4.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json5 = new JSONObject();
        try {
            json5.put("year: ", ld.getYear());
            json5.put("name: ", ld.getMonth());
            json5.put("numberofdays: ", ld.lengthOfMonth());
            json5.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json6 = new JSONObject();
        try {
            json6.put("year: ", ld.getYear());
            json6.put("name: ", ld.getMonth());
            json6.put("numberofdays: ", ld.lengthOfMonth());
            json6.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json7 = new JSONObject();
        try {
            json7.put("year: ", ld.getYear());
            json7.put("name: ", ld.getMonth());
            json7.put("numberofdays: ", ld.lengthOfMonth());
            json7.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json8 = new JSONObject();
        try {
            json8.put("year: ", ld.getYear());
            json8.put("name: ", ld.getMonth());
            json8.put("numberofdays: ", ld.lengthOfMonth());
            json8.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json9 = new JSONObject();
        try {
            json9.put("year: ", ld.getYear());
            json9.put("name: ", ld.getMonth());
            json9.put("numberofdays: ", ld.lengthOfMonth());
            json9.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json10 = new JSONObject();
        try {
            json10.put("year: ", ld.getYear());
            json10.put("name: ", ld.getMonth());
            json10.put("numberofdays: ", ld.lengthOfMonth());
            json10.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json11 = new JSONObject();
        try {
            json11.put("year: ", ld.getYear());
            json11.put("name: ", ld.getMonth());
            json11.put("numberofdays: ", ld.lengthOfMonth());
            json11.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ld = ld.plusMonths(1);
        JSONObject json12 = new JSONObject();
        try {
            json12.put("year: ", ld.getYear());
            json12.put("name: ", ld.getMonth());
            json12.put("numberofdays: ", ld.lengthOfMonth());
            json12.put("firstdayofweek: ", ld.getDayOfWeek());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        months.put("month1", json);
        months.put("month2", json2);
        months.put("month3", json3);
        months.put("month4", json4);
        months.put("month5", json5);
        months.put("month6", json6);
        months.put("month7", json7);
        months.put("month8", json8);
        months.put("month9", json9);
        months.put("month10", json10);
        months.put("month11", json11);
        months.put("month12", json12);

        try (PrintWriter out = new PrintWriter(new FileWriter(filePath))) {
            out.write(months.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listaFicheros (HashMap<String, String> ar) {
        System.out.println("-----FICHEROS CREADOS-----");
        for (Map.Entry<String, String> entry : ar.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(val+key);
        }

    }
}

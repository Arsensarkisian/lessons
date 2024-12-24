import java.io.*;
import java.util.Scanner;


public class FileUtil {
    private static Product [] fileProducts = new Product[40];

    public static void saveProducts(Product products) {
        File file = new File("/Users/arsensarkisian/IdeaProjects/shop/src/1.csv");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);

            PrintWriter printWriter = new PrintWriter(fileWriter);

                String line = String.join(",",
                        products.getName(),
                        products.getDescription(),
                        String.valueOf(products.getPrice()),
                        products.getProductCategories().toUpperCase());
                printWriter.println(line);

            System.out.println("Продукты успешно сохранены");
            printWriter.close();
        }catch (IOException e){
            System.out.println("Ошибка при сохранении" + e.getMessage());
        }
    }


    public static Product[] readProducts() throws IOException {
        File file = new File("/Users/arsensarkisian/IdeaProjects/shop/src/1.csv");

        if(!file.exists()){
            System.out.println("Файл не найден. Создаем новый файл");
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан " + file.getAbsolutePath());
            } else {
                System.out.println("Ошибка при создании файла");
            }
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);
        String line;
        int i = 0;
        while ((line = bf.readLine()) != null){


            String[] fields = line.split(",");
            if(fields.length == 4) {
                String name = fields[0].trim();
                String description = fields[1].trim();
                double price = Double.parseDouble(fields[2].trim());
                Categories categories = Categories.valueOf(fields[3].trim());
                 fileProducts[i++] = new Product(name, description, price, categories);
            }
        }
        bf.close();

        return fileProducts;
    }
}

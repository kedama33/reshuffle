package utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputUtil {
  String csvFilePath = "";

  public String getCsvFilePath() {
    return csvFilePath;
  }

  public void inputFilePath() {
    Scanner sc = new Scanner(System.in);

    System.out.print("読み込むcsvファイルのパスを入力してください: ");
    this.csvFilePath = sc.nextLine();

    sc.close();
  }

  public boolean checkInputCSVFilePath() {
    return checkBlank() || checkExtension() || checkExist() ? true : false;
  }

  boolean checkBlank() {
    if (csvFilePath.isBlank() || csvFilePath.isEmpty()) {
      System.out.println("※※※入力されたパスがブランクです※※※");
      return true;
    }
    return false;
  }

  boolean checkExtension() {
    if (csvFilePath.length() < 4 || !csvFilePath.substring(csvFilePath.length() - 4).equals(".csv")) {
      System.out.println("※※※入力されたファイルがcsvではありません※※※");
      return true;
    }
    return false;
  }

  boolean checkExist() {
    Path targetFilePath = Paths.get(csvFilePath);
    if (!Files.exists(targetFilePath)) {
      System.out.println("※※※指定されたファイルが存在しません※※※");
      return true;
    }
    return false;
  }
}

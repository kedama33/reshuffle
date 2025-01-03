package utils;

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
    return checkBlank() || checkExtension() ? true : false;
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
}

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
    this.csvFilePath = sc.next();

    // TODO 後で消す
    System.out.println(csvFilePath);

    sc.close();
  }
}

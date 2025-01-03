// cd class
// javac -d class Main.java

// cd class
// java Main

import utils.InputUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        InputUtil inputUtil = new InputUtil();

        // 入力したいcsvファイルのパスをターミナルから受け取る
        inputUtil.inputFilePath();

        // 受け取ったパスをチェックする
        inputUtil.checkInputCSVFilePath();
    }
}

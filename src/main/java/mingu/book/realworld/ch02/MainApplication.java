package mingu.book.realworld.ch02;

import mingu.book.realworld.ch02.parser.BankStatementCSVParser;
import mingu.book.realworld.ch02.parser.BankStatementParser;
import mingu.book.realworld.ch02.service.BankStatementAnalyzer;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
        bankStatementAnalyzer.analyze("bank-data-simple.csv", bankStatementParser);
    }
}

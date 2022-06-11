package mingu.book.realworld.ch02.parser;

import mingu.book.realworld.ch02.model.BankTransaction;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}

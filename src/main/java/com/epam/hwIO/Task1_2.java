package com.epam.hwIO;


import java.io.*;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class Task1_2 {
    static Set<String> keyWord = new HashSet<>();

    public static void main(String[] args) throws FileNotFoundException {

        keyWord.add("byte");
        keyWord.add("short");
        keyWord.add("int");
        keyWord.add("long");
        keyWord.add("char");
        keyWord.add("float");
        keyWord.add("double");
        keyWord.add("boolean");
        keyWord.add("if");
        keyWord.add("else");
        keyWord.add("switch");
        keyWord.add("case");
        keyWord.add("default");
        keyWord.add("while");
        keyWord.add("break");
        keyWord.add("continue");
        keyWord.add("for");
        keyWord.add("try");
        keyWord.add("catch");
        keyWord.add("finally");
        keyWord.add("throw");
        keyWord.add("throws");
        keyWord.add("private");
        keyWord.add("protected");
        keyWord.add("public");
        keyWord.add("import");
        keyWord.add("package");
        keyWord.add("class");
        keyWord.add("interface");
        keyWord.add("implements");
        keyWord.add("final");
        keyWord.add("void");
        keyWord.add("abstract");
        keyWord.add("native");
        keyWord.add("static");
        keyWord.add("extends");
        keyWord.add("new");
        keyWord.add("return");
        keyWord.add("this");
        keyWord.add("super");
        keyWord.add("synchronized");
        keyWord.add("volatile");
        keyWord.add("const");
        keyWord.add("goto");
        keyWord.add("instanceof");
        keyWord.add("enum");
        keyWord.add("assert");
        keyWord.add("transient");
        keyWord.add("strictfp");

    }
}

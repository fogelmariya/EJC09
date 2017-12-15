package com.epam.hwOperProc;

public class NodePad {
    WritingInNodepad writingInNodepad = new WritingInNodepad();

    public void addNewWriting(int value) {
        writingInNodepad.nodepad.add(value);
    }

    public void deleteWriting(int number){
        writingInNodepad.nodepad.remove(number);
    }

    public void editWriting(int number, int value){
        writingInNodepad.nodepad.remove(number);
        writingInNodepad.nodepad.add(number, value);
    }

    public void showNodePad() {
        for (int i = 0; i < writingInNodepad.nodepad.size(); i++) {
            System.out.print(writingInNodepad.nodepad.get(i) + ", ");
        }
        System.out.println();
    }

}

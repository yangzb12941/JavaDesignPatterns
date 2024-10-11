package PrototypePattern;

/**
 * 浅拷贝
 */
public class Prototype implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        int MAX_COUNT = 10;
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            Prototype mail = new Prototype();
            i++;
        }

        Prototype mail = new Prototype();
        while (i < MAX_COUNT) {
            Prototype cloneMail = (Prototype) mail.clone();
        }
    }
}

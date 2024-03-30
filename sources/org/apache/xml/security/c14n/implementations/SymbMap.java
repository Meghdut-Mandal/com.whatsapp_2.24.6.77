package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass001;
import java.util.ArrayList;
import java.util.List;

public class SymbMap implements Cloneable {
    public int a = 23;
    public NameSpaceSymbEntry[] b = new NameSpaceSymbEntry[23];
    public String[] c = new String[23];

    public int a(Object obj) {
        String str;
        String[] strArr = this.c;
        int length = strArr.length;
        int hashCode = (obj.hashCode() & Integer.MAX_VALUE) % length;
        String str2 = strArr[hashCode];
        if (str2 != null && !str2.equals(obj)) {
            int i = length - 1;
            do {
                int i2 = hashCode;
                hashCode++;
                if (i2 == i) {
                    hashCode = 0;
                }
                str = strArr[hashCode];
                if (str == null) {
                    break;
                }
            } while (str.equals(obj));
        }
        return hashCode;
    }

    public NameSpaceSymbEntry a(String str) {
        return this.b[a((Object) str)];
    }

    public void a(int i) {
        String[] strArr = this.c;
        int length = strArr.length;
        NameSpaceSymbEntry[] nameSpaceSymbEntryArr = this.b;
        this.c = new String[i];
        this.b = new NameSpaceSymbEntry[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                String str = strArr[i2];
                if (str != null) {
                    int a2 = a((Object) str);
                    this.c[a2] = str;
                    this.b[a2] = nameSpaceSymbEntryArr[i2];
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public void a(String str, NameSpaceSymbEntry nameSpaceSymbEntry) {
        int a2 = a((Object) str);
        String[] strArr = this.c;
        String str2 = strArr[a2];
        strArr[a2] = str;
        NameSpaceSymbEntry[] nameSpaceSymbEntryArr = this.b;
        nameSpaceSymbEntryArr[a2] = nameSpaceSymbEntry;
        if (str2 == null || !str2.equals(str)) {
            int i = this.a - 1;
            this.a = i;
            if (i == 0) {
                int length = nameSpaceSymbEntryArr.length;
                this.a = length;
                a(length << 2);
            }
        }
    }

    public Object clone() {
        try {
            SymbMap symbMap = (SymbMap) super.clone();
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr = new NameSpaceSymbEntry[this.b.length];
            symbMap.b = nameSpaceSymbEntryArr;
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr2 = this.b;
            System.arraycopy(nameSpaceSymbEntryArr2, 0, nameSpaceSymbEntryArr, 0, nameSpaceSymbEntryArr2.length);
            String[] strArr = new String[this.c.length];
            symbMap.c = strArr;
            String[] strArr2 = this.c;
            System.arraycopy(strArr2, 0, strArr, 0, strArr2.length);
            return symbMap;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List a() {
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        while (true) {
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr = this.b;
            if (i >= nameSpaceSymbEntryArr.length) {
                return A0I;
            }
            if (nameSpaceSymbEntryArr[i] != null && !"".equals(nameSpaceSymbEntryArr[i].c)) {
                A0I.add(nameSpaceSymbEntryArr[i]);
            }
            i++;
        }
    }
}

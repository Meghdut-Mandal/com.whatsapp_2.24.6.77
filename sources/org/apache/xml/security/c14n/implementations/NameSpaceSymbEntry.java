package org.apache.xml.security.c14n.implementations;

import org.w3c.dom.Attr;

public class NameSpaceSymbEntry implements Cloneable {
    public int a = 0;
    public String b;
    public String c;
    public String d = null;
    public boolean e;
    public Attr f;

    public NameSpaceSymbEntry(String str, Attr attr, boolean z, String str2) {
        this.c = str;
        this.e = z;
        this.f = attr;
        this.b = str2;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}

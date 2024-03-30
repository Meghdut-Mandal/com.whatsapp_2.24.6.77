package org.apache.xml.security.utils;

import X.C36441kJ;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class HelperNodeList implements NodeList {
    public ArrayList a;
    public boolean b;

    public HelperNodeList() {
        this(false);
    }

    public int getLength() {
        return this.a.size();
    }

    public Node item(int i) {
        return (Node) this.a.get(i);
    }

    public HelperNodeList(boolean z) {
        this.a = C36441kJ.A14(20);
        this.b = z;
    }
}

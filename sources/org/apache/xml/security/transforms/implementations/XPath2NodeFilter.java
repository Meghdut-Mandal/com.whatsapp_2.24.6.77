package org.apache.xml.security.transforms.implementations;

import java.util.Iterator;
import java.util.Set;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;

public class XPath2NodeFilter implements NodeFilter {
    public boolean a;
    public boolean b;
    public boolean c;
    public Set d;
    public Set e;
    public Set f;
    public int g = -1;
    public int h = -1;
    public int i = -1;

    public XPath2NodeFilter(Set set, Set set2, Set set3) {
        this.d = set;
        this.a = !set.isEmpty();
        this.e = set2;
        this.b = !set2.isEmpty();
        this.f = set3;
        this.c = !set3.isEmpty();
    }

    public static boolean a(Node node, Set set) {
        if (!set.contains(node)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (XMLUtils.a((Node) it.next(), node)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean b(Node node, Set set) {
        return set.contains(node);
    }

    public int a(Node node) {
        int i2;
        if (!this.b || !a(node, this.e)) {
            if (this.c && !a(node, this.f)) {
                i2 = 0;
            }
        }
        i2 = -1;
        return this.a ? a(node, this.d) ? 1 : 0 : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 == -1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(org.w3c.dom.Node r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.b
            r5 = 1
            r4 = -1
            if (r0 == 0) goto L_0x001a
            int r0 = r6.g
            if (r0 == r4) goto L_0x000c
            if (r8 > r0) goto L_0x0017
        L_0x000c:
            java.util.Set r0 = r6.e
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0054
            r6.g = r8
            r0 = r8
        L_0x0017:
            r3 = -1
            if (r0 != r4) goto L_0x001b
        L_0x001a:
            r3 = 1
        L_0x001b:
            r2 = 0
            if (r3 == r4) goto L_0x0033
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0033
            int r0 = r6.h
            if (r0 == r4) goto L_0x0028
            if (r8 > r0) goto L_0x0033
        L_0x0028:
            java.util.Set r0 = r6.f
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x0051
            r6.h = r4
            r3 = 0
        L_0x0033:
            int r1 = r6.i
            if (r8 > r1) goto L_0x003a
            r6.i = r4
            r1 = -1
        L_0x003a:
            if (r3 == r5) goto L_0x0050
            boolean r0 = r6.a
            if (r0 == 0) goto L_0x0058
            if (r1 != r4) goto L_0x004c
            java.util.Set r0 = r6.d
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x004c
            r6.i = r8
        L_0x004c:
            int r0 = r6.i
            if (r0 == r4) goto L_0x0057
        L_0x0050:
            return r5
        L_0x0051:
            r6.h = r8
            goto L_0x0033
        L_0x0054:
            r6.g = r4
            goto L_0x001a
        L_0x0057:
            return r2
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.transforms.implementations.XPath2NodeFilter.a(org.w3c.dom.Node, int):int");
    }
}

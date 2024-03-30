package X;

import java.security.cert.PolicyNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AXN implements PolicyNode {
    public PolicyNode A00;
    public List A01;
    public boolean A02;
    public int A03;
    public String A04;
    public Set A05;
    public Set A06;

    public AXN(String str, PolicyNode policyNode, List list, Set set, Set set2, int i, boolean z) {
        this.A01 = list;
        this.A03 = i;
        this.A05 = set;
        this.A00 = policyNode;
        this.A06 = set2;
        this.A04 = str;
        this.A02 = z;
    }

    public Object clone() {
        return A01();
    }

    public Iterator getChildren() {
        return this.A01.iterator();
    }

    public int getDepth() {
        return this.A03;
    }

    public Set getExpectedPolicies() {
        return this.A05;
    }

    public PolicyNode getParent() {
        return this.A00;
    }

    public Set getPolicyQualifiers() {
        return this.A06;
    }

    public String getValidPolicy() {
        return this.A04;
    }

    public boolean isCritical() {
        return this.A02;
    }

    public String toString() {
        return A00("");
    }

    public String A00(String str) {
        StringBuffer A0p = C165597tg.A0p(str);
        A0p.append(this.A04);
        A0p.append(" {\n");
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                A0p.append(((AXN) list.get(i)).A00(AnonymousClass000.A0q("    ", AnonymousClass000.A0v(str))));
                i++;
            } else {
                A0p.append(str);
                return C165597tg.A0n("}\n", A0p);
            }
        }
    }

    public AXN A01() {
        HashSet A16 = C36441kJ.A16();
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            A16.add(new String(AnonymousClass001.A0C(it)));
        }
        HashSet A162 = C36441kJ.A16();
        Iterator it2 = this.A06.iterator();
        while (it2.hasNext()) {
            A162.add(new String(AnonymousClass001.A0C(it2)));
        }
        AXN axn = new AXN(new String(this.A04), (PolicyNode) null, AnonymousClass001.A0I(), A16, A162, this.A03, this.A02);
        for (AXN A012 : this.A01) {
            AXN A013 = A012.A01();
            A013.A00 = axn;
            axn.A01.add(A013);
            A013.A00 = axn;
        }
        return axn;
    }
}

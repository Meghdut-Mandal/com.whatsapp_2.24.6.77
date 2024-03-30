package X;

import java.util.List;

/* renamed from: X.5Dw  reason: invalid class name and case insensitive filesystem */
public class C105235Dw extends AnonymousClass5EQ {
    public final C160627lJ A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C105235Dw) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C105235Dw(C160627lJ r1, List list, int i) {
        super(i);
        this.A01 = list;
        this.A00 = r1;
    }
}

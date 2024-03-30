package X;

import java.util.List;

/* renamed from: X.15b  reason: invalid class name and case insensitive filesystem */
public final class C226015b {
    public long A00;
    public C226115c A01 = C226115c.ALL;
    public String A02;
    public List A03;
    public List A04;

    public final void A00(String str) {
        List list = this.A04;
        if (list != null) {
            list.clear();
            list.add(str);
        } else {
            list = AnonymousClass03T.A03(str);
        }
        this.A04 = list;
    }

    public final boolean A01() {
        List list = this.A04;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = this.A03;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }
}

package X;

import java.util.List;

/* renamed from: X.4lo  reason: invalid class name and case insensitive filesystem */
public class C95554lo extends C06730Uv {
    public final /* synthetic */ C95984mb A00;
    public final /* synthetic */ List A01;

    public C95554lo(C95984mb r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public int A00() {
        return this.A00.A03.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C118815om r3 = (C118815om) this.A01.get(i);
        C118815om r2 = (C118815om) this.A00.A03.get(i2);
        AnonymousClass00C.A0D(r2, 0);
        if (!C014106d.A01(r3.A01, r2.A01) || r3.A00.A00 != r2.A00.A00) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1Q((((long) ((C118815om) this.A01.get(i)).A01.A03) > ((long) ((C118815om) this.A00.A03.get(i2)).A01.A03) ? 1 : (((long) ((C118815om) this.A01.get(i)).A01.A03) == ((long) ((C118815om) this.A00.A03.get(i2)).A01.A03) ? 0 : -1)));
    }
}

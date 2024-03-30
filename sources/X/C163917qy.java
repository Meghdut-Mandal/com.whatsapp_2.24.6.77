package X;

/* renamed from: X.7qy  reason: invalid class name and case insensitive filesystem */
public class C163917qy implements AnonymousClass026 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163917qy(C1271967i r1, C140456lc r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final void accept(Object obj) {
        C140456lc r3;
        C1271967i r2;
        int i;
        switch (this.A02) {
            case 0:
                r3 = (C140456lc) this.A00;
                r2 = (C1271967i) this.A01;
                i = 40;
                break;
            case 1:
                C140456lc r5 = (C140456lc) this.A00;
                C1271967i r4 = (C1271967i) this.A01;
                String str = (String) obj;
                C160377ku A0X = r5.A0X(46);
                if (A0X != null && str.length() == r5.A0T(36, 0)) {
                    C1273868b A002 = C1273868b.A00();
                    A002.A0A(str, 0);
                    C1273868b.A06(r4, r5, A002, A0X);
                    return;
                }
                return;
            default:
                r3 = (C140456lc) this.A00;
                r2 = (C1271967i) this.A01;
                r3.A05.put(40, obj);
                i = 46;
                break;
        }
        C160377ku A0X2 = r3.A0X(i);
        if (A0X2 != null) {
            C1273868b.A06(r2, r3, C1273868b.A03(obj), A0X2);
        }
    }
}

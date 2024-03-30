package X;

import android.content.Context;

/* renamed from: X.0su  reason: invalid class name and case insensitive filesystem */
public class C18280su implements C004101v {
    public Object A00;
    public final int A01;

    public C18280su(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((AnonymousClass01G) obj).A1d();
                return;
            case 1:
                AnonymousClass01L r0 = (AnonymousClass01L) obj;
                C002300y A23 = r0.A23();
                A23.A0H();
                A23.A0N(r0.A07.A01.A00(AnonymousClass01L.A02));
                return;
            default:
                ((AnonymousClass01I) obj).A1v();
                return;
        }
    }
}

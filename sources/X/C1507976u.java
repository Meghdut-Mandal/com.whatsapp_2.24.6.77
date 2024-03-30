package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.76u  reason: invalid class name and case insensitive filesystem */
public final class C1507976u implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C157827ek A03;
    public final /* synthetic */ C130326Kq A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ Object A06;

    public C1507976u(Context context, C157827ek r2, C130326Kq r3, Object obj, Object obj2, int i, long j) {
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = context;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5oS r1;
        C130326Kq r5 = this.A04;
        if (r5 != null) {
            C157827ek r4 = this.A03;
            if (AnonymousClass6T6.A01(r4, r5, this.A01)) {
                return new C130326Kq(r5.A00, r4, r5.A02, this.A06);
            }
        }
        Object obj = this.A05;
        Context context = this.A02;
        int i = this.A00;
        if (r5 == null || (r1 = r5.A00) == null) {
            r1 = null;
        }
        C123035vp r52 = new C123035vp(context, new C129986Jg(r1), obj, i);
        C157827ek r7 = this.A03;
        Object obj2 = this.A06;
        long j = this.A01;
        AnonymousClass6RN.A00("RC Layout");
        C161007lx B2C = r7.B2C(r52, C131696Qd.A01(j), C131696Qd.A00(j));
        AnonymousClass68E.A00();
        AnonymousClass6RN.A00("RC Reduce");
        C130326Kq A002 = AnonymousClass6T6.A00(r52, B2C, r7, obj2, j);
        AnonymousClass68E.A00();
        r52.A00 = null;
        return A002;
    }
}

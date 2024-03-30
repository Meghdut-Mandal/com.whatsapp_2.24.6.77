package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6mE  reason: invalid class name and case insensitive filesystem */
public final class C140826mE implements C161997nq {
    public static final C140826mE A00 = new C140826mE();

    public /* synthetic */ boolean BLj(C161997nq r2) {
        AnonymousClass00C.A0D(r2, 1);
        return AnonymousClass6GY.A01(this, r2);
    }

    public C120925sJ BO1(C114855hw r9, long j) {
        C140346lR r2 = C112635eD.A00;
        Context context = r9.A00.A02;
        AnonymousClass00C.A0D(context, 0);
        View view = (View) r2.A00.B0w(context);
        view.measure(C131696Qd.A01(j), C131696Qd.A00(j));
        int max = Math.max(AnonymousClass5YU.A00((int) (j >>> 32)).A04(j), view.getMeasuredWidth());
        long max2 = (((long) Math.max(AnonymousClass5YU.A00((int) j).A03(j), view.getMeasuredHeight())) & 4294967295L) | (((long) max) << 32);
        return new C120925sJ((Object) null, (int) ((max2 >> 32) & 4294967295L), (int) (max2 & 4294967295L));
    }
}

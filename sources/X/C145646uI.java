package X;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.6uI  reason: invalid class name and case insensitive filesystem */
public final class C145646uI implements AnonymousClass4O5 {
    public final Context A00;
    public final C18820ts A01;
    public final C1512778x A02;
    public final C1512778x A03;
    public final C1512778x A04;
    public final Calendar A05;

    public C145646uI(Context context, C18820ts r8) {
        int A042 = C36361kB.A04(context, r8, 1);
        this.A00 = context;
        this.A01 = r8;
        Calendar instance = Calendar.getInstance();
        AnonymousClass00C.A08(instance);
        C1512778x r5 = new C1512778x(context, r8, instance, 1);
        this.A03 = r5;
        Calendar instance2 = Calendar.getInstance();
        AnonymousClass00C.A08(instance2);
        C1512778x r4 = new C1512778x(context, r8, instance2, A042);
        this.A04 = r4;
        Calendar instance3 = Calendar.getInstance();
        AnonymousClass00C.A08(instance3);
        C1512778x r3 = new C1512778x(context, r8, instance3, 3);
        this.A02 = r3;
        Calendar instance4 = Calendar.getInstance();
        AnonymousClass00C.A08(instance4);
        this.A05 = instance4;
        r5.add(6, -2);
        r4.add(6, -7);
        r3.add(6, -28);
        instance4.add(6, -366);
    }

    public final C1512778x A00(long j) {
        int i;
        GregorianCalendar gregorianCalendar;
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        C1512778x r2 = this.A03;
        if (instance.after(r2)) {
            return r2;
        }
        C1512778x r22 = this.A04;
        if (instance.after(r22)) {
            return r22;
        }
        C1512778x r23 = this.A02;
        if (instance.after(r23)) {
            return r23;
        }
        boolean after = instance.after(this.A05);
        Context context = this.A00;
        C18820ts r4 = this.A01;
        if (after) {
            i = 4;
            gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), 1);
        } else {
            i = 5;
            gregorianCalendar = new GregorianCalendar(instance.get(1), 1, 1);
        }
        return new C1512778x(context, r4, gregorianCalendar, i);
    }
}

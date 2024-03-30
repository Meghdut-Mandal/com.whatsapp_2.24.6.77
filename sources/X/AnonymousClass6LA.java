package X;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import java.util.List;

/* renamed from: X.6LA  reason: invalid class name */
public class AnonymousClass6LA {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final List A03;
    public final AnonymousClass005 A04;

    public static void A00(Context context, Intent intent, AnonymousClass6LA r5) {
        if (((AnonymousClass62F) r5.A00.get()).A00()) {
            ((C24801Dv) r5.A04.get()).A09(C24801Dv.A00(context), intent, 475);
            return;
        }
        r5.A01.get();
        C18740tg.A06(C24801Dv.A01(context, AnonymousClass01I.class));
    }

    public AnonymousClass6LA(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        this.A01 = r2;
        this.A04 = r4;
        this.A00 = r5;
        this.A02 = r6;
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A03 = ((C122875vZ) r3.get()).A02;
    }
}

package X;

import android.content.Intent;
import java.util.GregorianCalendar;

/* renamed from: X.9Qv  reason: invalid class name and case insensitive filesystem */
public final class C194709Qv {
    public final AnonymousClass9RT A00;
    public final C195389Uc A01;

    public final void A00(Intent intent, C225314u r11, C23034B1f b1f) {
        AnonymousClass00C.A0D(intent, 1);
        long longExtra = intent.getLongExtra("dob_timestamp_ms", 0);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(longExtra);
        this.A01.A00(new C21264AEu(r11, b1f, this), "kyc-recollect", (String) null, gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
    }

    public C194709Qv(C195389Uc r1, AnonymousClass9RT r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}

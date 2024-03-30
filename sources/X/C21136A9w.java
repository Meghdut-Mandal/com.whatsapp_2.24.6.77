package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.A9w  reason: case insensitive filesystem */
public class C21136A9w implements C87734Py {
    public C19460v5 A00;
    public C63553Km A01;
    public AnonymousClass1KK A02;
    public C199439fJ A03;
    public A8P A04;
    public AnonymousClass1EV A05;
    public AnonymousClass39O A06;
    public AnonymousClass9UH A07;
    public AnonymousClass1FR A08;

    public void BlQ(Context context, AnonymousClass3T1 r14, C207219uk r15, int i) {
        Intent A0U;
        C207199ui r5 = r15.A01;
        if (r5 != null) {
            Context context2 = context;
            AnonymousClass3T1 r10 = r14;
            int i2 = i;
            if (!C207219uk.A01(r15)) {
                C64933Qa r3 = r14.A1J;
                if (r3.A02 && this.A08.A08.A0A()) {
                    AnonymousClass1FR r2 = this.A08;
                    if (r2.A08.A05(C36441kJ.A0n(r2.A00)) == 1) {
                        AnonymousClass1FR r0 = this.A08;
                        if (r0.A08.A05(r3.A00) == 1) {
                            if (i2 == 10) {
                                C19460v5 r1 = this.A00;
                                if (r1.A05()) {
                                    r1.A02();
                                    throw AnonymousClass001.A0A("launchUpdateStatus");
                                }
                            }
                            this.A06.A01.A0E(1107);
                            if (this.A06.A01.A0E(1107)) {
                                this.A06.A00.A02();
                                throw AnonymousClass001.A0A("getOrderDetailsActivity");
                            }
                        }
                    }
                }
                this.A06.A01.A0E(1107);
            } else if (i != 0) {
                if (i2 == 1) {
                    A0U = this.A07.A00(context2, r5, r14.A1J, r5.A0E, r5.A06, (String) null);
                    if (A0U == null) {
                        return;
                    }
                } else if (i2 == 3) {
                    A0U = AnonymousClass190.A0U(context, (Parcelable) null, "com.bloks.www.payments.whatsapp.f2care", (String) null);
                } else {
                    return;
                }
                context.startActivity(A0U);
                return;
            }
            this.A02.A0C(new C21099A8k(context, this, r5, r10, i2), r14.A0L());
        }
    }
}

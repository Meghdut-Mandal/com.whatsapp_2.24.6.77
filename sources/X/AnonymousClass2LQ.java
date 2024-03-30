package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2LQ  reason: invalid class name */
public final class AnonymousClass2LQ extends AnonymousClass1MX {
    public final C236519h A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final AnonymousClass1YX A03;
    public final C19970wo A04;
    public final AnonymousClass1YV A05;
    public final AnonymousClass1ML A06;
    public final AnonymousClass1YW A07;

    public void A01(Context context, Intent intent) {
        AnonymousClass1ML r2 = this.A06;
        if (r2.A00 != 1) {
            this.A05.A03();
            this.A07.A01();
            this.A03.A00.clear();
        }
        C36321k7.A1K(r2, "app/presenceavailable/timeout/foreground ", AnonymousClass000.A0u());
    }

    public AnonymousClass2LQ(AnonymousClass1YX r1, C236519h r2, C21060yb r3, C19970wo r4, C19630wG r5, AnonymousClass1YV r6, AnonymousClass1ML r7, AnonymousClass1YW r8) {
        this.A04 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = r1;
    }
}

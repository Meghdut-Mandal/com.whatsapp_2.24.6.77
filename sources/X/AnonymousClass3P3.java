package X;

import com.whatsapp.R;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.3P3  reason: invalid class name */
public class AnonymousClass3P3 {
    public final C20690y0 A00;
    public final C20310xM A01;
    public final AnonymousClass16J A02;
    public final Map A03 = AnonymousClass001.A0J();
    public final C19700wN A04;
    public final AnonymousClass17Y A05;
    public final C19970wo A06;
    public final C19770wU A07;

    public static void A00(AnonymousClass3P3 r2, AnonymousClass2bU r3, Throwable th) {
        r2.A03.remove(r3);
        AnonymousClass2bU.A00(r3).A0f = false;
        r2.A02.A05(r3, -1);
        if (th instanceof FileNotFoundException) {
            AnonymousClass17Y r22 = r2.A05;
            boolean A042 = C64933Qa.A04(r3);
            int i = R.string.f12nameremoved;
            if (A042) {
                i = R.string.f12nameremoved;
            }
            r22.A04(i, 1);
        }
    }

    public void A01(AnonymousClass2bU r12) {
        int i = r12.A1I;
        long A08 = this.A06.A08(r12.A0I);
        String str = r12.A04;
        if (str == null) {
            C80293vA.A00(this.A07, this, r12, 42);
            return;
        }
        C19700wN r5 = this.A04;
        C19770wU r6 = this.A07;
        int i2 = r12.A09;
        ArrayList A14 = C36441kJ.A14(3);
        C20690y0 r1 = this.A00;
        A14.add(r1.A0I(i, i2, 2));
        A14.add(r1.A0I(i, i2, 1));
        A14.add(r1.A0I(i, i2, 3));
        C101304xK r4 = new C101304xK(r5, r6, str, A14, A08);
        this.A03.put(r12, r4);
        C65013Qj A002 = AnonymousClass2bU.A00(r12);
        A002.A0f = true;
        A002.A0E = 0;
        this.A02.A05(r12, -1);
        AnonymousClass3YU r13 = new AnonymousClass3YU(r12, this, 4);
        Executor executor = this.A05.A04;
        r4.A0B(r13, executor);
        r4.A00.A03(new AnonymousClass3YU(r12, this, 5), executor);
        r6.Boy(r4);
    }

    public AnonymousClass3P3(C19700wN r2, C20690y0 r3, AnonymousClass17Y r4, C19970wo r5, C20310xM r6, AnonymousClass16J r7, C19770wU r8) {
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r2;
        this.A07 = r8;
        this.A00 = r3;
        this.A01 = r6;
        this.A02 = r7;
    }
}

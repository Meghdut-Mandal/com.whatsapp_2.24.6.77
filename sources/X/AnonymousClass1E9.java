package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* renamed from: X.1E9  reason: invalid class name */
public class AnonymousClass1E9 {
    public Runnable A00;
    public final C19730wQ A01;
    public final C19600wD A02;
    public final C20810yC A03;
    public final AnonymousClass19A A04;
    public final AnonymousClass1EA A05;
    public final AnonymousClass1EB A06;
    public final C24451Cm A07;
    public final C24451Cm A08;
    public final C19770wU A09;
    public final Runnable A0A = new C35751jC(this, 0);
    public final List A0B = Collections.singletonList("20210210");
    public final AnonymousClass17Y A0C;
    public final C19970wo A0D;

    public static void A00(AnonymousClass1E9 r5, List list, long j) {
        C35661j3 r2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (r5.A06.A00(str) == 1) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            r2 = null;
        } else {
            r2 = new C35661j3(arrayList, list, r5, 18);
        }
        r5.A00 = r2;
        if (r2 == null) {
            r5.A08.A01();
        } else {
            r5.A09.BpM(r2, "ToSGatingRepository/postTosAcceptanceState", j);
        }
    }

    public void A01() {
        C19770wU r1 = this.A09;
        r1.Bnx(this.A0A);
        Runnable runnable = this.A00;
        if (runnable != null) {
            r1.Bnx(runnable);
        }
        this.A07.A01();
        this.A08.A01();
        ((SharedPreferences) this.A06.A01.getValue()).edit().clear().apply();
    }

    public void A02(C64893Pv r6) {
        this.A07.A01();
        AnonymousClass1EB r4 = this.A06;
        ((SharedPreferences) r4.A01.getValue()).edit().putLong("request_refresh_rate_seconds", r6.A00).apply();
        for (C63003Ij r0 : r6.A01) {
            String str = r0.A01;
            r4.A01(str, r0.A00);
            r4.A02(str, System.currentTimeMillis());
        }
        AnonymousClass17Y r3 = this.A0C;
        AnonymousClass1EA r2 = this.A05;
        Objects.requireNonNull(r2);
        r3.A0H(new C35731jA((Object) r2, 49));
    }

    public AnonymousClass1E9(AnonymousClass17Y r7, C19730wQ r8, C19600wD r9, C19970wo r10, C20810yC r11, AnonymousClass19A r12, AnonymousClass1EA r13, AnonymousClass1EB r14, C19770wU r15) {
        this.A0D = r10;
        this.A03 = r11;
        this.A0C = r7;
        this.A01 = r8;
        this.A09 = r15;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r14;
        this.A02 = r9;
        this.A07 = new C24451Cm(new Random(), 5, 16000);
        this.A08 = new C24451Cm(new Random(), 5, 16000);
    }
}

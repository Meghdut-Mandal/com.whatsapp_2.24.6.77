package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6Kd  reason: invalid class name and case insensitive filesystem */
public final class C130206Kd {
    public final C20810yC A00;
    public final C19770wU A01;
    public final C006302t A02;
    public final C124735yi A03;

    public static final int A00(C130206Kd r11) {
        C124735yi r0 = r11.A03;
        return Voip.startCall(r0.A02, r0.A0A, r0.A05, r0.A01, r0.A09, r0.A04, r0.A06, r0.A03, r0.A00, r0.A08, r0.A07);
    }

    public C130206Kd(C124735yi r1, C20810yC r2, C19770wU r3, C006302t r4) {
        C36321k7.A0x(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r1;
        this.A02 = r4;
    }
}

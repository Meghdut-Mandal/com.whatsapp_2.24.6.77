package X;

import java.io.File;

/* renamed from: X.1Yn  reason: invalid class name and case insensitive filesystem */
public final class C29921Yn {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16J A01;
    public final C20690y0 A02;
    public final C20050ww A03;
    public final C19970wo A04;
    public final C20060wx A05;
    public final C20810yC A06;
    public final AnonymousClass1BV A07;
    public final AnonymousClass1BS A08;
    public final C19770wU A09;

    public C29921Yn(C20690y0 r2, AnonymousClass17Y r3, C20050ww r4, C19970wo r5, C20060wx r6, AnonymousClass16J r7, C20810yC r8, AnonymousClass1BV r9, AnonymousClass1BS r10, C19770wU r11) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r11, 4);
        AnonymousClass00C.A0D(r2, 5);
        AnonymousClass00C.A0D(r4, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r7, 9);
        this.A04 = r5;
        this.A06 = r8;
        this.A00 = r3;
        this.A09 = r11;
        this.A02 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r10;
        this.A01 = r7;
        this.A07 = r9;
    }

    public final void A01(AnonymousClass3KQ r6, AnonymousClass3T1 r7) {
        AnonymousClass00C.A0D(r6, 1);
        String str = r6.A06;
        String str2 = r6.A03;
        C20810yC r2 = this.A06;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 6459) && str != null) {
            A00(r7, this.A02.A0P(str), str);
        }
        if (C20800yB.A01(r1, r2, 6458) && str2 != null) {
            A00(r7, this.A02.A0O(str2), str2);
        }
    }

    private final void A00(AnonymousClass3T1 r13, File file, String str) {
        C19970wo r3 = this.A04;
        C20810yC r5 = this.A06;
        C104895Bw r1 = new C104895Bw(this.A03, r3, this.A05, r5, this.A07, C25471Gl.A0K, this.A08, file, str, "image/jpeg");
        r1.B0M(new C75583nT(this, r13));
        this.A09.Boy(r1);
    }
}

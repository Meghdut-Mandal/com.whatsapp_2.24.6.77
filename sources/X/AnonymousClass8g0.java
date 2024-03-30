package X;

import android.content.Context;

/* renamed from: X.8g0  reason: invalid class name */
public abstract class AnonymousClass8g0 extends AIB {
    public final C22974AzQ A00;

    public void A08(C202059ky r7) {
        C200049gU r3;
        C194449Pt r0;
        C196039Xk r2;
        long j;
        C200959iX r4;
        C24611Dc r1;
        String str;
        C200959iX r32;
        if (this instanceof B7Q) {
            B7Q b7q = (B7Q) this;
            if (b7q.A03 != 0) {
                r32 = (C200959iX) b7q.A00;
                if (r7 == null) {
                    r32.A08.A07("deleteFingerprint success");
                    r32.A09.A03();
                    return;
                }
                r32.A08.A07(AnonymousClass000.A0l(r7, "deleteFingerprint error: ", AnonymousClass000.A0u()));
                int i = r7.A00;
                if (i == 1441) {
                    r32.A09.A04(b7q.A02);
                    r2 = r32.A0A;
                    j = r7.A02;
                    r2.A02(j);
                }
                if (!(i == 1440 || i == 445)) {
                    if (i == 1448) {
                        r32.A09.A04(b7q.A02);
                        r3 = r32.A07;
                    } else {
                        return;
                    }
                }
                r32.A09.A04(b7q.A02);
                return;
            } else if (r7 == null) {
                r32 = (C200959iX) b7q.A00;
                r32.A08.A07("setFingerprintFromPin success");
                r32.A09.A04(b7q.A02);
                return;
            } else {
                r4 = (C200959iX) b7q.A00;
                r4.A08.A07(AnonymousClass000.A0l(r7, "setFingerprintFromPin error: ", AnonymousClass000.A0u()));
                r4.A09.A03();
                int i2 = r7.A00;
                if (i2 != 1441) {
                    if (i2 == 1448) {
                        r3 = r4.A07;
                    } else {
                        return;
                    }
                }
            }
            r0 = (C194449Pt) b7q.A01;
            r3.A02(r7, r0.A00.A05, "PIN");
            return;
        }
        if (this instanceof AnonymousClass8h8) {
            AnonymousClass8h8 r5 = (AnonymousClass8h8) this;
            if (r7 == null) {
                r1 = r5.A01.A08;
                str = "verifyPinToken success";
            } else {
                r4 = r5.A01;
                r4.A08.A07(AnonymousClass000.A0l(r7, "verifyPinToken error: ", AnonymousClass000.A0u()));
                int i3 = r7.A00;
                if (i3 != 1441) {
                    if (i3 == 1448) {
                        r3 = r4.A07;
                        r0 = r5.A00;
                        r3.A02(r7, r0.A00.A05, "PIN");
                        return;
                    }
                    return;
                }
            }
        } else {
            if (this instanceof AnonymousClass8h7) {
                AnonymousClass8h7 r22 = (AnonymousClass8h7) this;
                if (r7 == null) {
                    r2 = r22.A01.A0A;
                    r2.A01();
                    j = 0;
                    r2.A02(j);
                } else if (r7.A00 == 1448) {
                    r3 = r22.A01.A07;
                    r0 = r22.A00;
                } else {
                    return;
                }
            } else {
                AnonymousClass8h6 r52 = (AnonymousClass8h6) this;
                if (r7 == null) {
                    r1 = r52.A01.A08;
                    str = "changePin success";
                } else {
                    r4 = r52.A01;
                    r4.A08.A07(AnonymousClass000.A0l(r7, "changePin error: ", AnonymousClass000.A0u()));
                    int i4 = r7.A00;
                    if (i4 != 1441) {
                        if (i4 == 1448) {
                            r3 = r4.A07;
                            r0 = r52.A00;
                        } else {
                            return;
                        }
                    }
                }
            }
            r3.A02(r7, r0.A00.A05, "PIN");
            return;
        }
        r1.A07(str);
        return;
        r2 = r4.A0A;
        j = r7.A02;
        r2.A02(j);
    }

    public AnonymousClass8g0(Context context, AnonymousClass17Y r2, C29221Vu r3, C22974AzQ azQ) {
        super(context, r3, r2);
        this.A00 = azQ;
    }

    public void A05(C202059ky r2) {
        A08(r2);
        this.A00.Bf8(r2);
    }

    public void A06(C202059ky r2) {
        A08(r2);
        this.A00.Bf8(r2);
    }

    public void A07(C203399nx r3) {
        C202059ky r1;
        C203399nx A03 = C203399nx.A03(r3);
        if (A03 != null) {
            r1 = C202059ky.A01(A03);
        } else {
            r1 = null;
        }
        A08(r1);
        this.A00.Bf8(r1);
    }
}

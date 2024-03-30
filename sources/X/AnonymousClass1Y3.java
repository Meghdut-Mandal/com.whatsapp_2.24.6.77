package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Y3  reason: invalid class name */
public class AnonymousClass1Y3 {
    public final C19460v5 A00;
    public final AnonymousClass17Y A01;
    public final C26021Io A02;
    public final C19970wo A03;
    public final C19420v0 A04;
    public final C220712t A05;
    public final C220412q A06;
    public final C24381Cf A07;
    public final C24541Cv A08;
    public final AnonymousClass1LU A09;
    public final C20500xf A0A;
    public final C21010yW A0B;
    public final C28361Si A0C;
    public final AnonymousClass1A1 A0D;
    public final C19770wU A0E;

    public void A00(AnonymousClass11F r7) {
        A02(r7, 1, true, true, false);
    }

    public void A01(AnonymousClass11F r7, int i, boolean z, boolean z2) {
        A02(r7, i, z, z2, false);
    }

    public void A02(AnonymousClass11F r14, int i, boolean z, boolean z2, boolean z3) {
        C220712t r4 = this.A05;
        AnonymousClass11F r5 = r14;
        if (r4.A0A(r14)) {
            int i2 = this.A06.A0A(r14).A00;
            if (i2 > 0) {
                C20500xf r0 = this.A0A;
                C21010yW r10 = this.A0B;
                C24541Cv r8 = this.A08;
                C19770wU r1 = this.A0E;
                if (AnonymousClass3M3.A01(r0, r14)) {
                    r1.Boy(new C80513vW(r8, r14, r10, i2, 0));
                }
            }
            if (z2) {
                this.A0C.A0B(r14);
            }
            this.A0C.A0D(r14, (AnonymousClass3T1) null);
            C220712t.A00(r4, r5, (AnonymousClass3T1) null, 0, 0, i, z, z3);
            C19420v0 r12 = this.A04;
            C19420v0.A00(r12).putLong("last_read_conversation_time", C19970wo.A00(this.A03)).apply();
            this.A01.A0I(new C35321iV(this.A07, r14, this.A02, 35), 300);
        }
    }

    public void A03(AnonymousClass11F r10, boolean z) {
        StringBuilder sb;
        C220712t r4 = this.A05;
        AnonymousClass005 r3 = r4.A01;
        AnonymousClass11F r5 = r10;
        ((C24731Do) r3.get()).A02.A00(r10, 8);
        C65073Qp A092 = r4.A00.A09(r10, false);
        if (A092 == null) {
            sb.append("msgstore/setchatunseen/nochat/");
            sb.append(r10);
            Log.i(sb.toString());
        } else {
            sb = new StringBuilder();
            sb.append("msgstore/setchatunseen/");
            sb.append(r10);
            sb.append("/");
            sb.append(A092.A09());
            Log.i(sb.toString());
            A092.A0H(-1, 0, 0, 0);
            ((C24731Do) r3.get()).A09.A01(new C35351iY(r4, r5, A092, 4, z), 1);
        }
        this.A07.A02(r10);
    }

    public AnonymousClass1Y3(C19460v5 r1, AnonymousClass17Y r2, C26021Io r3, C19970wo r4, C19420v0 r5, C220712t r6, C220412q r7, C24381Cf r8, C24541Cv r9, AnonymousClass1LU r10, C20500xf r11, C21010yW r12, C28361Si r13, AnonymousClass1A1 r14, C19770wU r15) {
        this.A03 = r4;
        this.A01 = r2;
        this.A0E = r15;
        this.A06 = r7;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
        this.A02 = r3;
        this.A0D = r14;
        this.A08 = r9;
        this.A0C = r13;
        this.A09 = r10;
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r1;
    }
}

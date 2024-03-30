package X;

import androidx.compose.material3.ButtonElevation$animateElevation$1$1;
import androidx.compose.material3.ButtonElevation$animateElevation$2;
import androidx.compose.material3.ButtonElevation$animateElevation$3;

/* renamed from: X.6O8  reason: invalid class name */
public final class AnonymousClass6O8 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass6O8)) {
                AnonymousClass6O8 r5 = (AnonymousClass6O8) obj;
                if (!AnonymousClass000.A1Q(Float.compare(this.A03, r5.A03)) || !AnonymousClass000.A1Q(Float.compare(this.A02, r5.A02)) || !AnonymousClass000.A1Q(Float.compare(this.A00, r5.A00)) || !AnonymousClass000.A1Q(Float.compare(this.A01, r5.A01)) || !AnonymousClass000.A1Q(Float.compare(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A03), this.A02), this.A00), this.A01), this.A04);
    }

    public AnonymousClass6O8(float f, float f2, float f3, float f4, float f5) {
        this.A03 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A04 = f5;
    }

    public static final C137126fd A00(C156897b8 r9, AnonymousClass6O8 r10, C161337ma r11, boolean z) {
        float f;
        r11.Bum(-1312510462);
        r11.Bum(-492369756);
        Object BnZ = r11.BnZ();
        Object obj = C129736Ig.A00;
        if (BnZ == obj) {
            BnZ = new AYG();
            ((C136916fF) r11).A0R(BnZ);
        }
        C136916fF r2 = (C136916fF) r11;
        C136916fF.A0M(r2, false);
        AYG ayg = (AYG) BnZ;
        boolean A1X = C90464aC.A1X(r11, r9, ayg, 511388516);
        Object BnZ2 = r11.BnZ();
        if (A1X || BnZ2 == obj) {
            BnZ2 = new ButtonElevation$animateElevation$1$1(r9, ayg, (C023509x) null);
            r2.A0R(BnZ2);
        }
        C136916fF.A0M(r2, false);
        C132846Vm.A03(r11, r9, (C009003v) BnZ2);
        C15680no r6 = (C15680no) C007103b.A0O(ayg);
        AnonymousClass6O8 r7 = r10;
        if (!z) {
            f = r10.A04;
        } else if (r6 instanceof C136706er) {
            f = r10.A02;
        } else if (r6 instanceof C136646el) {
            f = r10.A01;
        } else if (r6 instanceof C136636ek) {
            f = r10.A00;
        } else {
            f = r10.A03;
        }
        r11.Bum(-492369756);
        Object BnZ3 = r11.BnZ();
        if (BnZ3 == obj) {
            BnZ3 = new C132336Td(C114135gh.A01, new AnonymousClass72X(f), (Object) null);
            r2.A0R(BnZ3);
        }
        C136916fF.A0M(r2, false);
        C132336Td r5 = (C132336Td) BnZ3;
        if (!z) {
            r11.Bum(-719930083);
            C132846Vm.A03(r11, new AnonymousClass72X(f), new ButtonElevation$animateElevation$2(r5, (C023509x) null, f));
        } else {
            r11.Bum(-719929940);
            C132846Vm.A03(r11, new AnonymousClass72X(f), new ButtonElevation$animateElevation$3(r5, r6, r7, (C023509x) null, f));
        }
        C136916fF.A0M(r2, false);
        C137126fd r0 = r5.A02;
        C136916fF.A0M(r2, false);
        return r0;
    }
}

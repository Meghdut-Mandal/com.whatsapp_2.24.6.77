package X;

import android.util.Pair;
import java.security.Key;

/* renamed from: X.9oC  reason: invalid class name and case insensitive filesystem */
public class C203509oC implements B1H {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C203509oC(C22974AzQ azQ, C200959iX r2, C194449Pt r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = azQ;
    }

    public void BWg(C202059ky r2) {
        ((C22974AzQ) this.A01).Bf8(r2);
    }

    public void BiD(String str) {
        String str2 = str;
        if (this.A03 != 0) {
            C200959iX r11 = (C200959iX) this.A00;
            C194449Pt r12 = (C194449Pt) this.A02;
            String A012 = AnonymousClass6VG.A01(r11.A09, 2);
            C198799eD r1 = r11.A00;
            B7Q b7q = new B7Q(r11.A04.A00, r11.A02, r11.A05, (C22974AzQ) this.A01, r11, r12, A012, 1);
            byte[] A002 = C198799eD.A00(true, str2, "DELETEBIO", (String) null, (byte[]) null, new Object[0], C36371kC.A09(r1.A01));
            AnonymousClass1AL[] r3 = new AnonymousClass1AL[1];
            C36341k9.A1L("action", "delete-payment-bio", r3, 0);
            C194449Pt.A00(r12, r1, b7q, A002, r3);
            return;
        }
        C200959iX r10 = (C200959iX) this.A00;
        C194449Pt r112 = (C194449Pt) this.A02;
        C22974AzQ azQ = (C22974AzQ) this.A01;
        AnonymousClass6VG r2 = r10.A09;
        try {
            Pair A0Q = C36441kJ.A0Q(AnonymousClass6VG.A01(r2, 2), AnonymousClass5ZX.A00());
            Object obj = A0Q.second;
            if (obj != null) {
                r10.A08.A07("[Set Touch ID] success");
                C198799eD r0 = r10.A00;
                byte[] encoded = ((Key) obj).getEncoded();
                B7Q b7q2 = new B7Q(r10.A04.A00, r10.A02, r10.A05, azQ, r10, r112, (String) A0Q.first, 0);
                byte[] A003 = C198799eD.A00(true, str2, "SETBIO", (String) null, encoded, new Object[0], C36371kC.A09(r0.A01));
                AnonymousClass1AL[] r32 = new AnonymousClass1AL[1];
                C36341k9.A1L("action", "set-payment-bio", r32, 0);
                C194449Pt.A00(r112, r0, b7q2, A003, r32);
                return;
            }
            r10.A08.A07("[Set Touch ID] failure");
        } catch (RuntimeException e) {
            AnonymousClass6VG.A01(r2, 0);
            throw e;
        }
    }
}

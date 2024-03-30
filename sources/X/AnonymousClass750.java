package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* renamed from: X.750  reason: invalid class name */
public class AnonymousClass750 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public final int A08 = 0;

    public AnonymousClass750(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145536u3 r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        AnonymousClass00C.A0D(x509Certificate, 2);
        C36321k7.A10(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
        this.A07 = str;
    }

    public final void run() {
        int i;
        switch (this.A08) {
            case 0:
                String str = this.A07;
                C19770wU r6 = (C19770wU) this.A01;
                C20310xM r5 = (C20310xM) this.A02;
                C23043B1o b1o = (C23043B1o) this.A03;
                AnonymousClass17Y r3 = (AnonymousClass17Y) this.A04;
                AnonymousClass4T4 r2 = (AnonymousClass4T4) this.A05;
                AnonymousClass1XC r7 = (AnonymousClass1XC) this.A06;
                ArrayList A0R = ((C24881Ed) this.A00).A0R(Collections.singletonList(str));
                if (!A0R.isEmpty()) {
                    int i2 = ((C202319lY) C36441kJ.A12(A0R)).A02;
                    if (AnonymousClass000.A1Z(C202449lr.A01, i2)) {
                        r7.A02(new C147156wl(r5, r2, b1o, r6), str, false);
                        return;
                    } else if (AnonymousClass000.A1Z(C202449lr.A00, i2)) {
                        Objects.requireNonNull(r2);
                        i = 30;
                        r3.A0H(new C81113wU((Object) r2, i));
                        return;
                    }
                }
                r6.Boy(new C81193wc(b1o, r5, 24));
                Objects.requireNonNull(r2);
                i = 31;
                r3.A0H(new C81113wU((Object) r2, i));
                return;
            case 1:
                AnonymousClass6OQ r1 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey = (PublicKey) this.A04;
                Integer num = (Integer) this.A03;
                C160057kO r22 = (C160057kO) this.A00;
                C128936Ee r32 = (C128936Ee) this.A02;
                String str2 = this.A07;
                ((C145536u3) this.A05).BlX(r1, r22, r32, num, str2, publicKey, (X509Certificate) this.A01);
                return;
            default:
                AnonymousClass6OQ r12 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer num2 = (Integer) this.A03;
                C160057kO r23 = (C160057kO) this.A00;
                C128936Ee r33 = (C128936Ee) this.A02;
                String str3 = this.A07;
                ((AnonymousClass6u6) this.A05).BlX(r12, r23, r33, num2, str3, publicKey2, (X509Certificate) this.A01);
                return;
        }
    }

    public AnonymousClass750(AnonymousClass17Y r2, C20310xM r3, C24881Ed r4, AnonymousClass4T4 r5, AnonymousClass1XC r6, C23043B1o b1o, C19770wU r8, String str) {
        this.A00 = r4;
        this.A07 = str;
        this.A01 = r8;
        this.A02 = r3;
        this.A03 = b1o;
        this.A04 = r2;
        this.A05 = r5;
        this.A06 = r6;
    }

    public AnonymousClass750(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, AnonymousClass6u6 r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        AnonymousClass00C.A0D(x509Certificate, 2);
        C36321k7.A10(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
        this.A07 = str;
    }
}

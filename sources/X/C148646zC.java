package X;

import java.io.File;

/* renamed from: X.6zC  reason: invalid class name and case insensitive filesystem */
public class C148646zC implements C160767lY {
    public final /* synthetic */ C101334xN A00;

    public void BW8(int i) {
        if (i == 1) {
            this.A00.A0j.A07();
        } else if (i == 2) {
            AnonymousClass6Fk r7 = this.A00.A0j;
            long j = r7.A08;
            if (j != -1 && r7.A01() != -1) {
                r7.A0E = C90514aH.A0J(j);
                r7.A03 = 2;
            }
        } else if (i == 3) {
            this.A00.A0j.A09();
        }
    }

    public void BXt(AnonymousClass6Fc r1) {
    }

    public C148646zC(C101334xN r1) {
        this.A00 = r1;
    }

    public void BSW(AnonymousClass6Fc r5, long j) {
        long j2;
        C101334xN r3 = this.A00;
        r3.A0q.A05(1);
        synchronized (r5) {
            j2 = r5.A06;
        }
        r3.A0I(j2);
        r3.A0e.A0B(j2);
        r3.A0j.A0A(j2, j);
        C124935z2 r0 = r3.A01;
        if (r0 != null) {
            r0.A0A = j2;
        }
    }

    public void BcE(File file, boolean z) {
        C101334xN r3 = this.A00;
        C129166Fp A02 = r3.A0e.A02();
        synchronized (A02) {
            A02.A03 = false;
            A02.A04 = Boolean.valueOf(z);
            A02.A01 = new C133136Wx(23);
        }
        C101334xN.A07(r3, A02, file, AnonymousClass6YC.A08(r3.A0f.A0J), true);
        r3.A04 = A02.A03();
        r3.A0K.A04(new AnonymousClass6AL(A02, z));
    }

    public void Bev() {
        this.A00.A0H();
    }

    public void BW9(AnonymousClass6Fc r7) {
        if (r7.A00() == 4) {
            AnonymousClass6Fk r5 = this.A00.A0j;
            if (!r5.A0C()) {
                r5.A07();
            }
            if (r5.A02() == -1) {
                r5.A09();
            }
        }
    }
}

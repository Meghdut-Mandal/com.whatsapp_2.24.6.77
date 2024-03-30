package X;

import java.io.File;

/* renamed from: X.6Pj  reason: invalid class name and case insensitive filesystem */
public class C131516Pj {
    public final C159427jL A00;
    public final C124935z2 A01;
    public final C124995z9 A02;
    public final AnonymousClass3Ot A03;
    public final C125105zK A04;

    public C131516Pj(C146506vi r4, C124995z9 r5) {
        this(r4.A0L, r4.A0M, r5, r4.A0O.A03);
    }

    public int A00() {
        if (this instanceof AnonymousClass5BQ) {
            return 2;
        }
        if (this instanceof AnonymousClass5BR) {
            return 3;
        }
        if (this instanceof AnonymousClass5BP) {
            return 4;
        }
        return 0;
    }

    public File A01() {
        File file = this.A02.A07;
        C18740tg.A06(file);
        return file;
    }

    public boolean A02() {
        C124995z9 r1 = this.A02;
        if (AnonymousClass6Y1.A06(r1.A06)) {
            return r1.A0D;
        }
        return r1.A0C;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("[job_id=");
        A0i.append(this.A01.A0D);
        return C90474aD.A0g(A0i);
    }

    public C131516Pj(C159427jL r2, C124935z2 r3, C124995z9 r4, AnonymousClass3Ot r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = new C125105zK();
    }
}

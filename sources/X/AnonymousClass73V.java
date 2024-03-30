package X;

import java.io.File;

/* renamed from: X.73V  reason: invalid class name */
public final class AnonymousClass73V implements Runnable {
    public final AnonymousClass4R0 A00;
    public final int A01;
    public final AnonymousClass1GZ A02;
    public final AnonymousClass64Z A03;
    public final String A04;

    public void run() {
        File file;
        File file2;
        AnonymousClass1GZ r0 = this.A02;
        String str = this.A04;
        int i = this.A01;
        C18740tg.A00();
        C106755Lf A002 = AnonymousClass1GZ.A00(r0);
        AnonymousClass59h r2 = new AnonymousClass59h(r0.A03, r0.A05, r0.A07, r0.A08, r0.A09, r0.A0A, r0.A0B, r0.A0D, A002, AnonymousClass1GZ.A0J, str);
        AnonymousClass63X A0G = r2.A0G();
        C25371Ga r4 = r2.A00;
        String str2 = r2.A02;
        byte[] bArr = null;
        if (A0G == null) {
            file = null;
        } else {
            file = A0G.A00;
            bArr = A0G.A01;
        }
        r4.BXx(file, str2, bArr);
        C121635tS B81 = A002.B81(str);
        if (B81 != null) {
            file2 = C90524aI.A0S(B81.A00);
        } else {
            file2 = null;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MediaLoadGifJob/failed to load, name: ");
            A0u.append(str);
            C36321k7.A1S(", attribution:", A0u, i);
        }
        this.A03.A00(file2, true);
    }

    public AnonymousClass73V(AnonymousClass1GZ r1, AnonymousClass4R0 r2, AnonymousClass64Z r3, String str, int i) {
        this.A02 = r1;
        this.A00 = r2;
        this.A04 = str;
        this.A01 = i;
        this.A03 = r3;
    }
}

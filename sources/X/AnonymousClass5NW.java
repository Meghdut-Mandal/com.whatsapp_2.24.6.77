package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.5NW  reason: invalid class name */
public class AnonymousClass5NW extends C139166jL {
    public final C225314u A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1X4 A02;
    public final C19600wD A03;
    public final AnonymousClass171 A04;
    public final C19630wG A05;
    public final C20060wx A06;
    public final AnonymousClass1A5 A07;
    public final AnonymousClass1SU A08;
    public final AnonymousClass1ST A09;
    public final C46932bu A0A;
    public final AnonymousClass5NM A0B;

    public B39 B4R() {
        File file;
        C46932bu r13 = this.A0A;
        C65013Qj A002 = AnonymousClass2bU.A00(r13);
        if (A002.A0V && (file = A002.A0I) != null && file.exists()) {
            return new C139176jM(this.A00, Uri.fromFile(A002.A0I));
        }
        C19630wG r8 = this.A05;
        AnonymousClass17Y r4 = this.A01;
        AnonymousClass1X4 r5 = this.A02;
        C20060wx r9 = this.A06;
        AnonymousClass171 r7 = this.A04;
        AnonymousClass1SU r11 = this.A08;
        AnonymousClass1ST r12 = this.A09;
        C19600wD r6 = this.A03;
        AnonymousClass1A5 r10 = this.A07;
        return new C139186jN(this.A00, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, this.A0B, this.A00);
    }

    public AnonymousClass5NW(C225314u r1, AnonymousClass17Y r2, AnonymousClass1X4 r3, C19600wD r4, AnonymousClass171 r5, C19630wG r6, C20060wx r7, AnonymousClass1A5 r8, AnonymousClass1SU r9, AnonymousClass1ST r10, C46932bu r11, AnonymousClass5NM r12) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A0A = r11;
        this.A00 = r1;
        this.A0B = r12;
    }
}

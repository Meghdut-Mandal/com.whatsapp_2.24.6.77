package X;

import java.io.File;

/* renamed from: X.6va  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146426va implements C158377gp {
    public final /* synthetic */ C132466Tv A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C124465yE A02;
    public final /* synthetic */ AnonymousClass1GV A03;
    public final /* synthetic */ AnonymousClass65P A04;
    public final /* synthetic */ C25471Gl A05;

    public /* synthetic */ C146426va(C132466Tv r1, C146506vi r2, C124465yE r3, AnonymousClass1GV r4, AnonymousClass65P r5, C25471Gl r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
    }

    public final void BZz(AnonymousClass6VQ r14) {
        AnonymousClass1GV r7 = this.A03;
        C146506vi r5 = this.A01;
        AnonymousClass65P r8 = this.A04;
        C124465yE r6 = this.A02;
        C132466Tv r4 = this.A00;
        C25471Gl r10 = this.A05;
        C25411Gf r2 = r7.A04;
        File file = r8.A0A;
        String str = r8.A0E;
        int i = r8.A00;
        AnonymousClass64Z r3 = new AnonymousClass64Z(r4, r5, r6, r7, r8, r14, r10);
        if (file == null) {
            AnonymousClass1GZ r82 = r2.A00;
            C18740tg.A06(str);
            AnonymousClass00C.A08(str);
            AnonymousClass73V r72 = new AnonymousClass73V(r82, r5, r3, str, i);
            r2.A04(r72.A00, r72);
            return;
        }
        r3.A00(file, false);
    }
}

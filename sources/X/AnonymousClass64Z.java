package X;

import android.graphics.RectF;
import java.io.File;
import java.util.UUID;

/* renamed from: X.64Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64Z {
    public final /* synthetic */ C132466Tv A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C124465yE A02;
    public final /* synthetic */ AnonymousClass1GV A03;
    public final /* synthetic */ AnonymousClass65P A04;
    public final /* synthetic */ AnonymousClass6VQ A05;
    public final /* synthetic */ C25471Gl A06;

    public /* synthetic */ AnonymousClass64Z(C132466Tv r1, C146506vi r2, C124465yE r3, AnonymousClass1GV r4, AnonymousClass65P r5, AnonymousClass6VQ r6, C25471Gl r7) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }

    public final void A00(File file, boolean z) {
        AnonymousClass1GV r6 = this.A03;
        C124465yE r1 = this.A02;
        C146506vi r16 = this.A01;
        C132466Tv r15 = this.A00;
        AnonymousClass65P r0 = this.A04;
        AnonymousClass6VQ r14 = this.A05;
        C25471Gl r5 = this.A06;
        File file2 = file;
        if (z && file != null) {
            File file3 = file2;
            r1.A02.A04(new AnonymousClass5v7(file3, file2.getName(), C25541Gs.A04(file2), file2.length()));
        }
        C164867sV r8 = new C164867sV(r16, r1, r6, r0, 0);
        C117385mB r12 = r1.A05;
        C158407gs r11 = r1.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(UUID.randomUUID(), A0u);
        File A002 = AnonymousClass1GV.A00(r6, file2, AnonymousClass000.A0q(".mp4", A0u));
        long j = r0.A04;
        long j2 = r0.A05;
        int i = r0.A03;
        int i2 = r0.A02;
        AnonymousClass6VQ r20 = r14;
        File file4 = file2;
        C158407gs r19 = r11;
        C117385mB r17 = r12;
        RectF rectF = r0.A06;
        r6.A05.A00(new AnonymousClass5BX(rectF, r15, r16, r17, r8, r19, r20, A002, file4, i, i2, j, j2, r0.A0I), r5);
    }
}

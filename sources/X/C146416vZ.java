package X;

import android.graphics.RectF;
import java.io.File;
import java.util.UUID;

/* renamed from: X.6vZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146416vZ implements C158377gp {
    public final /* synthetic */ C132466Tv A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C124465yE A02;
    public final /* synthetic */ AnonymousClass1GV A03;
    public final /* synthetic */ AnonymousClass65P A04;

    public /* synthetic */ C146416vZ(C132466Tv r1, C146506vi r2, C124465yE r3, AnonymousClass1GV r4, AnonymousClass65P r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void BZz(AnonymousClass6VQ r36) {
        AnonymousClass1GV r12 = this.A03;
        C146506vi r16 = this.A01;
        C132466Tv r34 = this.A00;
        AnonymousClass65P r0 = this.A04;
        C124465yE r2 = this.A02;
        C164867sV r3 = new C164867sV(r16, r2, r12, r0, 1);
        C117385mB r17 = r2.A05;
        C158407gs r15 = r2.A07;
        File file = r0.A0A;
        StringBuilder A0f = C36421kH.A0f(file);
        C36351kA.A1K(UUID.randomUUID(), A0f);
        File A002 = AnonymousClass1GV.A00(r12, file, AnonymousClass000.A0q(".mp4", A0f));
        long j = r0.A04;
        long j2 = r0.A05;
        int i = r0.A03;
        int i2 = r0.A02;
        RectF rectF = r0.A06;
        File file2 = file;
        int i3 = i;
        int i4 = i2;
        long j3 = j;
        C158407gs r19 = r15;
        RectF rectF2 = rectF;
        C132466Tv r152 = r34;
        r12.A05.A00(new AnonymousClass5BY(rectF2, r152, r16, r17, r3, r19, r36, file2, A002, i3, i4, j3, j2, r0.A0M, r0.A0H, r0.A0G, r0.A0L, r0.A0I), C25471Gl.A0i);
    }
}

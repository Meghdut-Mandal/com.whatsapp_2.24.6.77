package X;

import java.io.File;

/* renamed from: X.3ml  reason: invalid class name and case insensitive filesystem */
public final class C75153ml implements AnonymousClass4U3 {
    public final /* synthetic */ AnonymousClass3OG A00;
    public final /* synthetic */ AnonymousClass141 A01;
    public final /* synthetic */ AnonymousClass146 A02;

    public void BiP(AnonymousClass39E r7, AnonymousClass147 r8) {
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass3OG r4 = this.A00;
        r4.A0E.remove(this.A02);
        File A002 = r4.A06.A00(this.A01);
        if (A002 != null && A002.exists()) {
            AnonymousClass1P3.A00(r4.A05.A0D(r8), r4.A0D, A002, (byte[]) null, false);
        }
        AnonymousClass3OG.A00(r4, r4.A0F.decrementAndGet());
    }

    public C75153ml(AnonymousClass3OG r1, AnonymousClass141 r2, AnonymousClass146 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void Bj9() {
        AnonymousClass3OG r1 = this.A00;
        AnonymousClass3OG.A00(r1, r1.A0F.decrementAndGet());
    }

    public void onError(int i) {
        AnonymousClass3OG r1 = this.A00;
        AnonymousClass3OG.A00(r1, r1.A0F.decrementAndGet());
    }
}

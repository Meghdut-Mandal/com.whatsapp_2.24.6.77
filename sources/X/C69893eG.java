package X;

import android.view.View;

/* renamed from: X.3eG  reason: invalid class name and case insensitive filesystem */
public final class C69893eG implements C32061ct {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C69923eJ A02;

    public void Bf7(C63093Is r7) {
        AnonymousClass00C.A0D(r7, 0);
        int ordinal = r7.A02.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            C69923eJ r1 = this.A02;
            r1.A01.A08();
            r1.A02.A04((AnonymousClass11F) null, Integer.valueOf(this.A01), 1, 8);
            AnonymousClass155 r0 = this.A00;
            View view = r0.A00;
            C235718z.A02(C36391kE.A0I(r0, view), view, true);
            return;
        }
        AnonymousClass155 r02 = this.A00;
        View view2 = r02.A00;
        C235718z.A02(C36391kE.A0I(r02, view2), view2, false);
    }

    public C69893eG(AnonymousClass155 r1, C69923eJ r2, int i) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = i;
    }
}

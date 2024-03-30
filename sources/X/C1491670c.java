package X;

/* renamed from: X.70c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1491670c implements AnonymousClass4SK {
    public final /* synthetic */ AnonymousClass5NK A00;
    public final /* synthetic */ C65083Qq A01;

    public /* synthetic */ C1491670c(AnonymousClass5NK r1, C65083Qq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void BSJ(C65083Qq r4, boolean z) {
        AnonymousClass5NK r2 = this.A00;
        C65083Qq r0 = this.A01;
        r2.A0K = z;
        if (r0 instanceof AnonymousClass5NR) {
            r2.A0X.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
        C124685yd r02 = r2.A0r;
        if (r02 != null) {
            C128896Ea r03 = r02.A06;
            if (z) {
                r03.A02();
            } else {
                r03.A00();
            }
        }
    }
}

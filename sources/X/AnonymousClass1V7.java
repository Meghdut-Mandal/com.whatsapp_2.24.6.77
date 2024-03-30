package X;

import android.view.View;

/* renamed from: X.1V7  reason: invalid class name */
public final class AnonymousClass1V7 {
    public C46812bi A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C21390zA A06;
    public final AnonymousClass1V6 A07;
    public final AnonymousClass1V8 A08;

    public AnonymousClass1V7(C21390zA r2, AnonymousClass1V6 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A07 = r3;
        this.A06 = r2;
        this.A08 = new AnonymousClass1V8(r3);
    }

    public final void A00() {
        this.A04 = false;
        this.A03 = false;
        this.A05 = false;
        this.A02 = false;
    }

    public final void A01(View view) {
        AnonymousClass00C.A0D(view, 0);
        if (AnonymousClass1V9.A00(view)) {
            this.A05 = true;
            this.A04 = true;
            this.A03 = true;
            return;
        }
        this.A05 = false;
        this.A04 = false;
        this.A03 = false;
    }

    public final void A02(AnonymousClass11F r2) {
        boolean z;
        C46812bi A012;
        AnonymousClass11F r0;
        if (r2 == null || (A012 = this.A07.A01()) == null || (r0 = A012.A1J.A00) == null) {
            z = false;
        } else {
            z = r2.equals(r0);
        }
        this.A02 = z;
    }
}

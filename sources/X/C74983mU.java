package X;

import android.view.View;

/* renamed from: X.3mU  reason: invalid class name and case insensitive filesystem */
public final class C74983mU implements C87794Qe {
    public AnonymousClass4QD A00;
    public AnonymousClass3FB A01;
    public C601636s A02;
    public C96174mu A03;
    public C78053rU A04;
    public final AnonymousClass3BO A05;
    public final AnonymousClass1GZ A06;
    public final AnonymousClass3L7 A07;
    public final C33541fX A08 = C48742hy.A00(this, 29);

    public void BYd(AnonymousClass3XU r2) {
        C87784Qd r0;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass4QD r02 = this.A00;
        if (r02 != null) {
            r02.BoZ();
        }
        C601636s r03 = this.A02;
        if (r03 != null && (r0 = r03.A02.A00) != null) {
            r0.BYd(r2);
        }
    }

    public final void A00() {
        AnonymousClass3FB r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("gifKeyboardView");
        }
        View view = r0.A01;
        if (view != null && view.getVisibility() == 0) {
            C96174mu r1 = this.A03;
            if (r1 == null) {
                r1 = new AnonymousClass2UT(this);
                this.A03 = r1;
            }
            AnonymousClass3FB r02 = this.A01;
            if (r02 == null) {
                throw C36331k8.A0d("gifKeyboardView");
            }
            r02.A00(r1);
            C96174mu r12 = this.A03;
            if (r12 != null) {
                r12.A0L(this.A07.A02());
            }
        }
    }

    public C74983mU(AnonymousClass3BO r2, AnonymousClass1GZ r3, AnonymousClass3L7 r4) {
        this.A06 = r3;
        this.A07 = r4;
        this.A05 = r2;
    }
}

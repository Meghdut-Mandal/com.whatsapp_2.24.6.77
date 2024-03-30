package X;

/* renamed from: X.4ho  reason: invalid class name and case insensitive filesystem */
public final class C94194ho extends C137856gq implements C161807nV, C161767nR {
    public boolean A00;
    public C160787la A01;

    public /* synthetic */ Object BAY(C114375h9 r2) {
        return C109185Wp.A00(this, r2);
    }

    public static final void A00(C94194ho r2) {
        C006302t r1;
        C160787la r0 = r2.A01;
        if (r0 != null && r0.BLA() && r2.A08 && (r1 = (C006302t) C109185Wp.A00(r2, C112165dS.A00)) != null) {
            r1.invoke(r2.A01);
        }
    }

    public void BYg(C160787la r3) {
        C006302t r1;
        this.A01 = r3;
        if (!this.A00) {
            return;
        }
        if (r3.BLA()) {
            A00(this);
        } else if (this.A08 && (r1 = (C006302t) C109185Wp.A00(this, C112165dS.A00)) != null) {
            r1.invoke((Object) null);
        }
    }

    public /* synthetic */ AnonymousClass65T BGK() {
        return C94774il.A00;
    }
}

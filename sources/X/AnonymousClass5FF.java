package X;

import android.view.View;

/* renamed from: X.5FF  reason: invalid class name */
public class AnonymousClass5FF extends C46482Xv {
    public AnonymousClass5EL A00;
    public final AnonymousClass6WN A01;

    public void A0B() {
        AnonymousClass6V2 r1 = this.A01.A0H;
        r1.A07 = null;
        r1.A03();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EL r2 = (AnonymousClass5EL) obj;
        this.A00 = r2;
        this.A01.A06(r2);
    }

    public void A0D() {
        AnonymousClass5EL r1 = this.A00;
        if (r1 != null) {
            this.A01.A07(r1);
        }
    }

    public AnonymousClass5FF(View view, AnonymousClass6WN r2) {
        super(view);
        this.A01 = r2;
        r2.A05(view);
    }
}

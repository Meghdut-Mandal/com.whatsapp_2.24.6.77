package X;

import android.content.Context;

/* renamed from: X.5NX  reason: invalid class name */
public final class AnonymousClass5NX extends C139166jL {
    public final C19630wG A00;
    public final C146506vi A01;
    public final C602437b A02;

    public AnonymousClass5NX(C19630wG r3, AnonymousClass1Y4 r4, C46932bu r5) {
        this.A00 = r3;
        this.A01 = r4.A04(AnonymousClass1Y4.A00(r4, r5));
        this.A02 = null;
    }

    public B39 B4R() {
        B39 r0;
        C146506vi r3 = this.A01;
        Context context = this.A00.A00;
        if (r3 != null) {
            r0 = new AnonymousClass5NY(context, r3, this.A02);
        } else {
            r0 = new AnonymousClass83G(context);
        }
        return r0;
    }

    public AnonymousClass5NX(C19630wG r2, AnonymousClass1Y4 r3, C46932bu r4, C602437b r5) {
        this.A00 = r2;
        this.A01 = r3.A04(AnonymousClass1Y4.A00(r3, r4));
        this.A02 = r5;
    }
}

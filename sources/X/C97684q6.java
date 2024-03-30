package X;

import android.content.Context;

/* renamed from: X.4q6  reason: invalid class name and case insensitive filesystem */
public abstract class C97684q6 extends C92794ej implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C97684q6(Context context, C124515yJ r5) {
        super(context, r5);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass5B8 r2 = (AnonymousClass5B8) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            r2.A09 = (C32691e2) r1.A4R.get();
            r2.A0A = C36351kA.A0U(r1);
        }
    }
}

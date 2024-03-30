package X;

import android.content.Context;

/* renamed from: X.1Mk  reason: invalid class name and case insensitive filesystem */
public final class C27021Mk implements C18700tb {
    public final Context A00;
    public final AnonymousClass016 A01;
    public final Object A02 = new Object();
    public volatile AnonymousClass051 A03;

    public /* bridge */ /* synthetic */ Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = ((C27051Mn) new AnonymousClass04H(new C27041Mm(this.A00, this), this.A01).A00(C27051Mn.class)).A00;
                }
            }
        }
        return this.A03;
    }

    public C27021Mk(AnonymousClass01G r2) {
        this.A01 = r2;
        this.A00 = r2;
    }
}

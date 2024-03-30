package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.6C3  reason: invalid class name */
public final class AnonymousClass6C3 {
    public AnonymousClass0BQ A00;
    public AnonymousClass6B2 A01 = new AnonymousClass6B2(0, false, false);
    public WeakReference A02;
    public final C162567on A03 = new C162567on(this, 0);

    public final AnonymousClass0BQ A00(Context context, int i, boolean z) {
        AnonymousClass0BQ r2;
        AnonymousClass00C.A0D(context, 0);
        if (this.A01.A00 != i || (r2 = this.A00) == null) {
            AnonymousClass6B2 r1 = new AnonymousClass6B2(i, z, true);
            this.A01 = r1;
            A01();
            r2 = AnonymousClass0BQ.A03(context, r1.A00);
            if (r2 == null) {
                r2 = null;
            } else {
                r2.A08(this.A03);
                if (r1.A02) {
                    r2.start();
                }
            }
            this.A00 = r2;
        }
        return r2;
    }

    public final void A02() {
        this.A01 = new AnonymousClass6B2(0, false, false);
        WeakReference weakReference = this.A02;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A02 = null;
        A01();
    }

    public final void A01() {
        AnonymousClass0BQ r0 = this.A00;
        if (r0 != null) {
            r0.A07();
        }
        AnonymousClass0BQ r02 = this.A00;
        if (r02 != null) {
            r02.stop();
        }
        this.A00 = null;
    }
}

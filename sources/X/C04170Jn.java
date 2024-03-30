package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0Jn  reason: invalid class name and case insensitive filesystem */
public final class C04170Jn extends AnonymousClass0XC {
    public final AnonymousClass0JS A00;

    public final void A01(Status status) {
        try {
            this.A00.A0B(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void A02(AnonymousClass0WT r4, boolean z) {
        AnonymousClass0JS r2 = this.A00;
        r4.A00.put(r2, Boolean.valueOf(z));
        r2.A02(new C10150dm(r2, r4));
    }

    public final void A03(C10350e6 r3) {
        try {
            this.A00.A09(r3.A04);
        } catch (RuntimeException e) {
            A04(e);
        }
    }

    public C04170Jn(AnonymousClass0JS r1, int i) {
        super(i);
        this.A00 = r1;
    }

    public final void A04(Exception exc) {
        try {
            this.A00.A0B(new Status(10, AnonymousClass000.A0p(": ", exc.getLocalizedMessage(), AnonymousClass000.A0v(exc.getClass().getSimpleName()))));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }
}

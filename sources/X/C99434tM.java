package X;

import android.os.Bundle;

/* renamed from: X.4tM  reason: invalid class name and case insensitive filesystem */
public final class C99434tM extends AnonymousClass6F5 {
    public C99434tM(int i, Bundle bundle) {
        super(bundle, i, 2);
    }

    public final void A00(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            A02((Object) null);
        } else {
            A01(new C108735Ur(4, "Invalid response to one way request"));
        }
    }
}

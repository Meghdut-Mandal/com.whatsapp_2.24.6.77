package X;

import android.net.Uri;

/* renamed from: X.5zZ  reason: invalid class name and case insensitive filesystem */
public abstract class C125245zZ {
    public boolean A00(Uri uri) {
        String host;
        if (this instanceof C98384rL) {
            C98384rL r0 = (C98384rL) this;
            if (uri == null || (host = uri.getHost()) == null) {
                return false;
            }
            String str = r0.A00[0];
            if (host.equals(str) || host.endsWith(AnonymousClass000.A0p(".", str, AnonymousClass000.A0u()))) {
                return true;
            }
            return false;
        } else if (this instanceof C98374rK) {
            C98374rK r02 = (C98374rK) this;
            if (uri != null) {
                return r02.A00.contains(uri.getScheme());
            }
            return false;
        } else {
            C98364rJ r03 = (C98364rJ) this;
            if (uri == null) {
                return false;
            }
            for (C125245zZ A00 : r03.A00) {
                if (!A00.A00(uri)) {
                    return false;
                }
            }
            return true;
        }
    }
}

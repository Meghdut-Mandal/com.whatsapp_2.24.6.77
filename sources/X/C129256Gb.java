package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: X.6Gb  reason: invalid class name and case insensitive filesystem */
public abstract class C129256Gb {
    public static final AnonymousClass65N A00(Context context, Uri uri, boolean z) {
        AnonymousClass00C.A0D(uri, 0);
        boolean z2 = true;
        if (uri.getPath() == null) {
            z2 = false;
        }
        C131736Qi.A02(z2, AnonymousClass000.A0l(uri, "Path cannot be null contentUri: ", AnonymousClass000.A0u()));
        if (AnonymousClass098.A07(C109715Yq.A00(C90484aE.A0c(uri).getPath(), "video/mp4"), "video", false)) {
            try {
                return new C141176mn(context, z).B78(uri);
            } catch (IOException | RuntimeException unused) {
                return null;
            }
        } else {
            boolean z3 = true;
            if (uri.getPath() == null) {
                z3 = false;
            }
            C131736Qi.A02(z3, AnonymousClass000.A0l(uri, "Path cannot be null contentUri: ", AnonymousClass000.A0u()));
            try {
                return new C141156ml().B78(uri);
            } catch (IOException unused2) {
                return null;
            }
        }
    }

    public static final boolean A01(C125085zI r4) {
        if (r4.A04 != null) {
            return false;
        }
        long j = r4.A02;
        if (j == 0 || j == -1) {
            return true;
        }
        return false;
    }
}

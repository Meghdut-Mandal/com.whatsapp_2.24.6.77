package X;

import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.7rK  reason: invalid class name and case insensitive filesystem */
public class C164137rK implements AnonymousClass4SM {
    public Object A00;
    public final int A01;

    public C164137rK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWy(String str, String str2, boolean z) {
        String str3;
        if (this.A01 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("InlineVideoPlaybackImplHandler/onPlaybackError=");
            A0u.append(str);
            Log.e(C36371kC.A0z(" isTransient=", A0u, z));
            C1491570b.A01((C1491570b) this.A00);
            return;
        }
        AnonymousClass5NK r0 = (AnonymousClass5NK) this.A00;
        if (z) {
            str3 = "_transient";
        } else {
            str3 = "_not_transient";
        }
        r0.A0r.A01 = AnonymousClass000.A0p(str2.toLowerCase(Locale.ROOT), str3, AnonymousClass000.A0u());
    }
}

package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67A  reason: invalid class name */
public final class AnonymousClass67A {
    public C157867eo A00;
    public AnonymousClass5YZ A01;
    public final List A02;
    public final List A03;

    public final AnonymousClass5S7 A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        C157867eo r5 = this.A00;
        Uri A002 = C133036Wk.A00(r5, str);
        if (A002 == null) {
            r5.BoD("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
        } else {
            for (C125245zZ A003 : this.A02) {
                if (A003.A00(A002)) {
                    return AnonymousClass5S7.NAVIGATE;
                }
            }
            String scheme = A002.getScheme();
            String authority = A002.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Uri is blocked, scheme: ");
            A0u.append(scheme);
            r5.BoD("WebViewUriHandler", AnonymousClass000.A0p(" , authority: ", authority, A0u), (Throwable) null);
        }
        return AnonymousClass5S7.BLOCKED;
    }

    public final AnonymousClass5S7 A01(String str) {
        AnonymousClass00C.A0D(str, 1);
        C157867eo r3 = this.A00;
        if (C133036Wk.A00(r3, str) == null) {
            r3.BoD("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
            return AnonymousClass5S7.BLOCKED;
        }
        Iterator it = this.A03.iterator();
        if (!it.hasNext()) {
            return A00(str);
        }
        it.next();
        throw AnonymousClass001.A0A("launch");
    }

    public AnonymousClass67A(C157867eo r3, AnonymousClass5YZ r4, List list, List list2) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A03 = A0I;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A02 = A0I2;
        A0I2.addAll(list2);
        A0I.addAll(list);
        this.A00 = r3;
        this.A01 = r4;
    }
}

package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.77v  reason: invalid class name and case insensitive filesystem */
public final class C1510477v implements C160957lr {
    public void BRB(List list) {
        AnonymousClass00C.A0D("WfsNativeAuthSsoLogger onAnnotate", 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WfsNativeAuthSsoLogger, source: ");
            AnonymousClass00C.A0D(AnonymousClass000.A0q(((C188598zq) it.next()).A00(), A0u), 0);
        }
    }

    public void Bh7() {
        AnonymousClass00C.A0D("WfsNativeAuthSsoLogger onStart", 0);
    }

    public void BRX(C1271567e r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onAuthTokenFetchStart, source: ");
        C188598zq r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        C90464aC.A1R(A0u, C90464aC.A0Y(r0, A0u, r3));
    }

    public void Bgy(Exception exc, C1271567e r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrievalException, source: ");
        C188598zq r0 = null;
        if (r4 != null) {
            r0 = r4.A04;
        }
        AnonymousClass3TI.A02(AnonymousClass000.A0q(C90464aC.A0Y(r0, A0u, r4), A0u), exc);
    }

    public void Bgz(C1271567e r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrievalNoAccountError, source: ");
        C188598zq r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        C90464aC.A1R(A0u, C90464aC.A0Y(r0, A0u, r3));
    }

    public void Bh0(C1271567e r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrieved, source: ");
        C188598zq r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        C90464aC.A1R(A0u, C90464aC.A0Y(r0, A0u, r3));
    }

    public void Bh1(C1271567e r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoProviderNoTrusted, source: ");
        C188598zq r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        C90464aC.A1R(A0u, C90464aC.A0Y(r0, A0u, r3));
    }

    public void Bh2(Map map, C1271567e r7) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoProviderNotFound, source: ");
        C188598zq r0 = null;
        if (r7 != null) {
            r0 = r7.A04;
        }
        boolean A1Z = C90464aC.A1Z(C90464aC.A0Y(r0, A0u, r7), A0u);
        if (map != null) {
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C = AnonymousClass001.A0C(A10);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("WfsNativeAuthSsoLogger, key: ");
                A0u2.append(A0C);
                A0u2.append(" value: ");
                AnonymousClass00C.A0D(AnonymousClass000.A0q(C36431kI.A1A(A0C, map), A0u2), A1Z ? 1 : 0);
            }
        }
    }

    public void Bh3(C1271567e r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onSsoProviderResolved, source: ");
        C188598zq r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        C90464aC.A1R(A0u, C90464aC.A0Y(r0, A0u, r3));
    }

    public void Bja(C1271567e r3, AnonymousClass78U r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfsNativeAuthSsoLogger onTransformerException, source: ");
        A0u.append(r3.A04);
        A0u.append(", package name: ");
        AnonymousClass3TI.A02(AnonymousClass000.A0q(r3.A02, A0u), r4);
    }
}

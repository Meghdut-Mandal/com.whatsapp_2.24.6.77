package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.13q  reason: invalid class name and case insensitive filesystem */
public final class C222713q {
    public static final AnonymousClass11F A00(Jid jid) {
        if (jid instanceof AnonymousClass11F) {
            return (AnonymousClass11F) jid;
        }
        return null;
    }

    public static final AnonymousClass11F A01(String str) {
        AnonymousClass11F r1;
        C222613p r0 = Jid.JID_FACTORY;
        Jid A00 = C222513o.A00(str);
        if ((A00 instanceof AnonymousClass11F) && (r1 = (AnonymousClass11F) A00) != null) {
            return r1;
        }
        throw new C19740wR(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass11F A02(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x001f
            X.11F r1 = A01(r4)     // Catch:{ all -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0018:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x001d
            r2 = r1
        L_0x001d:
            X.11F r2 = (X.AnonymousClass11F) r2
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222713q.A02(java.lang.String):X.11F");
    }
}

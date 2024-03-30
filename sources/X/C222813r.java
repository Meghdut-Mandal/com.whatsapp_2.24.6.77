package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13r  reason: invalid class name and case insensitive filesystem */
public final class C222813r {
    public static final UserJid A00(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    public static final UserJid A01(String str) {
        UserJid userJid;
        C222613p r0 = Jid.JID_FACTORY;
        Jid A00 = C222513o.A00(str);
        if ((A00 instanceof UserJid) && (userJid = (UserJid) A00) != null) {
            return userJid;
        }
        throw new C19740wR(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.UserJid A02(java.lang.String r4) {
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
            com.whatsapp.jid.UserJid r1 = A01(r4)     // Catch:{ all -> 0x0012 }
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
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222813r.A02(java.lang.String):com.whatsapp.jid.UserJid");
    }
}

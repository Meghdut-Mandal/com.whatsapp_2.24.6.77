package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.6SZ  reason: invalid class name */
public final class AnonymousClass6SZ {
    public static final GroupJid A00(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }

    public static final GroupJid A01(String str) {
        GroupJid groupJid;
        C222513o r0 = Jid.Companion;
        Jid A00 = C222513o.A00(str);
        if ((A00 instanceof GroupJid) && (groupJid = (GroupJid) A00) != null) {
            return groupJid;
        }
        throw new C19740wR(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.GroupJid A02(java.lang.String r4) {
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
            if (r0 != 0) goto L_0x001e
            com.whatsapp.jid.GroupJid r1 = A01(r4)     // Catch:{ all -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)
        L_0x0017:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x001c
            r2 = r1
        L_0x001c:
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SZ.A02(java.lang.String):com.whatsapp.jid.GroupJid");
    }
}

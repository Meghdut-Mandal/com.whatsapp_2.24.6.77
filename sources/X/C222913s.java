package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13s  reason: invalid class name and case insensitive filesystem */
public final class C222913s {
    public static final PhoneUserJid A00(String str) {
        PhoneUserJid phoneUserJid;
        AnonymousClass00C.A0D(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "s.whatsapp.net");
        AnonymousClass00C.A08(A04);
        if ((A04 instanceof PhoneUserJid) && (phoneUserJid = (PhoneUserJid) A04) != null) {
            return phoneUserJid;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid phone number: ");
        sb.append(str);
        throw new C19740wR(sb.toString());
    }

    public static final boolean A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        int length = str.length();
        if (length >= 5 && length <= 20) {
            AnonymousClass00C.A0D("10", 1);
            if (!str.startsWith("10")) {
                AnonymousClass00C.A0D("0", 1);
                if (!str.startsWith("0")) {
                    char[] charArray = str.toCharArray();
                    AnonymousClass00C.A08(charArray);
                    int length2 = charArray.length;
                    int i = 0;
                    while (i < length2) {
                        char c = charArray[i];
                        if (AnonymousClass00C.A00(c, 48) >= 0 && AnonymousClass00C.A00(c, 57) <= 0) {
                            i++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.PhoneUserJid A02(java.lang.String r4) {
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
            if (r0 != 0) goto L_0x002f
            X.13p r0 = com.whatsapp.jid.Jid.JID_FACTORY     // Catch:{ all -> 0x0022 }
            com.whatsapp.jid.Jid r1 = X.C222513o.A00(r4)     // Catch:{ all -> 0x0022 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001c
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x001c
            goto L_0x0028
        L_0x001c:
            X.0wR r0 = new X.0wR     // Catch:{ all -> 0x0022 }
            r0.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0028:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x002d
            r2 = r1
        L_0x002d:
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222913s.A02(java.lang.String):com.whatsapp.jid.PhoneUserJid");
    }
}

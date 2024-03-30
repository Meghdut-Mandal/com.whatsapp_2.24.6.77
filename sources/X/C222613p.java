package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13p  reason: invalid class name and case insensitive filesystem */
public final class C222613p {
    public static volatile C222613p A01;
    public final C002000v A00 = new C002000v(1000);

    public static Jid A00(String str) {
        if (str.equals("s.whatsapp.net")) {
            return C177588e2.A00;
        }
        if (str.equals("g.us")) {
            return C177578e1.A00;
        }
        if (str.equals("call")) {
            return C177568e0.A00;
        }
        return null;
    }

    public static C222613p A01() {
        if (A01 == null) {
            synchronized (C222613p.class) {
                if (A01 == null) {
                    A01 = new C222613p();
                }
            }
        }
        return A01;
    }

    public UserJid A04(String str, String str2) {
        C222613p r0 = Jid.JID_FACTORY;
        String A012 = C222513o.A01(str, str2);
        C002000v r2 = this.A00;
        Jid jid = (Jid) r2.A04(A012);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        UserJid A02 = A02(str, str2);
        r2.A08(A012, A02);
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1.equals("Server") != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r1.equals("0") != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return new com.whatsapp.jid.PhoneUserJid(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        return new X.C223313w(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        return X.C177638e7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = com.whatsapp.jid.Jid.JID_FACTORY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        return X.C177628e6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        throw new X.C19740wR(X.C222513o.A01(r1, r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.jid.UserJid A02(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -2070199035: goto L_0x0013;
                case -1673355044: goto L_0x0021;
                case -1211484089: goto L_0x001e;
                case -1102975408: goto L_0x003f;
                case -605206432: goto L_0x004d;
                case 107143: goto L_0x004a;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.13p r0 = com.whatsapp.jid.Jid.JID_FACTORY
            java.lang.String r1 = X.C222513o.A01(r1, r2)
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0013:
            java.lang.String r0 = "status_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.13z r0 = X.C223613z.A00
            return r0
        L_0x001e:
            java.lang.String r0 = "hosted"
            goto L_0x0023
        L_0x0021:
            java.lang.String r0 = "s.whatsapp.net"
        L_0x0023:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "Server"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005b
            com.whatsapp.jid.PhoneUserJid r0 = new com.whatsapp.jid.PhoneUserJid
            r0.<init>(r1)
            return r0
        L_0x003f:
            java.lang.String r0 = "lid_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.8e8 r0 = X.C177648e8.A00
            return r0
        L_0x004a:
            java.lang.String r0 = "lid"
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "hosted.lid"
        L_0x004f:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.13w r0 = new X.13w
            r0.<init>(r1)
            return r0
        L_0x005b:
            X.8e7 r0 = X.C177638e7.A00
            return r0
        L_0x005e:
            X.8e6 r0 = X.C177628e6.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222613p.A02(java.lang.String, java.lang.String):com.whatsapp.jid.UserJid");
    }

    public C28981Uw A03(String str, String str2) {
        String trim = str.trim();
        if (trim.isEmpty() || "0".equals(trim) || trim.indexOf("0") == 0) {
            throw new C19740wR("Identifier must be a valid number starting with non-zero");
        }
        C222613p r0 = Jid.JID_FACTORY;
        String A012 = C222513o.A01(str, str2);
        if ("newsletter".equals(str2)) {
            C002000v r2 = this.A00;
            Jid jid = (Jid) r2.A04(A012);
            if (jid instanceof C28981Uw) {
                return (C28981Uw) jid;
            }
            C28981Uw r1 = new C28981Uw(str);
            r2.A08(A012, r1);
            return r1;
        }
        throw new C19740wR(A012);
    }
}

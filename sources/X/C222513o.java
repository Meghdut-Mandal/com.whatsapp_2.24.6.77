package X;

/* renamed from: X.13o  reason: invalid class name and case insensitive filesystem */
public final class C222513o {
    public static final String A01(String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        if (str.length() == 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw new X.C19740wR(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r5.equals(r0) != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        r8 = r7.lastIndexOf(46);
        r6 = r7.lastIndexOf(58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        if (r6 != -1) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ef, code lost:
        if (r8 != -1) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f1, code lost:
        r0 = X.C222613p.A02(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f6, code lost:
        r1 = r7.length();
        r0 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fc, code lost:
        if (r6 == r0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        if (r8 == r0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r6 == -1) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0102, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0103, code lost:
        if (r8 == -1) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0105, code lost:
        if (r8 < r6) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0107, code lost:
        if (r6 != -1) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0109, code lost:
        r2 = 0;
        r1 = r9.A04(r7.substring(0, r8), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0112, code lost:
        if (r6 == -1) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0117, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r2 = java.lang.Integer.parseInt(r7.substring(r6 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0127, code lost:
        if ("lid".equals(r5) == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0129, code lost:
        r0 = new X.C177508du(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0135, code lost:
        if ("hosted.lid".equals(r5) == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0137, code lost:
        r0 = new X.C177608e4((X.C223313w) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0145, code lost:
        if ("hosted".equals(r5) == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r0 = new X.C177558dz(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014d, code lost:
        r0 = new X.C223413x(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016c, code lost:
        throw new X.C19740wR(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0172, code lost:
        throw new X.C19740wR(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.Jid A00(java.lang.String r10) {
        /*
            X.13p r9 = com.whatsapp.jid.Jid.JID_FACTORY
            if (r10 == 0) goto L_0x0173
            X.00v r4 = r9.A00
            java.lang.Object r0 = r4.A04(r10)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 != 0) goto L_0x00dc
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x015f
            r0 = 64
            int r1 = r10.lastIndexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x00ab
            if (r1 == 0) goto L_0x0153
            int r0 = r10.length()
            if (r1 == r0) goto L_0x0153
            r0 = 0
            java.lang.String r7 = r10.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r5 = r10.substring(r0)
            int r0 = r5.hashCode()
            switch(r0) {
                case -1673355044: goto L_0x00c7;
                case -1618876223: goto L_0x0087;
                case -1211484089: goto L_0x007e;
                case -605206432: goto L_0x007b;
                case 107143: goto L_0x0078;
                case 3045982: goto L_0x006a;
                case 3116421: goto L_0x005c;
                case 3556308: goto L_0x004e;
                case 1102578873: goto L_0x003d;
                case 1958063037: goto L_0x004b;
                default: goto L_0x0037;
            }
        L_0x0037:
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x003d:
            java.lang.String r0 = "newsletter"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1Uw r0 = r9.A03(r7, r5)
            goto L_0x00d9
        L_0x004b:
            java.lang.String r0 = "interop"
            goto L_0x0080
        L_0x004e:
            java.lang.String r0 = "temp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.146 r0 = new X.146
            r0.<init>(r7)
            goto L_0x00d9
        L_0x005c:
            java.lang.String r0 = "g.us"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.147 r0 = new X.147
            r0.<init>(r7)
            goto L_0x00d9
        L_0x006a:
            java.lang.String r0 = "call"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.8e3 r0 = new X.8e3
            r0.<init>(r7)
            goto L_0x00d9
        L_0x0078:
            java.lang.String r0 = "lid"
            goto L_0x0080
        L_0x007b:
            java.lang.String r0 = "hosted.lid"
            goto L_0x0080
        L_0x007e:
            java.lang.String r0 = "hosted"
        L_0x0080:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00e0
            goto L_0x0037
        L_0x0087:
            java.lang.String r0 = "broadcast"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "location"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x009a
            X.8dv r0 = X.C177518dv.A00
            goto L_0x00d9
        L_0x009a:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a5
            X.8dw r0 = X.C177528dw.A00
            goto L_0x00d9
        L_0x00a5:
            X.8dx r0 = new X.8dx
            r0.<init>(r7)
            goto L_0x00d9
        L_0x00ab:
            com.whatsapp.jid.Jid r0 = X.C222613p.A00(r10)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "status_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00bc
            X.13z r0 = X.C223613z.A00
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r0 = "lid_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0159
            X.8e8 r0 = X.C177648e8.A00
            goto L_0x00d9
        L_0x00c7:
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "gdpr"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00e0
            X.8dy r0 = X.C177548dy.A00
        L_0x00d9:
            r4.A08(r10, r0)
        L_0x00dc:
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x00e0:
            r0 = 46
            int r8 = r7.lastIndexOf(r0)
            r0 = 58
            int r6 = r7.lastIndexOf(r0)
            r3 = -1
            if (r6 != r3) goto L_0x00f6
            if (r8 != r3) goto L_0x00f6
            com.whatsapp.jid.UserJid r0 = X.C222613p.A02(r7, r5)
            goto L_0x00d9
        L_0x00f6:
            int r1 = r7.length()
            int r0 = r1 + -1
            if (r6 == r0) goto L_0x016d
            if (r8 == r0) goto L_0x016d
            if (r6 == r3) goto L_0x0103
            r1 = r6
        L_0x0103:
            if (r8 == r3) goto L_0x0117
            if (r8 < r6) goto L_0x0109
            if (r6 != r3) goto L_0x0117
        L_0x0109:
            r2 = 0
            java.lang.String r0 = r7.substring(r2, r8)
            com.whatsapp.jid.UserJid r1 = r9.A04(r0, r5)
            if (r6 == r3) goto L_0x0121
            int r0 = r6 + 1
            goto L_0x0119
        L_0x0117:
            r8 = r1
            goto L_0x0109
        L_0x0119:
            java.lang.String r0 = r7.substring(r0)     // Catch:{ NumberFormatException -> 0x0167 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0167 }
        L_0x0121:
            java.lang.String r0 = "lid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x012f
            X.8du r0 = new X.8du
            r0.<init>(r1, r2)
            goto L_0x00d9
        L_0x012f:
            java.lang.String r0 = "hosted.lid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x013f
            X.13w r1 = (X.C223313w) r1
            X.8e4 r0 = new X.8e4
            r0.<init>(r1, r2)
            goto L_0x00d9
        L_0x013f:
            java.lang.String r0 = "hosted"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x014d
            X.8dz r0 = new X.8dz
            r0.<init>(r1, r2)
            goto L_0x00d9
        L_0x014d:
            X.13x r0 = new X.13x
            r0.<init>(r1, r2)
            goto L_0x00d9
        L_0x0153:
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x0159:
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x015f:
            java.lang.String r1 = "<empty>"
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0167:
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x016d:
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x0173:
            java.lang.String r1 = "null"
            X.0wR r0 = new X.0wR
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222513o.A00(java.lang.String):com.whatsapp.jid.Jid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.Jid A02(java.lang.String r4) {
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
            com.whatsapp.jid.Jid r1 = A00(r4)     // Catch:{ all -> 0x0012 }
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
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222513o.A02(java.lang.String):com.whatsapp.jid.Jid");
    }
}

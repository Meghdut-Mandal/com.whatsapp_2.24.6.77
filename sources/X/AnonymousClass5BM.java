package X;

/* renamed from: X.5BM  reason: invalid class name */
public class AnonymousClass5BM extends AnonymousClass5V2 {
    public final int responseCode;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r3 >= 500) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r4.contains("URL signature expired") != false) goto L_0x0043;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5BM(int r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x002b
            r0 = 401(0x191, float:5.62E-43)
            r1 = 8
            if (r3 == r0) goto L_0x002d
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x0039
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L_0x0043
            r0 = 408(0x198, float:5.72E-43)
            if (r3 == r0) goto L_0x002b
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L_0x0043
            r0 = 416(0x1a0, float:5.83E-43)
            if (r3 == r0) goto L_0x0037
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L_0x0034
            r0 = 507(0x1fb, float:7.1E-43)
            if (r3 == r0) goto L_0x0034
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = -1
            if (r3 < r0) goto L_0x002d
        L_0x002b:
            r1 = 16
        L_0x002d:
            r0 = 0
            r2.<init>(r0, r0, r1)
            r2.responseCode = r3
            return
        L_0x0034:
            r1 = 12
            goto L_0x002d
        L_0x0037:
            r1 = 6
            goto L_0x002d
        L_0x0039:
            if (r4 == 0) goto L_0x002d
            java.lang.String r0 = "URL signature expired"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x002d
        L_0x0043:
            r1 = 5
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5BM.<init>(int, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("failed to download; code=");
        A0u.append(this.responseCode);
        A0u.append("; status=");
        return AnonymousClass000.A0q(C133136Wx.A01(this.downloadStatus), A0u);
    }
}

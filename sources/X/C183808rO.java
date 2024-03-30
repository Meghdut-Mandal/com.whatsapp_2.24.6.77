package X;

/* renamed from: X.8rO  reason: invalid class name and case insensitive filesystem */
public final class C183808rO extends C19950wm {
    public final String A00;
    public final AnonymousClass9EU A01;
    public volatile boolean A02;
    public final /* synthetic */ AnonymousClass9SI A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183808rO(AnonymousClass9EU r2, AnonymousClass9SI r3, String str) {
        super("LinkifierThread");
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:12|13|14|(1:16)|17|(2:19|(2:22|20))|23|24|(1:26)(1:36)|27|(1:29)|30|(3:32|(2:35|33)|68)|37|(4:41|(3:43|(3:45|(2:53|70)|54)|69)|55|(2:57|67)(1:66))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ef A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f9 A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100 A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0116 A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136 A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0177 A[Catch:{ InterruptedException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r13 = r16
            boolean r0 = r13.A02     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 != 0) goto L_0x0187
            X.9EU r0 = r13.A01     // Catch:{ InterruptedException -> 0x0187 }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x0187 }
            java.lang.Object r0 = r0.takeLast()     // Catch:{ InterruptedException -> 0x0187 }
            X.9Li r0 = (X.C193409Li) r0     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0005
            java.lang.CharSequence r8 = r0.A03     // Catch:{ InterruptedException -> 0x0187 }
            android.widget.TextView r14 = r0.A00     // Catch:{ InterruptedException -> 0x0187 }
            X.3T1 r10 = r0.A02     // Catch:{ InterruptedException -> 0x0187 }
            X.7gM r9 = r0.A01     // Catch:{ InterruptedException -> 0x0187 }
            java.lang.Object r1 = r14.getTag()     // Catch:{ InterruptedException -> 0x0187 }
            boolean r0 = r1 instanceof X.AnonymousClass3T1     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0184
            X.3T1 r1 = (X.AnonymousClass3T1) r1     // Catch:{ InterruptedException -> 0x0187 }
            X.3Qa r0 = r1.A1J     // Catch:{ InterruptedException -> 0x0187 }
        L_0x002b:
            X.3Qa r4 = r10.A1J     // Catch:{ InterruptedException -> 0x0187 }
            boolean r0 = r4.equals(r0)     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0005
            android.text.SpannableStringBuilder r11 = X.C36441kJ.A0P(r8)     // Catch:{ InterruptedException -> 0x0187 }
            X.9SI r12 = r13.A03     // Catch:{ InterruptedException -> 0x0187 }
            X.1e1 r7 = r12.A05     // Catch:{ InterruptedException -> 0x0187 }
            java.lang.String r1 = r13.A00     // Catch:{ InterruptedException -> 0x0187 }
            r0 = 2
            android.text.util.Linkify.addLinks(r11, r0)     // Catch:{ Exception -> 0x00e9 }
            X.1DU r0 = r7.A02     // Catch:{ Exception -> 0x00e9 }
            r0.A06(r11)     // Catch:{ Exception -> 0x00e9 }
            X.C1901697d.A00(r11, r1)     // Catch:{ Exception -> 0x00e9 }
            X.1EU r1 = r7.A05     // Catch:{ Exception -> 0x00e9 }
            X.1EV r0 = r7.A04     // Catch:{ Exception -> 0x00e9 }
            X.C1901497b.A00(r11, r0, r1)     // Catch:{ Exception -> 0x00e9 }
            X.C1901597c.A00(r11, r0, r1)     // Catch:{ Exception -> 0x00e9 }
            java.util.regex.Pattern r0 = X.C1906099p.A00     // Catch:{ Exception -> 0x00e9 }
            java.util.regex.Matcher r1 = r0.matcher(r11)     // Catch:{ Exception -> 0x00e9 }
            boolean r0 = r1.find()     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x0078
            int r3 = r1.start()     // Catch:{ Exception -> 0x00e9 }
            int r2 = r1.end()     // Catch:{ Exception -> 0x00e9 }
            java.lang.CharSequence r0 = r11.subSequence(r3, r2)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e9 }
            android.text.style.URLSpan r1 = new android.text.style.URLSpan     // Catch:{ Exception -> 0x00e9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e9 }
            r0 = 0
            r11.setSpan(r1, r3, r2, r0)     // Catch:{ Exception -> 0x00e9 }
        L_0x0078:
            X.1eA r0 = r7.A03     // Catch:{ Exception -> 0x00e9 }
            X.0yC r1 = r0.A00     // Catch:{ Exception -> 0x00e9 }
            r0 = 6151(0x1807, float:8.62E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "(?:"
            r1.append(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "R\\$|\\$|S\\/|S\\/\\.|Rp|₪|د\\.إ|TL"
            r1.append(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = ")\\s*\\d+([.,]\\d{2})?\\b"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00e9 }
            java.util.regex.Matcher r5 = r0.matcher(r11)     // Catch:{ Exception -> 0x00e9 }
        L_0x00a0:
            boolean r0 = r5.find()     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00e9
            int r0 = r5.start()     // Catch:{ Exception -> 0x00e9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00e9 }
            int r0 = r5.end()     // Catch:{ Exception -> 0x00e9 }
            android.util.Pair r1 = X.C36341k9.A0I(r1, r0)     // Catch:{ Exception -> 0x00e9 }
            X.9e0 r0 = X.C200739i8.A01     // Catch:{ Exception -> 0x00e9 }
            android.util.Pair r1 = X.C200739i8.A00(r1, r0, r11)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r0 = r1.first     // Catch:{ Exception -> 0x00e9 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ Exception -> 0x00e9 }
            int r3 = X.AnonymousClass000.A0I(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r0 = r1.second     // Catch:{ Exception -> 0x00e9 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ Exception -> 0x00e9 }
            int r2 = X.AnonymousClass000.A0I(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "order:"
            r1.append(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.CharSequence r0 = r11.subSequence(r3, r2)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            android.text.style.URLSpan r1 = new android.text.style.URLSpan     // Catch:{ Exception -> 0x00e9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e9 }
            r0 = 0
            r11.setSpan(r1, r3, r2, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00a0
        L_0x00e9:
            X.1e7 r3 = r7.A00     // Catch:{ InterruptedException -> 0x0187 }
            boolean r0 = r4.A02     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0116
            X.0wQ r0 = r3.A00     // Catch:{ InterruptedException -> 0x0187 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C36441kJ.A0n(r0)     // Catch:{ InterruptedException -> 0x0187 }
        L_0x00f5:
            X.11F r0 = r4.A00     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x00fc
            X.C32741e7.A00(r11, r3, r0, r2)     // Catch:{ InterruptedException -> 0x0187 }
        L_0x00fc:
            java.util.List r0 = r10.A0w     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x011b
            java.util.Iterator r1 = r0.iterator()     // Catch:{ InterruptedException -> 0x0187 }
        L_0x0104:
            boolean r0 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r1.next()     // Catch:{ InterruptedException -> 0x0187 }
            X.3ux r0 = (X.C80163ux) r0     // Catch:{ InterruptedException -> 0x0187 }
            X.11F r0 = r0.A00     // Catch:{ InterruptedException -> 0x0187 }
            X.C32741e7.A00(r11, r3, r0, r2)     // Catch:{ InterruptedException -> 0x0187 }
            goto L_0x0104
        L_0x0116:
            com.whatsapp.jid.UserJid r2 = r10.A0L()     // Catch:{ InterruptedException -> 0x0187 }
            goto L_0x00f5
        L_0x011b:
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            java.util.ArrayList r0 = X.AnonymousClass6YV.A0C(r11)     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.isEmpty()     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 != 0) goto L_0x0005
            int r0 = r11.length()     // Catch:{ InterruptedException -> 0x0187 }
            r6 = 0
            java.lang.Object[] r5 = r11.getSpans(r6, r0, r1)     // Catch:{ InterruptedException -> 0x0187 }
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5     // Catch:{ InterruptedException -> 0x0187 }
            if (r5 == 0) goto L_0x0160
            int r4 = r5.length     // Catch:{ InterruptedException -> 0x0187 }
        L_0x0137:
            if (r6 >= r4) goto L_0x0160
            r3 = r5[r6]     // Catch:{ InterruptedException -> 0x0187 }
            if (r3 == 0) goto L_0x015d
            java.lang.String r2 = r3.getURL()     // Catch:{ InterruptedException -> 0x0187 }
            if (r2 == 0) goto L_0x015d
            X.1e6 r1 = r7.A01     // Catch:{ InterruptedException -> 0x0187 }
            com.whatsapp.jid.UserJid r0 = r10.A0L()     // Catch:{ InterruptedException -> 0x0187 }
            java.util.Set r1 = r1.BFr(r0, r10, r2)     // Catch:{ InterruptedException -> 0x0187 }
            if (r1 == 0) goto L_0x015d
            boolean r0 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 != 0) goto L_0x015d
            X.7vK r0 = new X.7vK     // Catch:{ InterruptedException -> 0x0187 }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x0187 }
            X.C1901997g.A00(r11, r11, r3, r0)     // Catch:{ InterruptedException -> 0x0187 }
        L_0x015d:
            int r6 = r6 + 1
            goto L_0x0137
        L_0x0160:
            X.00v r2 = r12.A01     // Catch:{ InterruptedException -> 0x0187 }
            java.lang.String r1 = r8.toString()     // Catch:{ InterruptedException -> 0x0187 }
            android.text.SpannableStringBuilder r0 = X.C36441kJ.A0P(r11)     // Catch:{ InterruptedException -> 0x0187 }
            r2.A08(r1, r0)     // Catch:{ InterruptedException -> 0x0187 }
            java.lang.Object r0 = r14.getTag()     // Catch:{ InterruptedException -> 0x0187 }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x0187 }
            if (r0 == 0) goto L_0x0005
            X.17Y r0 = r12.A02     // Catch:{ InterruptedException -> 0x0187 }
            r15 = 7
            X.75A r8 = new X.75A     // Catch:{ InterruptedException -> 0x0187 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x0187 }
            r0.A0H(r8)     // Catch:{ InterruptedException -> 0x0187 }
            goto L_0x0005
        L_0x0184:
            r0 = 0
            goto L_0x002b
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183808rO.run():void");
    }
}

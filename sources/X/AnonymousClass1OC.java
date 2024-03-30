package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1OC  reason: invalid class name */
public class AnonymousClass1OC {
    public final C20050ww A00;
    public final AnonymousClass1O7 A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C20060wx A04;
    public final C20810yC A05;
    public final AnonymousClass1BV A06;
    public final AnonymousClass1O9 A07;
    public final AnonymousClass1BS A08;
    public final C19930wk A09;
    public final HashMap A0A = new HashMap();

    public AnonymousClass1OC(C20050ww r3, AnonymousClass1O7 r4, C19970wo r5, C19630wG r6, C20060wx r7, C20810yC r8, AnonymousClass1BV r9, AnonymousClass1O9 r10, AnonymousClass1BS r11, C19770wU r12) {
        C19930wk r1 = new C19930wk(r12, false);
        this.A02 = r5;
        this.A05 = r8;
        this.A03 = r6;
        this.A00 = r3;
        this.A04 = r7;
        this.A08 = r11;
        this.A01 = r4;
        this.A07 = r10;
        this.A06 = r9;
        this.A09 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r5 != null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(android.content.Context r4, java.lang.String r5, java.net.URL r6, int r7) {
        /*
            if (r6 != 0) goto L_0x0005
            r0 = 0
            if (r5 == 0) goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            X.C18740tg.A0C(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r0 = "_"
            r2.append(r0)
            if (r6 == 0) goto L_0x003c
            java.lang.String r1 = r6.toString()
        L_0x001c:
            r0 = 0
            java.lang.String r0 = android.webkit.URLUtil.guessFileName(r1, r0, r0)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            java.io.File r2 = r4.getCacheDir()
            java.lang.String r0 = "ProfilePictureTemp"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
        L_0x003c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "https://pps.whatsapp.net"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A00(android.content.Context, java.lang.String, java.net.URL, int):java.io.File");
    }

    public void A01(C124245xp r19, long j) {
        C124245xp r11 = r19;
        AnonymousClass11F r9 = r11.A03;
        int i = r11.A02;
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(locale, "%s.%d", new Object[]{r9.getRawString(), valueOf});
        HashMap hashMap = this.A0A;
        synchronized (hashMap) {
            AnonymousClass5C0 r4 = (AnonymousClass5C0) hashMap.get(format);
            if (r4 != null) {
                if (!r4.A04.A04.equals(r11.A04)) {
                    AnonymousClass75I.A00(r4, false);
                    hashMap.remove(format);
                }
            }
            String format2 = String.format(locale, "%s.%d", new Object[]{r9.getRawString(), valueOf});
            C164987sh r14 = new C164987sh(this, r11, 7);
            C19970wo r6 = this.A02;
            C20810yC r92 = this.A05;
            C19630wG r7 = this.A03;
            C20050ww r42 = this.A00;
            C20060wx r8 = this.A04;
            AnonymousClass1BS r13 = this.A08;
            AnonymousClass5C0 r3 = new AnonymousClass5C0(r42, this.A01, r6, r7, r8, r92, this.A06, r11, this.A07, r13, r14, format2, j);
            hashMap.put(format2, r3);
            this.A09.execute(r3);
        }
    }
}

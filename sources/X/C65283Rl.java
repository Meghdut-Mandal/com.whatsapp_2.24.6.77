package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Rl  reason: invalid class name and case insensitive filesystem */
public class C65283Rl {
    public static final long A09 = TimeUnit.MINUTES.toMillis(15);
    public long A00;
    public boolean A01;
    public final AnonymousClass13E A02;
    public final C19770wU A03;
    public final List A04 = AnonymousClass001.A0I();
    public final List A05 = AnonymousClass001.A0I();
    public final List A06 = AnonymousClass001.A0I();
    public final C19630wG A07;
    public final C20020wt A08;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.C65283Rl r7) {
        /*
            monitor-enter(r7)
            boolean r0 = r7.A01     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x007e
            java.util.List r4 = r7.A06     // Catch:{ all -> 0x0080 }
            r4.clear()     // Catch:{ all -> 0x0080 }
            java.util.List r0 = r7.A05     // Catch:{ all -> 0x0080 }
            r0.clear()     // Catch:{ all -> 0x0080 }
            java.util.List r0 = r7.A04     // Catch:{ all -> 0x0080 }
            r0.clear()     // Catch:{ all -> 0x0080 }
            X.0wG r0 = r7.A07     // Catch:{ all -> 0x0080 }
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x0080 }
            r0 = 2132017164(0x7f14000c, float:1.9672599E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x007b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x007b }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x007b }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x007b }
            r3.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x007b }
        L_0x002d:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x0071 }
            if (r5 == 0) goto L_0x006d
            java.lang.String r0 = "\t"
            java.lang.String r6 = " "
            java.lang.String r2 = r5.replaceAll(r0, r6)     // Catch:{ IllegalArgumentException -> 0x005e }
            java.lang.String r1 = "^ +| +$|( )+"
            java.lang.String r0 = "$1"
            java.lang.String r0 = r2.replaceAll(r1, r0)     // Catch:{ IllegalArgumentException -> 0x005e }
            java.lang.String[] r2 = android.text.TextUtils.split(r0, r6)     // Catch:{ IllegalArgumentException -> 0x005e }
            if (r2 == 0) goto L_0x0058
            int r1 = r2.length     // Catch:{ IllegalArgumentException -> 0x005e }
            r0 = 3
            if (r1 < r0) goto L_0x0058
            X.0wt r1 = r7.A08     // Catch:{ IllegalArgumentException -> 0x005e }
            X.38N r0 = new X.38N     // Catch:{ IllegalArgumentException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005e }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x005e }
            goto L_0x002d
        L_0x0058:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x005e }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x005e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x005e }
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "domain-fronting-providers/load/bad-line: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)     // Catch:{ all -> 0x0071 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0071 }
            goto L_0x002d
        L_0x006d:
            r3.close()     // Catch:{ UnsupportedEncodingException -> 0x007b }
            goto L_0x007b
        L_0x0071:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ UnsupportedEncodingException -> 0x007b }
        L_0x007a:
            throw r1     // Catch:{ UnsupportedEncodingException -> 0x007b }
        L_0x007b:
            r0 = 1
            r7.A01 = r0     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r7)
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65283Rl.A00(X.3Rl):void");
    }

    public C65283Rl(C19630wG r2, AnonymousClass13E r3, C20020wt r4, C19770wU r5) {
        this.A07 = r2;
        this.A08 = r4;
        this.A03 = r5;
        this.A02 = r3;
    }
}

package X;

import android.content.SharedPreferences;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: X.1Ki  reason: invalid class name and case insensitive filesystem */
public abstract class C26481Ki {
    public int A00;
    public int A01;
    public final C19630wG A02;
    public final C19770wU A03;
    public final Integer A04;
    public final C20050ww A05;
    public final AnonymousClass13E A06;
    public final C21080yd A07;
    public volatile boolean A08 = true;
    public volatile boolean A09 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File A02(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0wG r0 = r3.A02     // Catch:{ all -> 0x0037 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0037 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0037 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0037 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "SimpleAssetDownloader/getAssetDir/Could not make directory "
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x0037 }
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0037 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0037 }
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0035:
            monitor-exit(r3)
            return r2
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26481Ki.A02(java.lang.String):java.io.File");
    }

    public void A03(C160427kz r13, Object obj, String str, Map map) {
        C160427kz r4 = r13;
        if (!this.A09) {
            this.A09 = true;
            this.A08 = false;
            this.A03.Box(new C106985Mc(this.A05, r4, this, this.A06, this.A07, this.A04, obj, str, map), new Void[0]);
        } else if (r13 != null) {
            r13.BQX();
        }
    }

    public String A05(Object obj) {
        return ((SharedPreferences) ((C26491Kj) this).A01.A00.get()).getString("extensions_psl_cache_etag", (String) null);
    }

    public void A06() {
    }

    public void A07() {
    }

    public void A08() {
    }

    public void A09(int i) {
    }

    public void A0A(Object obj, String str) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor A002 = C19420v0.A00(((C26491Kj) this).A01);
        if (str == null) {
            putString = A002.remove("extensions_psl_cache_etag");
        } else {
            putString = A002.putString("extensions_psl_cache_etag", str);
        }
        putString.apply();
    }

    public boolean A0B() {
        return false;
    }

    public boolean A0C(InputStream inputStream, Object obj, Map map) {
        C26491Kj r7 = (C26491Kj) this;
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        byte[] A012 = AnonymousClass0Va.A01(inputStream);
        Charset charset = AnonymousClass0S4.A05;
        String str2 = new String(A012, charset);
        r7.A04.A02(r7.A00, "psl_payload_size", (long) str2.length());
        C26511Kl r4 = r7.A03.A01;
        byte[] bytes = str2.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        synchronized (r4) {
            if (r4.A06) {
                r4.A00.put(str, bytes);
                ((C19930wk) r4.A04.getValue()).execute(new C35491im(r4, bytes, str, 7));
            } else {
                C26511Kl.A00(r4, new C153367Ob(r4, str, bytes));
            }
        }
        return true;
    }

    public boolean A0D(Object obj) {
        if (((SharedPreferences) ((C26491Kj) this).A01.A00.get()).getString("extensions_psl_cache_etag", (String) null) != null) {
            return true;
        }
        return false;
    }

    public boolean A0E(String str, Map map, byte[] bArr) {
        return ((C26491Kj) this).A0I(map, bArr, true);
    }

    public boolean A04(File file) {
        if (file == null || file.list() == null || file.list().length == 0) {
            return true;
        }
        return false;
    }

    public C26481Ki(C20050ww r2, C19630wG r3, AnonymousClass13E r4, C21080yd r5, C19770wU r6, Integer num) {
        this.A02 = r3;
        this.A03 = r6;
        this.A05 = r2;
        this.A07 = r5;
        this.A06 = r4;
        this.A04 = num;
        this.A00 = 1;
        this.A01 = 1;
    }
}

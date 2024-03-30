package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.5Lf  reason: invalid class name and case insensitive filesystem */
public final class C106755Lf extends AnonymousClass12N implements C159467jP {
    public File A00;
    public Executor A01;
    public final C19700wN A02;
    public final C1028051z A03;
    public final C28281Sa A04;
    public final C19970wo A05;
    public final C19630wG A06;
    public final C19770wU A07;
    public final String A08;
    public volatile boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void A01() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = X.C224714l.A02()     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00db
            boolean r0 = r11.A09     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00db
            r11.A09()     // Catch:{ all -> 0x00dd }
            java.io.File r7 = A00(r11)     // Catch:{ all -> 0x00dd }
            r5 = 1
            r4 = 0
            if (r7 == 0) goto L_0x00d9
            boolean r0 = r7.exists()     // Catch:{ all -> 0x00dd }
            if (r0 != r5) goto L_0x00d9
            java.lang.String r10 = "file"
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x00c8 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00c8 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x00c8 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x00c8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00c8 }
            r2.beginObject()     // Catch:{ all -> 0x00c1 }
        L_0x002f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c1 }
            r9 = 0
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = "mappings"
            java.lang.String r0 = r2.nextName()     // Catch:{ all -> 0x00c1 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x002f
            r2.beginArray()     // Catch:{ all -> 0x00c1 }
        L_0x0045:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0082
            r2.beginObject()     // Catch:{ all -> 0x00c1 }
            r8 = r9
            r3 = r9
        L_0x0050:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r2.nextName()     // Catch:{ all -> 0x00c1 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r10)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r8 = r2.nextString()     // Catch:{ all -> 0x00c1 }
            goto L_0x0050
        L_0x0065:
            java.lang.String r0 = "url"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r3 = r2.nextString()     // Catch:{ all -> 0x00c1 }
            goto L_0x0050
        L_0x0072:
            r2.endObject()     // Catch:{ all -> 0x00c1 }
            if (r8 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x008d
            X.5tS r0 = new X.5tS     // Catch:{ all -> 0x00c1 }
            r0.<init>(r8, r9, r3)     // Catch:{ all -> 0x00c1 }
            r6.add(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x0045
        L_0x0082:
            r2.endArray()     // Catch:{ all -> 0x00c1 }
            goto L_0x002f
        L_0x0086:
            java.lang.String r0 = "field not found: file"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x0093
        L_0x008d:
            java.lang.String r0 = "field not found: url"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00c1 }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x0094:
            r2.endObject()     // Catch:{ all -> 0x00c1 }
            r2.close()     // Catch:{ IOException -> 0x00c8 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ IOException -> 0x00c8 }
        L_0x009e:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00c8 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x00c8 }
            X.5tS r2 = (X.C121635tS) r2     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = r2.A00     // Catch:{ IOException -> 0x00c8 }
            boolean r0 = X.C90484aE.A1W(r0)     // Catch:{ IOException -> 0x00c8 }
            if (r0 == 0) goto L_0x009e
            X.51z r1 = r11.A03     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x00c8 }
            r1.A0D(r0, r2)     // Catch:{ IOException -> 0x00c8 }
            goto L_0x009e
        L_0x00ba:
            r6.size()     // Catch:{ IOException -> 0x00c8 }
            r7.getAbsolutePath()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00d9
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x00c8 }
            throw r0     // Catch:{ IOException -> 0x00c8 }
        L_0x00c8:
            r3 = move-exception
            java.lang.String r0 = "DiskBackedGifCache/init/error"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x00dd }
            X.0wN r2 = r11.A02     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "DiskBackedGifCache/load-error"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00dd }
            r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x00dd }
        L_0x00d9:
            r11.A09 = r5     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r11)
            return
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106755Lf.A01():void");
    }

    public final synchronized Executor A09() {
        Executor executor;
        executor = this.A01;
        if (executor == null) {
            executor = C36411kG.A0r(this.A07);
            this.A01 = executor;
        }
        return executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r6.A03.A00.get() < (java.lang.System.currentTimeMillis() - 60000)) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Bjh(X.AnonymousClass5SK r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L_0x0017
            X.51z r0 = r6.A03     // Catch:{ all -> 0x002d }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A00     // Catch:{ all -> 0x002d }
            long r4 = r0.get()     // Catch:{ all -> 0x002d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002d }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
        L_0x0017:
            X.51z r2 = r6.A03     // Catch:{ all -> 0x002d }
            r0 = 0
            r2.A0B(r0)     // Catch:{ all -> 0x002d }
            X.1PN r1 = r2.A02     // Catch:{ all -> 0x002d }
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x002d }
            r0 = 0
            r6.A09 = r0     // Catch:{ all -> 0x002d }
            X.1Sa r0 = r6.A04     // Catch:{ all -> 0x002d }
            r2.A0B(r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r6)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106755Lf.Bjh(X.5SK, boolean):void");
    }

    public static final File A00(C106755Lf r4) {
        String str;
        File file = r4.A00;
        boolean z = true;
        if (file != null && file.exists()) {
            return r4.A00;
        }
        File externalCacheDir = r4.A06.A00.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            z = false;
        }
        if (z) {
            File A0w = C36441kJ.A0w(externalCacheDir, "gif/gif_cache_mem_store");
            if (A0w.exists() || A0w.mkdirs()) {
                File A0w2 = C36441kJ.A0w(A0w, r4.A08);
                r4.A00 = A0w2;
                return A0w2;
            }
            str = "DiskBackedGifCache/getmappingfile/disk cache dir doesn't exit";
        } else {
            str = "DiskBackedGifCache/getmappingfile/external cache dir doesn't exit";
        }
        Log.e(str);
        return null;
    }

    public C121635tS B81(String str) {
        if (str == null) {
            return null;
        }
        A01();
        return this.A03.A0E(str);
    }

    public void Bmb(C121635tS r4, String str) {
        if (str != null) {
            A01();
            this.A03.A0D(str, r4);
            A09().execute(new C80243v5(this, 31));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106755Lf(C19700wN r3, AnonymousClass60T r4, C19970wo r5, C19630wG r6, C220112n r7, C19770wU r8, String str, int i) {
        super(r7);
        C36321k7.A1B(r5, r7, r6, r3, r8);
        AnonymousClass00C.A0D(r4, 6);
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r3;
        this.A07 = r8;
        this.A08 = str;
        C143746r3 r1 = new C143746r3(this);
        this.A04 = r1;
        C1028051z A002 = r4.A00(i);
        this.A03 = A002;
        A002.A0B(r1);
        A08();
    }

    public String BHv() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A08);
        A0u.append(':');
        AnonymousClass1PN r1 = this.A03.A02;
        A0u.append(r1.A02());
        A0u.append('/');
        return C36381kD.A10(A0u, r1.A01());
    }
}

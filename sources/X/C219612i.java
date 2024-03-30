package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.12i  reason: invalid class name and case insensitive filesystem */
public class C219612i {
    public final C19770wU A00;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final C19970wo A03;
    public final AnonymousClass12g A04;
    public final AnonymousClass12P A05;

    public void A02(String str) {
        AnonymousClass1M0 A052 = this.A05.A05();
        try {
            AnonymousClass14m.A01(A052.A02, str);
            A052.close();
            synchronized (this.A01) {
                this.A02.remove(str);
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C219612i(C19970wo r2, AnonymousClass12g r3, AnonymousClass12P r4, C19770wU r5) {
        this.A03 = r2;
        this.A00 = r5;
        this.A04 = r3;
        this.A05 = r4;
    }

    public long A00(String str, long j) {
        String A012 = A01(str);
        if (A012 == null) {
            return j;
        }
        return Long.parseLong(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = r10.A05.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r4.A02.A09("SELECT value FROM props WHERE key = ?", "GET_PROP_VALUE", new java.lang.String[]{r11});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r2.moveToNext() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = r2.getString(r2.getColumnIndexOrThrow("value"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.put(r11, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r10.A04.A01("PropsMessageStore/getProp", android.os.SystemClock.uptimeMillis() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r11) {
        /*
            r10 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r6 = r10.A01
            monitor-enter(r6)
            java.util.Map r7 = r10.A02     // Catch:{ all -> 0x0072 }
            boolean r0 = r7.containsKey(r11)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r7.get(r11)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return r0
        L_0x0017:
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            r5 = 0
            X.12P r0 = r10.A05     // Catch:{ all -> 0x0070 }
            X.1M0 r4 = r0.get()     // Catch:{ all -> 0x0070 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "SELECT value FROM props WHERE key = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0066 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "GET_PROP_VALUE"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0066 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "value"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r5 = r2.getString(r0)     // Catch:{ all -> 0x005a }
        L_0x003f:
            r2.close()     // Catch:{ all -> 0x0066 }
            r4.close()     // Catch:{ all -> 0x0070 }
            monitor-enter(r6)
            r7.put(r11, r5)     // Catch:{ all -> 0x0057 }
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            X.12g r3 = r10.A04
            java.lang.String r2 = "PropsMessageStore/getProp"
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r3.A01(r2, r0)
            return r5
        L_0x0057:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            throw r0
        L_0x005a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0070 }
        L_0x006f:
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            throw r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219612i.A01(java.lang.String):java.lang.String");
    }

    public void A03(String str, long j) {
        A04(str, String.valueOf(j));
    }

    public void A04(String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass1M0 A052 = this.A05.A05();
        try {
            AnonymousClass14m.A03(A052.A02, str, str2, "PropsMessageStore");
            A052.close();
            synchronized (this.A01) {
                this.A02.put(str, str2);
            }
            this.A04.A01("PropsMessageStore/setProp", SystemClock.uptimeMillis() - uptimeMillis);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}

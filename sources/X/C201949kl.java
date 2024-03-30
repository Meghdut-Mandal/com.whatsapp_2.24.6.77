package X;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.9kl  reason: invalid class name and case insensitive filesystem */
public class C201949kl {
    public static Object A00;
    public static HashMap A01;
    public static final HashMap A02 = AnonymousClass001.A0J();
    public static final HashMap A03 = AnonymousClass001.A0J();
    public static final AtomicBoolean A04 = new AtomicBoolean();
    public static final Pattern A05 = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern A06 = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final Uri A07 = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri A08 = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final HashMap A09 = AnonymousClass001.A0J();
    public static final HashMap A0A = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r2 = r5.query(A07, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r11}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r2.moveToFirst() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r3 != A00) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        A01.put(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r1 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        if (r3 != A00) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        A01.put(r11, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0068, code lost:
        if (r2 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.ContentResolver r10, java.lang.String r11) {
        /*
            java.lang.Class<X.9kl> r4 = X.C201949kl.class
            monitor-enter(r4)
            r5 = r10
            A01(r10)     // Catch:{ all -> 0x006e }
            java.lang.Object r3 = A00     // Catch:{ all -> 0x006e }
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x006e }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x006e }
            r7 = 0
            if (r0 == 0) goto L_0x001d
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x006e }
            java.lang.String r0 = X.C90504aG.A0l(r11, r0)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x001b
            r7 = r0
        L_0x001b:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return r7
        L_0x001d:
            r0 = 0
            r1 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            android.net.Uri r6 = A07
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r0] = r11
            r10 = r7
            r8 = r7
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0053
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1.equals(r7)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0041
            r1 = r7
        L_0x0041:
            monitor-enter(r4)     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x0050 }
            if (r3 != r0) goto L_0x004b
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x0050 }
            r0.put(r11, r1)     // Catch:{ all -> 0x0050 }
        L_0x004b:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0060
            r7 = r1
            goto L_0x0060
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            goto L_0x0066
        L_0x0053:
            monitor-enter(r4)     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x0064 }
            if (r3 != r0) goto L_0x005d
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x0064 }
            r0.put(r11, r7)     // Catch:{ all -> 0x0064 }
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x0063
        L_0x0060:
            r2.close()
        L_0x0063:
            return r7
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            if (r2 == 0) goto L_0x006d
            r2.close()
        L_0x006d:
            throw r0
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201949kl.A00(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static void A01(ContentResolver contentResolver) {
        if (A01 == null) {
            A04.set(false);
            A01 = AnonymousClass001.A0J();
            A00 = C36441kJ.A11();
            contentResolver.registerContentObserver(A07, true, new C165687tz());
        } else if (A04.getAndSet(false)) {
            A01.clear();
            A02.clear();
            A09.clear();
            A03.clear();
            A0A.clear();
            A00 = C36441kJ.A11();
        }
    }
}

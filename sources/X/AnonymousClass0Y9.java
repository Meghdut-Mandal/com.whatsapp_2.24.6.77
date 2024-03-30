package X;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Y9  reason: invalid class name */
public abstract class AnonymousClass0Y9 {
    public static final AtomicInteger A06 = new AtomicInteger();
    public static final Object A07 = new Object();
    public static final AtomicReference A08 = new AtomicReference();
    public static volatile AnonymousClass0QR A09;
    public final AnonymousClass0WY A00;
    public final String A01;
    public final Object A02;
    public final boolean A03;
    public volatile int A04 = -1;
    public volatile Object A05;

    public abstract Object A03(Object obj);

    public static void A00(Context context) {
        Context context2;
        if (A09 == null) {
            synchronized (A07) {
                if (A09 == null) {
                    AnonymousClass0QR r1 = A09;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (r1 == null || ((C04730Lu) r1).A00 != context) {
                        synchronized (C07100Wi.class) {
                            try {
                                Map map = C07100Wi.A07;
                                Iterator A0z = AnonymousClass000.A0z(map);
                                while (A0z.hasNext()) {
                                    C07100Wi r0 = (C07100Wi) A0z.next();
                                    r0.A00.unregisterContentObserver(r0.A01);
                                }
                                map.clear();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        synchronized (AnonymousClass0RN.class) {
                            try {
                                Map map2 = AnonymousClass0RN.A00;
                                Iterator A0z2 = AnonymousClass000.A0z(map2);
                                if (!A0z2.hasNext()) {
                                    map2.clear();
                                } else {
                                    A0z2.next();
                                    throw AnonymousClass001.A0A("zzb");
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        synchronized (AnonymousClass0WW.class) {
                            try {
                                AnonymousClass0WW r02 = AnonymousClass0WW.A02;
                                if (!(r02 == null || (context2 = r02.A00) == null || r02.A01 == null)) {
                                    context2.getContentResolver().unregisterContentObserver(AnonymousClass0WW.A02.A01);
                                }
                                AnonymousClass0WW.A02 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        A09 = new C04730Lu(context, new AnonymousClass0eR(new C10540eQ(context)));
                        A06.incrementAndGet();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.0Tt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: X.0Tk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.0Tt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: X.0Tt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: X.0Tk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: X.0Tk} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(5:20|21|22|23|24)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0107, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x010a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x010b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(r7)), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        android.os.StrictMode.setThreadPolicy(r12);
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x00fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0071 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x010b A[ExcHandler: IllegalStateException | NullPointerException | SecurityException (r2v11 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:101:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x011e A[Catch:{ SecurityException -> 0x00fa, IllegalStateException | NullPointerException | SecurityException -> 0x010b, IllegalStateException | NullPointerException | SecurityException -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0129 A[SYNTHETIC, Splitter:B:126:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0139 A[Catch:{ SecurityException -> 0x00fa, IllegalStateException | NullPointerException | SecurityException -> 0x010b, IllegalStateException | NullPointerException | SecurityException -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:43:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00b6 A[Catch:{ SecurityException -> 0x00fa, IllegalStateException | NullPointerException | SecurityException -> 0x010b, IllegalStateException | NullPointerException | SecurityException -> 0x010b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02() {
        /*
            r13 = this;
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x000b
            java.lang.String r1 = r13.A01
            java.lang.String r0 = "flagName must not be null"
            java.util.Objects.requireNonNull(r1, r0)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = A06
            int r5 = r0.get()
            int r0 = r13.A04
            if (r0 >= r5) goto L_0x0192
            monitor-enter(r13)
            int r0 = r13.A04     // Catch:{ all -> 0x018f }
            if (r0 >= r5) goto L_0x018d
            X.0QR r4 = A09     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            if (r4 == 0) goto L_0x0180
            X.0WY r8 = r13.A00     // Catch:{ all -> 0x018f }
            android.net.Uri r6 = r8.A00     // Catch:{ all -> 0x018f }
            r3 = 0
            if (r6 == 0) goto L_0x0164
            X.0Lu r4 = (X.C04730Lu) r4     // Catch:{ all -> 0x018f }
            android.content.Context r9 = r4.A00     // Catch:{ all -> 0x018f }
            boolean r0 = X.AnonymousClass0W0.A00(r9, r6)     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0053
            android.content.ContentResolver r10 = r9.getContentResolver()     // Catch:{ all -> 0x018f }
            X.0hQ r7 = X.C12050hQ.A00     // Catch:{ all -> 0x018f }
            java.lang.Class<X.0Wi> r2 = X.C07100Wi.class
            monitor-enter(r2)     // Catch:{ all -> 0x018f }
            java.util.Map r1 = X.C07100Wi.A07     // Catch:{ all -> 0x004f }
            java.lang.Object r11 = r1.get(r6)     // Catch:{ all -> 0x004f }
            X.0Wi r11 = (X.C07100Wi) r11     // Catch:{ all -> 0x004f }
            if (r11 != 0) goto L_0x004d
            X.0Wi r0 = new X.0Wi     // Catch:{ SecurityException -> 0x004d }
            r0.<init>(r10, r6, r7)     // Catch:{ SecurityException -> 0x004d }
            r1.put(r6, r0)     // Catch:{ SecurityException -> 0x004c }
        L_0x004c:
            r11 = r0
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0184
        L_0x0053:
            r11 = r3
        L_0x0054:
            if (r11 == 0) goto L_0x00b3
            java.lang.String r10 = r13.A01     // Catch:{ all -> 0x018f }
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x00a0
            java.lang.Object r7 = r11.A03     // Catch:{ all -> 0x018f }
            monitor-enter(r7)     // Catch:{ all -> 0x018f }
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x009a
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x009c }
            X.0Tk r0 = new X.0Tk     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            r0.<init>(r11)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            java.lang.Object r0 = r0.A00()     // Catch:{ SecurityException -> 0x0071, SQLiteException | IllegalStateException | SecurityException -> 0x0084, SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            goto L_0x007c
        L_0x0071:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x007f }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
        L_0x007c:
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            goto L_0x0095
        L_0x007f:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
            throw r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0084 }
        L_0x0084:
            java.lang.String r1 = "ConfigurationContentLdr"
            java.lang.String r0 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0090 }
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x009c }
            r0 = 0
            goto L_0x0098
        L_0x0090:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x0095:
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x009c }
        L_0x0098:
            r11.A06 = r0     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r7)     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009c }
            goto L_0x0184
        L_0x00a0:
            if (r0 != 0) goto L_0x00a6
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x018f }
        L_0x00a6:
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r2 = r13.A03(r0)     // Catch:{ all -> 0x018f }
            goto L_0x00b4
        L_0x00b3:
            r2 = r3
        L_0x00b4:
            if (r2 != 0) goto L_0x012b
            boolean r0 = r8.A01     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0126
            java.lang.Class<X.0WW> r8 = X.AnonymousClass0WW.class
            monitor-enter(r8)     // Catch:{ all -> 0x018f }
            X.0WW r1 = X.AnonymousClass0WW.A02     // Catch:{ all -> 0x0123 }
            if (r1 != 0) goto L_0x00dc
            java.lang.String r7 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0123 }
            int r1 = android.os.Process.myUid()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0123 }
            int r0 = X.C05320Pg.A00(r9, r7, r0, r2, r1)     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x00de
            X.0WW r1 = new X.0WW     // Catch:{ all -> 0x0123 }
            r1.<init>(r9)     // Catch:{ all -> 0x0123 }
        L_0x00da:
            X.AnonymousClass0WW.A02 = r1     // Catch:{ all -> 0x0123 }
        L_0x00dc:
            monitor-exit(r8)     // Catch:{ all -> 0x0123 }
            goto L_0x00e4
        L_0x00de:
            X.0WW r1 = new X.0WW     // Catch:{ all -> 0x0123 }
            r1.<init>()     // Catch:{ all -> 0x0123 }
            goto L_0x00da
        L_0x00e4:
            java.lang.String r7 = r13.A01     // Catch:{ all -> 0x018f }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x011b
            boolean r0 = X.AnonymousClass0YS.A01(r0)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x011b
            X.0Tt r0 = new X.0Tt     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            r0.<init>(r1, r7)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            java.lang.String r0 = r0.A00()     // Catch:{ SecurityException -> 0x00fa, IllegalStateException | NullPointerException | SecurityException -> 0x010b, IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            goto L_0x011c
        L_0x00fa:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x0106 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            goto L_0x011c
        L_0x0106:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
            throw r0     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x010b }
        L_0x010b:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "Unable to read GServices for: "
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "GservicesLoader"
            android.util.Log.e(r0, r1, r2)     // Catch:{ all -> 0x018f }
        L_0x011b:
            r0 = r3
        L_0x011c:
            if (r0 == 0) goto L_0x0126
            java.lang.Object r2 = r13.A03(r0)     // Catch:{ all -> 0x018f }
            goto L_0x0127
        L_0x0123:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0123 }
            goto L_0x0184
        L_0x0126:
            r2 = r3
        L_0x0127:
            if (r2 != 0) goto L_0x012b
            java.lang.Object r2 = r13.A02     // Catch:{ all -> 0x018f }
        L_0x012b:
            X.0qH r0 = r4.A01     // Catch:{ all -> 0x018f }
            java.lang.Object r1 = r0.ByC()     // Catch:{ all -> 0x018f }
            X.0fH r1 = (X.C10820fH) r1     // Catch:{ all -> 0x018f }
            boolean r0 = r1.A01()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x018f }
            X.0SS r0 = (X.AnonymousClass0SS) r0     // Catch:{ all -> 0x018f }
            java.lang.String r4 = ""
            java.lang.String r2 = r13.A01     // Catch:{ all -> 0x018f }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x018f }
            X.007 r0 = r0.A00     // Catch:{ all -> 0x018f }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x018f }
            X.007 r1 = (X.AnonymousClass007) r1     // Catch:{ all -> 0x018f }
            if (r1 == 0) goto L_0x015f
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x018f }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x018f }
        L_0x015f:
            if (r3 != 0) goto L_0x0185
            java.lang.Object r2 = r13.A02     // Catch:{ all -> 0x018f }
            goto L_0x0189
        L_0x0164:
            boolean r0 = X.AnonymousClass0YS.A00()     // Catch:{ all -> 0x018f }
            r1 = 0
            if (r0 != 0) goto L_0x0184
            java.lang.Class<X.0RN> r2 = X.AnonymousClass0RN.class
            monitor-enter(r2)     // Catch:{ all -> 0x018f }
            java.util.Map r0 = X.AnonymousClass0RN.A00     // Catch:{ all -> 0x017d }
            r0.get(r3)     // Catch:{ all -> 0x017d }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x017d }
            throw r3     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x017d }
            throw r0     // Catch:{ all -> 0x017d }
        L_0x017d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017d }
            goto L_0x0184
        L_0x0180:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x018f }
        L_0x0184:
            throw r1     // Catch:{ all -> 0x018f }
        L_0x0185:
            java.lang.Object r2 = r13.A03(r3)     // Catch:{ all -> 0x018f }
        L_0x0189:
            r13.A05 = r2     // Catch:{ all -> 0x018f }
            r13.A04 = r5     // Catch:{ all -> 0x018f }
        L_0x018d:
            monitor-exit(r13)     // Catch:{ all -> 0x018f }
            goto L_0x0192
        L_0x018f:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x018f }
            throw r0
        L_0x0192:
            java.lang.Object r0 = r13.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y9.A02():java.lang.Object");
    }

    public /* synthetic */ AnonymousClass0Y9(AnonymousClass0WY r2, Object obj, String str) {
        if (r2.A00 != null) {
            this.A00 = r2;
            this.A01 = str;
            this.A02 = obj;
            this.A03 = true;
            return;
        }
        throw AnonymousClass001.A08("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void A01(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(": ");
        sb.append((String) obj);
        Log.e("PhenotypeFlag", sb.toString());
    }
}

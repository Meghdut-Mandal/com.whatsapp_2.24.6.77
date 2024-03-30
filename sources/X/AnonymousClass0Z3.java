package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0Z3  reason: invalid class name */
public final class AnonymousClass0Z3 {
    public static int A01 = -1;
    public static AnonymousClass0ML A02;
    public static AnonymousClass0MM A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public static final C16880qF A08 = new C10530eP();
    public static final C16880qF A09 = new AnonymousClass0eO();
    public static final ThreadLocal A0A = new ThreadLocal();
    public static final C17100qi A0B = new C10510eM();
    public static final ThreadLocal A0C = new C13260ja();
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ca, code lost:
        throw new X.AnonymousClass0OB("V2 version check failed", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3 A[Catch:{ all -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r8 = 0
            java.lang.ThreadLocal r0 = A0C     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r0 = "api"
            r1 = 1
            if (r1 == r11) goto L_0x0019
            r3 = r0
        L_0x0019:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            android.net.Uri$Builder r3 = r0.appendPath(r10)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.String r2 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r2, r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r10 = r8
            r11 = r8
            r9 = r8
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            if (r3 == 0) goto L_0x00a1
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00a1
            r4 = 0
            int r5 = r3.getInt(r4)     // Catch:{ Exception -> 0x00b8 }
            if (r5 <= 0) goto L_0x0096
            java.lang.Class<X.0Z3> r2 = X.AnonymousClass0Z3.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00b8 }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0092 }
            A06 = r0     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "loaderVersion"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x006e
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0092 }
            A01 = r0     // Catch:{ all -> 0x0092 }
        L_0x006e:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x0080
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x007d
            r1 = 0
        L_0x007d:
            A07 = r1     // Catch:{ all -> 0x0092 }
            r4 = r1
        L_0x0080:
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            java.lang.ThreadLocal r0 = A0A     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00b8 }
            X.0WK r1 = (X.AnonymousClass0WK) r1     // Catch:{ Exception -> 0x00b8 }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00b8 }
            if (r0 != 0) goto L_0x0096
            r1.A00 = r3     // Catch:{ Exception -> 0x00b8 }
            goto L_0x0095
        L_0x0092:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            goto L_0x00b7
        L_0x0095:
            r3 = r8
        L_0x0096:
            if (r12 == 0) goto L_0x009b
            if (r4 == 0) goto L_0x009b
            goto L_0x00b0
        L_0x009b:
            if (r3 == 0) goto L_0x00a0
            r3.close()
        L_0x00a0:
            return r5
        L_0x00a1:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.0OB r1 = new X.0OB     // Catch:{ Exception -> 0x00b8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00b7
        L_0x00b0:
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.0OB r1 = new X.0OB     // Catch:{ Exception -> 0x00b8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b7:
            throw r1     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            r2 = move-exception
            goto L_0x00be
        L_0x00ba:
            r0 = move-exception
            throw r0
        L_0x00bc:
            r2 = move-exception
            r3 = r8
        L_0x00be:
            boolean r0 = r2 instanceof X.AnonymousClass0OB     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c3
            throw r2     // Catch:{ all -> 0x00cb }
        L_0x00c3:
            java.lang.String r1 = "V2 version check failed"
            X.0OB r0 = new X.0OB     // Catch:{ all -> 0x00cb }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d1
            r3.close()
        L_0x00d1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z3.A02(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void A07(ClassLoader classLoader) {
        AnonymousClass0MM r3 = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof AnonymousClass0MM) {
                    r3 = (AnonymousClass0MM) queryLocalInterface;
                } else {
                    r3 = new AnonymousClass0MM(iBinder);
                }
            }
            A03 = r3;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new AnonymousClass0OB("Failed to instantiate dynamite loader", e);
        }
    }

    public static int A00(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("com.google.android.gms.dynamite.descriptors.");
            A0u.append(str);
            Class<?> loadClass = classLoader.loadClass(AnonymousClass000.A0q(".ModuleDescriptor", A0u));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AnonymousClass0QM.A00(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Module descriptor id '");
            A0u2.append(valueOf);
            A0u2.append("' didn't match expected id '");
            A0u2.append(str);
            Log.e("DynamiteModule", AnonymousClass000.A0q("'", A0u2));
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("Local module descriptor class for ");
            A0u3.append(str);
            A0u3.append(" not found.");
            AnonymousClass000.A1A(A0u3, "DynamiteModule");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int A01(android.content.Context r19, java.lang.String r20, boolean r21) {
        /*
            r4 = r19
            java.lang.Class<X.0Z3> r19 = X.AnonymousClass0Z3.class
            monitor-enter(r19)     // Catch:{ all -> 0x02b1 }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x02aa }
            r3 = 0
            r5 = 0
            r8 = r20
            r7 = r21
            if (r0 != 0) goto L_0x0198
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r6 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.Class r18 = r6.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            monitor-enter(r18)     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x0177 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x0177 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0177 }
            if (r1 != r0) goto L_0x003d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0177 }
        L_0x003a:
            monitor-exit(r18)     // Catch:{ all -> 0x0177 }
            goto L_0x0196
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            A07(r1)     // Catch:{ 0OB -> 0x0042 }
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0177 }
            goto L_0x003a
        L_0x0045:
            boolean r0 = A08(r4)     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x004e
            monitor-exit(r18)     // Catch:{ all -> 0x0177 }
            goto L_0x0170
        L_0x004e:
            boolean r0 = A07     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0165
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0177 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0165
            r0 = 1
            int r17 = A02(r4, r8, r7, r0)     // Catch:{ 0OB -> 0x015a }
            java.lang.String r0 = A06     // Catch:{ 0OB -> 0x015a }
            if (r0 == 0) goto L_0x0174
            boolean r0 = r0.isEmpty()     // Catch:{ 0OB -> 0x015a }
            if (r0 != 0) goto L_0x0174
            java.lang.Class<X.0P8> r16 = X.AnonymousClass0P8.class
            monitor-enter(r16)     // Catch:{ 0OB -> 0x015a }
            java.lang.ClassLoader r0 = X.AnonymousClass0P8.A00     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0124
            java.lang.Thread r0 = X.AnonymousClass0P8.A01     // Catch:{ all -> 0x0120 }
            r15 = 0
            if (r0 != 0) goto L_0x00fb
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00f3 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x00f3 }
            java.lang.ThreadGroup r13 = r0.getThreadGroup()     // Catch:{ all -> 0x00f3 }
            if (r13 != 0) goto L_0x0085
            r9 = r3
            goto L_0x00f5
        L_0x0085:
            java.lang.Class<java.lang.Void> r14 = java.lang.Void.class
            monitor-enter(r14)     // Catch:{ all -> 0x00f3 }
            int r10 = r13.activeGroupCount()     // Catch:{ SecurityException -> 0x00d7 }
            java.lang.ThreadGroup[] r9 = new java.lang.ThreadGroup[r10]     // Catch:{ SecurityException -> 0x00d7 }
            r13.enumerate(r9)     // Catch:{ SecurityException -> 0x00d7 }
            r12 = 0
            r2 = 0
        L_0x0093:
            if (r2 >= r10) goto L_0x00a6
            r11 = r9[r2]     // Catch:{ SecurityException -> 0x00d7 }
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r11.getName()     // Catch:{ SecurityException -> 0x00d7 }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00d7 }
            if (r0 != 0) goto L_0x00ad
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a6:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r11 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00d7 }
            r11.<init>(r13, r0)     // Catch:{ SecurityException -> 0x00d7 }
        L_0x00ad:
            int r10 = r11.activeCount()     // Catch:{ SecurityException -> 0x00d7 }
            java.lang.Thread[] r2 = new java.lang.Thread[r10]     // Catch:{ SecurityException -> 0x00d7 }
            r11.enumerate(r2)     // Catch:{ SecurityException -> 0x00d7 }
        L_0x00b6:
            if (r12 >= r10) goto L_0x00c9
            r9 = r2[r12]     // Catch:{ SecurityException -> 0x00d7 }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r9.getName()     // Catch:{ SecurityException -> 0x00d7 }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00d7 }
            if (r0 != 0) goto L_0x00ee
            int r12 = r12 + 1
            goto L_0x00b6
        L_0x00c9:
            X.0jW r9 = new X.0jW     // Catch:{ SecurityException -> 0x00d7 }
            r9.<init>(r11)     // Catch:{ SecurityException -> 0x00d7 }
            r9.setContextClassLoader(r3)     // Catch:{ SecurityException -> 0x00d5 }
            r9.start()     // Catch:{ SecurityException -> 0x00d5 }
            goto L_0x00ee
        L_0x00d5:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r0 = move-exception
            r9 = r3
        L_0x00d9:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "Failed to enumerate thread/threadgroup "
            r1.append(r0)     // Catch:{ all -> 0x00f0 }
            r1.append(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "DynamiteLoaderV2CL"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r14)     // Catch:{ all -> 0x00f0 }
            goto L_0x00f5
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            goto L_0x011f
        L_0x00f5:
            X.AnonymousClass0P8.A01 = r9     // Catch:{ all -> 0x0120 }
            java.lang.Thread r0 = X.AnonymousClass0P8.A01     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0122
        L_0x00fb:
            java.lang.Thread r9 = X.AnonymousClass0P8.A01     // Catch:{ all -> 0x0120 }
            monitor-enter(r9)     // Catch:{ all -> 0x0120 }
            java.lang.Thread r0 = X.AnonymousClass0P8.A01     // Catch:{ SecurityException -> 0x0105 }
            java.lang.ClassLoader r15 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x0105 }
            goto L_0x011b
        L_0x0105:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x011d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "Failed to get thread context classloader "
            r1.append(r0)     // Catch:{ all -> 0x011d }
            r1.append(r2)     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "DynamiteLoaderV2CL"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r9)     // Catch:{ all -> 0x011d }
            goto L_0x0122
        L_0x011d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x011d }
        L_0x011f:
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0122:
            X.AnonymousClass0P8.A00 = r15     // Catch:{ all -> 0x0157 }
        L_0x0124:
            java.lang.ClassLoader r2 = X.AnonymousClass0P8.A00     // Catch:{ all -> 0x0157 }
            monitor-exit(r16)     // Catch:{ 0OB -> 0x015a }
            if (r2 != 0) goto L_0x013d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ 0OB -> 0x015a }
            r0 = 29
            if (r1 < r0) goto L_0x0148
            java.lang.String r1 = A06     // Catch:{ 0OB -> 0x015a }
            X.AnonymousClass006.A01(r1)     // Catch:{ 0OB -> 0x015a }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 0OB -> 0x015a }
            dalvik.system.DelegateLastClassLoader r2 = new dalvik.system.DelegateLastClassLoader     // Catch:{ 0OB -> 0x015a }
            r2.<init>(r1, r0)     // Catch:{ 0OB -> 0x015a }
        L_0x013d:
            A07(r2)     // Catch:{ 0OB -> 0x015a }
            r6.set(r3, r2)     // Catch:{ 0OB -> 0x015a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 0OB -> 0x015a }
            A04 = r0     // Catch:{ 0OB -> 0x015a }
            goto L_0x0172
        L_0x0148:
            java.lang.String r1 = A06     // Catch:{ 0OB -> 0x015a }
            X.AnonymousClass006.A01(r1)     // Catch:{ 0OB -> 0x015a }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 0OB -> 0x015a }
            X.0NV r2 = new X.0NV     // Catch:{ 0OB -> 0x015a }
            r2.<init>(r1, r0)     // Catch:{ 0OB -> 0x015a }
            goto L_0x013d
        L_0x0157:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ 0OB -> 0x015a }
            throw r0     // Catch:{ 0OB -> 0x015a }
        L_0x015a:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0177 }
            r6.set(r3, r0)     // Catch:{ all -> 0x0177 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0177 }
            goto L_0x003a
        L_0x0165:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0177 }
            r6.set(r3, r0)     // Catch:{ all -> 0x0177 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0177 }
            goto L_0x003a
        L_0x0170:
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            return r5
        L_0x0172:
            monitor-exit(r18)     // Catch:{ all -> 0x0177 }
            goto L_0x0175
        L_0x0174:
            monitor-exit(r18)     // Catch:{ all -> 0x0177 }
        L_0x0175:
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            return r17
        L_0x0177:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x017e, IllegalAccessException -> 0x017c, NoSuchFieldException -> 0x017a }
        L_0x017a:
            r0 = move-exception
            goto L_0x017f
        L_0x017c:
            r0 = move-exception
            goto L_0x017f
        L_0x017e:
            r0 = move-exception
        L_0x017f:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x02aa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = "Failed to load module via V2: "
            r1.append(r0)     // Catch:{ all -> 0x02aa }
            r1.append(r2)     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x02aa }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02aa }
        L_0x0196:
            A04 = r0     // Catch:{ all -> 0x02aa }
        L_0x0198:
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x01bb
            int r0 = A02(r4, r8, r7, r5)     // Catch:{ 0OB -> 0x01a4 }
            return r0
        L_0x01a4:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02b1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r1.append(r0)     // Catch:{ all -> 0x02b1 }
            r1.append(r2)     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x02b1 }
            return r5
        L_0x01bb:
            X.0ML r6 = A05(r4)     // Catch:{ all -> 0x02b1 }
            if (r6 == 0) goto L_0x02a9
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            java.lang.String r2 = r6.A00     // Catch:{ RemoteException -> 0x0286 }
            r1.writeInterfaceToken(r2)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 6
            android.os.Parcel r0 = r6.A00(r0, r1)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            r0 = 3
            if (r1 < r0) goto L_0x0243
            java.lang.ThreadLocal r11 = A0A     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r0 = r11.get()     // Catch:{ RemoteException -> 0x0286 }
            X.0WK r0 = (X.AnonymousClass0WK) r0     // Catch:{ RemoteException -> 0x0286 }
            if (r0 == 0) goto L_0x01ec
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0286 }
            if (r0 == 0) goto L_0x01ec
            int r5 = r0.getInt(r5)     // Catch:{ RemoteException -> 0x0286 }
            return r5
        L_0x01ec:
            X.0LR r10 = new X.0LR     // Catch:{ RemoteException -> 0x0286 }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            java.lang.ThreadLocal r0 = A0C     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0286 }
            long r0 = r0.longValue()     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r9, r10, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r9.writeLong(r0)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r9, r6, r0)     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r6 = X.AnonymousClass0LR.A00(r0)     // Catch:{ RemoteException -> 0x0286 }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x0286 }
            if (r6 == 0) goto L_0x0233
            boolean r0 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            if (r0 == 0) goto L_0x0233
            int r2 = r6.getInt(r5)     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            if (r2 <= 0) goto L_0x022f
            java.lang.Object r1 = r11.get()     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            X.0WK r1 = (X.AnonymousClass0WK) r1     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            if (r1 == 0) goto L_0x022f
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            if (r0 != 0) goto L_0x022f
            r1.A00 = r6     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            return r2
        L_0x022f:
            r6.close()     // Catch:{ all -> 0x02b1 }
            return r2
        L_0x0233:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0240, all -> 0x02a4 }
            if (r6 == 0) goto L_0x02a9
            r6.close()     // Catch:{ all -> 0x02b1 }
            return r5
        L_0x0240:
            r0 = move-exception
            r3 = r6
            goto L_0x0287
        L_0x0243:
            r0 = 2
            if (r1 != r0) goto L_0x0266
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0286 }
            X.0LR r0 = new X.0LR     // Catch:{ RemoteException -> 0x0286 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r1, r0, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 5
            android.os.Parcel r0 = r6.A00(r0, r1)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            return r1
        L_0x0266:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0286 }
            X.0LR r0 = new X.0LR     // Catch:{ RemoteException -> 0x0286 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r1, r0, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 3
            android.os.Parcel r0 = r6.A00(r0, r1)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            return r1
        L_0x0286:
            r0 = move-exception
        L_0x0287:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r1.append(r0)     // Catch:{ all -> 0x02a2 }
            r1.append(r2)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x02a2 }
            if (r3 == 0) goto L_0x02a9
            r3.close()     // Catch:{ all -> 0x02b1 }
            return r5
        L_0x02a2:
            r0 = move-exception
            goto L_0x02a6
        L_0x02a4:
            r0 = move-exception
            r3 = r6
        L_0x02a6:
            if (r3 == 0) goto L_0x02b0
            goto L_0x02ad
        L_0x02a9:
            return r5
        L_0x02aa:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            goto L_0x02b0
        L_0x02ad:
            r3.close()     // Catch:{ all -> 0x02b1 }
        L_0x02b0:
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            r3 = move-exception
            X.AnonymousClass006.A01(r4)     // Catch:{ Exception -> 0x02b9 }
            X.AnonymousClass006.A01(r3)     // Catch:{ Exception -> 0x02b9 }
            throw r3
        L_0x02b9:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z3.A01(android.content.Context, java.lang.String, boolean):int");
    }

    public static AnonymousClass0Z3 A04(Context context, C16880qF r20, String str) {
        AnonymousClass0OB r1;
        AnonymousClass0Z3 r10;
        int i;
        AnonymousClass0OB r12;
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        AnonymousClass0MM r15;
        Boolean valueOf;
        IObjectWrapper A032;
        Class<AnonymousClass0Z3> cls = AnonymousClass0Z3.class;
        ThreadLocal threadLocal = A0A;
        Object obj = threadLocal.get();
        AnonymousClass0WK r8 = new AnonymousClass0WK((AnonymousClass0OT) null);
        threadLocal.set(r8);
        ThreadLocal threadLocal2 = A0C;
        Number number = (Number) threadLocal2.get();
        long longValue = number.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            Context context2 = context;
            C16880qF r19 = r20;
            String str2 = str;
            C06270Sy Bpd = r19.Bpd(context2, A0B, str2);
            int i2 = Bpd.A00;
            int i3 = Bpd.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Considering local module ");
            A0u.append(str2);
            A0u.append(":");
            A0u.append(i2);
            AnonymousClass000.A1D(" and remote module ", str2, ":", A0u);
            A0u.append(i3);
            Log.i("DynamiteModule", A0u.toString());
            int i4 = Bpd.A02;
            if (i4 != 0) {
                if (i4 != -1) {
                    int i5 = Bpd.A01;
                    if (i5 != 0) {
                        try {
                            synchronized (cls) {
                                try {
                                    if (A08(context2)) {
                                        bool = A04;
                                    } else {
                                        throw new AnonymousClass0OB("Remote loading disabled");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            if (bool == null) {
                                th = new AnonymousClass0OB("Failed to determine which loading route to use.");
                            } else if (bool.booleanValue()) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("Selected remote version of ");
                                A0u2.append(str2);
                                Log.i("DynamiteModule", AnonymousClass000.A0r(", version >= ", A0u2, i5));
                                synchronized (cls) {
                                    try {
                                        r15 = A03;
                                    } catch (Throwable th2) {
                                        while (true) {
                                            th = th2;
                                            break;
                                        }
                                    }
                                }
                                if (r15 != null) {
                                    AnonymousClass0WK r13 = (AnonymousClass0WK) threadLocal.get();
                                    if (r13 == null || r13.A00 == null) {
                                        th = new AnonymousClass0OB("No result cursor");
                                    } else {
                                        Context applicationContext = context2.getApplicationContext();
                                        Cursor cursor = r13.A00;
                                        new AnonymousClass0LR((Object) null);
                                        synchronized (cls) {
                                            try {
                                                boolean z = false;
                                                if (A01 >= 2) {
                                                    z = true;
                                                }
                                                valueOf = Boolean.valueOf(z);
                                            } catch (Throwable th3) {
                                                while (true) {
                                                    th = th3;
                                                    break;
                                                }
                                            }
                                        }
                                        if (valueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            AnonymousClass0LR r11 = new AnonymousClass0LR(applicationContext);
                                            AnonymousClass0LR r102 = new AnonymousClass0LR(cursor);
                                            Parcel obtain = Parcel.obtain();
                                            A06(obtain, r11, r15.A00, str2, i5);
                                            obtain.writeStrongBinder(r102.asBinder());
                                            A032 = A03(obtain, r15, 3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            AnonymousClass0LR r112 = new AnonymousClass0LR(applicationContext);
                                            AnonymousClass0LR r103 = new AnonymousClass0LR(cursor);
                                            Parcel obtain2 = Parcel.obtain();
                                            A06(obtain2, r112, r15.A00, str2, i5);
                                            obtain2.writeStrongBinder(r103.asBinder());
                                            A032 = A03(obtain2, r15, 2);
                                        }
                                        Context context3 = (Context) AnonymousClass0LR.A00(A032);
                                        if (context3 != null) {
                                            r10 = new AnonymousClass0Z3(context3);
                                        } else {
                                            th = new AnonymousClass0OB("Failed to get module context");
                                        }
                                    }
                                } else {
                                    th = new AnonymousClass0OB("DynamiteLoaderV2 was not cached.");
                                }
                            } else {
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                A0u3.append("Selected remote version of ");
                                A0u3.append(str2);
                                Log.i("DynamiteModule", AnonymousClass000.A0r(", version >= ", A0u3, i5));
                                AnonymousClass0ML A052 = A05(context2);
                                if (A052 != null) {
                                    Parcel obtain3 = Parcel.obtain();
                                    String str3 = A052.A00;
                                    obtain3.writeInterfaceToken(str3);
                                    Parcel A002 = A052.A00(6, obtain3);
                                    int readInt = A002.readInt();
                                    A002.recycle();
                                    if (readInt >= 3) {
                                        AnonymousClass0WK r0 = (AnonymousClass0WK) threadLocal.get();
                                        if (r0 != null) {
                                            AnonymousClass0LR r104 = new AnonymousClass0LR(context2);
                                            AnonymousClass0LR r14 = new AnonymousClass0LR(r0.A00);
                                            Parcel obtain4 = Parcel.obtain();
                                            A06(obtain4, r104, str3, str2, i5);
                                            obtain4.writeStrongBinder(r14.asBinder());
                                            iObjectWrapper = A03(obtain4, A052, 8);
                                        } else {
                                            th = new AnonymousClass0OB("No cached result cursor holder");
                                        }
                                    } else if (readInt == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        AnonymousClass0LR r02 = new AnonymousClass0LR(context2);
                                        Parcel obtain5 = Parcel.obtain();
                                        A06(obtain5, r02, str3, str2, i5);
                                        iObjectWrapper = A03(obtain5, A052, 4);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        AnonymousClass0LR r16 = new AnonymousClass0LR(context2);
                                        Parcel obtain6 = Parcel.obtain();
                                        A06(obtain6, r16, str3, str2, i5);
                                        iObjectWrapper = A03(obtain6, A052, 2);
                                    }
                                    Object A003 = AnonymousClass0LR.A00(iObjectWrapper);
                                    if (A003 != null) {
                                        r10 = new AnonymousClass0Z3((Context) A003);
                                    } else {
                                        th = new AnonymousClass0OB("Failed to load remote module.");
                                    }
                                } else {
                                    th = new AnonymousClass0OB("Failed to create IDynamiteLoader.");
                                }
                            }
                            throw th;
                        } catch (RemoteException e) {
                            r12 = new AnonymousClass0OB("Failed to load remote module.", e);
                        } catch (AnonymousClass0OB e2) {
                            throw e2;
                        } catch (AnonymousClass0OB e3) {
                            Log.w("DynamiteModule", AnonymousClass000.A0p("Failed to load remote module: ", e3.getMessage(), AnonymousClass000.A0u()));
                            int i6 = Bpd.A00;
                            if (i6 != 0) {
                                if (r19.Bpd(context2, new C10520eN(i6), str2).A02 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str2)));
                                    r10 = new AnonymousClass0Z3(context2.getApplicationContext());
                                }
                            }
                            r1 = new AnonymousClass0OB("Remote load failed. No local fallback found.", e3);
                        } catch (Throwable th4) {
                            try {
                                AnonymousClass006.A01(context2);
                                AnonymousClass006.A01(th4);
                            } catch (Exception e4) {
                                Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
                            }
                            r12 = new AnonymousClass0OB("Failed to load remote module.", th4);
                        }
                    }
                } else if (Bpd.A00 != 0) {
                    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str2)));
                    r10 = new AnonymousClass0Z3(context2.getApplicationContext());
                }
                if (i != 0) {
                    threadLocal2.set(number);
                }
                return r10;
            }
            int i7 = Bpd.A00;
            int i8 = Bpd.A01;
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("No acceptable module ");
            A0u4.append(str2);
            A0u4.append(" found. Local version is ");
            A0u4.append(i7);
            A0u4.append(" and remote version is ");
            A0u4.append(i8);
            r1 = new AnonymousClass0OB(AnonymousClass000.A0q(".", A0u4));
            throw r1;
            throw r12;
        } finally {
            if (longValue == 0) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(number);
            }
            Cursor cursor2 = r8.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            threadLocal.set(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0ML A05(android.content.Context r5) {
        /*
            java.lang.Class<X.0Z3> r4 = X.AnonymousClass0Z3.class
            monitor-enter(r4)
            X.0ML r3 = A02     // Catch:{ all -> 0x0056 }
            if (r3 != 0) goto L_0x0054
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x003a }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ Exception -> 0x003a }
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ Exception -> 0x003a }
            boolean r0 = r1 instanceof X.AnonymousClass0ML     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0032
            X.0ML r1 = (X.AnonymousClass0ML) r1     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x0054
        L_0x002f:
            A02 = r1     // Catch:{ Exception -> 0x003a }
            goto L_0x0038
        L_0x0032:
            X.0ML r1 = new X.0ML     // Catch:{ Exception -> 0x003a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x002f
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return r1
        L_0x003a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            r2.append(r0)     // Catch:{ all -> 0x0056 }
            r2.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0056 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return r3
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z3.A05(android.content.Context):X.0ML");
    }

    public static boolean A08(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (!bool.equals((Object) null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                    if (C02600Bc.A00.A02(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    A05 = valueOf;
                    z = valueOf.booleanValue();
                    if (z) {
                        if (!(resolveContentProvider == null || (applicationInfo = resolveContentProvider.applicationInfo) == null || (applicationInfo.flags & 129) != 0)) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            A07 = true;
                        }
                        return z;
                    }
                }
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public IBinder A09(String str) {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new AnonymousClass0OB("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public AnonymousClass0Z3(Context context) {
        AnonymousClass006.A01(context);
        this.A00 = context;
    }

    public static IObjectWrapper A03(Parcel parcel, C07770Zf r1, int i) {
        Parcel A002 = r1.A00(i, parcel);
        IObjectWrapper A012 = AnonymousClass0MR.A01(A002.readStrongBinder());
        A002.recycle();
        return A012;
    }

    public static void A06(Parcel parcel, AnonymousClass0E1 r2, String str, String str2, int i) {
        parcel.writeInterfaceToken(str);
        parcel.writeStrongBinder(r2.asBinder());
        parcel.writeString(str2);
        parcel.writeInt(i);
    }
}

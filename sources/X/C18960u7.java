package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0u7  reason: invalid class name and case insensitive filesystem */
public class C18960u7 {
    public static final Object A09 = new Object();
    public static final Map A0A = new AnonymousClass008();
    public static final Executor A0B = new C18970u8();
    public final Context A00;
    public final C19000uB A01;
    public final C19120uP A02;
    public final C19220ua A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final List A07 = new CopyOnWriteArrayList();
    public final AtomicBoolean A08 = new AtomicBoolean();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C18960u7 A00() {
        /*
            java.lang.Object r5 = A09
            monitor-enter(r5)
            java.util.Map r1 = A0A     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "[DEFAULT]"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0083 }
            X.0u7 r0 = (X.C18960u7) r0     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            return r0
        L_0x0011:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r4.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "Default FirebaseApp is not initialized in this process "
            r4.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = X.AnonymousClass0P7.A01     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x0071
            int r2 = X.AnonymousClass0P7.A00     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0029
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0083 }
            X.AnonymousClass0P7.A00 = r2     // Catch:{ all -> 0x0083 }
        L_0x0029:
            r3 = 0
            if (r2 <= 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ all -> 0x006d }
            r1.append(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006d }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x006d }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0068 }
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0068 }
            r1.<init>(r0)     // Catch:{ all -> 0x0068 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0064, all -> 0x005f }
            X.AnonymousClass006.A01(r0)     // Catch:{ IOException -> 0x0064, all -> 0x005f }
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x0064, all -> 0x005f }
            goto L_0x0064
        L_0x005f:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x006e
        L_0x0064:
            r1.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x006f
        L_0x0068:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
        L_0x006e:
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x006f:
            X.AnonymousClass0P7.A01 = r3     // Catch:{ all -> 0x0083 }
        L_0x0071:
            r4.append(r3)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = ". Make sure to call FirebaseApp.initializeApp(Context) first."
            r4.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0083 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0083 }
            r0.<init>(r1)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18960u7.A00():X.0u7");
    }

    public static C18960u7 A01(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C18960u7 r0;
        synchronized (A09) {
            Map map = A0A;
            if (map.containsKey("[DEFAULT]")) {
                r0 = A00();
            } else {
                AnonymousClass006.A01(context);
                Resources resources = context.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string.f12nameremoved);
                int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
                if (identifier == 0) {
                    str = null;
                } else {
                    str = resources.getString(identifier);
                }
                if (TextUtils.isEmpty(str)) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    r0 = null;
                } else {
                    int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
                    if (identifier2 == 0) {
                        str2 = null;
                    } else {
                        str2 = resources.getString(identifier2);
                    }
                    int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
                    if (identifier3 == 0) {
                        str3 = null;
                    } else {
                        str3 = resources.getString(identifier3);
                    }
                    int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
                    if (identifier4 == 0) {
                        str4 = null;
                    } else {
                        str4 = resources.getString(identifier4);
                    }
                    int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
                    if (identifier5 == 0) {
                        str5 = null;
                    } else {
                        str5 = resources.getString(identifier5);
                    }
                    int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
                    if (identifier6 == 0) {
                        str6 = null;
                    } else {
                        str6 = resources.getString(identifier6);
                    }
                    int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
                    if (identifier7 == 0) {
                        str7 = null;
                    } else {
                        str7 = resources.getString(identifier7);
                    }
                    C19000uB r7 = new C19000uB(str, str2, str3, str4, str5, str6, str7);
                    if (context.getApplicationContext() instanceof Application) {
                        Application application = (Application) context.getApplicationContext();
                        AtomicReference atomicReference = C19010uC.A00;
                        if (atomicReference.get() == null) {
                            C19010uC r2 = new C19010uC();
                            if (atomicReference.compareAndSet((Object) null, r2)) {
                                AnonymousClass00B.A00(application);
                                AnonymousClass00B r1 = AnonymousClass00B.A04;
                                synchronized (r1) {
                                    try {
                                        r1.A01.add(r2);
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String trim = "[DEFAULT]".trim();
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    try {
                        boolean z = false;
                        if (!map.containsKey(trim)) {
                            z = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("FirebaseApp name ");
                        sb.append(trim);
                        sb.append(" already exists!");
                        AnonymousClass006.A08(z, sb.toString());
                        AnonymousClass006.A02(context, "Application context cannot be null.");
                        r0 = new C18960u7(context, r7, trim);
                        map.put(trim, r0);
                        A03(r0);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
        return r0;
    }

    public static void A02(C18960u7 r1) {
        AnonymousClass006.A08(!r1.A08.get(), "FirebaseApp was deleted");
    }

    public static void A03(C18960u7 r5) {
        Queue queue;
        Context context = r5.A00;
        if (Build.VERSION.SDK_INT < 24 || !(!AnonymousClass00D.A00(context))) {
            C19120uP r4 = r5.A02;
            A02(r5);
            for (Map.Entry entry : r4.A01.entrySet()) {
                C19220ua r2 = (C19220ua) entry.getValue();
                if (((C19020uF) entry.getKey()).A00 == 1) {
                    r2.get();
                }
            }
            C19160uT r3 = r4.A00;
            synchronized (r3) {
                queue = r3.A00;
                if (queue != null) {
                    r3.A00 = null;
                } else {
                    queue = null;
                }
            }
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    it.next();
                    AnonymousClass006.A01((Object) null);
                    synchronized (r3) {
                        Queue queue2 = r3.A00;
                        if (queue2 != null) {
                            queue2.add((Object) null);
                        } else {
                            synchronized (r3) {
                                throw new NullPointerException("getType");
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        C90934bB.A00(context);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18960u7)) {
            return false;
        }
        String str = this.A04;
        C18960u7 r3 = (C18960u7) obj;
        A02(r3);
        return str.equals(r3.A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r2.A00(this.A01, "options");
        return r2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18960u7(android.content.Context r12, X.C19000uB r13, java.lang.String r14) {
        /*
            r11 = this;
            r11.<init>()
            r5 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r11.A06 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r11.A08 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r11.A05 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r11.A07 = r0
            X.AnonymousClass006.A01(r12)
            r11.A00 = r12
            X.AnonymousClass006.A03(r14)
            r11.A04 = r14
            X.AnonymousClass006.A01(r13)
            r11.A01 = r13
            java.lang.String r6 = "ComponentDiscovery"
            android.content.pm.PackageManager r2 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008d }
            if (r2 != 0) goto L_0x003d
            java.lang.String r0 = "Context has no PackageManager."
            android.util.Log.w(r6, r0)     // Catch:{ NameNotFoundException -> 0x008d }
            goto L_0x0092
        L_0x003d:
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r0 = com.google.firebase.components.ComponentDiscoveryService.class
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x008d }
            r1.<init>(r12, r0)     // Catch:{ NameNotFoundException -> 0x008d }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x008d }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "ComponentDiscoveryService has no service info."
            android.util.Log.w(r6, r0)     // Catch:{ NameNotFoundException -> 0x008d }
            goto L_0x0092
        L_0x0052:
            android.os.Bundle r4 = r0.metaData     // Catch:{ NameNotFoundException -> 0x008d }
            if (r4 == 0) goto L_0x0092
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0063:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r4.get(r3)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0063
            r0 = 31
            java.lang.String r0 = r3.substring(r0)
            r2.add(r0)
            goto L_0x0063
        L_0x008d:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r6, r0)
        L_0x0092:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r6, r0)
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x009b:
            java.lang.String r4 = "Could not instantiate %s"
            java.lang.String r3 = "Could not instantiate %s."
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x00a8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r8 = r10.next()
            java.lang.String r8 = (java.lang.String) r8
            r9 = 1
            java.lang.Class r1 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.Class<com.google.firebase.iid.Registrar> r0 = com.google.firebase.iid.Registrar.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            if (r0 != 0) goto L_0x00d4
            java.lang.String r2 = "Class %s is not an instance of %s"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            r1[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            r1[r9] = r0     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            android.util.Log.w(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            goto L_0x00a8
        L_0x00d4:
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            r7.add(r0)     // Catch:{ ClassNotFoundException -> 0x00ee, IllegalAccessException | InstantiationException -> 0x00fa, NoSuchMethodException | InvocationTargetException -> 0x00e4 }
            goto L_0x00a8
        L_0x00e4:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r8
            java.lang.String r0 = java.lang.String.format(r4, r0)
            goto L_0x0103
        L_0x00ee:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r8
            java.lang.String r0 = "Class %s is not an found."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0103
        L_0x00fa:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r8
            java.lang.String r0 = java.lang.String.format(r3, r0)
        L_0x0103:
            android.util.Log.w(r6, r0, r2)
            goto L_0x00a8
        L_0x0107:
            java.util.concurrent.Executor r6 = A0B
            r0 = 6
            X.0uF[] r4 = new X.C19020uF[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0uG r1 = new X.0uG
            r1.<init>(r2, r0)
            X.1jh r0 = new X.1jh
            r0.<init>(r12, r5)
            r1.A02 = r0
            X.0uF r0 = r1.A00()
            r4[r5] = r0
            java.lang.Class<X.0u7> r2 = X.C18960u7.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0uG r1 = new X.0uG
            r1.<init>(r2, r0)
            X.1jh r0 = new X.1jh
            r0.<init>(r11, r5)
            r1.A02 = r0
            X.0uF r1 = r1.A00()
            r0 = 1
            r4[r0] = r1
            java.lang.Class<X.0uB> r2 = X.C19000uB.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0uG r1 = new X.0uG
            r1.<init>(r2, r0)
            X.1jh r0 = new X.1jh
            r0.<init>(r13, r5)
            r1.A02 = r0
            X.0uF r1 = r1.A00()
            r0 = 2
            r4[r0] = r1
            java.lang.String r1 = "fire-android"
            java.lang.String r0 = ""
            X.0uF r1 = X.C19050uI.A00(r1, r0)
            r0 = 3
            r4[r0] = r1
            java.lang.String r1 = "fire-core"
            java.lang.String r0 = "19.0.0"
            X.0uF r1 = X.C19050uI.A00(r1, r0)
            r0 = 4
            r4[r0] = r1
            java.lang.Class<X.0uL> r1 = X.C19080uL.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0uG r3 = new X.0uG
            r3.<init>(r1, r0)
            java.lang.Class<X.0uJ> r2 = X.C19060uJ.class
            r1 = 2
            X.0uM r0 = new X.0uM
            r0.<init>(r2, r1)
            r3.A01(r0)
            X.0uN r1 = X.C19100uN.A00
            java.lang.String r0 = "Null factory"
            X.AnonymousClass006.A02(r1, r0)
            r3.A02 = r1
            X.0uF r1 = r3.A00()
            r0 = 5
            r4[r0] = r1
            X.0uP r0 = new X.0uP
            r0.<init>(r7, r6, r4)
            r11.A02 = r0
            X.1jz r1 = new X.1jz
            r1.<init>(r12, r11, r5)
            X.0ua r0 = new X.0ua
            r0.<init>(r1)
            r11.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18960u7.<init>(android.content.Context, X.0uB, java.lang.String):void");
    }
}

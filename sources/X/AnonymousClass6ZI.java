package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;

/* renamed from: X.6ZI  reason: invalid class name */
public class AnonymousClass6ZI implements ServiceConnection {
    public IInterface A00;
    public Integer A01;
    public C117835mu A02;
    public final Context A03;
    public final C19700wN A04;
    public final Object A05 = C36441kJ.A11();
    public final C117825mt A06;

    public void onBindingDied(ComponentName componentName) {
        A00("binder-died");
    }

    public void onNullBinding(ComponentName componentName) {
        A00("binder-null");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        IInterface r1;
        if (iBinder != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("svc-connection/attach-binder; service=");
            String A0q = AnonymousClass000.A0q("GoogleMigrateClient", A0u);
            Log.i(A0q);
            Object obj = this.A05;
            synchronized (obj) {
                Integer num = this.A01;
                z = false;
                if (num == C023109s.A01) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppDataReaderService)) {
                        r1 = new C141386nA(iBinder);
                    } else {
                        r1 = (IAppDataReaderService) queryLocalInterface;
                    }
                    this.A00 = r1;
                    this.A01 = C023109s.A0C;
                    obj.notifyAll();
                    StringBuilder A0v = AnonymousClass000.A0v(A0q);
                    A0v.append(" -> state=");
                    C36321k7.A1a(A0v, C111585cW.A00(this.A01));
                } else {
                    StringBuilder A0v2 = AnonymousClass000.A0v(A0q);
                    A0v2.append(", attached while in a wrong state=");
                    C36321k7.A1Z(A0v2, C111585cW.A00(num));
                    C19700wN r3 = this.A04;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("unexpected state=");
                    r3.A0E("svc-connection-attach-binder-failure", AnonymousClass000.A0q(C111585cW.A00(this.A01), A0u2), false);
                    z = true;
                }
            }
            if (z) {
                A01(true);
                return;
            }
            return;
        }
        A00("binder-null-on-connect");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        A00("disconnected");
    }

    public AnonymousClass6ZI(Context context, C19700wN r3, C117825mt r4, C117835mu r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A01 = C023109s.A00;
    }

    public void A00(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("svc-connection/detach-binder; service=");
        String A0q = AnonymousClass000.A0q("GoogleMigrateClient", A0u);
        C36321k7.A1Q(", reason=", str, AnonymousClass000.A0v(A0q));
        synchronized (this.A05) {
            Integer num = this.A01;
            if (!(num == C023109s.A01 || num == C023109s.A0C)) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                AnonymousClass000.A1D(A0q, ", reason=", str, A0u2);
                A0u2.append(", detached while in wrong state=");
                C36321k7.A1Z(A0u2, C111585cW.A00(num));
                C19700wN r3 = this.A04;
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("reason=");
                A0u3.append(str);
                A0u3.append(", unexpected state=");
                r3.A0E("svc-connection-detach-binder-failure", AnonymousClass000.A0q(C111585cW.A00(this.A01), A0u3), false);
            }
        }
        A01(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r4.A01 == r6) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r4.A04.A0E("svc-client-close-unexpected-connection", X.AnonymousClass000.A0p("name=", "GoogleMigrateClient", X.AnonymousClass000.A0u()), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r4.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r6.A03.unbindService(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "svc-connection/close; service="
            r1.append(r0)
            java.lang.String r5 = "GoogleMigrateClient"
            java.lang.String r4 = X.AnonymousClass000.A0q(r5, r1)
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.Object r3 = r6.A05
            monitor-enter(r3)
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x0067 }
            java.lang.Integer r1 = X.C023109s.A0G     // Catch:{ all -> 0x0067 }
            if (r0 != r1) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            return
        L_0x001d:
            X.5mu r2 = r6.A02     // Catch:{ all -> 0x0067 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x0067 }
            r6.A01 = r1     // Catch:{ all -> 0x0067 }
            r3.notifyAll()     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = " -> state="
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = X.C111585cW.A00(r0)     // Catch:{ all -> 0x0067 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            android.content.Context r0 = r6.A03
            r0.unbindService(r6)
            if (r7 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            X.6FI r4 = r2.A00
            monitor-enter(r4)
            X.6ZI r0 = r4.A01     // Catch:{ all -> 0x0063 }
            if (r0 == r6) goto L_0x005e
            X.0wN r3 = r4.A04     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "svc-client-close-unexpected-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "name="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)     // Catch:{ all -> 0x0063 }
            r0 = 0
            r3.A0E(r2, r1, r0)     // Catch:{ all -> 0x0063 }
        L_0x005c:
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x0062
        L_0x005e:
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0066:
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZI.A01(boolean):void");
    }
}

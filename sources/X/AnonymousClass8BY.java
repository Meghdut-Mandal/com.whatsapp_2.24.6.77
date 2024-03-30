package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.8BY  reason: invalid class name */
public final class AnonymousClass8BY extends C04270Jz {
    public final AnonymousClass9PQ A00 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A01 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A02 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A03 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A04 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A05 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A06 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A07 = new AnonymousClass9PQ();
    public final AnonymousClass9PQ A08 = new AnonymousClass9PQ();
    public final C132606Ul A09;
    public final ExecutorService A0A;

    public final String A07() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final String A08() {
        return "com.google.android.gms.wearable.BIND";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 8600000;
    }

    public final /* bridge */ /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (!(queryLocalInterface instanceof C170668Ei)) {
            return new C170668Ei(iBinder);
        }
        return queryLocalInterface;
    }

    public final String A06() {
        if (this.A09.A02()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }

    public final void A0B(Bundle bundle, IBinder iBinder, int i, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", AnonymousClass000.A0r("onPostInitHandler: statusCode ", C90524aI.A0h(41), i));
        }
        if (i == 0) {
            this.A00.A00(iBinder);
            this.A01.A00(iBinder);
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A05.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
            this.A08.A00(iBinder);
            i = 0;
        }
        super.A0B(bundle, iBinder, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r2 < 8600000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B3T(X.C16840qB r7) {
        /*
            r6 = this;
            java.lang.String r5 = "com.google.android.wearable.app.cn"
            boolean r0 = r6.BoR()
            if (r0 != 0) goto L_0x00a3
            android.content.Context r4 = r6.A0F     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0088 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0088 }
            r3 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = "com.google.android.wearable.api.version"
            int r2 = r1.getInt(r0, r3)     // Catch:{ NameNotFoundException -> 0x0088 }
            r0 = 8600000(0x8339c0, float:1.2051167E-38)
            if (r2 >= r0) goto L_0x00a3
        L_0x0024:
            r0 = 82
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            java.lang.String r0 = "The Wear OS app is out of date. Requires API version 8600000 but found "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x0088 }
            java.lang.String r0 = "WearableClient"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            java.lang.String r1 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x0088 }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.Intent r2 = r0.setPackage(r5)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0088 }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ NameNotFoundException -> 0x0088 }
            java.lang.String r0 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.net.Uri r0 = r0.build()     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.Intent r2 = X.C36391kE.A0G(r0)     // Catch:{ NameNotFoundException -> 0x0088 }
        L_0x0066:
            int r0 = X.AnonymousClass990.A00     // Catch:{ NameNotFoundException -> 0x0088 }
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            r3 = 6
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.AnonymousClass006.A02(r7, r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            r6.A08 = r7     // Catch:{ NameNotFoundException -> 0x0088 }
            android.os.Handler r2 = r6.A0G     // Catch:{ NameNotFoundException -> 0x0088 }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0B     // Catch:{ NameNotFoundException -> 0x0088 }
            int r1 = r0.get()     // Catch:{ NameNotFoundException -> 0x0088 }
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)     // Catch:{ NameNotFoundException -> 0x0088 }
            r2.sendMessage(r0)     // Catch:{ NameNotFoundException -> 0x0088 }
            goto L_0x0087
        L_0x0085:
            r2 = 0
            goto L_0x0024
        L_0x0087:
            return
        L_0x0088:
            r4 = 0
            r3 = 16
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.AnonymousClass006.A02(r7, r0)
            r6.A08 = r7
            android.os.Handler r2 = r6.A0G
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0B
            int r1 = r0.get()
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)
            r2.sendMessage(r0)
            return
        L_0x00a3:
            super.B3T(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BY.B3T(X.0qB):void");
    }

    public final boolean BoR() {
        return AnonymousClass000.A1Q(this.A09.A02() ? 1 : 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8BY(Context context, Looper looper, C17610rh r13, C17620ri r14, AnonymousClass0TT r15) {
        super(context, looper, r13, r14, r15, 14);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        C132606Ul A002 = C132606Ul.A00(context);
        AnonymousClass006.A01(unconfigurableExecutorService);
        this.A0A = unconfigurableExecutorService;
        this.A09 = A002;
    }

    public final C04520Ky[] A0F() {
        return AnonymousClass9B9.A04;
    }
}

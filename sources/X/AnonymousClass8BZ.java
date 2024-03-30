package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.util.Set;

/* renamed from: X.8BZ  reason: invalid class name */
public final class AnonymousClass8BZ extends C04270Jz {
    public long A00;
    public AnonymousClass9LU A01;
    public final Set A02 = new C000000a();
    public final Set A03 = new C000000a();
    public final Set A04 = new C000000a();
    public final Set A05 = new C000000a();
    public final Set A06 = new C000000a();
    public final Set A07 = new C000000a();

    public final String A07() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    public final String A08() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    public final void A0A(int i) {
        if (i == 1) {
            A00();
            i = 1;
        }
        super.A0A(i);
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12451000;
    }

    public AnonymousClass8BZ(Context context, Looper looper, C17610rh r11, C17620ri r12, AnonymousClass0TT r13) {
        super(context, looper, r11, r12, r13, 54);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            C1892192s.A00 = cacheDir;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:51|(2:53|54)|55|56|(3:58|59|73)(1:74)|60) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e8 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec A[SYNTHETIC, Splitter:B:58:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ef A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r8 = this;
            java.util.Set r7 = r8.A02
            java.util.Iterator r1 = r7.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            r1.next()
            java.lang.String r0 = "zze"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0016:
            java.util.Set r6 = r8.A03
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            r1.next()
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x002a:
            java.util.Set r5 = r8.A04
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            r1.next()
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0040:
            java.util.Set r4 = r8.A05
            java.util.Iterator r1 = r4.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            r1.next()
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0056:
            java.util.Set r3 = r8.A06
            java.util.Iterator r1 = r3.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006c
            r1.next()
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x006c:
            java.util.Set r2 = r8.A07
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0082
            r1.next()
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0082:
            r7.clear()
            r6.clear()
            r5.clear()
            r4.clear()
            r3.clear()
            r2.clear()
            X.9LU r3 = r8.A01
            if (r3 == 0) goto L_0x00fd
            monitor-enter(r3)
            java.util.concurrent.ExecutorService r0 = r3.A03     // Catch:{ all -> 0x00f6 }
            r0.shutdownNow()     // Catch:{ all -> 0x00f6 }
            r4 = 0
            r2 = 0
        L_0x00a0:
            X.007 r1 = r3.A00     // Catch:{ all -> 0x00f6 }
            int r0 = r1.size()     // Catch:{ all -> 0x00f6 }
            if (r2 >= r0) goto L_0x00b6
            java.lang.Object r0 = r1.A06(r2)     // Catch:{ all -> 0x00f6 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00b3
            r0.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00b6:
            r1.clear()     // Catch:{ all -> 0x00f6 }
            r2 = 0
        L_0x00ba:
            X.007 r1 = r3.A01     // Catch:{ all -> 0x00f6 }
            int r0 = r1.size()     // Catch:{ all -> 0x00f6 }
            if (r2 >= r0) goto L_0x00d0
            java.lang.Object r0 = r1.A06(r2)     // Catch:{ all -> 0x00f6 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00cd
            r0.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x00ba
        L_0x00d0:
            r1.clear()     // Catch:{ all -> 0x00f6 }
        L_0x00d3:
            X.007 r1 = r3.A02     // Catch:{ all -> 0x00f6 }
            int r0 = r1.size()     // Catch:{ all -> 0x00f6 }
            if (r4 >= r0) goto L_0x00f2
            java.lang.Object r1 = r1.A06(r4)     // Catch:{ all -> 0x00f6 }
            X.8Cc r1 = (X.C170138Cc) r1     // Catch:{ all -> 0x00f6 }
            android.os.ParcelFileDescriptor r0 = r1.A00     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00e8
            r0.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            android.os.ParcelFileDescriptor r0 = r1.A01     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ef
            r0.close()     // Catch:{ IOException -> 0x00ef }
        L_0x00ef:
            int r4 = r4 + 1
            goto L_0x00d3
        L_0x00f2:
            r1.clear()     // Catch:{ all -> 0x00f6 }
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00f9:
            monitor-exit(r3)
            r0 = 0
            r8.A01 = r0
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BZ.A00():void");
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (!(queryLocalInterface instanceof C170408Dh)) {
            return new C170408Dh(iBinder);
        }
        return queryLocalInterface;
    }

    public final C04520Ky[] A0F() {
        return new C04520Ky[]{AnonymousClass9BP.A0j, AnonymousClass9BP.A07, AnonymousClass9BP.A0B, AnonymousClass9BP.A09, AnonymousClass9BP.A0C, AnonymousClass9BP.A08, AnonymousClass9BP.A0k, AnonymousClass9BP.A0A, AnonymousClass9BP.A0l, AnonymousClass9BP.A0D};
    }

    public final boolean BoR() {
        return C197069b5.A00(this.A0F);
    }

    public final Bundle A03() {
        Bundle A072 = AnonymousClass001.A07();
        A072.putLong("clientId", this.A00);
        return A072;
    }

    public final /* bridge */ /* synthetic */ void A0C(IInterface iInterface) {
        super.A0C(iInterface);
        this.A01 = new AnonymousClass9LU();
    }

    public final void B5X() {
        Parcel obtain;
        Parcel obtain2;
        if (isConnected()) {
            try {
                C204409px r5 = (C204409px) A04();
                AnonymousClass8CG r1 = new AnonymousClass8CG();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(r5.A01);
                obtain.writeInt(1);
                r1.writeToParcel(obtain, 0);
                obtain2 = Parcel.obtain();
                r5.A00.transact(2011, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        }
        A00();
        super.B5X();
    }
}

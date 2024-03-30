package X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: X.8BW  reason: invalid class name */
public final class AnonymousClass8BW extends C04270Jz {
    public final AnonymousClass9MO A00;
    public final C16010oP A01;
    public final String A02 = "locationServices";

    public final String A07() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String A08() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 11717000;
    }

    public AnonymousClass8BW(Context context, Looper looper, C17610rh r12, C17620ri r13, AnonymousClass0TT r14) {
        super(context, looper, r12, r13, r14, 23);
        C21018A3h a3h = new C21018A3h(this);
        this.A01 = a3h;
        this.A00 = new AnonymousClass9MO(context, a3h);
    }

    public final /* bridge */ /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (!(queryLocalInterface instanceof C23102B4r)) {
            return new AnonymousClass8DV(iBinder);
        }
        return queryLocalInterface;
    }

    public final Location A0G(String str) {
        C04520Ky[] r1;
        int i;
        C04510Kx r0 = this.A0Q;
        if (r0 == null) {
            r1 = null;
        } else {
            r1 = r0.A03;
        }
        boolean A002 = AnonymousClass0QN.A00(AnonymousClass9BC.A02, r1);
        AnonymousClass8BW r02 = ((C21018A3h) this.A00.A00).A00;
        r02.A09();
        C204449q1 r4 = (C204449q1) ((C23102B4r) r02.A04());
        Parcel obtain = Parcel.obtain();
        String str2 = r4.A01;
        if (A002) {
            obtain.writeInterfaceToken(str2);
            obtain.writeString(str);
            i = 80;
        } else {
            obtain.writeInterfaceToken(str2);
            i = 7;
        }
        obtain = Parcel.obtain();
        try {
            AnonymousClass000.A15(r4.A00, obtain, obtain, i);
            obtain.recycle();
            return (Location) AnonymousClass000.A0W(obtain, Location.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
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
    public final void B5X() {
        /*
            r12 = this;
            X.9MO r3 = r12.A00
            monitor-enter(r3)
            boolean r0 = r12.isConnected()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0095
            java.util.Map r2 = r3.A01     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r2)     // Catch:{ all -> 0x008a }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008a }
            r6 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x008a }
            X.8De r7 = (X.C170378De) r7     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0010
            X.0oP r0 = r3.A00     // Catch:{ all -> 0x008a }
            X.A3h r0 = (X.C21018A3h) r0     // Catch:{ all -> 0x008a }
            X.8BW r0 = r0.A00     // Catch:{ all -> 0x008a }
            android.os.IInterface r0 = r0.A04()     // Catch:{ all -> 0x008a }
            X.B4r r0 = (X.C23102B4r) r0     // Catch:{ all -> 0x008a }
            r11 = 2
            X.8CC r5 = new X.8CC     // Catch:{ all -> 0x008a }
            r9 = r6
            r10 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008a }
            r0.Byw(r5)     // Catch:{ all -> 0x008a }
            goto L_0x0010
        L_0x0038:
            r2.clear()     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r2)     // Catch:{ all -> 0x0087 }
        L_0x0043:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0087 }
            X.8Dd r8 = (X.C170368Dd) r8     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x0043
            X.0oP r0 = r3.A00     // Catch:{ all -> 0x0087 }
            X.A3h r0 = (X.C21018A3h) r0     // Catch:{ all -> 0x0087 }
            X.8BW r0 = r0.A00     // Catch:{ all -> 0x0087 }
            android.os.IInterface r0 = r0.A04()     // Catch:{ all -> 0x0087 }
            X.B4r r0 = (X.C23102B4r) r0     // Catch:{ all -> 0x0087 }
            r11 = 2
            X.8CC r5 = new X.8CC     // Catch:{ all -> 0x0087 }
            r9 = r6
            r10 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0087 }
            r0.Byw(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0043
        L_0x006a:
            r2.clear()     // Catch:{ all -> 0x0087 }
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r2)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007f
            r1.next()     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x007f:
            r2.clear()     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
        L_0x008c:
            throw r0     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x009a }
        L_0x0095:
            super.B5X()     // Catch:{ all -> 0x009a }
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            return
        L_0x009a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BW.B5X():void");
    }

    public final Bundle A03() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("client_name", this.A02);
        return A07;
    }

    public final C04520Ky[] A0F() {
        return AnonymousClass9BC.A05;
    }
}

package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.DistinctElementSidecarCallback;
import androidx.window.layout.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;

/* renamed from: X.9xi  reason: invalid class name and case insensitive filesystem */
public final class C208139xi implements B0R {
    public C22851Ax0 A00;
    public final C202089l1 A01;
    public final SidecarInterface A02;
    public final Map A03 = C36431kI.A1G();
    public final Map A04 = C36431kI.A1G();

    public final void A02(Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C22851Ax0 ax0 = this.A00;
        if (ax0 != null) {
            ax0.Bkk(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null) {
            C203959pE r0 = new C203959pE(activity, this);
            map2.put(activity, r0);
            activity.registerComponentCallbacks(r0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f5 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r8 = this;
            r5 = 1
            r7 = 0
            androidx.window.sidecar.SidecarInterface r6 = r8.A02     // Catch:{ all -> 0x0125 }
            r4 = 0
            if (r6 == 0) goto L_0x0026
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0026
            java.lang.String r2 = "setSidecarCallback"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0125 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r0 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0026
            java.lang.Class r2 = r0.getReturnType()     // Catch:{ all -> 0x0125 }
        L_0x001d:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0125 }
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0105
            goto L_0x0028
        L_0x0026:
            r2 = r4
            goto L_0x001d
        L_0x0028:
            if (r6 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = r4
            goto L_0x0049
        L_0x002d:
            r6.getDeviceState()     // Catch:{ all -> 0x0125 }
            r6.onDeviceStateListenersChanged(r5)     // Catch:{ all -> 0x0125 }
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x002b
            java.lang.String r2 = "getWindowLayoutInfo"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0125 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x002b
            java.lang.Class r2 = r0.getReturnType()     // Catch:{ all -> 0x0125 }
        L_0x0049:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x00f5
            if (r6 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r2 = r4
            goto L_0x006c
        L_0x0056:
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0054
            java.lang.String r2 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0125 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0054
            java.lang.Class r2 = r0.getReturnType()     // Catch:{ all -> 0x0125 }
        L_0x006c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0125 }
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x00e5
            if (r6 == 0) goto L_0x008c
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x008c
            java.lang.String r2 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0125 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x008c
            java.lang.Class r4 = r0.getReturnType()     // Catch:{ all -> 0x0125 }
        L_0x008c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0125 }
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0115
            androidx.window.sidecar.SidecarDeviceState r6 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x0125 }
            r6.<init>()     // Catch:{ all -> 0x0125 }
            r4 = 3
            r6.posture = r4     // Catch:{ NoSuchFieldError -> 0x009d }
            goto L_0x00ca
        L_0x009d:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r3 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r2 = "setPosture"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0125 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0125 }
            java.lang.reflect.Method r1 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0125 }
            X.AnonymousClass000.A1L(r0, r4, r7)     // Catch:{ all -> 0x0125 }
            r1.invoke(r6, r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "getPosture"
            java.lang.Object r1 = X.AnonymousClass000.A0h(r3, r6, r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x0125 }
            int r0 = X.C90514aH.A0H(r1)     // Catch:{ all -> 0x0125 }
            if (r0 == r4) goto L_0x00ca
            java.lang.String r0 = "Invalid device posture getter/setter"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0125 }
            r1.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0124
        L_0x00ca:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x0125 }
            r1.<init>()     // Catch:{ all -> 0x0125 }
            android.graphics.Rect r0 = r1.getRect()     // Catch:{ all -> 0x0125 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0125 }
            r1.setRect(r0)     // Catch:{ all -> 0x0125 }
            r1.getType()     // Catch:{ all -> 0x0125 }
            r1.setType(r5)     // Catch:{ all -> 0x0125 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x0125 }
            r0.<init>()     // Catch:{ all -> 0x0125 }
            return r5
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x0125 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0125 }
            r1.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0124
        L_0x00f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x0125 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0125 }
            r1.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0124
        L_0x0105:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x0125 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0125 }
            r1.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0124
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)     // Catch:{ all -> 0x0125 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0125 }
            r1.<init>(r0)     // Catch:{ all -> 0x0125 }
        L_0x0124:
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208139xi.A03():boolean");
    }

    public void Bqr(C22851Ax0 ax0) {
        this.A00 = new C208129xh(ax0);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.A01, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    public C208139xi(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        C202089l1 r0 = new C202089l1(C023109s.A0C);
        this.A02 = sidecarImpl;
        this.A01 = r0;
    }

    public final AnonymousClass9V8 A00(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder A002 = AnonymousClass93T.A00(activity);
        if (A002 == null) {
            return new AnonymousClass9V8(C023409w.A00);
        }
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A002);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        C202089l1 r1 = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return r1.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    public void Bkj(Activity activity) {
        IBinder A002 = AnonymousClass93T.A00(activity);
        if (A002 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A002);
            }
            Map map = this.A03;
            activity.unregisterComponentCallbacks((ComponentCallbacks) map.get(activity));
            map.remove(activity);
            Map map2 = this.A04;
            boolean A1S = AnonymousClass000.A1S(map2.size(), 1);
            map2.remove(A002);
            if (A1S && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }
}

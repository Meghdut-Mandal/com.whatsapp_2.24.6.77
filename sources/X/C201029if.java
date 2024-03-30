package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.9if  reason: invalid class name and case insensitive filesystem */
public final class C201029if {
    public static final void A01(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            Class<SidecarDeviceState> cls = SidecarDeviceState.class;
            try {
                Method A0G = AnonymousClass001.A0G(cls, Integer.TYPE, "setPosture", new Class[1], 0);
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, i, 0);
                A0G.invoke(sidecarDeviceState, objArr);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static final List A00(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return C023409w.A00;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0h = AnonymousClass000.A0h(SidecarWindowLayoutInfo.class, sidecarWindowLayoutInfo, "getDisplayFeatures");
                AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) A0h;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return C023409w.A00;
            }
        }
    }

    public final int A02(SidecarDeviceState sidecarDeviceState) {
        int i;
        try {
            i = sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0h = AnonymousClass000.A0h(SidecarDeviceState.class, sidecarDeviceState, "getPosture");
                AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type kotlin.Int");
                i = AnonymousClass000.A0I(A0h);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }
}

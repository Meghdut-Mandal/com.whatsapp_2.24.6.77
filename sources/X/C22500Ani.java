package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.Ani  reason: case insensitive filesystem */
public final class C22500Ani extends AnonymousClass00R implements C006302t {
    public static final C22500Ani A00 = new C22500Ani();

    public C22500Ani() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        AnonymousClass00C.A0D(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

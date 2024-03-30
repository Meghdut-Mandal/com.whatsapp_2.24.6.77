package X;

import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;

/* renamed from: X.89H  reason: invalid class name */
public final class AnonymousClass89H extends C165997ur {
    public void BWa(int i, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("releaseMwaResources: onError ");
        A0u.append(i);
        A0u.append(". ");
        A0u.append(str);
        AnonymousClass6YR.A09("lam:LinkedAppManager", AnonymousClass000.A0t(A0u, '.'), (Throwable) null);
    }

    public void Bf4(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(appLinkLinkInfoResponse, "releaseMwaResources: onResult ", C36341k9.A0i(appLinkLinkInfoResponse)));
    }
}

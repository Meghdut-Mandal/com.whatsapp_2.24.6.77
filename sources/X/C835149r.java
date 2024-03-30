package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;

/* renamed from: X.49r  reason: invalid class name and case insensitive filesystem */
public final class C835149r extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C835149r(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(0);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity = this.this$0;
        C20810yC r9 = linkedDeviceEditDeviceActivity.A0D;
        AnonymousClass17Y r4 = linkedDeviceEditDeviceActivity.A05;
        C19700wN r3 = linkedDeviceEditDeviceActivity.A03;
        C19460v5 r1 = linkedDeviceEditDeviceActivity.A00;
        if (r1 != null) {
            C21060yb r7 = linkedDeviceEditDeviceActivity.A08;
            AnonymousClass1LU r8 = linkedDeviceEditDeviceActivity.A04;
            if (r8 != null) {
                C19460v5 r2 = linkedDeviceEditDeviceActivity.A01;
                if (r2 != null) {
                    return new AnonymousClass3H6(r1, r2, r3, r4, linkedDeviceEditDeviceActivity, linkedDeviceEditDeviceActivity, r7, r8, r9);
                }
                throw C36331k8.A0d("subscriptionManager");
            }
            throw C36331k8.A0d("smbMDExtensionUtils");
        }
        throw C36331k8.A0d("smbStrings");
    }
}

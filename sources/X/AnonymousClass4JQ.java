package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.4JQ  reason: invalid class name */
public final class AnonymousClass4JQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JQ(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(1);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.this$0.A0A.getValue();
        DeviceJid deviceJid = this.this$0.A05;
        if (deviceJid == null) {
            throw C36331k8.A0d("deviceJid");
        }
        C80263v7.A00(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 32);
        return AnonymousClass0AJ.A00;
    }
}

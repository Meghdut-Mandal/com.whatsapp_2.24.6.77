package X;

import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.3tn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79483tn implements C25711Hj {
    public final /* synthetic */ LinkedDevicesSharedViewModel A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C79483tn(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A00 = linkedDevicesSharedViewModel;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A00;
        String str = this.A01;
        try {
            C236419g r4 = linkedDevicesSharedViewModel.A0G;
            boolean A1O = AnonymousClass000.A1O(r4.A0A().size());
            DeviceJid A02 = DeviceJid.Companion.A02(str);
            boolean z = false;
            if (!A1O) {
                z = true;
            }
            r4.A0C(A02, "user_initiated", false, z);
        } catch (C19740wR e) {
            Log.e(AnonymousClass000.A0p("Invalid jid: ", str, AnonymousClass000.A0u()), e);
        }
    }
}

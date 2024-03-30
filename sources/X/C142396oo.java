package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.6oo  reason: invalid class name and case insensitive filesystem */
public class C142396oo implements AnonymousClass4UK {
    public final /* synthetic */ AnonymousClass6WM A00;

    public void BYX(DeviceJid deviceJid, int i) {
    }

    public void BZ0(DeviceJid deviceJid) {
    }

    public C142396oo(AnonymousClass6WM r1) {
        this.A00 = r1;
    }

    public void BZ1(DeviceJid deviceJid) {
        C1256060o r2 = this.A00.A02;
        C36321k7.A1K(deviceJid, "VoiceService/notifyDeviceIdentityChanged ", AnonymousClass000.A0u());
        AnonymousClass6YM.A07(r2.A00, deviceJid, false);
    }

    public void BZ2(DeviceJid deviceJid) {
        C1256060o r2 = this.A00.A02;
        C36321k7.A1K(deviceJid, "VoiceService/notifyDeviceIdentityDeleted ", AnonymousClass000.A0u());
        AnonymousClass6YM.A07(r2.A00, deviceJid, true);
    }
}

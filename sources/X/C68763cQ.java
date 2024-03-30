package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3cQ  reason: invalid class name and case insensitive filesystem */
public final class C68763cQ implements AnonymousClass4UK, AnonymousClass16A {
    public final C99424tL A00;
    public final UserJid A01;

    public void BSM(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        A00(userJid.getPrimaryDevice());
    }

    public /* synthetic */ void BSP(UserJid userJid) {
    }

    public void BYX(DeviceJid deviceJid, int i) {
        AnonymousClass00C.A0D(deviceJid, 0);
        A00(deviceJid);
    }

    public void BZ2(DeviceJid deviceJid) {
    }

    private final void A00(DeviceJid deviceJid) {
        if (AnonymousClass00C.A0J(this.A01.getPrimaryDevice(), deviceJid)) {
            this.A00.A04((Object) null);
        }
    }

    public C68763cQ(C99424tL r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }

    public void BZ0(DeviceJid deviceJid) {
        A00(deviceJid);
    }

    public void BZ1(DeviceJid deviceJid) {
        A00(deviceJid);
    }
}

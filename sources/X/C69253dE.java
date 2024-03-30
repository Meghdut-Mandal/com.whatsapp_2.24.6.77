package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3dE  reason: invalid class name and case insensitive filesystem */
public class C69253dE implements AnonymousClass16A {
    public final /* synthetic */ C50172kK A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ void BSP(UserJid userJid) {
    }

    public C69253dE(C50172kK r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void BSM(UserJid userJid) {
        if (this.A01.equals(userJid)) {
            this.A00.A06.countDown();
        }
    }
}

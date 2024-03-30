package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2YG  reason: invalid class name */
public final class AnonymousClass2YG extends C68993cn {
    public AnonymousClass354 A00;
    public final C28981Uw A01;
    public final UserJid A02;
    public final AnonymousClass1ZL A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2YG(C27591Ow r1, C28981Uw r2, UserJid userJid, AnonymousClass4OL r4, AnonymousClass1ZL r5, AnonymousClass354 r6, C19770wU r7) {
        super(r1, r4, r7);
        C36321k7.A11(r7, r1, r4);
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r6;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}

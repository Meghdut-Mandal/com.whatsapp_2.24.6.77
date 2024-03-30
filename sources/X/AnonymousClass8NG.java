package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.8NG  reason: invalid class name */
public final class AnonymousClass8NG extends AnonymousClass8NN implements C22901AyD {
    public AnonymousClass8NG() {
        super(AnonymousClass8SW.DEFAULT_INSTANCE);
    }

    public static void A00(Jid jid, AnonymousClass8NG r1) {
        r1.A0X(jid.getRawString());
    }

    public static void A01(Jid jid, AnonymousClass8NG r1, C64933Qa r2) {
        r1.A0X(AnonymousClass143.A03(jid));
        r1.A0Y(r2.A02);
    }

    public void A0U() {
        AnonymousClass8SW r1 = (AnonymousClass8SW) C90524aI.A0H(this);
        r1.bitField0_ &= -2;
        r1.remoteJid_ = AnonymousClass8SW.DEFAULT_INSTANCE.remoteJid_;
    }

    public void A0V(String str) {
        AnonymousClass8SW r1 = (AnonymousClass8SW) C90524aI.A0H(this);
        int i = AnonymousClass8SW.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 4;
        r1.id_ = str;
    }

    public void A0W(String str) {
        AnonymousClass8SW r1 = (AnonymousClass8SW) C90524aI.A0H(this);
        int i = AnonymousClass8SW.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 8;
        r1.participant_ = str;
    }

    public void A0X(String str) {
        AnonymousClass8SW r1 = (AnonymousClass8SW) C90524aI.A0H(this);
        int i = AnonymousClass8SW.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 1;
        r1.remoteJid_ = str;
    }

    public void A0Y(boolean z) {
        AnonymousClass8SW r1 = (AnonymousClass8SW) C90524aI.A0H(this);
        int i = AnonymousClass8SW.FROM_ME_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.fromMe_ = z;
    }
}

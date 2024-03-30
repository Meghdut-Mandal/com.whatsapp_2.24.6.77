package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.16I  reason: invalid class name */
public class AnonymousClass16I extends C19590wC {
    public void A00(AnonymousClass11F r3) {
        for (C226815j A04 : getObservers()) {
            A04.A04(r3);
        }
    }

    public void A01(AnonymousClass11F r3) {
        for (C226815j A05 : getObservers()) {
            A05.A05(r3);
        }
    }

    public void A02(UserJid userJid) {
        for (C226815j A06 : getObservers()) {
            A06.A06(userJid);
        }
    }

    public void A03(Collection collection) {
        for (C226815j A09 : getObservers()) {
            A09.A09(collection);
        }
    }

    public void A04(Collection collection) {
        for (C226815j A0B : getObservers()) {
            A0B.A0B(collection);
        }
    }

    public AnonymousClass16I(AnonymousClass005 r1) {
        super(r1);
    }

    public AnonymousClass16I() {
        super(new C18910u1(Collections.emptySet(), (AnonymousClass004) null));
    }
}

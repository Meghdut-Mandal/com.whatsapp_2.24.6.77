package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

public class B9I implements AnonymousClass4PE {
    public Object A00;
    public final int A01;

    public B9I(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C167497y9 B3s(UserJid userJid) {
        UserJid userJid2 = userJid;
        switch (this.A01) {
            case 0:
                B9I b9i = this;
                C19730wQ r4 = (C19730wQ) ((C27121Mz) b9i.A00).A01.A4g.get();
                Application A002 = AnonymousClass1JT.A00(((C27121Mz) b9i.A00).A01.AfJ);
                AnonymousClass185 r8 = (AnonymousClass185) ((C27121Mz) b9i.A00).A01.A8u.get();
                AnonymousClass1KK r6 = (AnonymousClass1KK) ((C27121Mz) b9i.A00).A01.A19.get();
                C26421Kc r7 = (C26421Kc) ((C27121Mz) b9i.A00).A01.A1A.get();
                return new C167497y9(A002, r4, (C63553Km) ((C27121Mz) b9i.A00).A01.A18.get(), r6, r7, r8, userJid2, (C19770wU) ((C27121Mz) b9i.A00).A01.A9Y.get());
            case 1:
                B9I b9i2 = this;
                C19730wQ r42 = (C19730wQ) ((AnonymousClass1U2) b9i2.A00).A00.A4g.get();
                Application A003 = AnonymousClass1JT.A00(((AnonymousClass1U2) b9i2.A00).A00.AfJ);
                AnonymousClass185 r82 = (AnonymousClass185) ((AnonymousClass1U2) b9i2.A00).A00.A8u.get();
                AnonymousClass1KK r62 = (AnonymousClass1KK) ((AnonymousClass1U2) b9i2.A00).A00.A19.get();
                C26421Kc r72 = (C26421Kc) ((AnonymousClass1U2) b9i2.A00).A00.A1A.get();
                return new C167497y9(A003, r42, (C63553Km) ((AnonymousClass1U2) b9i2.A00).A00.A18.get(), r62, r72, r82, userJid2, (C19770wU) ((AnonymousClass1U2) b9i2.A00).A00.A9Y.get());
            default:
                return null;
        }
    }
}

package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7rd  reason: invalid class name and case insensitive filesystem */
public class C164327rd implements C22909AyL {
    public Object A00;
    public final int A01;

    public C164327rd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C195419Uf B3r(UserJid userJid) {
        UserJid userJid2 = userJid;
        switch (this.A01) {
            case 0:
                C164327rd r1 = this;
                AnonymousClass6VE r4 = (AnonymousClass6VE) ((C27121Mz) r1.A00).A01.A1Q.get();
                return new C195419Uf((AnonymousClass6MH) ((C27121Mz) r1.A00).A01.A1P.get(), r4, (AnonymousClass9Y1) ((C27121Mz) r1.A00).A01.A1R.get(), userJid2, (C19770wU) ((C27121Mz) r1.A00).A01.A9Y.get());
            case 1:
                C164327rd r12 = this;
                AnonymousClass6VE r42 = (AnonymousClass6VE) ((AnonymousClass1U2) r12.A00).A00.A1Q.get();
                return new C195419Uf((AnonymousClass6MH) ((AnonymousClass1U2) r12.A00).A00.A1P.get(), r42, (AnonymousClass9Y1) ((AnonymousClass1U2) r12.A00).A00.A1R.get(), userJid2, (C19770wU) ((AnonymousClass1U2) r12.A00).A00.A9Y.get());
            default:
                return null;
        }
    }
}

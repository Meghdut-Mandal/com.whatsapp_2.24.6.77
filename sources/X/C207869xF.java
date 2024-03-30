package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9xF  reason: invalid class name and case insensitive filesystem */
public final class C207869xF implements AnonymousClass04G {
    public final AnonymousClass9DS A00;
    public final C195419Uf A01;
    public final UserJid A02;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public AnonymousClass04R B3o(Class cls) {
        AnonymousClass9DS r0 = this.A00;
        UserJid userJid = this.A02;
        C195419Uf r11 = this.A01;
        C27121Mz r1 = r0.A00;
        C18800tq r02 = r1.A01;
        C19970wo A0V = C36351kA.A0V(r02);
        C19730wQ A0N = C36351kA.A0N(r02);
        Application A002 = AnonymousClass1JT.A00(r02.AfJ);
        AnonymousClass3L6 A0U = C165597tg.A0U(r02);
        C202279lS A0Q = C165607th.A0Q(r02);
        C18830tt r5 = r02.A00;
        AnonymousClass9Y1 A0P = C165607th.A0P(r02);
        AnonymousClass1KP A2v = C18800tq.A2v(r02);
        AnonymousClass1KK A0L = C165587tf.A0L(r02);
        C19470v6 r9 = C19470v6.A00;
        C61223Ba A0V2 = C165607th.A0V(r5);
        C63553Km r12 = (C63553Km) r02.A18.get();
        C131496Pg r22 = (C131496Pg) r5.A10.get();
        UserJid userJid2 = userJid;
        C198849eI r18 = (C198849eI) r5.A0x.get();
        return new C167507yA(A002, r9, A0N, r11, r12, A0L, (AnonymousClass1KL) r02.A1B.get(), new AnonymousClass9ZJ(), C27111My.A0E(r1.A00), (C29461Ws) r02.A1S.get(), r18, A0P, A0Q, A2v, r22, A0V, userJid2, A0V2, A0U, C36341k9.A0Z(r02));
    }

    public C207869xF(AnonymousClass9DS r1, C195419Uf r2, UserJid userJid) {
        C36321k7.A0y(userJid, r1);
        this.A02 = userJid;
        this.A01 = r2;
        this.A00 = r1;
    }
}

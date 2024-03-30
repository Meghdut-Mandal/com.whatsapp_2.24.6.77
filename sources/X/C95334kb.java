package X;

import android.app.Application;
import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.4kb  reason: invalid class name and case insensitive filesystem */
public class C95334kb extends AnonymousClass08K {
    public final C115855jY A00;
    public final C134986bw A01;
    public final Jid A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass04R A02(AnonymousClass08M r41, Class cls, String str) {
        C115855jY r0 = this.A00;
        boolean z = this.A04;
        String str2 = this.A03;
        C134986bw r13 = this.A01;
        boolean z2 = this.A05;
        Jid jid = this.A02;
        C32591ds r3 = r0.A00;
        C18800tq r2 = r3.A02;
        Application A002 = AnonymousClass1JT.A00(r2.AfJ);
        C18830tt r1 = r2.A00;
        AnonymousClass1QW A0N = C90494aF.A0N(r1);
        C27111My r22 = r3.A00;
        C145896uh A0Y = C27111My.A0Y(r22);
        C32581dr r02 = r3.A01;
        AnonymousClass6MI r10 = new AnonymousClass6MI((AnonymousClass1QW) r02.A1K.A00.A0Z.get());
        C142616pA A0J = C90494aF.A0J(r1);
        C119295pa r30 = new C119295pa();
        C20760y7 A003 = C32581dr.A00();
        C142646pD r222 = (C142646pD) r1.A1S.get();
        AnonymousClass5DR r24 = (AnonymousClass5DR) r1.A0c.get();
        C129006Eo r25 = (C129006Eo) r1.A3l.get();
        C1260562j r26 = (C1260562j) r1.A1O.get();
        AnonymousClass6MI r27 = r10;
        AnonymousClass7g3 r28 = (AnonymousClass7g3) r22.A2I.get();
        return new C95394km(A002, r41, (C115865jZ) r02.A0B.get(), (AnonymousClass1KK) r2.A19.get(), A0J, r222, A0Y, r24, r25, r26, r27, r28, (AnonymousClass7gA) r22.A2H.get(), r30, (AnonymousClass7gB) r02.A0A.get(), r13, jid, A0N, (C33191es) r1.A1P.get(), str2, A003, z, z2);
    }

    public C95334kb(Bundle bundle, AnonymousClass017 r2, C115855jY r3, C134986bw r4, Jid jid, String str, boolean z, boolean z2) {
        super(bundle, r2);
        this.A01 = r4;
        this.A02 = jid;
        this.A04 = z;
        this.A00 = r3;
        this.A03 = str;
        this.A05 = z2;
    }
}

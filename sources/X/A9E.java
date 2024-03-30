package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class A9E implements C22917AyT {
    public int A00;
    public int A01 = 4;
    public C001700s A02;
    public final C29461Ws A03;
    public final C193049Jq A04;
    public final UserJid A05;
    public final List A06;
    public final AnonymousClass17Y A07;

    public A9E(AnonymousClass17Y r3, C29461Ws r4, C193049Jq r5, UserJid userJid, List list) {
        AnonymousClass00C.A0D(r5, 5);
        this.A07 = r3;
        this.A05 = userJid;
        this.A06 = list;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void Blo(C21114A8z a8z) {
        this.A01 = a8z.A00;
        List<C207269up> list = a8z.A01;
        if (list != null) {
            for (C207269up A0C : list) {
                this.A03.A0C(A0C, this.A05);
            }
        }
        a8z.A01 = A00(this);
        this.A07.A0H(new AVa(this, a8z, 34));
    }

    public static final ArrayList A00(A9E a9e) {
        C206769tw r0;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = a9e.A06.iterator();
        while (it.hasNext()) {
            C207269up A0N = C165617ti.A0N(a9e.A03, AnonymousClass001.A0C(it));
            if (A0N != null && (r0 = A0N.A01) != null && r0.A00 == 0 && !A0N.A08) {
                A0I.add(A0N);
            }
        }
        return A0I;
    }
}

package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AjD  reason: case insensitive filesystem */
public final class C22252AjD extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C195919Wu $request;
    public final /* synthetic */ AnonymousClass8V9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22252AjD(C195919Wu r2, AnonymousClass8V9 r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C185718ug r7;
        C185718ug r9;
        AnonymousClass8V9 r1 = this.this$0;
        String str = this.$iqId;
        C195919Wu r5 = this.$request;
        C36321k7.A0w(str, r5);
        AnonymousClass1KK r0 = r1.A01;
        UserJid userJid = r5.A03;
        String A09 = r0.A09(userJid);
        if (A09 != null) {
            r1.A00 = r5;
        }
        C185718ug r8 = null;
        Long A0y = C36441kJ.A0y(r5.A01);
        Long A0y2 = C36441kJ.A0y(r5.A00);
        List list = r5.A04;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0J.add(new C185648uZ(AnonymousClass001.A0C(it), 6));
        }
        if (A09 != null) {
            r7 = new C185718ug(A09, 7);
        } else {
            r7 = null;
        }
        AnonymousClass9W6 r3 = r5.A02;
        if (r3 != null) {
            r8 = new C185718ug(C007103b.A0Q(",", "", "", r3.A02, C22562Aor.A00), 8);
            r9 = new C185718ug(C36441kJ.A0y(r3.A01), C36441kJ.A0y(r3.A00));
        } else {
            r9 = null;
        }
        return new C186018vH(userJid, r7, r8, r9, A0y, A0y2, str, (List) A0J);
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3tq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79513tq implements C25711Hj {
    public final /* synthetic */ AnonymousClass1X4 A00;
    public final /* synthetic */ AnonymousClass3XT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C79513tq(AnonymousClass1X4 r1, AnonymousClass3XT r2, String str, List list) {
        this.A00 = r1;
        this.A03 = list;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void accept(Object obj) {
        AnonymousClass1X4 r4 = this.A00;
        List list = this.A03;
        String str = this.A02;
        AnonymousClass3XT r6 = this.A01;
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            A0r.add(C64933Qa.A02(it));
        }
        r4.A0S.A01(new C35621iz(r4, r4.A0D((C145166tS) null, r6, (AnonymousClass3JL) null, (C63663Kx) null, (AnonymousClass3BG) null, (AnonymousClass3T1) null, (AnonymousClass3L1) null, C79163tH.A00, (Integer) null, str, A0r, (List) null, false, false, false), 31), 69);
    }
}

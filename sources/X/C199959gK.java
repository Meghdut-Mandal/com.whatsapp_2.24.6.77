package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9gK  reason: invalid class name and case insensitive filesystem */
public class C199959gK {
    public static final C21828Ab5 A0A = new C21828Ab5();
    public int A00 = 0;
    public final C194879Rp A01;
    public final C195299Tr A02;
    public final Object A03;
    public final Object A04;
    public final HashMap A05 = AnonymousClass001.A0J();
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final Object A09;

    public Object A00() {
        C195299Tr r3 = this.A02;
        if (!r3.A00.A07()) {
            return this.A09;
        }
        if (this.A00 != 0) {
            C23091B4b b4b = this.A01.A00;
            Object obj = this.A09;
            int BOA = b4b.BOA(obj);
            if (BOA <= 0) {
                return null;
            }
            return ((List) obj).get(BOA - 1);
        } else if (this.A08) {
            return null;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1M(r3, "No results for path: ", A0u);
            throw new C173698Sr(A0u.toString());
        }
    }

    public void A02(C21670AUn aUn, Object obj, String str) {
        if (this.A07) {
            this.A06.add(aUn);
        }
        C194879Rp r3 = this.A01;
        C23091B4b b4b = r3.A00;
        b4b.BqC(this.A09, this.A00, obj);
        b4b.BqC(this.A03, this.A00, str);
        this.A00++;
        Collection collection = r3.A02;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("resultFound");
            }
        }
    }

    public C199959gK(C194879Rp r3, C195299Tr r4, Object obj, boolean z) {
        C201749kK.A03(obj, "root can not be null");
        C201749kK.A03(r3, "configuration can not be null");
        this.A07 = z;
        this.A02 = r4;
        this.A04 = obj;
        this.A01 = r3;
        AnonymousClass9YQ r1 = ((A8O) r3.A00).A00;
        this.A09 = r1.A01();
        this.A03 = r1.A01();
        this.A06 = AnonymousClass001.A0I();
        this.A08 = r3.A03.contains(C188068yz.SUPPRESS_EXCEPTIONS);
    }

    public ArrayList A01() {
        ArrayList A0I = AnonymousClass001.A0I();
        if (this.A00 > 0) {
            for (Object add : this.A01.A00.Bvj(this.A03)) {
                A0I.add(add);
            }
        }
        return A0I;
    }
}

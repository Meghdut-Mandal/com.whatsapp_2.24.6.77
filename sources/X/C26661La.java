package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.1La  reason: invalid class name and case insensitive filesystem */
public abstract class C26661La extends AnonymousClass1LZ {
    public final C26011In A00;

    public C26681Lc A0I() {
        return ((C26671Lb) this).A00;
    }

    public C26691Ld A0J() {
        return ((C26671Lb) this).A01;
    }

    public List A0M() {
        Collection values = ((AnonymousClass1LY) ((C26671Lb) this).A02.get()).A01.values();
        ArrayList<C26701Le> arrayList = new ArrayList<>();
        for (Object next : values) {
            if (((C26701Le) next).BJz((Object) null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(arrayList, 10));
        for (C26701Le BEa : arrayList) {
            arrayList2.add(BEa.BEa());
        }
        Set<String> A0e = C007103b.A0e(arrayList2);
        ArrayList arrayList3 = new ArrayList(AnonymousClass03U.A06(A0e, 10));
        for (String r2 : A0e) {
            arrayList3.add(new AnonymousClass3I4(true, r2));
        }
        return arrayList3;
    }

    public boolean A0N(C175958bL r5) {
        C26671Lb r3 = (C26671Lb) this;
        String str = r5.A02;
        Object obj = r5.A01;
        if (!(obj instanceof Boolean) || str == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C26701Le r0 = (C26701Le) ((AnonymousClass1LY) r3.A03.get()).A01.get(str);
        if (r0 == null) {
            return true;
        }
        r0.BQQ(booleanValue);
        return true;
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        Boolean bool;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass8NN A0p = AnonymousClass8OG.DEFAULT_INSTANCE.A0p();
        A0p.A0S();
        AnonymousClass8OG r1 = (AnonymousClass8OG) A0p.A00;
        r1.bitField0_ |= 1;
        r1.acknowledged_ = booleanValue;
        AnonymousClass8OG r12 = (AnonymousClass8OG) A0p.A0R();
        r5.A0S();
        AnonymousClass8SS r2 = (AnonymousClass8SS) r5.A00;
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.nuxAction_ = r12;
        r2.bitField0_ |= 33554432;
        return r5;
    }

    public Object A0L(AnonymousClass8SS r2) {
        AnonymousClass8OG r0 = r2.nuxAction_;
        if (r0 == null && (r0 = AnonymousClass8OG.DEFAULT_INSTANCE) == null) {
            return null;
        }
        return Boolean.valueOf(r0.acknowledged_);
    }

    public C26661La(C26011In r1, AnonymousClass1AC r2) {
        super(r2);
        this.A00 = r1;
    }
}

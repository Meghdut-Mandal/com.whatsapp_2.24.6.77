package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
public class C49382j1 extends C132446Tt {
    public final AnonymousClass171 A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        AnonymousClass27v r0 = (AnonymousClass27v) this.A01.get();
        if (r0 != null) {
            r0.A44(list);
        }
    }

    public C49382j1(AnonymousClass171 r2, AnonymousClass27v r3, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r2;
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = list2;
        this.A01 = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (this.A00.A0h(A0f, this.A02, true)) {
                A0I.add(A0f);
            }
        }
        return A0I;
    }
}

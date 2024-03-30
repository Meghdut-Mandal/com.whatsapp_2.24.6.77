package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Gr  reason: invalid class name */
public class AnonymousClass2Gr extends C48992iO {
    public final AnonymousClass16D A00;
    public final C230116v A01;

    public AnonymousClass2Gr(AnonymousClass16D r1, AnonymousClass171 r2, AnonymousClass27v r3, C18820ts r4, C230116v r5, List list) {
        super(r2, r3, r4, list);
        this.A00 = r1;
        this.A01 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list;
        ArrayList A0I = AnonymousClass001.A0I();
        WeakReference weakReference = this.A02;
        AnonymousClass27v r2 = (AnonymousClass27v) weakReference.get();
        if (r2 != null) {
            r2.A42(A0I);
            AnonymousClass27v r1 = (AnonymousClass27v) weakReference.get();
            if (r1 != null && (list = r1.A0S) != null && !list.isEmpty() && r1.A0U) {
                HashSet A16 = C36441kJ.A16();
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    C36361kB.A1S(A16, it);
                }
                List list2 = r2.A0S;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass11F A0a = C36401kF.A0a(it2);
                        if (A0a != null && !A16.contains(A0a)) {
                            AnonymousClass141 A0D = this.A00.A0D(A0a);
                            if (A0D.A0F != null) {
                                A0I.add(A0D);
                            }
                        }
                    }
                }
            }
            C20810yC r12 = this.A01.A01;
            if (!r12.A0E(3764) && !r12.A0E(3762)) {
                Iterator it3 = A0I.iterator();
                while (it3.hasNext()) {
                    if (AnonymousClass143.A0I(C36341k9.A0W(it3))) {
                        it3.remove();
                    }
                }
            }
            Collections.sort(A0I, new C43172Fh(this.A00, this.A01));
        }
        Iterator it4 = A0I.iterator();
        while (it4.hasNext()) {
            C36391kE.A1O(C36391kE.A0f(it4), this.A03);
        }
        return A0I;
    }
}

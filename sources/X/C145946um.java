package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6um  reason: invalid class name and case insensitive filesystem */
public final class C145946um implements C160087kR {
    public C110225aK A00;
    public final /* synthetic */ C131436Pa A01;

    public void B2J(C123815x8 r8) {
        ArrayList arrayList;
        C110225aK r3;
        Collection values;
        AnonymousClass00C.A0D(r8, 0);
        if (r8.A00 == 0) {
            C1277669o r0 = (C1277669o) r8.A03.A00;
            if (r0 != null) {
                r3 = new AnonymousClass51h(r0.A00, true, r0.A01);
            } else {
                r3 = new C1026751g((List) null, C36371kC.A11("client parsing error"), 4);
            }
        } else {
            AnonymousClass66O r32 = r8.A04;
            Map map = r32.A00;
            List list = null;
            if (map == null || (values = map.values()) == null) {
                arrayList = null;
            } else {
                List<C132286Sy> A0Y = C007103b.A0Y(values);
                arrayList = C36351kA.A0z(A0Y);
                for (C132286Sy r02 : A0Y) {
                    AnonymousClass000.A1F(arrayList, r02.A01);
                }
                if (arrayList.contains(-20)) {
                    r3 = new C1026751g((List) null, C36371kC.A11("client parsing error"), 4);
                }
            }
            Map map2 = r32.A00;
            if (map2 != null) {
                ArrayList<C132286Sy> A14 = C36441kJ.A14(map2.size());
                Iterator A0y = AnonymousClass000.A0y(map2);
                while (A0y.hasNext()) {
                    A14.add(C36351kA.A0u(A0y));
                }
                ArrayList A0z = C36351kA.A0z(A14);
                for (C132286Sy r03 : A14) {
                    A0z.add(r03.A06);
                }
                list = C007103b.A0Y(A0z);
            }
            r3 = new C1026751g(arrayList, list, 2);
        }
        this.A00 = r3;
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        this.A00 = new C1026751g((List) null, C36371kC.A11(iOException.getMessage()), 1);
    }

    public void BWk(Exception exc) {
        List A11;
        int i;
        AnonymousClass00C.A0D(exc, 0);
        if (exc instanceof AnonymousClass5V0) {
            A11 = C36371kC.A11(((AnonymousClass5V0) exc).error.A06);
            i = 2;
        } else {
            A11 = C36371kC.A11(exc.getMessage());
            i = 3;
        }
        this.A00 = new C1026751g((List) null, A11, i);
    }

    public C145946um(C131436Pa r1) {
        this.A01 = r1;
    }
}

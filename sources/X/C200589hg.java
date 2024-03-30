package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.9hg  reason: invalid class name and case insensitive filesystem */
public abstract class C200589hg {
    public static final Set A00 = Collections.emptySet();

    public static C200129gf A00(AnonymousClass9XZ r11, AnonymousClass9D4 r12, String str, boolean z, boolean z2, boolean z3) {
        Set set;
        String str2;
        AnonymousClass9D4 r10 = r12;
        if (r12 == null) {
            return null;
        }
        List list = AnonymousClass9RE.A00(C165617ti.A0B(r11.A0A, 0), 0).A05;
        if (list.isEmpty()) {
            set = A00;
        } else {
            HashSet A16 = C36441kJ.A16();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C21709AXg aXg = ((C196079Xo) list.get(i)).A00.A0L;
                if (aXg != null) {
                    for (C207069uV r1 : aXg.A03) {
                        if (r1.A04 != null) {
                            A16.add(r1.A03);
                        }
                    }
                }
            }
            set = A16;
        }
        Iterator it = set.iterator();
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object[] A0M = AnonymousClass001.A0M();
            C90514aH.A1Q(next, A0M, 0);
            A0M[1] = str;
            C131916Rh.A01("DrmSessionManagerHelper", "DRM scheme %s for vid=%s", A0M);
        }
        if (set.isEmpty()) {
            C131916Rh.A01("DrmSessionManagerHelper", "Not a protected video for vid=%s", str);
            return null;
        }
        UUID uuid = AnonymousClass9B7.A04;
        if (set.contains(uuid)) {
            C200129gf r13 = new C200129gf(C201699k8.A00(uuid), new AnonymousClass9MN(r10, str2, z, z2, z3), uuid, new int[0]);
            r13.A02.A05();
            return r13;
        }
        throw new AnonymousClass924();
    }
}

package X;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5zu  reason: invalid class name and case insensitive filesystem */
public final class C125435zu {
    public final AnonymousClass6K3 A00(Context context, C20410xW r13, List list) {
        int i;
        File file;
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            boolean z = A0l instanceof C46882bp;
            if (z || (A0l instanceof C46812bi) || (A0l instanceof C47002cZ)) {
                AnonymousClass00C.A0E(A0l, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia");
                C65013Qj r0 = ((AnonymousClass2bU) A0l).A01;
                if (!(r0 == null || (file = r0.A0I) == null)) {
                    if (!z) {
                        if (A0l instanceof C46812bi) {
                            i3 = 1;
                        } else {
                            i4 = 1;
                        }
                        A1G.put(A0l, new C120205r8(file, (String) obj));
                    }
                }
            } else if (A0l instanceof AnonymousClass2bV) {
                AnonymousClass2bV r2 = (AnonymousClass2bV) A0l;
                AnonymousClass00C.A0D(r2, 0);
                C38401ok A00 = C55452ue.A00(context, (C32721e5) null, r2);
                obj = C007103b.A0M(A00.A0D);
                file = r13.A00(r2, A00);
                if (file == null) {
                }
            }
            i2 = 1;
            A1G.put(A0l, new C120205r8(file, (String) obj));
        }
        if (i2 + i3 + i4 > 1) {
            i = 7;
        } else {
            boolean A1S = AnonymousClass000.A1S(A1G.size(), 1);
            if (i2 != 0) {
                i = 4;
                if (A1S) {
                    i = 1;
                }
            } else if (i3 != 0) {
                i = 5;
                if (A1S) {
                    i = 2;
                }
            } else if (i4 != 0) {
                i = 6;
                if (A1S) {
                    i = 3;
                }
            } else {
                i = 0;
            }
        }
        return new AnonymousClass6K3(A1G, i);
    }
}

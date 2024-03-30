package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3PC  reason: invalid class name */
public final class AnonymousClass3PC {
    public Map A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1A6 A06;
    public final AnonymousClass1FI A07;
    public final AnonymousClass16E A08;
    public final C20810yC A09;
    public final AnonymousClass1CR A0A;
    public final C605938l A0B;
    public final Comparator A0C = new AnonymousClass4YZ(this, 11);

    public static final void A00(AnonymousClass3PC r7, List list, Map map, int i) {
        if (i != 0) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof UserJid) {
                    A0I.add(next);
                }
            }
            int i2 = 0;
            for (Object next2 : A0I) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    throw C36351kA.A0v();
                }
                int i4 = r7.A05;
                int i5 = ((i4 - i2) + 1) * i;
                if (i2 >= i4) {
                    i5 = i;
                }
                C36421kH.A1M(next2, map, C36381kD.A07(map.get(next2)) + i5);
                i2 = i3;
            }
        }
    }

    public String toString() {
        Map map = this.A00;
        if (map == null) {
            return "";
        }
        ArrayList A14 = C36441kJ.A14(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A11.getKey());
            A0u.append(": ");
            A14.add(C36381kD.A10(A0u, AnonymousClass000.A0I(A11.getValue())));
        }
        return C36381kD.A0x("\n ", A14);
    }

    public AnonymousClass3PC(AnonymousClass1A6 r3, AnonymousClass1FI r4, AnonymousClass16E r5, C20810yC r6, AnonymousClass1CR r7, C605938l r8) {
        C36321k7.A1B(r6, r5, r3, r7, r4);
        this.A09 = r6;
        this.A08 = r5;
        this.A06 = r3;
        this.A0A = r7;
        this.A07 = r4;
        this.A0B = r8;
        this.A01 = r6.A07(6463);
        this.A03 = r6.A07(6464);
        this.A02 = r6.A07(6465);
        this.A04 = r6.A07(6466);
        this.A05 = r6.A07(6467);
    }
}

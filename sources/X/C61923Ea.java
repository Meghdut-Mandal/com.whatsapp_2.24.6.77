package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ea  reason: invalid class name and case insensitive filesystem */
public class C61923Ea {
    public int A00;
    public int A01 = -1;
    public final C34831hi A02;
    public final String A03;
    public final /* synthetic */ C39871u3 A04;

    public C61923Ea(C39871u3 r2, String str, List list, int i) {
        this.A04 = r2;
        this.A00 = i;
        this.A03 = str;
        this.A02 = C36441kJ.A0s(list);
    }

    public boolean A00(C80143uv r9) {
        C34831hi r2 = this.A02;
        int indexOf = C36401kF.A0w(r2).indexOf(r9);
        if (!C36401kF.A0w(r2).remove(r9)) {
            return false;
        }
        this.A01 = indexOf;
        r2.A0D(r2.A04());
        C39871u3 r7 = this.A04;
        if (C36401kF.A00(r2) != 0) {
            return true;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C34831hi r5 = r7.A06;
        int i = 1;
        for (C61923Ea r22 : C36401kF.A0w(r5)) {
            if (this.A03.equals(r22.A03)) {
                r7.A00 = i;
            } else {
                r22.A00 = i;
                A0I.add(r22);
                i++;
            }
        }
        r5.A0D(A0I);
        return true;
    }
}

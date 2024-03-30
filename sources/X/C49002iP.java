package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2iP  reason: invalid class name and case insensitive filesystem */
public class C49002iP extends C132446Tt {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final boolean A03;
    public final /* synthetic */ C70803fk A04;

    public C49002iP(C70803fk r1, String str, ArrayList arrayList, List list, boolean z) {
        this.A04 = r1;
        this.A02 = list;
        this.A01 = arrayList;
        this.A03 = z;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C70803fk r5 = this.A04;
        C20310xM r4 = r5.A3R;
        List<C64933Qa> list = this.A02;
        ArrayList A0I = AnonymousClass001.A0I();
        for (C64933Qa A032 : list) {
            AnonymousClass3T1 A033 = r4.A1B.A03(A032);
            if (A033 != null) {
                A0I.add(A033);
            }
        }
        ArrayList A15 = C36441kJ.A15(A0I);
        AnonymousClass1X4 A0A = C70803fk.A0A(r5);
        AnonymousClass1XY r2 = r5.A1Z;
        ArrayList A152 = C36441kJ.A15(A15);
        Collections.sort(A152, C81713xS.A00);
        A0A.A0H(r2, (AnonymousClass3XT) null, this.A00, A152, this.A01, this.A03);
        return null;
    }
}

package X;

import java.util.Set;

/* renamed from: X.9Pe  reason: invalid class name and case insensitive filesystem */
public class C194319Pe {
    public final /* synthetic */ AnonymousClass9XY A00;

    public C194319Pe(AnonymousClass9XY r1) {
        this.A00 = r1;
    }

    public void A00(String str, Set set, boolean z) {
        boolean z2;
        AnonymousClass9XY r2 = this.A00;
        AnonymousClass3B0 r0 = r2.A06;
        boolean z3 = r0.A0A;
        Set set2 = set;
        boolean contains = set.contains(r0.A04);
        if (!z3 ? contains : !contains) {
            z2 = false;
        } else {
            z2 = true;
        }
        r2.A00 = z2;
        r2.A03.Bp3(new AVk(r2, set2, str, 1, z));
    }
}

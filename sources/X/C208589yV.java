package X;

import android.graphics.Path;

/* renamed from: X.9yV  reason: invalid class name and case insensitive filesystem */
public class C208589yV implements C22854Ax4 {
    public final Path.FillType A00;
    public final AnonymousClass814 A01;
    public final AnonymousClass817 A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public B0T Bvf(AnonymousClass9Y2 r2, C165737u4 r3, C208409yC r4) {
        return new C208389yA(r3, this, r4);
    }

    public C208589yV(Path.FillType fillType, AnonymousClass814 r2, AnonymousClass817 r3, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A00 = fillType;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeFill{color=, fillEnabled=");
        A0u.append(this.A05);
        return AnonymousClass000.A0s(A0u);
    }
}

package X;

/* renamed from: X.9yQ  reason: invalid class name and case insensitive filesystem */
public class C208539yQ implements C22854Ax4 {
    public final Integer A00;
    public final boolean A01;

    public B0T Bvf(AnonymousClass9Y2 r2, C165737u4 r3, C208409yC r4) {
        if (r3.A0Q) {
            return new C208299y0(this);
        }
        AnonymousClass6GP.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public C208539yQ(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MergePaths{mode=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "SUBTRACT";
                    break;
                case 3:
                    str = "INTERSECT";
                    break;
                case 4:
                    str = "EXCLUDE_INTERSECTIONS";
                    break;
                default:
                    str = "MERGE";
                    break;
            }
        } else {
            str = "null";
        }
        A0u.append(str);
        return AnonymousClass000.A0s(A0u);
    }
}

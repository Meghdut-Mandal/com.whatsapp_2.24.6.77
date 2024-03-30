package X;

/* renamed from: X.8ul  reason: invalid class name and case insensitive filesystem */
public class C185768ul extends C50492l0 implements C16450pG {
    public C185768ul(Long l, int i) {
        long longValue;
        String str;
        AnonymousClass6QB A0q = C36441kJ.A0q("messages");
        boolean A0K = C203539oF.A0K(l);
        if (i != 0) {
            if (A0K) {
                longValue = l.longValue();
                str = "before";
            }
            C592133b.A00(A0q, this);
        }
        if (A0K) {
            longValue = l.longValue();
            str = "after";
        }
        C592133b.A00(A0q, this);
        C36411kG.A1K(A0q, str, longValue);
        C592133b.A00(A0q, this);
    }
}

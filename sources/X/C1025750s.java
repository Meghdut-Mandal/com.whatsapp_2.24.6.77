package X;

/* renamed from: X.50s  reason: invalid class name and case insensitive filesystem */
public class C1025750s extends C119225pT {
    public final int A00;

    public C1025750s(int i) {
        super("frequently_contacted_biz");
        this.A00 = 0;
        if (i > 0) {
            this.A00 = i;
            return;
        }
        throw AnonymousClass001.A08("FrequentlyContactedBizWidget max list size cannot be zero or negative");
    }
}

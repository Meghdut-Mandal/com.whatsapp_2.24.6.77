package X;

/* renamed from: X.2VJ  reason: invalid class name */
public class AnonymousClass2VJ extends C81783xZ {
    public final /* synthetic */ C20350xQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2VJ(C19730wQ r2, AnonymousClass171 r3, C20350xQ r4) {
        super(r2, r3, 1);
        this.A00 = r4;
    }

    public int A01(AnonymousClass141 r2, AnonymousClass141 r3) {
        if (r2.A0J() == null && r3.A0J() != null) {
            return 1;
        }
        if (r2.A0J() == null || r3.A0J() != null) {
            return super.compare(r2, r3);
        }
        return -1;
    }
}

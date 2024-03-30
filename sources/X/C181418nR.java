package X;

/* renamed from: X.8nR  reason: invalid class name and case insensitive filesystem */
public final class C181418nR extends C181758nz {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181418nR(C64933Qa r2, int i, long j) {
        super(r2, 142, j);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = i;
    }

    public String A0b() {
        return String.valueOf(this.A00);
    }

    public void A16(String str) {
        Integer A03;
        if (str != null && (A03 = AnonymousClass097.A03(str)) != null) {
            this.A00 = A03.intValue();
        }
    }
}

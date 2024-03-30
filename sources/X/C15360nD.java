package X;

/* renamed from: X.0nD  reason: invalid class name and case insensitive filesystem */
public final class C15360nD extends AnonymousClass0UH {
    public long A00 = -1;
    public C023509x A01;

    public /* bridge */ /* synthetic */ boolean A00(Object obj) {
        C15350nC r6 = (C15350nC) obj;
        if (this.A00 >= 0) {
            return false;
        }
        long j = r6.A03;
        if (j < r6.A02) {
            r6.A02 = j;
        }
        this.A00 = j;
        return true;
    }

    public /* bridge */ /* synthetic */ C023509x[] A01(Object obj) {
        long j = this.A00;
        this.A00 = -1;
        this.A01 = null;
        return ((C15350nC) obj).A0D(j);
    }
}

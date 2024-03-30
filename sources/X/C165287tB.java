package X;

/* renamed from: X.7tB  reason: invalid class name and case insensitive filesystem */
public class C165287tB implements C158587hk {
    public Object A00;
    public final int A01;

    public C165287tB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bjw(int i, int i2, long j, long j2) {
        if (this.A01 != 0) {
            Integer[] numArr = new Integer[1];
            AnonymousClass000.A1L(numArr, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))), 0);
            ((C132446Tt) this.A00).A0F(numArr);
            return;
        }
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1J(numArr2, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))));
        ((C132446Tt) this.A00).A0F(numArr2);
    }
}

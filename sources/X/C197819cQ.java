package X;

/* renamed from: X.9cQ  reason: invalid class name and case insensitive filesystem */
public class C197819cQ {
    public int[] A00;
    public int[] A01;
    public int[] A02;

    public static C197819cQ A00(int[] iArr, int[] iArr2, int[] iArr3) {
        return new C197819cQ(iArr, iArr2, iArr3);
    }

    public static void A01(int[] iArr, int[] iArr2, int[] iArr3, Object[] objArr, int i) {
        objArr[i] = new C197819cQ(iArr, iArr2, iArr3);
    }

    public C197819cQ(int[] iArr, int[] iArr2, int[] iArr3) {
        this.A02 = iArr;
        this.A01 = iArr2;
        this.A00 = iArr3;
    }

    public C197819cQ() {
        this.A02 = new int[10];
        this.A01 = new int[10];
        this.A00 = new int[10];
    }
}

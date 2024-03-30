package X;

/* renamed from: X.Arz  reason: case insensitive filesystem */
public class C22633Arz extends AnonymousClass120 {
    public C22657AsN A00;

    public C22633Arz(C22657AsN asN) {
        this.A00 = asN;
    }

    public C22633Arz(C22624Arq[] arqArr) {
        this.A00 = new C22678Asi((C219411z[]) arqArr);
    }

    public static C22633Arz A00(Object obj) {
        if (obj instanceof C22633Arz) {
            return (C22633Arz) obj;
        }
        if (obj != null) {
            return new C22633Arz(C22657AsN.A01(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public C22624Arq A0A() {
        C219411z[] r1 = this.A00.A00;
        if (r1.length == 0) {
            return null;
        }
        return C22624Arq.A00(r1[0]);
    }

    public C22624Arq[] A0B() {
        C219411z[] r4 = this.A00.A00;
        int length = r4.length;
        C22624Arq[] arqArr = new C22624Arq[length];
        for (int i = 0; i != length; i++) {
            arqArr[i] = C22624Arq.A00(r4[i]);
        }
        return arqArr;
    }

    public C22633Arz(C219411z r3, AnonymousClass122 r4) {
        C202169lB A002 = C202169lB.A00();
        A002.A06(r4);
        this.A00 = new C22678Asi((C219411z) C202169lB.A01(r3, A002));
    }
}

package X;

import java.util.List;

/* renamed from: X.9yF  reason: invalid class name and case insensitive filesystem */
public final class C208439yF implements B36 {
    public float A00 = -1.0f;
    public C202689mQ A01 = null;
    public C202689mQ A02;
    public final List A03;

    public boolean isEmpty() {
        return false;
    }

    private C202689mQ A00(float f) {
        List list = this.A03;
        C202689mQ r2 = (C202689mQ) list.get(list.size() - 1);
        if (f < r2.A02()) {
            int size = list.size() - 2;
            while (size >= 1) {
                r2 = (C202689mQ) list.get(size);
                if (this.A02 == r2 || f < r2.A02() || f >= r2.A01()) {
                    size--;
                }
            }
            return (C202689mQ) C36391kE.A0t(list);
        }
        return r2;
    }

    public float BBZ() {
        return ((C202689mQ) C36401kF.A0n(this.A03)).A01();
    }

    public float BHs() {
        return ((C202689mQ) C36391kE.A0t(this.A03)).A02();
    }

    public boolean BLJ(float f) {
        C202689mQ r0 = this.A01;
        C202689mQ r1 = this.A02;
        if (r0 == r1 && this.A00 == f) {
            return true;
        }
        this.A01 = r1;
        this.A00 = f;
        return false;
    }

    public boolean BNh(float f) {
        C202689mQ r1 = this.A02;
        if (f >= r1.A02() && f < r1.A01()) {
            return !r1.A03();
        }
        this.A02 = A00(f);
        return true;
    }

    public C208439yF(List list) {
        this.A03 = list;
        this.A02 = A00(0.0f);
    }

    public C202689mQ BAb() {
        return this.A02;
    }
}

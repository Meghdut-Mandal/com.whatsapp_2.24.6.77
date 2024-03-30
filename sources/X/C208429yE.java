package X;

import java.util.List;

/* renamed from: X.9yE  reason: invalid class name and case insensitive filesystem */
public final class C208429yE implements B36 {
    public float A00 = -1.0f;
    public final C202689mQ A01;

    public boolean isEmpty() {
        return false;
    }

    public float BBZ() {
        return this.A01.A01();
    }

    public float BHs() {
        return this.A01.A02();
    }

    public boolean BLJ(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    public boolean BNh(float f) {
        return !this.A01.A03();
    }

    public C208429yE(List list) {
        this.A01 = (C202689mQ) C36391kE.A0t(list);
    }

    public C202689mQ BAb() {
        return this.A01;
    }
}

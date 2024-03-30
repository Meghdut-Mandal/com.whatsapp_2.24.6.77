package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6ey  reason: invalid class name and case insensitive filesystem */
public final class C136776ey implements C161457mw {
    public final C118255na A00;
    public final C136786ez A01;
    public final C161167mI A02;
    public final LazyListState A03;

    public Object BA9(int i) {
        C120625ro A012 = this.A01.A00.A01(i);
        return ((C136806f1) ((AnonymousClass7bD) A012.A02)).A00.invoke(Integer.valueOf(i - A012.A01));
    }

    public Object BDL(int i) {
        Object obj;
        C136816f2 r0 = (C136816f2) this.A02;
        Object[] objArr = r0.A01;
        int i2 = i - r0.A00;
        if (i2 >= 0) {
            AnonymousClass00C.A0D(objArr, 0);
            if (i2 <= objArr.length - 1 && (obj = objArr[i2]) != null) {
                return obj;
            }
        }
        this.A01.A00.A01(i);
        return new C134536bC(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136776ey)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A01, ((C136776ey) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C136776ey(C118255na r1, C136786ez r2, LazyListState lazyListState, C161167mI r4) {
        this.A03 = lazyListState;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public void Azg(C161337ma r9, Object obj, int i, int i2) {
        r9.Bun(-462424778);
        Object obj2 = obj;
        AnonymousClass5W4.A00(this.A03.A0J, r9, obj2, AnonymousClass5WH.A00(r9, new AnonymousClass7YC(this, i), -824725566), i, ((i2 << 3) & 112) | 3592);
        C136976fO B6Z = r9.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C155947Yb(this, obj, i, i2);
        }
    }
}

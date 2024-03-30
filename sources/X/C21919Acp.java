package X;

import java.util.List;

/* renamed from: X.Acp  reason: case insensitive filesystem */
public final class C21919Acp<E> extends C001100m<E> implements C162217oE<E> {
    public int A00;
    public final int A01;
    public final C162217oE A02;

    public static final void A00(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder A0h = C90464aC.A0h(i, "fromIndex: ");
            A0h.append(", toIndex: ");
            A0h.append(i2);
            throw C165617ti.A0W(AnonymousClass000.A0r(", size: ", A0h, i3));
        } else if (i > i2) {
            throw AnonymousClass000.A0d(" > toIndex: ", C90464aC.A0h(i, "fromIndex: "), i2);
        }
    }

    public Object get(int i) {
        AnonymousClass9Yn.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        A00(i, i2, this.A00);
        C162217oE r2 = this.A02;
        int i3 = this.A01;
        return new C21919Acp(r2, i + i3, i3 + i2);
    }

    public C21919Acp(C162217oE r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        A00(i, i2, r2.size());
        this.A00 = i2 - i;
    }

    public int A08() {
        return this.A00;
    }
}

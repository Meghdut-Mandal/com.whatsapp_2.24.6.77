package X;

import java.util.List;

/* renamed from: X.6fD  reason: invalid class name and case insensitive filesystem */
public final class C136896fD implements C157567dk {
    public Object A00;
    public final Object A01;
    public final List A02 = AnonymousClass001.A0I();

    public void BwR() {
        List list = this.A02;
        if (C36401kF.A1a(list)) {
            this.A00 = list.remove(C36431kI.A07(list));
            return;
        }
        throw AnonymousClass001.A09("empty stack");
    }

    public C136896fD(C137846gp r2) {
        this.A01 = r2;
        this.A00 = r2;
    }
}

package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.8UW  reason: invalid class name */
public class AnonymousClass8UW extends C79593ty {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public AnonymousClass8UW(List list) {
        C18740tg.A0E(AnonymousClass000.A1R(list.size()), "AllOfAsyncFuture: futures list is empty");
        this.A02 = C36441kJ.A15(Collections.nCopies(list.size(), (Object) null));
        this.A03 = C36441kJ.A15(Collections.nCopies(list.size(), (Object) null));
        this.A00 = list.size();
        for (int i = 0; i < list.size(); i++) {
            C79593ty r2 = (C79593ty) list.get(i);
            r2.A0A(new C23205B9n(this, i, 1));
            r2.A00.A03(new C23205B9n(this, i, 0), (Executor) null);
        }
    }
}

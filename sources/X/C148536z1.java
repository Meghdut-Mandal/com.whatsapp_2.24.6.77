package X;

import java.util.List;

/* renamed from: X.6z1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148536z1 implements C88214Rv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C96144mr A01;

    public /* synthetic */ C148536z1(C96144mr r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void Bhf(boolean z) {
        C96144mr r0 = this.A01;
        int i = this.A00;
        List A002 = C96144mr.A00(r0);
        if (i >= 0 && i < A002.size()) {
            ((AnonymousClass6CV) A002.get(i)).A01 = z;
        }
    }
}

package X;

import android.util.Pair;

public class B8J implements C23042B1n {
    public Object A00;
    public final int A01;

    public B8J(C198329dH r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BWb(Pair pair) {
        C001700s r0;
        if (this.A01 != 0) {
            C001700s r02 = ((C198329dH) this.A00).A07;
            if (r02 != null) {
                C36331k8.A13(r02);
                return;
            }
            return;
        }
        Number number = (Number) pair.first;
        Boolean A0m = C36371kC.A0m();
        if (number == null || 405 != number.intValue()) {
            r0 = ((C198329dH) this.A00).A08;
        } else {
            r0 = ((C198329dH) this.A00).A04;
        }
        if (r0 != null) {
            r0.A0C(A0m);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2 = this.A01;
        C198329dH r2 = (C198329dH) this.A00;
        C19770wU r1 = r2.A0N;
        if (i2 != 0) {
            i = 32;
        } else {
            i = 31;
        }
        C36391kE.A1R(r1, r2, obj, i);
    }
}

package X;

import android.text.Editable;

/* renamed from: X.4t1  reason: invalid class name and case insensitive filesystem */
public class C99284t1 extends C08900bV {
    public final /* synthetic */ C93014fP A00;

    public C99284t1(C93014fP r1) {
        this.A00 = r1;
    }

    public void afterTextChanged(Editable editable) {
        C129176Fq A03 = this.A00.A03();
        if (A03 instanceof C99384tC) {
            C99384tC r3 = (C99384tC) A03;
            if (r3.A03.isTouchExplorationEnabled() && r3.A04.getInputType() != 0 && !r3.A01.hasFocus()) {
                r3.A04.dismissDropDown();
            }
            r3.A04.post(new C1497572q(r3, 33));
        } else if (A03 instanceof C99374tB) {
            C99374tB r32 = (C99374tB) A03;
            if (r32.A02.A0B == null) {
                C99374tB.A00(r32, C99374tB.A01(r32));
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00.A03().A09(charSequence, i, i2, i3);
    }
}

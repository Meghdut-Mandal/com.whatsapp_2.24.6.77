package X;

import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.5d8  reason: invalid class name and case insensitive filesystem */
public class C111965d8 implements C157857en {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C111965d8(BloksEditText bloksEditText, C1271967i r2, C140456lc r3, int i) {
        this.A03 = i;
        this.A02 = bloksEditText;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void Bjo() {
        int i = this.A03;
        BloksEditText bloksEditText = (BloksEditText) this.A02;
        C1271967i r1 = (C1271967i) this.A00;
        C140456lc r0 = (C140456lc) this.A01;
        if (i != 0) {
            AnonymousClass6XF.A05(bloksEditText, r1, r0);
        } else {
            AnonymousClass6XF.A04(bloksEditText, r1, r0);
        }
    }
}

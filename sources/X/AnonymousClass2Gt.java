package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Gt  reason: invalid class name */
public class AnonymousClass2Gt extends C48992iO {
    public final C21100yf A00;
    public final AnonymousClass17X A01;
    public final C220412q A02;
    public final C20810yC A03;
    public final C20350xQ A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0Q = this.A04.A0Q();
        Iterator it = A0Q.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0W = C36341k9.A0W(it);
            if (A0W != null) {
                AnonymousClass171.A04(this.A00, (AnonymousClass144) A0W, 1, true);
            }
        }
        Collections.sort(A0Q, new AnonymousClass4W4(this.A00, this.A01, this, 0));
        Iterator it2 = A0Q.iterator();
        while (it2.hasNext()) {
            C36391kE.A1O(C36391kE.A0f(it2), this.A03);
        }
        return A0Q;
    }

    public AnonymousClass2Gt(C21100yf r4, AnonymousClass171 r5, AnonymousClass27v r6, C18820ts r7, C220412q r8, AnonymousClass17X r9, C20810yC r10, C20350xQ r11, List list) {
        super(r5, r6, r7, list);
        this.A03 = r10;
        this.A00 = r4;
        this.A04 = r11;
        this.A01 = r9;
        this.A02 = r8;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(C36411kG.A0h(C36391kE.A0f(it)));
        }
    }
}

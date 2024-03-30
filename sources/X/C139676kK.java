package X;

import android.graphics.Bitmap;
import java.util.Iterator;

/* renamed from: X.6kK  reason: invalid class name and case insensitive filesystem */
public final class C139676kK implements C162197oC {
    public final AnonymousClass5TP A00;
    public final C006302t A01;
    public final C006302t A02;
    public final int A03;
    public final C1263563p A04;
    public final AnonymousClass6NZ A05;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C162197oC r3 = (C162197oC) obj;
        AnonymousClass00C.A0D(r3, 1);
        return r3.BGF().compareTo(this.A00);
    }

    public void run() {
        Object next;
        int i = this.A03;
        C12380hx r1 = new C12380hx(C15060md.A03(new C154307Rr(this), C90514aH.A0X(new C11020fb(i, 0, -1))));
        if (!r1.hasNext()) {
            next = null;
        } else {
            next = r1.next();
        }
        AnonymousClass011 r2 = (AnonymousClass011) next;
        if (r2 == null) {
            this.A02.invoke((Object) null);
            return;
        }
        AU0 A022 = this.A05.A02((Bitmap) ((AU0) r2.second).A01());
        AnonymousClass00C.A08(A022);
        Iterator it = new C15020mZ(C90484aE.A0H(r2) + 1, i).iterator();
        while (it.hasNext()) {
            int A002 = ((C12260hl) it).A00();
            C1263563p r12 = this.A04;
            Object A012 = A022.A01();
            AnonymousClass00C.A08(A012);
            r12.A00((Bitmap) A012, A002);
        }
        this.A02.invoke(A022);
    }

    public C139676kK(AnonymousClass5TP r1, C1263563p r2, AnonymousClass6NZ r3, C006302t r4, C006302t r5, int i) {
        this.A03 = i;
        this.A01 = r4;
        this.A00 = r1;
        this.A02 = r5;
        this.A05 = r3;
        this.A04 = r2;
    }

    public AnonymousClass5TP BGF() {
        return this.A00;
    }
}

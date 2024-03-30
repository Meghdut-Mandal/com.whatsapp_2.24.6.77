package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.7J4  reason: invalid class name */
public final class AnonymousClass7J4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6NB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7J4(AnonymousClass6NB r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6NB r7 = this.this$0;
        int i = 0;
        r7.A00 = false;
        HashSet A16 = C36441kJ.A16();
        C1506776e r8 = r7.A03;
        int i2 = r8.A00;
        if (i2 > 0) {
            Object[] objArr = r8.A01;
            int i3 = 0;
            do {
                C137846gp r2 = (C137846gp) objArr[i3];
                C114375h9 r1 = (C114375h9) r7.A04.A01[i3];
                if (r2.A0R.A02.A08) {
                    AnonymousClass6NB.A00(r2.A0R.A02, r1);
                }
                i3++;
            } while (i3 < i2);
        }
        r8.A06();
        r7.A04.A06();
        C1506776e r5 = r7.A01;
        int i4 = r5.A00;
        if (i4 > 0) {
            Object[] objArr2 = r5.A01;
            do {
                C137856gq r22 = (C137856gq) objArr2[i];
                C114375h9 r12 = (C114375h9) r7.A02.A01[i];
                if (r22.A08) {
                    AnonymousClass6NB.A00(r22, r12);
                }
                i++;
            } while (i < i4);
        }
        r5.A06();
        r7.A02.A06();
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            ((C94384i8) it.next()).A0F();
        }
        return AnonymousClass0AJ.A00;
    }
}

package X;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;

/* renamed from: X.9SO  reason: invalid class name */
public final class AnonymousClass9SO {
    public final AnonymousClass84B A00;
    public final C23090B4a A01;
    public final C197559bu A02;
    public final C006302t A03;
    public final C006302t A04;
    public final C006302t A05;
    public final C009003v A06;

    public AnonymousClass9SO(Context context, Looper looper, C23090B4a b4a, C197559bu r22, Integer num, C006302t r24, C006302t r25, C006302t r26, C009003v r27, int i, int i2) {
        C006302t r12 = r24;
        this.A04 = r12;
        C006302t r13 = r25;
        this.A05 = r13;
        C009003v r15 = r27;
        this.A06 = r15;
        C006302t r14 = r26;
        this.A03 = r14;
        C197559bu r10 = r22;
        this.A02 = r10;
        C23090B4a b4a2 = b4a;
        this.A01 = b4a2;
        AnonymousClass84B r6 = new AnonymousClass84B(context, looper, b4a2, r10, num, r12, r13, r14, r15, i2, i);
        AnonymousClass9U5 r1 = new AnonymousClass9U5(r6);
        C006302t r0 = r6.A00;
        if (r0 == null) {
            throw C36331k8.A0d("statesBlock");
        }
        r0.invoke(r1);
        if (r1.A00) {
            C166097v1 r5 = r6.A00;
            if (r5 != null) {
                Iterator A10 = C36391kE.A10(r5.A09);
                int i3 = 0;
                while (A10.hasNext()) {
                    C194799Rh r16 = (C194799Rh) A10.next();
                    int i4 = 0;
                    while (r16 != null) {
                        r16 = r16.A01;
                        i4++;
                    }
                    if (i3 < i4) {
                        i3 = i4;
                    }
                }
                r5.A0B = new C194799Rh[i3];
                r5.A0C = new C194799Rh[i3];
                C194799Rh r2 = (C194799Rh) r5.A09.get(r5.A04);
                int i5 = 0;
                while (true) {
                    r5.A01 = i5;
                    if (r2 == null) {
                        break;
                    }
                    r5.A0C[i5] = r2;
                    r2 = r2.A01;
                    i5++;
                }
                r5.A00 = -1;
                int i6 = 0;
                for (int i7 = i5 - 1; i7 >= 0; i7--) {
                    r5.A0B[i6] = r5.A0C[i7];
                    i6++;
                }
                r5.A00 = i6 - 1;
                r5.sendMessageAtFrontOfQueue(r5.obtainMessage(-2, C166097v1.A0F));
            }
            r6.A04(AnonymousClass8AU.A00);
            this.A00 = r6;
            return;
        }
        throw AnonymousClass001.A09("Must call initial(state)!");
    }
}

package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.B7w  reason: case insensitive filesystem */
public class C23162B7w implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C23162B7w(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C178888i4 r2 = (C178888i4) this.A01;
            int i2 = this.A00;
            boolean z = this.A02;
            AnonymousClass3SJ.A00(r2, i2);
            r2.A3k(z);
            return;
        }
        C178858hy r1 = (C178858hy) this.A01;
        int i3 = this.A00;
        boolean z2 = this.A02;
        AnonymousClass3SJ.A00(r1, i3);
        C167737yi r0 = r1.A01;
        AnonymousClass9O9 r22 = new AnonymousClass9O9(5);
        r22.A08 = true;
        r22.A02 = R.string.f12nameremoved;
        r0.A03.A0D(r22);
        C23168B8c b8c = new C23168B8c(r0, 8);
        if (z2) {
            Context context = r0.A0C.A00;
            AnonymousClass17Y r4 = r0.A09;
            C19770wU r12 = r0.A0R;
            C29131Vl r11 = r0.A0P;
            AnonymousClass1EU r10 = r0.A0N;
            new AnonymousClass9XR(context, r4, r0.A0D, r0.A0H, r0.A0J, r0.A0K, r0.A0L, r10, r11, r12).A00(b8c);
            return;
        }
        C19970wo r5 = r0.A0B;
        AnonymousClass17Y r3 = r0.A09;
        C19730wQ r42 = r0.A0A;
        AnonymousClass19A r7 = r0.A0G;
        C19630wG r6 = r0.A0C;
        C19770wU r112 = r0.A0R;
        new C195019Sd(r3, r42, r5, r6, r7, r0.A0H, r0.A0I, r0.A0N, r112).A00(b8c);
    }
}

package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.7R3  reason: invalid class name */
public final class AnonymousClass7R3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94444iE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R3(C94444iE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C161937ni r9;
        List list = (List) obj;
        AnonymousClass6NV A00 = C94444iE.A00(this.this$0);
        AnonymousClass6V8 r1 = this.this$0.A03;
        long j = C133336Xx.A05;
        AnonymousClass6V8 r3 = AnonymousClass6V8.A03;
        long j2 = AnonymousClass6WI.A01;
        boolean z = false;
        AnonymousClass6FJ r7 = r1.A02;
        AnonymousClass6FJ A002 = AnonymousClass6J2.A00((C125185zS) null, (AnonymousClass6PD) null, (C109085Wf) null, r7, (C129796Im) null, (AnonymousClass68R) null, (AnonymousClass68S) null, (AnonymousClass72W) null, (AnonymousClass75Q) null, (AnonymousClass68U) null, (C131366Ot) null, (AnonymousClass6TV) null, (String) null, Float.NaN, j, j2, j2, j);
        C129026Eq r5 = r1.A00;
        C129026Eq A003 = C129636Hw.A00(r5, (C131236Og) null, (AnonymousClass6P5) null, (AnonymousClass6P7) null, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, j2);
        if (!(r7 == A002 && r5 == A003)) {
            r1 = new AnonymousClass6V8(A003, A002);
        }
        AnonymousClass5RW r10 = A00.A0B;
        if (!(r10 == null || (r9 = A00.A0A) == null)) {
            String str = A00.A0C;
            C023409w r8 = C023409w.A00;
            AnonymousClass72L r72 = new AnonymousClass72L(str, r8, r8);
            if (!(A00.A06 == null || A00.A07 == null)) {
                long j3 = A00.A04;
                long A07 = Constraints.A07(0, Constraints.A01(j3), 0, Constraints.A00(j3));
                int i = A00.A00;
                boolean z2 = A00.A0E;
                int i2 = A00.A02;
                C157027bi r32 = A00.A09;
                list.add(new AnonymousClass6FW(new AnonymousClass6NL(new C138026h9(r72, r1, r32, r9, r8), A00.A00, A07, AnonymousClass000.A1S(A00.A02, 2)), new C128796Dq(r72, r1, r32, r9, r10, r8, i, i2, A07, z2), A00.A03));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

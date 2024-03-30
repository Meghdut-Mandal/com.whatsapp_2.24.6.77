package X;

import java.util.List;

/* renamed from: X.7Qz  reason: invalid class name and case insensitive filesystem */
public final class C154127Qz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94454iF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154127Qz(C94454iF r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C94454iF r3 = this.this$0;
        AnonymousClass6FW r0 = C94454iF.A00(r3).A06;
        if (r0 != null) {
            AnonymousClass72L r2 = r0.A04.A03;
            AnonymousClass6V8 r1 = r3.A04;
            long j = C133336Xx.A05;
            AnonymousClass6V8 r32 = AnonymousClass6V8.A03;
            long j2 = AnonymousClass6WI.A01;
            AnonymousClass6FJ r10 = r1.A02;
            AnonymousClass6FJ A00 = AnonymousClass6J2.A00((C125185zS) null, (AnonymousClass6PD) null, (C109085Wf) null, r10, (C129796Im) null, (AnonymousClass68R) null, (AnonymousClass68S) null, (AnonymousClass72W) null, (AnonymousClass75Q) null, (AnonymousClass68U) null, (C131366Ot) null, (AnonymousClass6TV) null, (String) null, Float.NaN, j, j2, j2, j);
            C129026Eq r5 = r1.A00;
            C129026Eq A002 = C129636Hw.A00(r5, (C131236Og) null, (AnonymousClass6P5) null, (AnonymousClass6P7) null, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, j2);
            if (!(r10 == A00 && r5 == A002)) {
                r1 = new AnonymousClass6V8(A002, A00);
            }
            C128796Dq r52 = r0.A04;
            List list2 = r52.A08;
            int i = r52.A00;
            boolean z2 = r52.A09;
            int i2 = r52.A01;
            C161937ni r9 = r52.A06;
            AnonymousClass5RW r8 = r52.A07;
            list.add(new AnonymousClass6FW(r0.A03, new C128796Dq(r2, r1, r52.A05, r9, r8, list2, i, i2, r52.A02, z2), r0.A02));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

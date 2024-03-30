package X;

import com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1;
import com.whatsapp.calling.header.CallScreenDetailsStateHolder$callScreenDetailsUiState$1;

/* renamed from: X.5xi  reason: invalid class name and case insensitive filesystem */
public final class C124175xi {
    public final C24801Dv A00;
    public final C121435t8 A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass05H A03;
    public final AnonymousClass05L A04;
    public final C005502l A05;
    public final AnonymousClass05H A06;

    public C124175xi(C24801Dv r7, C116915lP r8, C121435t8 r9, AnonymousClass190 r10, C005502l r11) {
        C36321k7.A0z(r10, r7);
        AnonymousClass00C.A0D(r11, 5);
        this.A02 = r10;
        this.A00 = r7;
        this.A01 = r9;
        this.A05 = r11;
        AnonymousClass05N r5 = new AnonymousClass05N(false);
        this.A04 = r5;
        C15390nG A002 = AnonymousClass0R0.A00(new CallRepository$getCallStateModel$1(r8, (C023509x) null, false));
        C156497a4 r2 = C156497a4.A00;
        C006302t r1 = C07430Xq.A00;
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        C07710Yz.A03(r2, 2);
        AnonymousClass05H A003 = C07430Xq.A00(r1, r2, A002);
        this.A06 = A003;
        this.A03 = AnonymousClass0R1.A00(r11, new C12990iz(new CallScreenDetailsStateHolder$callScreenDetailsUiState$1(this, (C023509x) null), A003, r5));
    }
}

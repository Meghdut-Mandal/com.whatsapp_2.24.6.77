package X;

import com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1;
import com.whatsapp.calling.header.CallHeaderStateHolder$animationState$1;
import com.whatsapp.calling.header.CallHeaderStateHolder$uiState$1;
import com.whatsapp.calling.header.CallHeaderStateHolder$yTranslation$1;

/* renamed from: X.5yo  reason: invalid class name and case insensitive filesystem */
public final class C124795yo {
    public String A00;
    public boolean A01;
    public final C001600r A02;
    public final C132546Uf A03;
    public final C28201Rs A04;
    public final AnonymousClass05H A05;
    public final AnonymousClass05H A06;
    public final AnonymousClass05L A07;
    public final AnonymousClass05L A08;
    public final C005502l A09;
    public final AnonymousClass05H A0A;
    public final AnonymousClass05H A0B;

    public C124795yo(C27631Pa r8, C116915lP r9, C132546Uf r10, C005502l r11) {
        C36331k8.A1G(r8, 2, r11);
        this.A03 = r10;
        this.A09 = r11;
        C28201Rs A0t = C36441kJ.A0t();
        this.A04 = A0t;
        this.A02 = A0t;
        AnonymousClass05N r3 = new AnonymousClass05N(Float.valueOf(0.0f));
        this.A08 = r3;
        AnonymousClass05N r6 = new AnonymousClass05N(false);
        this.A07 = r6;
        AnonymousClass05H A012 = C07430Xq.A01(AnonymousClass0R0.A00(new CallRepository$getCallStateModel$1(r9, (C023509x) null, false)));
        this.A0B = A012;
        C15330nA r2 = new C15330nA(new CallHeaderStateHolder$animationState$1(r8, this, (C023509x) null));
        this.A0A = r2;
        this.A06 = new C12990iz(new CallHeaderStateHolder$yTranslation$1((C023509x) null), r3, A012);
        CallHeaderStateHolder$uiState$1 callHeaderStateHolder$uiState$1 = new CallHeaderStateHolder$uiState$1(r8, this, (C023509x) null);
        AnonymousClass05H[] r1 = new AnonymousClass05H[3];
        AnonymousClass000.A19(A012, r2, r6, r1);
        this.A05 = AnonymousClass0R1.A00(r11, new C18500tG(new C18510tH((Object) r1, (Object) callHeaderStateHolder$uiState$1, 6), 2));
    }
}

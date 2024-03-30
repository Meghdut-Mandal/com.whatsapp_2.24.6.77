package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.4ip  reason: invalid class name and case insensitive filesystem */
public final class C94814ip extends C94114hf implements C161747nP, C161757nQ, C161787nT, C17500rW {
    public C160257ki A00;
    public C157497dd A01;
    public AnonymousClass5RU A02;
    public C160557lC A03;
    public C161437mu A04;
    public boolean A05;
    public boolean A06;
    public final C94264hv A07;
    public final C136566ec A08;
    public final C94174hm A09;
    public final C94804io A0A;
    public final ScrollableNestedScrollConnection A0B;
    public final ScrollingLogic A0C;
    public final NestedScrollDispatcher A0D;

    public C94814ip(C160257ki r13, C161157mH r14, C157497dd r15, AnonymousClass5RU r16, C160557lC r17, C161437mu r18, boolean z, boolean z2) {
        C136566ec r7 = r15;
        C160557lC r9 = r17;
        this.A03 = r9;
        AnonymousClass5RU r8 = r16;
        this.A02 = r8;
        C160257ki r6 = r13;
        this.A00 = r13;
        this.A05 = z;
        boolean z3 = z2;
        this.A06 = z3;
        this.A01 = r15;
        this.A04 = r18;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0D = nestedScrollDispatcher;
        C136566ec r0 = new C136566ec(new C136316eB(new AnonymousClass6eI(ScrollableKt.A01)), ScrollableKt.A02);
        this.A08 = r0;
        ScrollingLogic scrollingLogic = new ScrollingLogic(r6, r15 == null ? r0 : r7, r8, r9, nestedScrollDispatcher, z3);
        this.A0C = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.A05);
        this.A0B = scrollableNestedScrollConnection;
        C94264hv r2 = new C94264hv(r14, this.A02, this.A03, this.A06);
        A0F(r2);
        this.A07 = r2;
        C94174hm r02 = new C94174hm(this.A05);
        A0F(r02);
        this.A09 = r02;
        A0F(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        A0F(new C94214hq());
        A0F(new C93484gd(r2));
        A0F(new C94184hn(new C153967Qj(this)));
        C94804io r1 = new C94804io(this.A02, scrollingLogic, this.A04, nestedScrollDispatcher, this.A05);
        A0F(r1);
        this.A0A = r1;
    }

    public void B1I(C158817iH r2) {
        r2.BqP(false);
    }

    public boolean BZT(KeyEvent keyEvent) {
        long A0B2;
        if (!this.A05) {
            return false;
        }
        if ((C109135Wk.A01(keyEvent) != C131386Ov.A0A && C109135Wk.A01(keyEvent) != C131386Ov.A0B) || keyEvent.getAction() != 0 || keyEvent.isCtrlPressed()) {
            return false;
        }
        ScrollingLogic scrollingLogic = this.A0C;
        AnonymousClass5RU r3 = this.A02;
        AnonymousClass5RU r2 = AnonymousClass5RU.Vertical;
        long j = this.A07.A00;
        if (r3 == r2) {
            float A032 = (float) C90474aD.A03(j);
            if (!AnonymousClass000.A1Q((C109135Wk.A01(keyEvent) > C131386Ov.A0B ? 1 : (C109135Wk.A01(keyEvent) == C131386Ov.A0B ? 0 : -1)))) {
                A032 = -A032;
            }
            A0B2 = C90464aC.A0B(0.0f, A032);
        } else {
            float A082 = (float) C90494aF.A08(j);
            if (!AnonymousClass000.A1Q((C109135Wk.A01(keyEvent) > C131386Ov.A0B ? 1 : (C109135Wk.A01(keyEvent) == C131386Ov.A0B ? 0 : -1)))) {
                A082 = -A082;
            }
            A0B2 = C90464aC.A0B(A082, 0.0f);
        }
        long j2 = C133206Xf.A03;
        C36331k8.A1T(new ScrollableNode$onKeyEvent$1$1(scrollingLogic, (C023509x) null, A0B2), A07());
        return true;
    }

    public void Bbq() {
        this.A08.A01 = new C136316eB(new AnonymousClass6eI((C161937ni) C109205Wr.A00(C131996Rr.A00, this)));
    }
}

package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.8Zg  reason: invalid class name and case insensitive filesystem */
public class C174998Zg extends AnonymousClass2IO {
    public AnonymousClass3EP A00;
    public AnonymousClass1C5 A01;
    public boolean A02;
    public final AnonymousClass01z A03;
    public final TemplateRowContentLayout A04;

    public void A16() {
        if (!this.A02) {
            this.A02 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
            AnonymousClass8ZJ.A0Z(r4, r2, A0n, this);
            this.A01 = (AnonymousClass1C5) r4.A7B.get();
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public void A1Y() {
        this.A04.A02(this.A03, this, this.A2Y);
        super.A1Y();
    }

    public C174998Zg(Context context, AnonymousClass01z r4, C89004Uw r5, C181768o0 r6) {
        super(context, r5, r6);
        A16();
        TemplateRowContentLayout templateRowContentLayout = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
        this.A04 = templateRowContentLayout;
        this.A03 = r4;
        templateRowContentLayout.A02(r4, this, this.A2Y);
    }

    public boolean A1M() {
        Long l = ((C88854Uh) getFMessage()).BIE().A00;
        if (l == null || C19970wo.A00(this.A19) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1f() {
        super.A1f();
        C181798o3 fMessage = getFMessage();
        if (this.A01.A06(fMessage)) {
            AnonymousClass3DP r2 = this.A1q;
            AnonymousClass00C.A0D(fMessage, 0);
            r2.A00(fMessage, "media-video", "0");
        }
    }

    public void A22(AnonymousClass3T1 r4, boolean z) {
        boolean A1W = C36371kC.A1W(r4, getFMessage());
        super.A22(r4, z);
        if (z || A1W) {
            this.A04.A02(this.A03, this, this.A2Y);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00(getFMessage(), i);
    }
}

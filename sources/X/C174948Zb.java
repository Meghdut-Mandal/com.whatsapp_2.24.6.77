package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.8Zb  reason: invalid class name and case insensitive filesystem */
public final class C174948Zb extends AnonymousClass2IJ {
    public AnonymousClass3EP A00;
    public boolean A01;
    public final AnonymousClass01z A02;
    public final InteractiveMessageButton A03 = ((InteractiveMessageButton) C36361kB.A0G(this, R.id.button));
    public final InteractiveMessageView A04;
    public final int A05 = (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) + (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2));

    public final void setViewMessageEventLogger(AnonymousClass3EP r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
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
            AnonymousClass3R3.A01((C64723Pe) r2.A5z.get(), this);
            AnonymousClass3R3.A02(C27861Qc.A08(A0n), this);
            AnonymousClass3R3.A00((AnonymousClass30M) A0n.A09.get(), this);
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, (AnonymousClass2bU) this.A0K, this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public int getCenteredLayoutId() {
        if (C203369nr.A08((AnonymousClass2bU) this.A0K)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        if (C203369nr.A08((AnonymousClass2bU) this.A0K)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        if (C203369nr.A08((AnonymousClass2bU) this.A0K)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public final AnonymousClass3EP getViewMessageEventLogger() {
        AnonymousClass3EP r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("viewMessageEventLogger");
    }

    public void onMeasure(int i, int i2) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        boolean A08 = C203369nr.A08((AnonymousClass2bU) this.A0K);
        conversationRowImage$RowImageView.A0G = A08;
        if (A08) {
            i = View.MeasureSpec.makeMeasureSpec(this.A05, 1073741824);
            conversationRowImage$RowImageView.A06 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            conversationRowImage$RowImageView.A05 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174948Zb(Context context, AnonymousClass01z r6, C89004Uw r7, AnonymousClass2c6 r8, int i) {
        super(context, r7, r8, i);
        C36321k7.A0y(context, r8);
        A16();
        this.A02 = r6;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C36361kB.A0G(this, R.id.interactive_view);
        this.A04 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r8.A1J.A02 ^ true ? 1 : 0);
        interactiveMessageView.A02(this.A2W, (C65413Ry) null);
        AnonymousClass2bU r3 = (AnonymousClass2bU) this.A0K;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageProductInteractive");
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0c, r3);
    }

    public void A1Y() {
        super.A1Y();
        AnonymousClass2bU r3 = (AnonymousClass2bU) this.A0K;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageProductInteractive");
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0c, r3);
    }

    public final int getCardWidth() {
        return this.A05;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getViewMessageEventLogger().A00((AnonymousClass2bU) this.A0K, i);
    }
}

package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.8ZB  reason: invalid class name */
public class AnonymousClass8ZB extends AnonymousClass2I5 {
    public AnonymousClass3EP A00;
    public boolean A01;
    public final AnonymousClass01z A02;
    public final InteractiveMessageButton A03 = ((InteractiveMessageButton) C012005e.A02(this, R.id.button));
    public final InteractiveMessageView A04;

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
            AnonymousClass8ZJ.A0b(r4, A0n, this);
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public AnonymousClass8ZB(Context context, AnonymousClass01z r6, C89004Uw r7, C46832bk r8) {
        super(context, r7, r8);
        A16();
        this.A02 = r6;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C012005e.A02(this, R.id.interactive_view);
        this.A04 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r8.A1J.A02 ^ true ? 1 : 0);
        interactiveMessageView.A02(this.A2W, (C65413Ry) null);
        AnonymousClass2bU r3 = (AnonymousClass2bU) this.A0K;
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0c, r3);
    }

    public void A1Y() {
        super.A1Y();
        AnonymousClass2bU r3 = (AnonymousClass2bU) this.A0K;
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0c, r3);
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
        this.A00.A00((AnonymousClass2bU) this.A0K, i);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.8ZI  reason: invalid class name */
public class AnonymousClass8ZI extends AnonymousClass2IB {
    public AnonymousClass3EP A00;
    public AnonymousClass005 A01;
    public boolean A02;
    public final int A03;
    public final AnonymousClass01z A04;
    public final InteractiveMessageButton A05;
    public final InteractiveMessageView A06;

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
            AnonymousClass8ZJ.A0g(r4, this);
            this.A01 = C18840tu.A00(A0n.A0E);
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public AnonymousClass8ZI(Context context, AnonymousClass01z r9, C89004Uw r10, C46872bo r11, int i) {
        super(context, r10, r11);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        A16();
        float A052 = this.A0G.A05(5073);
        this.A04 = r9;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C012005e.A02(this, R.id.button);
        this.A05 = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C012005e.A02(this, R.id.interactive_view);
        this.A06 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r11.A1J.A02 ^ true ? 1 : 0);
        C65413Ry r6 = (C65413Ry) this.A01.get();
        r6.A04 = new AnonymousClass2Wy(this, 0);
        super.getFMessage();
        interactiveMessageView.A02(this.A2W, r6);
        interactiveMessageButton.A0E.A00 = r6;
        if (i > 0) {
            interactiveMessageView.setDescriptionMinLines(i);
        }
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved) + (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
        A0C();
        if (r6.A05 && (conversationRowImage$RowImageView = this.A09) != null) {
            int A0h = C175108Zr.A0h(this) - (C36371kC.A03(this, R.dimen.f7nameremoved) * 2);
            conversationRowImage$RowImageView.A0H = r6.A05;
            conversationRowImage$RowImageView.A08 = A0h;
            conversationRowImage$RowImageView.A07 = (int) (A052 * ((float) A0h));
            conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.MATRIX);
            conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        }
    }

    private void A0C() {
        C46882bp fMessage = super.getFMessage();
        this.A06.A03(this, fMessage);
        this.A05.A00(this.A04, this, this.A0c, fMessage);
    }

    public void A1Y() {
        super.A1Y();
        A0C();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, super.getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0C();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        return C175108Zr.A0h(this);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onMeasure(int i, int i2) {
        if (C203369nr.A08(super.getFMessage())) {
            i = View.MeasureSpec.makeMeasureSpec(this.A03, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00(super.getFMessage(), i);
    }

    public C46872bo getFMessage() {
        return (C46872bo) super.getFMessage();
    }
}

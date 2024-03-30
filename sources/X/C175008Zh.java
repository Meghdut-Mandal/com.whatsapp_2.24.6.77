package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.8Zh  reason: invalid class name and case insensitive filesystem */
public class C175008Zh extends AnonymousClass2IO {
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
            AnonymousClass8ZJ.A0Z(r4, r2, A0n, this);
            this.A01 = C18840tu.A00(A0n.A0E);
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public C175008Zh(Context context, AnonymousClass01z r8, C89004Uw r9, C181778o1 r10, int i) {
        super(context, r9, r10);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView;
        A16();
        float A052 = this.A0G.A05(5073);
        this.A04 = r8;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C012005e.A02(this, R.id.button);
        this.A05 = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C012005e.A02(this, R.id.interactive_view);
        this.A06 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r10.A1J.A02 ^ true ? 1 : 0);
        C65413Ry r4 = (C65413Ry) this.A01.get();
        r4.A04 = new AnonymousClass2Wy(this, 1);
        super.getFMessage();
        interactiveMessageView.A02(this.A2W, r4);
        interactiveMessageButton.A0E.A00 = r4;
        if (i > 0) {
            interactiveMessageView.setDescriptionMinLines(i);
        }
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved) + (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
        A0B();
        if (r4.A05 && (conversationRowVideo$RowVideoView = this.A0A) != null) {
            int A0h = C175108Zr.A0h(this) - (C36371kC.A03(this, R.dimen.f7nameremoved) * 2);
            conversationRowVideo$RowVideoView.A09 = r4.A05;
            conversationRowVideo$RowVideoView.A03 = A0h;
            conversationRowVideo$RowVideoView.A02 = (int) (A052 * ((float) A0h));
            conversationRowVideo$RowVideoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            conversationRowVideo$RowVideoView.A04 = AnonymousClass3SN.A01(getContext());
            View A022 = C012005e.A02(this, R.id.media_container);
            if (A022 != null) {
                A022.setPadding(C36371kC.A03(this, R.dimen.f7nameremoved), C36371kC.A03(this, R.dimen.f7nameremoved), C36371kC.A03(this, R.dimen.f7nameremoved), 0);
            }
        }
    }

    private void A0B() {
        C181798o3 fMessage = super.getFMessage();
        this.A06.A03(this, fMessage);
        this.A05.A00(this.A04, this, this.A0c, fMessage);
    }

    public void A1Y() {
        super.A1Y();
        A0B();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        super.A22(r2, z);
        boolean A1W = C36371kC.A1W(r2, super.getFMessage());
        if (z || A1W) {
            A0B();
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

    public C181778o1 getFMessage() {
        return (C181778o1) super.getFMessage();
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.8Yf  reason: invalid class name and case insensitive filesystem */
public class C174728Yf extends AnonymousClass2IR {
    public boolean A00;
    public final TextEmojiLabel A01 = C36401kF.A0P(this, R.id.title_text_message);
    public final C89004Uw A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A05 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    private void A0B() {
        this.A04.A00(this);
        AnonymousClass3T1 fMessage = getFMessage();
        if (!TextUtils.isEmpty(fMessage.A0b())) {
            String A0b = fMessage.A0b();
            TextEmojiLabel textEmojiLabel = this.A01;
            A1s(textEmojiLabel, getFMessage(), A0b, false, false);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A01.setVisibility(8);
        }
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A05;
        AnonymousClass37E A002 = C61583Cq.A00(fMessage);
        AnonymousClass96M.A00(this, this.A02, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0E, A002);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public C174728Yf(Context context, C89004Uw r4, AnonymousClass2bV r5) {
        super(context, r4, r5);
        A16();
        this.A02 = r4;
        TextEmojiLabel textEmojiLabel = this.A01;
        C36331k8.A1A(this.A0G, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        A0B();
    }

    public void A1Y() {
        A0B();
        super.A1Y();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
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

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C175108Zr.A0s(this.A03, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C175108Zr.A0i(this, this.A03, getMeasuredHeight()));
    }
}

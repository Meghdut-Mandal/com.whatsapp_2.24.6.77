package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.8ZG  reason: invalid class name */
public class AnonymousClass8ZG extends AnonymousClass2IB {
    public boolean A00;
    public final C89004Uw A01;
    public final DynamicButtonsLayout A02 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A03 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A04 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    private void A0C() {
        this.A03.A00(this);
        DynamicButtonsLayout dynamicButtonsLayout = this.A02;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A04;
        AnonymousClass37E A002 = C61583Cq.A00(getFMessage());
        AnonymousClass96M.A00(this, this.A01, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0E, A002);
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
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
            AnonymousClass8ZJ.A0g(r4, this);
        }
    }

    public AnonymousClass8ZG(Context context, C89004Uw r3, C46882bp r4) {
        super(context, r3, r4);
        A16();
        this.A01 = r3;
        A0C();
    }

    public void A1Y() {
        A0C();
        super.A1Y();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
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

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C175108Zr.A0s(this.A02, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C175108Zr.A0i(this, this.A02, getMeasuredHeight()));
    }
}

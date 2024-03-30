package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.8ZN  reason: invalid class name */
public class AnonymousClass8ZN extends AnonymousClass2IG {
    public boolean A00;
    public final DynamicButtonsLayout A01 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A02 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));

    private void A0B() {
        List A0I;
        int i;
        this.A02.A00(this);
        AnonymousClass3T1 r1 = this.A0K;
        if (C61583Cq.A00(r1) == null || AnonymousClass3SS.A01(getContext()) == null) {
            A0I = AnonymousClass001.A0I();
        } else {
            A0I = C61583Cq.A00(r1).A02;
        }
        int size = A0I.size();
        DynamicButtonsLayout dynamicButtonsLayout = this.A01;
        if (size > 0) {
            dynamicButtonsLayout.A04(this.A2X, A0I);
            i = 0;
        } else {
            i = 8;
        }
        dynamicButtonsLayout.setVisibility(i);
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
            AnonymousClass3R2.A01(this, (C62163Fa) r2.A5p.get());
            AnonymousClass3R2.A00(A0k, this);
            AnonymousClass3R2.A02(this, C36371kC.A0l(r4));
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public AnonymousClass8ZN(Context context, C89004Uw r3, C46912bs r4) {
        super(context, r3, r4);
        A16();
        A0B();
    }

    public void A1Y() {
        A0B();
        super.A1Y();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C175108Zr.A0s(this.A01, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C175108Zr.A0i(this, this.A01, getMeasuredHeight()));
    }
}

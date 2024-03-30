package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Yq  reason: invalid class name and case insensitive filesystem */
public class C174838Yq extends AnonymousClass2IR {
    public C24881Ed A00;
    public AnonymousClass1EU A01;
    public AnonymousClass1FR A02;
    public boolean A03;
    public final TextView A04 = C36391kE.A0P(this, R.id.info);

    public boolean A1G() {
        return true;
    }

    public boolean A25() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private void A0B() {
        C202319lY r2;
        String str;
        TextView textView = this.A04;
        textView.setTextSize(getDividerFontSize());
        textView.setBackgroundResource(R.drawable.business_balloon);
        AnonymousClass3T1 fMessage = getFMessage();
        if ((fMessage instanceof C180968mi) || (fMessage instanceof C180978mj)) {
            String str2 = ((C180838mV) fMessage).A00;
            if (!TextUtils.isEmpty(str2)) {
                r2 = C165587tf.A0R(this.A00, str2, (String) null);
                if (r2 != null) {
                    str = this.A02.A0V(r2, getFMessage());
                } else {
                    str = null;
                }
            } else {
                r2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass3YF.A00(textView, this, r2, 31);
                textView.setText(str);
                C36331k8.A0r(getContext(), textView, R.color.f6nameremoved);
                return;
            }
            textView.setOnClickListener((View.OnClickListener) null);
            return;
        }
        throw AnonymousClass001.A09("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
    }

    public void A16() {
        if (!this.A03) {
            this.A03 = true;
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
            this.A02 = C36431kI.A0p(r4);
            this.A00 = (C24881Ed) r4.A6H.get();
            this.A01 = C36381kD.A0f(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r3 instanceof X.C180968mi) != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass3T1 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C180978mj
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3 instanceof X.C180968mi
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.C18740tg.A0C(r0)
            r2.A0K = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174838Yq.setFMessage(X.3T1):void");
    }

    public C174838Yq(Context context, C89004Uw r3, AnonymousClass3T1 r4) {
        super(context, r3, r4);
        A16();
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
}

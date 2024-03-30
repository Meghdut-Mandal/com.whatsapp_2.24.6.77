package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Yh  reason: invalid class name and case insensitive filesystem */
public class C174748Yh extends AnonymousClass2IR {
    public boolean A00;
    public final TextView A01;
    public final AnonymousClass01z A02;
    public final C62383Fy A03;

    public boolean A1G() {
        return true;
    }

    public boolean A25() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
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

    public void A22(AnonymousClass3T1 r4, boolean z) {
        boolean A1W = C36371kC.A1W(r4, this.A0K);
        super.A22(r4, z);
        if (z || A1W) {
            String string = getContext().getString(R.string.f12nameremoved);
            Drawable A0j = C175108Zr.A0j(this);
            TextView textView = this.A01;
            textView.setText(C165597tg.A0a(A0j, textView, string));
            C66953Xy.A00(textView, this, 32);
        }
    }

    public C181108mw getFMessage() {
        return (C181108mw) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C181108mw);
        this.A0K = r2;
    }

    public C174748Yh(Context context, AnonymousClass01z r5, C89004Uw r6, C62383Fy r7, AnonymousClass2bI r8) {
        super(context, r6, r8);
        A16();
        this.A02 = r5;
        this.A03 = r7;
        setClickable(false);
        setLongClickable(false);
        TextView A0O = C36391kE.A0O(getRootView(), R.id.info);
        this.A01 = A0O;
        C175108Zr.A0r(context, A0O, this);
        String string = getContext().getString(R.string.f12nameremoved);
        Drawable A0j = C175108Zr.A0j(this);
        TextView textView = this.A01;
        textView.setText(C165597tg.A0a(A0j, textView, string));
        C66953Xy.A00(textView, this, 32);
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

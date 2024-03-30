package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Yo  reason: invalid class name and case insensitive filesystem */
public class C174818Yo extends AnonymousClass2IR {
    public AnonymousClass1T1 A00;
    public AnonymousClass3D6 A01;
    public boolean A02;
    public final TextView A03;

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
        AnonymousClass11F r3;
        AnonymousClass2bH r5 = (AnonymousClass2bH) this.A0K;
        AnonymousClass1T1 r4 = this.A00;
        C64933Qa r1 = r5.A1J;
        if (r1.A02) {
            r3 = C36441kJ.A0n(this.A0T);
        } else {
            r3 = r1.A00;
        }
        String A0K = r4.A0K(r3, r5.A00, r5.A04, true);
        Drawable A0j = C175108Zr.A0j(this);
        TextView textView = this.A03;
        textView.setText(C165597tg.A0a(A0j, textView, A0K));
        C66953Xy.A00(textView, this, 34);
    }

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
            this.A01 = (AnonymousClass3D6) A0m.A0R.get();
            this.A00 = (AnonymousClass1T1) r4.A8V.get();
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public AnonymousClass2bH getFMessage() {
        return (AnonymousClass2bH) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bH);
        this.A0K = r2;
    }

    public C174818Yo(Context context, C89004Uw r3, AnonymousClass2bH r4) {
        super(context, r3, r4);
        A16();
        setClickable(false);
        setLongClickable(false);
        TextView A0P = C36391kE.A0P(this, R.id.info);
        this.A03 = A0P;
        C175108Zr.A0r(context, A0P, this);
        A0B();
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

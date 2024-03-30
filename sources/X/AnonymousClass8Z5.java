package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Z5  reason: invalid class name */
public class AnonymousClass8Z5 extends C175068Zn {
    public static final C193129Jy A02 = new C193129Jy(R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    public static final C193129Jy A03 = new C193129Jy(R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    public static final C193129Jy A04 = new C193129Jy(R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    public static final C193129Jy A05 = new C193129Jy(R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    public AnonymousClass1ND A00;
    public boolean A01;

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
            this.A00 = (AnonymousClass1ND) r4.A1N.get();
        }
    }

    public AnonymousClass5J5 getFMessage() {
        return (AnonymousClass5J5) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass5J5);
        this.A0K = r2;
    }

    public AnonymousClass8Z5(Context context, C89004Uw r6, AnonymousClass5J5 r7) {
        super(context, r6, r7);
        A16();
        setClickable(false);
        TextView textView = this.A00;
        textView.setBackgroundResource(R.drawable.date_balloon);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        textView.setOnLongClickListener(this.A2W);
        setLongClickable(true);
        setWillNotDraw(false);
        A2D();
    }
}

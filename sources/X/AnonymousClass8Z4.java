package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.8Z4  reason: invalid class name */
public class AnonymousClass8Z4 extends C175058Zm {
    public boolean A00;
    public final /* synthetic */ PopupNotification A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z4(Context context, PopupNotification popupNotification, C46812bi r9) {
        super(context, (C89004Uw) null, popupNotification.A0Z, popupNotification.A0a, r9);
        this.A01 = popupNotification;
        A16();
    }

    public boolean A1G() {
        return true;
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
            this.A00 = C18840tu.A00(r2.A35);
            this.A01 = C18840tu.A00(r2.A3S);
        }
    }

    public void onDraw(Canvas canvas) {
        View view = this.A08;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            view.setLayoutParams(layoutParams);
        }
        AnonymousClass8ZJ.A0U(view, this);
        super.onDraw(canvas);
    }
}

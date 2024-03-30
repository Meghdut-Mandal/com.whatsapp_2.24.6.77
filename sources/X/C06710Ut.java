package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.whatsapp.R;

/* renamed from: X.0Ut  reason: invalid class name and case insensitive filesystem */
public class C06710Ut {
    public int A00 = 8388611;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public C09450cO A03;
    public C16990qX A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09 = new C18460tC(this, 0);
    public final C016307a A0A;
    public final boolean A0B;

    public void A02() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public C09450cO A00() {
        C09450cO r2 = this.A03;
        if (r2 == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)) {
                r2 = new C03450Fb(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                r2 = new AnonymousClass0Fc(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            r2.A07(this.A0A);
            r2.A06(this.A09);
            r2.A05(this.A01);
            r2.BqL(this.A04);
            r2.A08(this.A05);
            r2.A02(this.A00);
            this.A03 = r2;
        }
        return r2;
    }

    public void A01() {
        C09450cO r0 = this.A03;
        if (r0 != null && r0.BNH()) {
            this.A03.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r3 = this;
            X.0cO r0 = r3.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.BNH()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.view.View r0 = r3.A01
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            X.0cO r0 = r3.A00()
            r0.A09(r1)
            r0.Btc()
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06710Ut.A03():boolean");
    }

    public C06710Ut(Context context, View view, C016307a r5, int i, int i2, boolean z) {
        this.A08 = context;
        this.A0A = r5;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }
}

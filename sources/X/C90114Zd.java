package X;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;

/* renamed from: X.4Zd  reason: invalid class name and case insensitive filesystem */
public class C90114Zd implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public Object A01;
    public final int A02 = 1;

    public C90114Zd(C70803fk r2) {
        this.A01 = r2;
        this.A00 = r2.A0N.getHeight();
    }

    public void onGlobalLayout() {
        int i;
        if (this.A02 != 0) {
            AnonymousClass3AZ r6 = (AnonymousClass3AZ) this.A01;
            DefaultRecipientsView defaultRecipientsView = r6.A06;
            C36351kA.A1C(defaultRecipientsView, this);
            int[] iArr = r6.A07;
            defaultRecipientsView.getLocationInWindow(iArr);
            int i2 = iArr[0] + r6.A01;
            int height = iArr[1] - (defaultRecipientsView.getHeight() / 2);
            PopupWindow popupWindow = r6.A03;
            popupWindow.setOutsideTouchable(true);
            WaTextView waTextView = r6.A04;
            int i3 = this.A00;
            if (i3 != 1) {
                i = R.string.f12nameremoved;
                if (i3 != 2) {
                    i = R.string.f12nameremoved;
                    if (i3 != 3) {
                        i = R.string.f12nameremoved;
                    }
                }
            } else {
                i = R.string.f12nameremoved;
            }
            waTextView.setText(i);
            C18820ts r3 = r6.A05;
            waTextView.setBackground(new C100744vb(AnonymousClass0BT.A00((Resources.Theme) null, r6.A02.getResources(), R.drawable.recipient_tooltip_background), r3));
            C53912s6.A00(waTextView, r6, 8);
            int i4 = 8388659;
            if (C36401kF.A1X(r3)) {
                i4 = 8388661;
            }
            popupWindow.showAtLocation(defaultRecipientsView, i4, i2, height);
            defaultRecipientsView.postDelayed(new C1503074t((Object) r6, 37), 5000);
            return;
        }
        C70803fk r1 = (C70803fk) this.A01;
        int height2 = r1.A0N.getHeight() - this.A00;
        this.A00 = r1.A0N.getHeight();
        if (height2 > 0) {
            r1.A2U.smoothScrollBy(height2, 0);
        }
    }

    public C90114Zd(AnonymousClass3AZ r2, int i) {
        this.A01 = r2;
        this.A00 = i;
    }
}

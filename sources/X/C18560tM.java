package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.List;

/* renamed from: X.0tM  reason: invalid class name and case insensitive filesystem */
public class C18560tM implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C18560tM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A01) {
            case 0:
                C03450Fb r2 = (C03450Fb) this.A00;
                if (r2.BNH()) {
                    List<C06140Sl> list = r2.A0L;
                    if (list.size() > 0 && !((C06140Sl) list.get(0)).A02.A0F) {
                        View view = r2.A04;
                        if (view == null || !view.isShown()) {
                            r2.dismiss();
                            return;
                        }
                        for (C06140Sl r0 : list) {
                            r0.A02.Btc();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass0Fc r22 = (AnonymousClass0Fc) this.A00;
                if (r22.BNH()) {
                    AnonymousClass0G1 r1 = r22.A0G;
                    if (!r1.A0F) {
                        View view2 = r22.A03;
                        if (view2 == null || !view2.isShown()) {
                            r22.dismiss();
                            return;
                        } else {
                            r1.Btc();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
                C17360rA r23 = appCompatSpinner.A01;
                if (!r23.BNH()) {
                    r23.Btd(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                AnonymousClass0G0 r24 = (AnonymousClass0G0) this.A00;
                AppCompatSpinner appCompatSpinner2 = r24.A04;
                if (!C011304x.A02(appCompatSpinner2) || !appCompatSpinner2.getGlobalVisibleRect(r24.A03)) {
                    r24.dismiss();
                    return;
                }
                r24.A04();
                C18560tM.super.Btc();
                return;
        }
    }
}

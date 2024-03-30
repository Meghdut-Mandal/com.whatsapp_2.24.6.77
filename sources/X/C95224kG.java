package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4kG  reason: invalid class name and case insensitive filesystem */
public class C95224kG extends AnonymousClass0BN {
    public final /* synthetic */ ClearableEditText A00;

    public void A0s(C07650Ys r5, int i) {
        if (i == 1) {
            r5.A0L(true);
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
            accessibilityNodeInfo.addAction(16);
            ClearableEditText clearableEditText = this.A00;
            r5.A0D(clearableEditText.getContext().getString(R.string.f12nameremoved));
            accessibilityNodeInfo.setBoundsInParent(clearableEditText.getClearBounds());
        }
    }

    public boolean A0w(int i, int i2, Bundle bundle) {
        if (i != 1 || i2 != 16) {
            return false;
        }
        ClearableEditText clearableEditText = this.A00;
        View.OnClickListener onClickListener = clearableEditText.A01;
        if (onClickListener != null) {
            onClickListener.onClick(clearableEditText);
        }
        C36391kE.A1K(clearableEditText);
        clearableEditText.requestFocus();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95224kG(View view, ClearableEditText clearableEditText) {
        super(view);
        this.A00 = clearableEditText;
    }

    public int A0m(float f, float f2) {
        if (ClearableEditText.A03(this.A00, (int) f, (int) f2)) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    public void A0t(List list) {
        if (this.A00.getClearIconDrawable() != null) {
            list.add(C36361kB.A0i());
        }
    }
}

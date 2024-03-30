package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.0HU  reason: invalid class name */
public class AnonymousClass0HU extends AnonymousClass0BN {
    public final /* synthetic */ Chip A00;

    public void A0q(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A07 = z;
            chip.refreshDrawableState();
        }
    }

    public void A0t(List list) {
        AnonymousClass0NO r0;
        list.add(0);
        Chip chip = this.A00;
        if (Chip.A07(chip) && (r0 = chip.A04) != null && r0.A0d && chip.A02 != null) {
            list.add(1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0HU(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    public int A0m(float f, float f2) {
        Chip chip = this.A00;
        if (!Chip.A07(chip) || !chip.getCloseIconTouchBounds().contains(f, f2)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0r(X.C07650Ys r5) {
        /*
            r4 = this;
            com.google.android.material.chip.Chip r2 = r4.A00
            X.0NO r0 = r2.A04
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.A02
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r5.A0L(r0)
            java.lang.CharSequence r0 = r2.getAccessibilityClassName()
            r5.A0C(r0)
            java.lang.CharSequence r2 = r2.getText()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002d
            r3.setText(r2)
            return
        L_0x002d:
            r5.A0D(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HU.A0r(X.0Ys):void");
    }

    public void A0s(C07650Ys r9, int i) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.A00;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                closeIconContentDescription = context.getString(R.string.f12nameremoved, objArr).trim();
            }
            r9.A0D(closeIconContentDescription);
            Rect A002 = chip.getCloseIconTouchBoundsInt();
            AccessibilityNodeInfo accessibilityNodeInfo = r9.A02;
            accessibilityNodeInfo.setBoundsInParent(A002);
            r9.A0A(AnonymousClass0Yd.A08);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        r9.A0D(charSequence);
        r9.A02.setBoundsInParent(Chip.A0J);
    }

    public boolean A0w(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.A00.performClick();
        }
        if (i != 1) {
            return false;
        }
        Chip chip = this.A00;
        boolean z = false;
        chip.playSoundEffect(0);
        View.OnClickListener onClickListener = chip.A02;
        if (onClickListener != null) {
            onClickListener.onClick(chip);
            z = true;
        }
        if (!chip.A0B) {
            return z;
        }
        chip.A0F.A0p(1, 1);
        return z;
    }
}

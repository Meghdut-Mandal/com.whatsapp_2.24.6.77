package androidx.preference;

import X.AnonymousClass0SL;
import X.AnonymousClass0Yh;
import X.AnonymousClass80G;
import X.C07650Ys;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public boolean A0O() {
        return false;
    }

    @Deprecated
    public void A0E(C07650Ys r8) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 28 && (collectionItemInfo = r8.A02.getCollectionItemInfo()) != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) new AnonymousClass0SL(collectionItemInfo).A00;
            r8.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), true, collectionItemInfo2.isSelected())));
        }
    }

    public void A0G(AnonymousClass80G r4) {
        super.A0G(r4);
        if (Build.VERSION.SDK_INT >= 28) {
            r4.A0H.setAccessibilityHeading(true);
        }
    }

    public boolean A0P() {
        return !super.A0O();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16842892));
    }

    public PreferenceCategory(Context context) {
        this(context, (AttributeSet) null);
    }
}

package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.whatsapp.R;

/* renamed from: X.0se  reason: invalid class name and case insensitive filesystem */
public class C18120se extends C011705b {
    public Object A00;
    public final int A01;

    public C18120se(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        if (2 - this.A01 != 0) {
            super.A0e(view, accessibilityEvent);
            return;
        }
        super.A0e(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            BottomSheetDragHandleView.A02((BottomSheetDragHandleView) this.A00);
        }
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        if (8 - this.A01 != 0) {
            super.A0i(view, accessibilityEvent);
            return;
        }
        super.A0i(view, accessibilityEvent);
        accessibilityEvent.setChecked(((CheckableImageButton) this.A00).isChecked());
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        switch (this.A01) {
            case 1:
                if (i == 1048576) {
                    AnonymousClass0FL r1 = (AnonymousClass0FL) this.A00;
                    if (r1.A03) {
                        r1.cancel();
                        return true;
                    }
                }
                break;
            case 10:
                if (i == 1048576) {
                    ((AnonymousClass6YL) this.A00).A0N();
                    return true;
                }
                break;
        }
        return super.A0j(view, i, bundle);
    }

    public void A0k(View view, C07650Ys r10) {
        int i;
        switch (this.A01) {
            case 0:
                super.A0k(view, r10);
                r10.A02.setScrollable(((AppBarLayout.BaseBehavior) this.A00).A05);
                r10.A0C(ScrollView.class.getName());
                return;
            case 1:
                super.A0k(view, r10);
                boolean z = false;
                if (((AnonymousClass0FL) this.A00).A03) {
                    r10.A02.addAction(1048576);
                    z = true;
                }
                r10.A02.setDismissable(z);
                return;
            case 3:
                super.A0k(view, r10);
                ViewGroup viewGroup = (ViewGroup) this.A00;
                if (view instanceof MaterialButton) {
                    int i2 = 0;
                    i = 0;
                    while (true) {
                        if (i2 < viewGroup.getChildCount()) {
                            if (viewGroup.getChildAt(i2) != view) {
                                if ((viewGroup.getChildAt(i2) instanceof MaterialButton) && AnonymousClass001.A05(viewGroup, i2) != 8) {
                                    i++;
                                }
                                i2++;
                            }
                        }
                    }
                    r10.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).isChecked())));
                    return;
                }
                i = -1;
                r10.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).isChecked())));
                return;
            case 4:
            case 7:
                super.A0k(view, r10);
                r10.A0J((Object) null);
                return;
            case 5:
                super.A0k(view, r10);
                r10.A02.setScrollable(false);
                return;
            case 6:
                super.A0k(view, r10);
                MaterialCalendar materialCalendar = (MaterialCalendar) this.A00;
                int visibility = materialCalendar.A00.getVisibility();
                int i3 = R.string.f12nameremoved;
                if (visibility == 0) {
                    i3 = R.string.f12nameremoved;
                }
                r10.A0E(materialCalendar.A0n(i3));
                return;
            case 8:
                super.A0k(view, r10);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.A00;
                boolean z2 = checkableImageButton.A00;
                AccessibilityNodeInfo accessibilityNodeInfo = r10.A02;
                accessibilityNodeInfo.setCheckable(z2);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 9:
                super.A0k(view, r10);
                r10.A02.setCheckable(((NavigationMenuItemView) this.A00).A04);
                return;
            case 10:
                super.A0k(view, r10);
                AccessibilityNodeInfo accessibilityNodeInfo2 = r10.A02;
                accessibilityNodeInfo2.addAction(1048576);
                accessibilityNodeInfo2.setDismissable(true);
                return;
            default:
                super.A0k(view, r10);
                return;
        }
    }
}

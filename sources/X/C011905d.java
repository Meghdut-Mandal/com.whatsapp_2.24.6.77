package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.05d  reason: invalid class name and case insensitive filesystem */
public final class C011905d extends View.AccessibilityDelegate {
    public final C011705b A00;

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0g(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AnonymousClass0X7 A0l = this.A00.A0l(view);
        if (A0l != null) {
            return (AccessibilityNodeProvider) A0l.A00;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0i(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C07650Ys r3 = new C07650Ys(accessibilityNodeInfo);
        r3.A0O(C012005e.A0d(view));
        r3.A0M(C012005e.A0c(view));
        r3.A0F((CharSequence) new C18130sf(1).A00(view));
        r3.A0H((CharSequence) new C18130sf(2).A00(view));
        this.A00.A0k(view, r3);
        r3.A09(view, accessibilityNodeInfo.getText());
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i = 0; i < list.size(); i++) {
            r3.A0A((AnonymousClass0Yd) list.get(i));
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0e(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0h(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A0j(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.A00.A0d(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0f(view, accessibilityEvent);
    }

    public C011905d(C011705b r1) {
        this.A00 = r1;
    }
}

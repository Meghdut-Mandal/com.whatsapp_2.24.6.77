package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.4kH  reason: invalid class name and case insensitive filesystem */
public class C95234kH extends AnonymousClass0BN {
    public C011705b A00;
    public final /* synthetic */ RCTextView A01;

    public boolean A0w(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95234kH(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public int A0m(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A07;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A0A;
                if (i >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A002 = RCTextView.A00(rCTextView, (int) f, (int) f2);
                if (A002 >= spanStart && A002 <= spanEnd) {
                    return i;
                }
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void A0s(C07650Ys r12, int i) {
        int lineVisibleEnd;
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A07;
        Rect A06 = AnonymousClass001.A06();
        ClickableSpan[] clickableSpanArr = rCTextView.A0A;
        if (clickableSpanArr == null || i >= clickableSpanArr.length) {
            AccessibilityNodeInfo accessibilityNodeInfo = r12.A02;
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setBoundsInParent(A06);
            return;
        }
        ClickableSpan clickableSpan = clickableSpanArr[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A06.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A06.getLineForOffset(spanEnd);
        Path A0M = C36441kJ.A0M();
        RectF A0N = C36441kJ.A0N();
        if (lineForOffset == lineForOffset2) {
            lineVisibleEnd = spanEnd;
        } else {
            lineVisibleEnd = rCTextView.A06.getLineVisibleEnd(lineForOffset);
        }
        rCTextView.A06.getSelectionPath(spanStart, lineVisibleEnd, A0M);
        A0M.computeBounds(A0N, true);
        A0N.offset(rCTextView.A00, rCTextView.A01);
        A0N.round(A06);
        AccessibilityNodeInfo accessibilityNodeInfo2 = r12.A02;
        accessibilityNodeInfo2.setBoundsInParent(A06);
        r12.A0L(true);
        accessibilityNodeInfo2.setFocusable(true);
        accessibilityNodeInfo2.setEnabled(true);
        accessibilityNodeInfo2.setVisibleToUser(true);
        accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
        r12.A0C("android.widget.Button");
        if (clickableSpan instanceof C91864ck) {
            C91864ck r5 = (C91864ck) clickableSpan;
            String str = r5.A00;
            String str2 = r5.A01;
            if (str != null) {
                r12.A0D(str);
            }
            AnonymousClass5YW.A00(rCTextView.getContext(), (View) null, r12, str2);
        }
    }

    public void A0t(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A0A;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                C90504aG.A10(i, list);
            }
        }
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        super.A0e(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A07)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public void A0k(View view, C07650Ys r5) {
        super.A0k(view, r5);
        CharSequence A012 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A012)) {
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
            accessibilityNodeInfo.setText(A012);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(C132986Wc.A0F);
        }
        C011705b r0 = this.A00;
        if (r0 != null) {
            r0.A0k(view, r5);
        }
    }
}

package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1gJ  reason: invalid class name and case insensitive filesystem */
public class C34011gJ extends AnonymousClass0BN {
    public final TextView A00;
    public final Rect A01 = new Rect();
    public final C21060yb A02;

    private void A04(Rect rect, C33981gG r8) {
        Layout layout;
        TextView textView = this.A00;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(r8);
            int spanEnd = spanned.getSpanEnd(r8);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 != lineForOffset) {
                Rect rect2 = new Rect();
                while (true) {
                    lineForOffset++;
                    if (lineForOffset > lineForOffset2) {
                        break;
                    }
                    layout.getLineBounds(lineForOffset, rect2);
                    rect.union(rect2);
                }
            } else {
                rect.left = (int) layout.getPrimaryHorizontal(spanStart);
                rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }

    public int A0m(float f, float f2) {
        TextView textView = this.A00;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f, f2);
        C33981gG[] r2 = (C33981gG[]) spanned.getSpans(offsetForPosition, offsetForPosition, C33981gG.class);
        if (r2.length == 1) {
            return spanned.getSpanStart(r2[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0s(X.C07650Ys r7, int r8) {
        /*
            r6 = this;
            android.widget.TextView r3 = r6.A00
            java.lang.CharSequence r1 = r3.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x006f
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<X.1gG> r0 = X.C33981gG.class
            java.lang.Object[] r2 = r1.getSpans(r8, r8, r0)
            X.1gG[] r2 = (X.C33981gG[]) r2
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x006f
            r0 = 0
            r5 = r2[r0]
            if (r5 == 0) goto L_0x0070
            java.lang.CharSequence r2 = r3.getText()
            boolean r0 = r2 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0033
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r2.getSpanStart(r5)
            int r0 = r2.getSpanEnd(r5)
            java.lang.CharSequence r2 = r2.subSequence(r1, r0)
        L_0x0033:
            r7.A0D(r2)
            r4 = 1
            android.view.accessibility.AccessibilityNodeInfo r3 = r7.A02
            r3.setFocusable(r4)
            r7.A0L(r4)
            android.graphics.Rect r2 = r6.A01
            r6.A04(r2, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0056
            r6.A04(r2, r5)
        L_0x004d:
            r3.setBoundsInParent(r2)
            r0 = 16
            r3.addAction(r0)
            return
        L_0x0056:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkAccessibilityHelper/LinkSpan bounds is empty for: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r2.set(r0, r0, r4, r4)
            goto L_0x004d
        L_0x006f:
            r5 = 0
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkAccessibilityHelper/TouchableSpan is null for offset: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.CharSequence r2 = r3.getText()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34011gJ.A0s(X.0Ys, int):void");
    }

    public void A0t(List list) {
        if (!this.A02.A0P("android.hardware.type.featurephone")) {
            CharSequence text = this.A00.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (C33981gG spanStart : (C33981gG[]) spanned.getSpans(0, spanned.length(), C33981gG.class)) {
                    list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
                }
            }
        }
    }

    public boolean A0w(int i, int i2, Bundle bundle) {
        C33981gG r0;
        if (i2 != 16) {
            return false;
        }
        TextView textView = this.A00;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            C33981gG[] r2 = (C33981gG[]) ((Spanned) text).getSpans(i, i, C33981gG.class);
            if (r2.length == 1 && (r0 = r2[0]) != null) {
                r0.onClick(textView);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LinkAccessibilityHelper/LinkSpan is null for offset: ");
        sb.append(i);
        Log.e(sb.toString());
        return false;
    }

    public C34011gJ(TextView textView, C21060yb r3) {
        super(textView);
        this.A02 = r3;
        this.A00 = textView;
    }
}

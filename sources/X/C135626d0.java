package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.6d0  reason: invalid class name and case insensitive filesystem */
public class C135626d0 implements View.OnFocusChangeListener {
    public final C125115zL A00;
    public final C1271967i A01;
    public final C140456lc A02;
    public final C160377ku A03;
    public final C160377ku A04;

    public void onFocusChange(View view, boolean z) {
        C160377ku r3;
        Editable text;
        BloksEditText bloksEditText = (BloksEditText) view;
        TextUtils.TruncateAt ellipsize = bloksEditText.getEllipsize();
        if (z) {
            if (ellipsize != null) {
                AnonymousClass6X8.A00((TextUtils.TruncateAt) null, bloksEditText, this.A00);
                bloksEditText.getExtendedPaddingTop();
                bloksEditText.getViewTreeObserver().addOnPreDrawListener(new C164027r9(bloksEditText, this, 0));
            }
            r3 = this.A03;
        } else {
            if (ellipsize == null && AnonymousClass6X8.A06(bloksEditText) && (text = bloksEditText.getText()) != null) {
                Rect A06 = AnonymousClass001.A06();
                bloksEditText.getPaint().getTextBounds(text.toString(), 0, text.length(), A06);
                if (A06.width() > C36331k8.A00(bloksEditText, bloksEditText.getWidth())) {
                    AnonymousClass6X8.A00(TextUtils.TruncateAt.END, bloksEditText, this.A00);
                }
            }
            r3 = this.A04;
        }
        if (r3 != null) {
            C1273868b A002 = C1273868b.A00();
            C140456lc r1 = this.A02;
            A002.A09(r1, 0);
            C1271967i r0 = this.A01;
            A002.A09(r0, 1);
            C1273868b.A06(r0, r1, A002, r3);
        }
    }

    public C135626d0(C1271967i r2, C140456lc r3, C160377ku r4, C160377ku r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = (C125115zL) C133266Xn.A04(r2, r3);
    }
}

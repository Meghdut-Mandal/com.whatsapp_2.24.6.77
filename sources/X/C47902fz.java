package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2fz  reason: invalid class name and case insensitive filesystem */
public final class C47902fz extends AnonymousClass2gA {
    public boolean A00;
    public final EditText A01;
    public final C21060yb A02;
    public final AnonymousClass1N0 A03;
    public final AnonymousClass1H2 A04;
    public final C19890wg A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (X.AnonymousClass098.A07(r2, r1, false) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            android.widget.EditText r5 = r7.A01
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x006b
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x006b
            r7.A00 = r6
            r5.removeTextChangedListener(r7)
            int r4 = r5.getSelectionStart()
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineForOffset(r4)
            if (r1 <= 0) goto L_0x0060
            android.text.Layout r0 = r5.getLayout()
            int r1 = r1 + -1
            int r3 = r0.getLineStart(r1)
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineEnd(r1)
            java.lang.CharSequence r0 = r8.subSequence(r3, r1)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "* \n"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "- \n"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "* "
            boolean r0 = X.AnonymousClass098.A07(r2, r1, r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = "- "
            boolean r0 = X.AnonymousClass098.A07(r2, r1, r6)
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            r8.insert(r4, r1)
        L_0x0060:
            r7.A00(r8)
            r5.addTextChangedListener(r7)
            return
        L_0x0067:
            r8.delete(r3, r1)
            goto L_0x0060
        L_0x006b:
            r7.A00(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47902fz.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 >= 1 && charSequence != null && charSequence.charAt(i) == 10) {
            this.A00 = true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47902fz(android.widget.EditText r14, android.widget.TextView r15, X.C21060yb r16, X.C18820ts r17, X.AnonymousClass1N0 r18, X.AnonymousClass1H2 r19, X.C19890wg r20, int r21, int r22, boolean r23) {
        /*
            r13 = this;
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            X.C36321k7.A1B(r6, r3, r4, r7, r5)
            r0 = 6
            r1 = r14
            X.AnonymousClass00C.A0D(r14, r0)
            r11 = 0
            r0 = r13
            r2 = r15
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A04 = r6
            r13.A02 = r3
            r13.A05 = r7
            r13.A03 = r5
            r13.A01 = r14
            r13.A06 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47902fz.<init>(android.widget.EditText, android.widget.TextView, X.0yb, X.0ts, X.1N0, X.1H2, X.0wg, int, int, boolean):void");
    }

    public final void A00(Editable editable) {
        boolean z = this.A06;
        EditText editText = this.A01;
        if (z) {
            Context context = editText.getContext();
            AnonymousClass1H2 r3 = this.A04;
            C21060yb r5 = this.A02;
            C19890wg r2 = this.A05;
            TextPaint paint = editText.getPaint();
            C36331k8.A1G(context, 1, r3);
            AnonymousClass3UG.A07(context, paint, editable, r3, 1.3f);
            AnonymousClass6YV.A0M(editable, false);
            float textSize = paint.getTextSize();
            int A012 = AnonymousClass1K2.A01(r5, r2);
            int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A012 < 2011) {
                i = 512;
            }
            AnonymousClass6YV.A01(editable, textSize, -16777216, i, true);
            return;
        }
        AnonymousClass3UG.A07(editText.getContext(), editText.getPaint(), editable, this.A04, 1.3f);
    }
}

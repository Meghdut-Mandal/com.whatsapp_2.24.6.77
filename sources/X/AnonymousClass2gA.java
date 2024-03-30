package X;

import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2gA  reason: invalid class name */
public class AnonymousClass2gA extends C66803Xj {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final EditText A03;
    public final TextView A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final int A07;
    public final AnonymousClass1N0 A08;
    public final AnonymousClass1H2 A09;
    public final C19890wg A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r11 < r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r11 != r9) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r8.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r14) {
        /*
            r13 = this;
            boolean r0 = r13.A0B
            android.widget.EditText r4 = r13.A03
            r6 = r14
            if (r0 == 0) goto L_0x00a6
            android.content.Context r5 = r4.getContext()
            X.1H2 r9 = r13.A09
            X.0yb r8 = r13.A05
            X.0wg r10 = r13.A0A
            android.text.TextPaint r7 = r4.getPaint()
            boolean r0 = r13.A0D
            r11 = 2131102076(0x7f06097c, float:1.781658E38)
            if (r0 == 0) goto L_0x001f
            r11 = 2131102075(0x7f06097b, float:1.7816578E38)
        L_0x001f:
            boolean r12 = r13.A0C
            X.AnonymousClass6YV.A0F(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0024:
            int r9 = r13.A02
            if (r9 == 0) goto L_0x0092
            java.lang.Runnable r1 = r13.A01
            if (r1 == 0) goto L_0x0031
            android.widget.TextView r0 = r13.A04
            r0.removeCallbacks(r1)
        L_0x0031:
            java.lang.String r7 = r14.toString()
            int r10 = X.C63883Lu.A00(r7)
            android.widget.TextView r8 = r13.A04
            if (r8 == 0) goto L_0x0074
            int r11 = r9 - r10
            int r1 = r13.A07
            if (r1 == 0) goto L_0x009e
            r0 = 8
            if (r11 >= r1) goto L_0x00a2
        L_0x0047:
            r0 = 16
            X.3wm r2 = new X.3wm
            r2.<init>((java.lang.Object) r13, (int) r11, (int) r0)
            r13.A01 = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r2, r0)
            r6 = 0
            r8.setVisibility(r6)
            X.0ts r5 = r13.A06
            java.text.NumberFormat r0 = r5.A0M()
            long r2 = (long) r11
            X.C36411kG.A1E(r8, r0, r2)
            r1 = 2131755384(0x7f100178, float:1.9141646E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1L(r0, r11, r6)
            java.lang.String r0 = r5.A0L(r0, r1, r2)
            r8.setContentDescription(r0)
        L_0x0074:
            if (r10 < r9) goto L_0x0093
            int r0 = r13.A00
            if (r0 != 0) goto L_0x0093
            int r1 = r4.getInputType()
            r13.A00 = r1
            if (r1 == 0) goto L_0x0092
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r4.setInputType(r1)
            r4.setText(r7)
            int r0 = r7.length()
            r4.setSelection(r0)
        L_0x0092:
            return
        L_0x0093:
            int r0 = r13.A00
            if (r0 == 0) goto L_0x0092
            r4.setInputType(r0)
            r0 = 0
            r13.A00 = r0
            return
        L_0x009e:
            r0 = 4
            if (r11 == r9) goto L_0x00a2
            goto L_0x0047
        L_0x00a2:
            r8.setVisibility(r0)
            goto L_0x0074
        L_0x00a6:
            android.content.Context r3 = r4.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            X.1H2 r1 = r13.A09
            r0 = 1067869798(0x3fa66666, float:1.3)
            X.AnonymousClass3UG.A07(r3, r2, r14, r1, r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2gA.afterTextChanged(android.text.Editable):void");
    }

    public AnonymousClass2gA(EditText editText, TextView textView, C21060yb r7, C18820ts r8, AnonymousClass1N0 r9, AnonymousClass1H2 r10, C19890wg r11, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A09 = r10;
        this.A05 = r7;
        this.A06 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A03 = editText;
        this.A04 = textView;
        this.A02 = i;
        this.A07 = i2;
        this.A0B = z;
        this.A0C = z3;
        this.A0D = z2;
        C36421kH.A11(editText, this, 12);
        if (textView != null) {
            long j = (long) i;
            Object[] A0L = AnonymousClass001.A0L();
            C36331k8.A1W(A0L, i);
            textView.setContentDescription(r8.A0L(A0L, R.plurals.f10nameremoved, j));
            if (i != 0 && i2 == 0) {
                C36411kG.A1E(textView, r8.A0M(), j);
            }
        }
    }
}

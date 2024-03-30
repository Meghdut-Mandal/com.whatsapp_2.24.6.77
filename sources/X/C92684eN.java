package X;

import android.widget.BaseAdapter;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.4eN  reason: invalid class name and case insensitive filesystem */
public class C92684eN extends BaseAdapter {
    public C106905Lu A00;
    public boolean A01;
    public final /* synthetic */ WebImagePicker A02;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public C92684eN(WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
    }

    public int getCount() {
        WebImagePicker webImagePicker = this.A02;
        int size = webImagePicker.A0J.size();
        int i = webImagePicker.A00;
        return ((size + i) - 1) / i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 != r2.A00) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r3 = r20
            r9 = 0
            r4 = r18
            if (r20 == 0) goto L_0x0013
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
            com.whatsapp.profile.WebImagePicker r2 = r4.A02
            int r0 = r2.A00
            if (r1 == r0) goto L_0x003a
        L_0x0013:
            com.whatsapp.profile.WebImagePicker r2 = r4.A02
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r2)
            android.content.Context r0 = r3.getContext()
            float r1 = X.C36341k9.A00(r0)
            r0 = 1076538027(0x402aaaab, float:2.6666667)
            float r1 = r1 * r0
            int r5 = (int) r1
            android.content.Context r0 = r3.getContext()
            float r1 = X.C36341k9.A00(r0)
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setPadding(r5, r0, r9, r0)
            r3.setClickable(r9)
        L_0x003a:
            int r8 = r3.getChildCount()
            int r7 = r2.A00
            r5 = r19
            int r7 = r7 * r19
            r6 = 0
        L_0x0045:
            int r0 = r19 + 1
            int r10 = r2.A00
            int r0 = r0 * r10
            if (r7 >= r0) goto L_0x00f9
            java.util.ArrayList r1 = r2.A0J
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x00ea
            java.lang.Object r11 = r1.get(r7)
            X.67w r11 = (X.C1273367w) r11
            if (r8 > r6) goto L_0x00e0
            android.widget.ImageView r15 = new android.widget.ImageView
            r15.<init>(r2)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r15.setScaleType(r0)
            int r0 = r2.A01
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r0, r0)
            r15.setLayoutParams(r10)
            android.content.Context r0 = r15.getContext()
            float r1 = X.C36341k9.A00(r0)
            r0 = 1079334229(0x40555555, float:3.3333333)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10.rightMargin = r0
            r0 = 2131233671(0x7f080b87, float:1.8083486E38)
            r15.setBackgroundResource(r0)
            android.content.Context r0 = r15.getContext()
            float r1 = X.C36341k9.A00(r0)
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r15.setPadding(r0, r0, r0, r0)
            android.view.View$OnClickListener r0 = r2.A03
            r15.setOnClickListener(r0)
            r3.addView(r15)
        L_0x009d:
            java.lang.String r0 = r11.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 2131888481(0x7f120961, float:1.9411599E38)
            java.lang.String r0 = r2.getString(r0)
        L_0x00ac:
            r15.setContentDescription(r0)
            r1 = 2131435340(0x7f0b1f4c, float:1.849252E38)
            java.lang.String r0 = r11.A07
            r15.setTag(r1, r0)
            X.6CW r12 = r2.A0D
            java.lang.String r10 = r11.A07
            int r1 = r11.A00
            if (r1 != 0) goto L_0x00d9
            r0 = 2131100317(0x7f06029d, float:1.7813012E38)
            int r1 = X.AnonymousClass00F.A00(r2, r0)
        L_0x00c6:
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r1)
            r14 = 0
            r16 = r14
            r17 = r10
            r12.A00(r13, r14, r15, r16, r17)
            int r6 = r6 + 1
        L_0x00d5:
            int r7 = r7 + 1
            goto L_0x0045
        L_0x00d9:
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r1 = r1 | r0
            goto L_0x00c6
        L_0x00dd:
            java.lang.String r0 = r11.A04
            goto L_0x00ac
        L_0x00e0:
            android.view.View r15 = r3.getChildAt(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r15.setVisibility(r9)
            goto L_0x009d
        L_0x00ea:
            int r10 = r10 * r19
            int r0 = r7 - r10
            if (r8 <= r0) goto L_0x00d5
            android.view.View r1 = r3.getChildAt(r0)
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x00d5
        L_0x00f9:
            X.5Lu r0 = r4.A00
            if (r0 != 0) goto L_0x0116
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0116
            java.util.ArrayList r0 = r2.A0J
            int r0 = X.C90504aG.A0C(r0)
            int r0 = r0 / r10
            if (r5 != r0) goto L_0x0116
            X.5Lu r1 = new X.5Lu
            r1.<init>(r4)
            r4.A00 = r1
            X.0wU r0 = r2.A04
            X.C36391kE.A1Q(r1, r0)
        L_0x0116:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92684eN.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

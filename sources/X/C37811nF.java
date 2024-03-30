package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.phonematching.CountryPicker;
import java.util.List;

/* renamed from: X.1nF  reason: invalid class name and case insensitive filesystem */
public final class C37811nF extends ArrayAdapter {
    public final String A00;
    public final String A01;
    public final /* synthetic */ CountryPicker A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37811nF(Context context, CountryPicker countryPicker, String str, String str2, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A02 = countryPicker;
        this.A00 = str;
        this.A01 = str2;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            int r0 = super.getCount()
            r2 = 1
            if (r0 != 0) goto L_0x0032
            if (r10 == 0) goto L_0x0012
            r0 = 2131434903(0x7f0b1d97, float:1.8491633E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0012:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625576(0x7f0e0668, float:1.8878364E38)
            r1.inflate(r0, r10, r2)
            r0 = 2131429895(0x7f0b0a07, float:1.8481476E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setClickable(r2)
        L_0x0031:
            return r10
        L_0x0032:
            java.lang.Object r7 = r8.getItem(r9)
            X.C18740tg.A06(r7)
            X.3EW r7 = (X.AnonymousClass3EW) r7
            if (r10 == 0) goto L_0x0046
            r0 = 2131429290(0x7f0b07aa, float:1.8480249E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x005b
        L_0x0046:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131624752(0x7f0e0330, float:1.8876693E38)
            r1.inflate(r0, r10, r2)
        L_0x005b:
            r0 = 2131429291(0x7f0b07ab, float:1.848025E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36401kF.A0O(r10, r0)
            java.lang.String r0 = r7.A02
            r1.A0I(r0)
            r0 = 2
            X.C011504z.A06(r1, r0)
            r0 = 2131429290(0x7f0b07aa, float:1.8480249E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r10, r0)
            java.lang.String r2 = r7.A01
            r5.setText(r2)
            r0 = 2131429296(0x7f0b07b0, float:1.848026E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r10, r0)
            java.lang.String r0 = r7.A04
            r6 = 0
            if (r0 == 0) goto L_0x00dc
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x008a:
            X.C33511fU.A03(r5)
            r0 = 2131429287(0x7f0b07a7, float:1.8480242E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "+"
            r1.append(r0)
            java.lang.String r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r3.setText(r0)
            r0 = 2131429298(0x7f0b07b2, float:1.8480265E38)
            android.widget.ImageView r4 = X.C36391kE.A0N(r10, r0)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e5
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r3 = r0.getResources()
            android.content.Context r2 = r8.getContext()
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            X.C36351kA.A15(r3, r5, r0)
            r4.setImageDrawable(r6)
            return r10
        L_0x00dc:
            r0 = 8
            r1.setVisibility(r0)
            r1.setText(r6)
            goto L_0x008a
        L_0x00e5:
            android.content.Context r2 = r8.getContext()
            android.content.Context r1 = r8.getContext()
            r0 = 2130970579(0x7f0407d3, float:1.7549872E38)
            int r0 = X.C224314h.A01(r1, r0)
            X.C36331k8.A0r(r2, r5, r0)
            r0 = 2131231385(0x7f080299, float:1.807885E38)
            r4.setImageResource(r0)
            android.content.Context r3 = r8.getContext()
            android.content.Context r2 = r8.getContext()
            r1 = 2130969809(0x7f0404d1, float:1.754831E38)
            r0 = 2131101059(0x7f060583, float:1.7814517E38)
            int r0 = X.C36351kA.A02(r2, r3, r1, r0)
            X.AnonymousClass3UF.A0E(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37811nF.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

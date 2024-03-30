package X;

import android.widget.BaseAdapter;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.List;

/* renamed from: X.1nO  reason: invalid class name and case insensitive filesystem */
public class C37901nO extends BaseAdapter {
    public List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ MyStatusesActivity A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public C37901nO(MyStatusesActivity myStatusesActivity) {
        this.A01 = myStatusesActivity;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ac, code lost:
        if (r7 == 37) goto L_0x02ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r5 = r20
            r3 = r18
            if (r20 != 0) goto L_0x02b6
            com.whatsapp.status.playback.MyStatusesActivity r2 = r3.A01
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131625584(0x7f0e0670, float:1.887838E38)
            r4 = r21
            android.view.View r5 = X.C36361kB.A0E(r1, r4, r0)
            X.3B3 r0 = new X.3B3
            r0.<init>(r5, r2)
            r5.setTag(r0)
        L_0x001d:
            java.util.List r1 = r3.A00
            r2 = r19
            X.3T1 r4 = X.C36411kG.A0n(r1, r2)
            boolean r1 = r4 instanceof X.C46812bi
            r3 = 0
            if (r1 == 0) goto L_0x0224
            com.whatsapp.status.playback.MyStatusesActivity r2 = r0.A0A
            boolean r1 = r2.A0m
            if (r1 == 0) goto L_0x0224
            r1 = r4
            X.2bi r1 = (X.C46812bi) r1
            int r1 = X.C55482uh.A00(r2, r1)
            android.graphics.drawable.LayerDrawable r2 = X.C55502uj.A00(r2, r1)
            com.whatsapp.status.ContactStatusThumbnail r1 = r0.A09
            r1.setImageDrawable(r2)
        L_0x0040:
            java.lang.String r1 = ""
            android.text.SpannableStringBuilder r9 = X.C36441kJ.A0P(r1)
            com.whatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.0v0 r1 = r8.A09
            boolean r17 = r1.A2L()
            android.widget.TextView r11 = r0.A06
            android.view.View r10 = r0.A02
            android.content.Context r2 = r10.getContext()
            r1 = 2131101132(0x7f0605cc, float:1.7814665E38)
            r12 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r2, r11, r1)
            boolean r16 = X.C66013Ui.A0n(r4)
            r7 = 0
            r6 = 8
            if (r16 == 0) goto L_0x0171
            r11.setVisibility(r3)
            r1 = 2131888756(0x7f120a74, float:1.9412156E38)
        L_0x006e:
            r11.setText(r1)
        L_0x0071:
            java.util.Map r11 = r8.A0x
            X.3Qa r2 = r4.A1J
            boolean r13 = r11.containsKey(r2)
            if (r13 == 0) goto L_0x016e
            int r1 = X.C36391kE.A08(r10)
        L_0x007f:
            r10.setBackgroundResource(r1)
            java.util.Set r1 = r8.A0y
            boolean r10 = r1.remove(r2)
            com.whatsapp.components.SelectionCheckView r1 = r0.A08
            if (r10 == 0) goto L_0x0169
            android.view.ViewTreeObserver r12 = r1.getViewTreeObserver()
            r10 = 1
            X.4Yt r1 = new X.4Yt
            r1.<init>(r10, r0, r13)
            r12.addOnPreDrawListener(r1)
        L_0x0099:
            boolean r1 = r4 instanceof X.AnonymousClass2bU
            if (r1 == 0) goto L_0x00a2
            r1 = r4
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r7 = r1.A01
        L_0x00a2:
            if (r16 == 0) goto L_0x00c3
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r3)
            android.widget.ImageView r10 = r0.A04
            r10.setVisibility(r6)
            android.view.View r1 = r0.A03
            r1.setVisibility(r6)
            com.whatsapp.WaTextView r0 = r0.A07
            r11 = r0
        L_0x00b6:
            r0.setVisibility(r6)
        L_0x00b9:
            r10.setTag(r4)
            r11.setTag(r4)
            r1.setTag(r4)
            return r5
        L_0x00c3:
            if (r7 == 0) goto L_0x00d6
            boolean r1 = r7.A0V
            if (r1 != 0) goto L_0x00d6
            boolean r1 = r4 instanceof X.C181798o3
            if (r1 == 0) goto L_0x013c
            r1 = r4
            X.2bu r1 = (X.C46932bu) r1
            boolean r1 = X.C65703Td.A04(r1)
            if (r1 == 0) goto L_0x013c
        L_0x00d6:
            boolean r1 = r11.isEmpty()
            r12 = 1
            r1 = r1 ^ 1
            android.widget.ImageView r10 = r0.A04
            if (r1 == 0) goto L_0x0132
            r10.setVisibility(r6)
        L_0x00e4:
            java.util.HashMap r1 = r8.A0u
            java.lang.Number r15 = X.C36441kJ.A10(r2, r1)
            com.whatsapp.WaTextView r11 = r0.A07
            if (r15 != 0) goto L_0x00fd
            r11.setVisibility(r6)
            com.whatsapp.status.playback.MyStatusesActivity.A0u(r4, r8, r3)
        L_0x00f4:
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r6)
        L_0x00f9:
            android.view.View r0 = r0.A03
            r1 = r0
            goto L_0x00b6
        L_0x00fd:
            r11.setVisibility(r3)
            X.0ts r14 = r8.A0F
            r13 = 2131755413(0x7f100195, float:1.9141705E38)
            int r1 = r15.intValue()
            long r1 = (long) r1
            java.lang.Object[] r7 = new java.lang.Object[r12]
            r7[r3] = r15
            java.lang.String r7 = r14.A0L(r7, r13, r1)
            r11.setContentDescription(r7)
            if (r17 == 0) goto L_0x0128
            X.0ts r9 = r8.A0F
            r8 = 2131755254(0x7f1000f6, float:1.9141382E38)
            java.lang.Object[] r7 = new java.lang.Object[r12]
            r7[r3] = r15
            java.lang.String r1 = r9.A0L(r7, r8, r1)
            r11.setText(r1)
            goto L_0x00f4
        L_0x0128:
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x00f4
            r11.setText(r9)
            goto L_0x00f4
        L_0x0132:
            r10.setVisibility(r3)
            r1 = 2131891211(0x7f12140b, float:1.9417136E38)
            X.C36331k8.A0q(r8, r10, r1)
            goto L_0x00e4
        L_0x013c:
            android.widget.ImageView r10 = r0.A04
            r10.setVisibility(r6)
            com.whatsapp.WaTextView r11 = r0.A07
            r11.setVisibility(r6)
            boolean r1 = X.C36421kH.A1V(r8)
            if (r1 == 0) goto L_0x0155
            android.view.View r1 = r0.A03
            r1.setVisibility(r6)
            android.widget.ProgressBar r0 = r0.A05
            goto L_0x00b6
        L_0x0155:
            boolean r2 = r7.A0f
            android.widget.ProgressBar r1 = r0.A05
            if (r2 == 0) goto L_0x015f
            r1.setVisibility(r3)
            goto L_0x00f9
        L_0x015f:
            r1.setVisibility(r6)
            android.view.View r1 = r0.A03
            r1.setVisibility(r3)
            goto L_0x00b9
        L_0x0169:
            r1.A04(r13, r3)
            goto L_0x0099
        L_0x016e:
            r1 = 0
            goto L_0x007f
        L_0x0171:
            int r2 = r4.A0D
            r1 = 4
            int r1 = X.AnonymousClass3TJ.A00(r2, r1)
            boolean r1 = X.C36401kF.A1U(r1)
            if (r1 == 0) goto L_0x01f7
            int r1 = X.C36351kA.A00(r17)
            r11.setVisibility(r1)
            long r1 = r4.A0H
            r14 = 0
            int r13 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x018f
            long r1 = r4.A0I
        L_0x018f:
            X.0wo r14 = r8.A07
            X.0ts r13 = r8.A0F
            long r1 = r14.A08(r1)
            java.lang.String r1 = X.AnonymousClass3UY.A0B(r13, r1)
            android.text.SpannableStringBuilder r2 = X.C36441kJ.A0P(r1)
            X.1Ua r1 = r8.A0j
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x01ce
            X.1i0 r1 = r8.A0h
            boolean r13 = r1.A09(r4)
            X.1i0 r1 = r8.A0h
            if (r13 == 0) goto L_0x01d5
            android.content.Context r14 = r10.getContext()
            int r13 = r11.getLineHeight()
            android.content.res.Resources r1 = r8.getResources()
            int r12 = r1.getColor(r12)
            X.AnonymousClass00C.A0D(r14, r3)
            r1 = 2131232717(0x7f0807cd, float:1.8081551E38)
        L_0x01c7:
            android.text.SpannableStringBuilder r1 = X.C56032vc.A00(r14, r13, r1, r12)
            r2.append(r1)
        L_0x01ce:
            if (r17 == 0) goto L_0x01f2
            r11.setText(r2)
            goto L_0x0071
        L_0x01d5:
            boolean r1 = r1.A08(r4)
            if (r1 == 0) goto L_0x01ce
            android.content.Context r14 = r10.getContext()
            int r13 = r11.getLineHeight()
            android.content.res.Resources r1 = r8.getResources()
            int r12 = r1.getColor(r12)
            X.AnonymousClass00C.A0D(r14, r3)
            r1 = 2131232718(0x7f0807ce, float:1.8081553E38)
            goto L_0x01c7
        L_0x01f2:
            r9.append(r2)
            goto L_0x0071
        L_0x01f7:
            r11.setVisibility(r3)
            boolean r1 = r4 instanceof X.AnonymousClass2bU
            if (r1 == 0) goto L_0x021f
            r1 = r4
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r2 = r1.A01
            if (r2 == 0) goto L_0x021f
            boolean r1 = r2.A0V
            if (r1 != 0) goto L_0x021f
            boolean r1 = r2.A0f
            if (r1 != 0) goto L_0x021f
            r1 = 2131894067(0x7f121f33, float:1.9422928E38)
            r11.setText(r1)
            android.content.Context r2 = r10.getContext()
            r1 = 2131102302(0x7f060a5e, float:1.7817038E38)
            X.C36331k8.A0r(r2, r11, r1)
            goto L_0x0071
        L_0x021f:
            r1 = 2131894068(0x7f121f34, float:1.942293E38)
            goto L_0x006e
        L_0x0224:
            boolean r1 = r4 instanceof X.AnonymousClass2bU
            if (r1 == 0) goto L_0x0247
            r1 = r4
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r1 = X.AnonymousClass2bU.A00(r1)
            boolean r7 = r1.A03()
            com.whatsapp.status.playback.MyStatusesActivity r1 = r0.A0A
            X.1SV r6 = r1.A0d
            com.whatsapp.status.ContactStatusThumbnail r2 = r0.A09
            X.3ta r1 = r1.A0Z
            if (r7 != 0) goto L_0x0242
            r6.A0D(r2, r4, r1)
            goto L_0x0040
        L_0x0242:
            r6.A0C(r2, r4, r1)
            goto L_0x0040
        L_0x0247:
            int r7 = r4.A1I
            if (r7 != 0) goto L_0x0294
            com.whatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.1DU r1 = r8.A0M
            java.lang.String r14 = X.AnonymousClass3UN.A05(r1, r4)
            r1 = r4
            X.2bV r1 = (X.AnonymousClass2bV) r1
            com.whatsapp.TextData r10 = r1.A02
            X.1H2 r12 = r8.A0C
            X.0yb r11 = r8.A08
            X.0wg r13 = r8.A0N
            if (r14 == 0) goto L_0x026c
            int r2 = r14.length()
            r1 = 700(0x2bc, float:9.81E-43)
            if (r2 <= r1) goto L_0x026c
            java.lang.String r14 = r14.substring(r3, r1)
        L_0x026c:
            android.view.View r1 = r0.A02
            android.content.Context r2 = r1.getContext()
            X.AnonymousClass00C.A0D(r2, r3)
            if (r10 == 0) goto L_0x027f
            int r1 = r10.fontStyle
            android.graphics.Typeface r9 = X.AnonymousClass3UN.A04(r2, r1)
            if (r9 != 0) goto L_0x0281
        L_0x027f:
            android.graphics.Typeface r9 = android.graphics.Typeface.SANS_SERIF
        L_0x0281:
            X.2g3 r7 = new X.2g3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.status.ContactStatusThumbnail r6 = r0.A09
            float r2 = r6.A00
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r7.A00 = r2
            r6.setImageDrawable(r7)
            goto L_0x0040
        L_0x0294:
            com.whatsapp.status.ContactStatusThumbnail r6 = r0.A09
            r1 = 1
            if (r7 == r1) goto L_0x02ae
            r1 = 3
            if (r7 == r1) goto L_0x02ae
            r1 = 15
            r2 = 2131232820(0x7f080834, float:1.808176E38)
            if (r7 == r1) goto L_0x02b1
            r1 = 23
            if (r7 == r1) goto L_0x02ae
            r1 = 37
            r2 = 2131231315(0x7f080253, float:1.8078708E38)
            if (r7 != r1) goto L_0x02b1
        L_0x02ae:
            r2 = 2131232844(0x7f08084c, float:1.8081809E38)
        L_0x02b1:
            r6.setImageResource(r2)
            goto L_0x0040
        L_0x02b6:
            java.lang.Object r0 = r5.getTag()
            X.3B3 r0 = (X.AnonymousClass3B3) r0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37901nO.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

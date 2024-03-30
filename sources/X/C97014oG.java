package X;

import android.view.View;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4oG  reason: invalid class name and case insensitive filesystem */
public abstract class C97014oG extends AnonymousClass0D3 {
    public final ParticipantsListViewModel A00;

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C1275168p r19) {
        /*
            r18 = this;
            r3 = r19
            r7 = r18
            boolean r0 = r7 instanceof X.C1029252o
            if (r0 == 0) goto L_0x0026
            X.52o r7 = (X.C1029252o) r7
            com.whatsapp.WaImageView r2 = r7.A00
            android.content.Context r0 = X.C36441kJ.A0F(r7)
            X.AnonymousClass3UE.A05(r0, r2)
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r1 = X.C36341k9.A0F(r2)
            r0 = 2131165449(0x7f070109, float:1.7945115E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r0, r0, r0, r0)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r7 instanceof X.C1029152n
            if (r0 == 0) goto L_0x003a
            X.52n r7 = (X.C1029152n) r7
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            boolean r0 = r3 instanceof X.C1029952w
            if (r0 != 0) goto L_0x0251
            java.lang.String r0 = "Unknown list item type"
            X.C18740tg.A0D(r1, r0)
            return
        L_0x003a:
            boolean r0 = r7 instanceof X.C1029052m
            if (r0 == 0) goto L_0x004e
            X.52m r7 = (X.C1029052m) r7
            r4 = 0
            X.AnonymousClass00C.A0D(r3, r4)
            boolean r0 = r3 instanceof X.C1029852v
            if (r0 != 0) goto L_0x0261
            java.lang.String r0 = "Unknown list item type"
            X.C18740tg.A0D(r4, r0)
            return
        L_0x004e:
            boolean r0 = r7 instanceof X.C1029352p
            if (r0 == 0) goto L_0x00e2
            X.52p r7 = (X.C1029352p) r7
            boolean r4 = r3 instanceof X.AnonymousClass52u
            java.lang.String r0 = "unknown view state type"
            X.C18740tg.A0D(r4, r0)
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r2 = r7.A00
            r9 = 1
            r8 = 0
            boolean r1 = X.AnonymousClass000.A1V(r2)
            java.lang.String r0 = "view model is null"
            X.C18740tg.A0D(r1, r0)
            if (r4 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            X.52u r3 = (X.AnonymousClass52u) r3
            com.whatsapp.WaTextView r1 = r7.A01
            X.3Bc r0 = r3.A00
            android.view.View r3 = r7.A0H
            java.lang.CharSequence r0 = X.C90474aD.A0V(r3, r0)
            r1.setText(r0)
            android.content.res.Resources r4 = r3.getResources()
            X.1hi r0 = r2.A0A
            boolean r11 = X.C36351kA.A1W(r0)
            X.5Fb r10 = r2.A04
            X.6OZ r0 = r10.A05()
            X.147 r6 = r0.A06
            X.16D r5 = r7.A02
            X.171 r2 = r7.A03
            X.1C6 r1 = r7.A05
            X.0xQ r0 = r7.A04
            X.141 r0 = X.AnonymousClass3UL.A01(r5, r0, r6, r1, r11)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r2 = X.C36381kD.A0v(r2, r0)
            if (r2 == 0) goto L_0x00c8
            X.6OZ r0 = r10.A05()
            boolean r0 = r0.A0N
            r1 = 2131895826(0x7f122612, float:1.9426496E38)
            if (r0 == 0) goto L_0x00af
            r1 = 2131895649(0x7f122561, float:1.9426137E38)
        L_0x00af:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = X.C36411kG.A0w(r4, r2, r0, r8, r1)
        L_0x00b5:
            com.whatsapp.TextEmojiLabel r0 = r7.A00
            r0.setText(r2)
            r0.setContentDescription(r1)
            r1 = 16
            X.74e r0 = new X.74e
            r0.<init>(r7, r1)
            r3.post(r0)
            return
        L_0x00c8:
            r0 = 2131890066(0x7f120f92, float:1.9414813E38)
            java.lang.String r2 = r4.getString(r0)
            X.6OZ r0 = r10.A05()
            boolean r1 = r0.A0N
            r0 = 2131887312(0x7f1204d0, float:1.9409228E38)
            if (r1 == 0) goto L_0x00dd
            r0 = 2131887311(0x7f1204cf, float:1.9409226E38)
        L_0x00dd:
            java.lang.String r1 = r4.getString(r0)
            goto L_0x00b5
        L_0x00e2:
            boolean r0 = r7 instanceof X.C1029452q
            if (r0 == 0) goto L_0x020b
            X.52q r7 = (X.C1029452q) r7
            boolean r1 = r3 instanceof X.C1029752t
            java.lang.String r0 = "Unknown list item type"
            X.C18740tg.A0D(r1, r0)
            if (r1 == 0) goto L_0x0025
            X.1RJ r4 = r7.A09
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0100
            android.view.View r1 = r4.A01()
            java.lang.Runnable r0 = r7.A0A
            r1.removeCallbacks(r0)
        L_0x0100:
            X.52t r3 = (X.C1029752t) r3
            r7.A00 = r3
            android.view.View r6 = r7.A0H
            r0 = 0
            X.C012005e.A0V(r6, r0)
            r0 = 0
            r6.setClickable(r0)
            X.52t r3 = r7.A00
            int r2 = r3.A00
            r0 = 11
            r1 = 8
            if (r2 != r0) goto L_0x0124
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0124
            X.1RJ r0 = r7.A08
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x0129
        L_0x0124:
            X.1RJ r0 = r7.A08
            r0.A03(r1)
        L_0x0129:
            X.1RJ r3 = r7.A07
            r3.A03(r1)
            r4.A03(r1)
            r7.A0C()
            X.52t r0 = r7.A00
            com.whatsapp.jid.UserJid r0 = r0.A02
            r6.setTag(r0)
            X.52t r0 = r7.A00
            if (r0 == 0) goto L_0x014b
            X.1RY r5 = r7.A06
            X.141 r4 = r0.A01
            android.widget.ImageView r2 = r7.A02
            r1 = 1
            X.4Sz r0 = r7.A05
            r5.A06(r2, r0, r4, r1)
        L_0x014b:
            X.52t r8 = r7.A00
            boolean r2 = r8.A03
            X.141 r4 = r8.A01
            boolean r0 = r4.A0B()
            if (r0 != 0) goto L_0x0204
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0204
            X.171 r1 = r7.A04
            boolean r0 = X.AnonymousClass171.A06(r4)
            if (r0 == 0) goto L_0x0204
            X.3SF r5 = r7.A03
            r0 = 2131896511(0x7f1228bf, float:1.9427885E38)
            java.lang.String r1 = X.AnonymousClass171.A03(r1, r4, r0)
            com.whatsapp.TextEmojiLabel r0 = r5.A01
            r0.setText(r1)
        L_0x0171:
            int r1 = r8.A00
            r4 = 0
            r14 = 1
            if (r1 != r14) goto L_0x01df
            android.view.View r0 = r7.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r7.A02
            r0.setAlpha(r1)
            if (r2 != 0) goto L_0x01c8
            android.view.View r7 = X.C36391kE.A0L(r3, r4)
            android.view.animation.AnimationSet r3 = new android.view.animation.AnimationSet
            r3.<init>(r4)
            r0 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r0, r1)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r10 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r9 = new android.view.animation.ScaleAnimation
            r12 = 1056964608(0x3f000000, float:0.5)
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r9.setDuration(r0)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r1 = 1070805811(0x3fd33333, float:1.65)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            android.view.animation.PathInterpolator r0 = X.C017907q.A00(r8, r1, r0, r11)
            r9.setInterpolator(r0)
            r3.addAnimation(r9)
            r3.addAnimation(r2)
            r7.startAnimation(r3)
        L_0x01c8:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131895950(0x7f12268e, float:1.9426747E38)
        L_0x01cf:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            com.whatsapp.TextEmojiLabel r0 = r5.A01
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C36411kG.A0w(r3, r0, r1, r4, r2)
            r6.setContentDescription(r0)
            return
        L_0x01df:
            r0 = 11
            if (r1 == r0) goto L_0x01e9
            if (r2 == 0) goto L_0x01e9
            X.C1029452q.A02(r7)
            return
        L_0x01e9:
            android.widget.ImageView r0 = r7.A02
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.setAlpha(r1)
            android.view.View r0 = r7.A01
            r0.setAlpha(r1)
            if (r2 == 0) goto L_0x01fc
            X.C1029452q.A01(r7)
            return
        L_0x01fc:
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131895962(0x7f12269a, float:1.9426772E38)
            goto L_0x01cf
        L_0x0204:
            X.3SF r5 = r7.A03
            r5.A05(r4)
            goto L_0x0171
        L_0x020b:
            boolean r0 = r7 instanceof X.C1028952l
            if (r0 == 0) goto L_0x0220
            X.52l r7 = (X.C1028952l) r7
            int r2 = r3.A00
            r0 = 2
            if (r2 == r0) goto L_0x0280
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallInfoButtonViewHolder/bind/Unsupported item type: "
            X.C36321k7.A1U(r0, r1, r2)
            return
        L_0x0220:
            X.52k r7 = (X.C1028852k) r7
            android.view.View r4 = r7.A0H
            r0 = 1
            r4.setClickable(r0)
            r0 = 0
            X.C135456cj.A01(r4, r7, r0)
            android.content.Context r3 = r4.getContext()
            com.whatsapp.WaImageView r2 = r7.A00
            X.AnonymousClass3UE.A05(r3, r2)
            r0 = 2131895932(0x7f12267c, float:1.942671E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131895931(0x7f12267b, float:1.9426709E38)
            java.lang.String r0 = r3.getString(r0)
            X.AnonymousClass3UE.A06(r4, r1, r0)
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x0025
            r0 = 2131232916(0x7f080894, float:1.8081955E38)
            r2.setImageResource(r0)
            return
        L_0x0251:
            com.whatsapp.WaTextView r2 = r7.A00
            X.52w r3 = (X.C1029952w) r3
            X.3Bc r1 = r3.A00
            android.view.View r0 = r7.A0H
            java.lang.CharSequence r0 = X.C90474aD.A0V(r0, r1)
            r2.setText(r0)
            return
        L_0x0261:
            com.whatsapp.wds.components.button.WDSButton r2 = r7.A00
            X.52v r3 = (X.C1029852v) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0276
            r1 = 5
            X.3YE r0 = new X.3YE
            r0.<init>(r7, r2, r1)
            r2.setOnClickListener(r0)
            r2.setVisibility(r4)
            return
        L_0x0276:
            r0 = 0
            r2.setOnClickListener(r0)
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0280:
            android.view.View r1 = r7.A0H
            r0 = 1
            r1.setClickable(r0)
            X.3Yj r0 = X.C67063Yj.A00
            r1.setOnClickListener(r0)
            com.whatsapp.WaTextView r1 = r7.A00
            r0 = 2131895944(0x7f122688, float:1.9426735E38)
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97014oG.A0B(X.68p):void");
    }

    public C97014oG(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view);
        this.A00 = participantsListViewModel;
    }
}

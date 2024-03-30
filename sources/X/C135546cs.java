package X;

import android.view.View;

/* renamed from: X.6cs  reason: invalid class name and case insensitive filesystem */
public class C135546cs implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C135546cs(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.3K5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.9Og} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.3K5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: X.3K5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A04
            switch(r0) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x0254;
                case 2: goto L_0x023a;
                case 3: goto L_0x0219;
                case 4: goto L_0x0110;
                case 5: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A01
            X.7yq r6 = (X.C167797yq) r6
            int r5 = r13.A00
            java.lang.Object r4 = r13.A02
            X.9un r4 = (X.C207249un) r4
            java.lang.Object r3 = r13.A03
            X.9lY r3 = (X.C202319lY) r3
            X.9Ml r0 = r6.A06
            if (r0 == 0) goto L_0x0030
            X.9lY r0 = r0.A01
            X.8av r0 = r0.A0A
            if (r0 == 0) goto L_0x0030
            X.9uW r2 = r0.A0B()
            if (r2 == 0) goto L_0x0030
            java.lang.Integer r1 = X.C36361kB.A0i()
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C167797yq.A02(r2, r6, r1, r0)
        L_0x0030:
            X.9Og r1 = new X.9Og
            r1.<init>(r5)
            r1.A04 = r4
            r1.A05 = r3
            X.1Rs r0 = r6.A08
        L_0x003b:
            r0.A0D(r1)
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r4 = r13.A01
            X.4md r4 = (X.C96004md) r4
            int r5 = r13.A00
            java.lang.Object r7 = r13.A02
            X.4oE r7 = (X.C96994oE) r7
            java.lang.Object r6 = r13.A03
            X.63e r6 = (X.C1262563e) r6
            java.util.List r2 = r4.A05
            java.lang.Object r0 = r2.get(r5)
            X.63e r0 = (X.C1262563e) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x008b
            java.lang.Object r2 = r2.get(r5)
            X.63e r2 = (X.C1262563e) r2
            X.6c9 r5 = r2.A03
            if (r5 == 0) goto L_0x0293
            android.widget.ImageView r1 = r7.A02
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r7.A03
            r0 = 0
            r1.setVisibility(r0)
            X.1Yo r4 = r7.A05
            X.6wx r3 = new X.6wx
            r3.<init>(r2, r7)
            java.lang.String r0 = r5.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.0wU r2 = r4.A0D
            if (r0 == 0) goto L_0x0288
            r1 = 1
            X.7pN r0 = new X.7pN
            r0.<init>(r5, r3, r4, r1)
            X.C36331k8.A1F(r0, r2)
            return
        L_0x008b:
            int r0 = r4.A00
            if (r0 == r5) goto L_0x003e
            java.util.ArrayList r3 = X.C36441kJ.A15(r2)
            int r0 = r4.A00
            java.lang.Object r0 = r2.get(r0)
            X.63e r0 = (X.C1262563e) r0
            X.6c9 r0 = r0.A03
            X.63e r1 = new X.63e
            r1.<init>(r0)
            r0 = 0
            r1.A02 = r0
            int r0 = r4.A00
            java.lang.Object r0 = r2.get(r0)
            X.63e r0 = (X.C1262563e) r0
            boolean r0 = r0.A00
            r1.A00 = r0
            int r0 = r4.A00
            java.lang.Object r0 = r2.get(r0)
            X.63e r0 = (X.C1262563e) r0
            boolean r0 = r0.A01
            r1.A01 = r0
            int r0 = r4.A00
            r3.set(r0, r1)
            X.6c9 r2 = r6.A03
            X.63e r1 = new X.63e
            r1.<init>(r2)
            r0 = 1
            r1.A02 = r0
            boolean r0 = r6.A00
            r1.A00 = r0
            boolean r0 = r6.A01
            r1.A01 = r0
            r3.set(r5, r1)
            r4.A01 = r2
            r4.A00 = r5
            X.7hH r0 = r4.A04
            r0.Bj3(r2)
            r3.size()
            java.util.List r1 = r4.A05
            X.4lr r0 = new X.4lr
            r0.<init>(r1, r3)
            X.C36341k9.A1A(r0, r4, r3, r1)
            return
        L_0x00ee:
            java.lang.Object r0 = r13.A01
            X.4fA r0 = (X.C92934fA) r0
            int r7 = r13.A00
            java.lang.Object r1 = r13.A02
            X.3IF r1 = (X.AnonymousClass3IF) r1
            java.lang.Object r3 = r13.A03
            android.view.View r3 = (android.view.View) r3
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r0.A04
            if (r0 == 0) goto L_0x003e
            X.2nv r4 = X.C51502nv.PROFILE_PIC
            X.141 r5 = r1.A00
            X.3Ed r6 = r1.A01
            X.1Rs r0 = r0.A09
            X.3K5 r1 = new X.3K5
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x003b
        L_0x0110:
            java.lang.Object r5 = r13.A01
            X.4mg r5 = (X.C96034mg) r5
            java.lang.Object r0 = r13.A02
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r3 = r13.A00
            java.lang.Object r4 = r13.A03
            X.8b6 r4 = (X.C175818b6) r4
            X.1N2 r1 = r5.A02
            android.view.View r0 = r0.A0H
            r1.A01(r0)
            r1 = 0
            r2 = 0
        L_0x0127:
            if (r1 >= r3) goto L_0x0134
            int r0 = r5.getItemViewType(r1)
            if (r0 != 0) goto L_0x0131
            int r2 = r2 + 1
        L_0x0131:
            int r1 = r1 + 1
            goto L_0x0127
        L_0x0134:
            X.7cx r1 = r5.A01
            int r3 = r3 - r2
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r1 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r1
            r1.A0K = r4
            X.AE0 r5 = r1.A0M
            X.9lR r0 = r1.A0L
            java.lang.String r2 = r0.A04(r4)
            X.AF7 r0 = r1.A0S
            boolean r0 = r5.A0Q(r4, r0, r2)
            if (r0 == 0) goto L_0x01ad
            org.json.JSONObject r6 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "step"
            java.lang.String r0 = "SelectBankStep"
            r6.put(r2, r0)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "completedSteps"
            X.1EZ r0 = r1.A0I     // Catch:{ Exception -> 0x01a6 }
            java.util.ArrayList r0 = r0.A05()     // Catch:{ Exception -> 0x01a6 }
            X.C90504aG.A1J(r0, r2, r6)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "isCompleteWith2FA"
            X.1EZ r0 = r1.A0I     // Catch:{ Exception -> 0x01a6 }
            boolean r0 = r0.A0E()     // Catch:{ Exception -> 0x01a6 }
            r6.put(r2, r0)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "isCompleteWithout2FA"
            X.1EZ r0 = r1.A0I     // Catch:{ Exception -> 0x01a6 }
            boolean r0 = r0.A0F()     // Catch:{ Exception -> 0x01a6 }
            r6.put(r2, r0)     // Catch:{ Exception -> 0x01a6 }
            X.9lR r0 = r1.A0L     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r7 = r0.A04(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r0 = "pspForDeviceBinding"
            r6.put(r0, r7)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r5 = "isDeviceBindingDone"
            X.AE0 r2 = r1.A0M     // Catch:{ Exception -> 0x01a6 }
            X.AF7 r0 = r1.A0S     // Catch:{ Exception -> 0x01a6 }
            boolean r0 = r2.A0Q(r4, r0, r7)     // Catch:{ Exception -> 0x01a6 }
            r6.put(r5, r0)     // Catch:{ Exception -> 0x01a6 }
            X.0wo r8 = r1.A07     // Catch:{ Exception -> 0x01a6 }
            X.0yC r9 = r1.A0D     // Catch:{ Exception -> 0x01a6 }
            X.19A r10 = r1.A0H     // Catch:{ Exception -> 0x01a6 }
            X.9lR r11 = r1.A0L     // Catch:{ Exception -> 0x01a6 }
            X.1Vk r12 = r1.A0M     // Catch:{ Exception -> 0x01a6 }
            X.8gJ r7 = new X.8gJ     // Catch:{ Exception -> 0x01a6 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01a6 }
            r7.A00 = r6     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = "SKIPPED_DEVICE_BINDING"
            r0 = 0
            r7.A00(r2, r0)     // Catch:{ Exception -> 0x01a6 }
        L_0x01a6:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity> r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.class
            android.content.Intent r7 = X.C36441kJ.A0H(r1, r0)
            goto L_0x01b3
        L_0x01ad:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r7 = X.C36441kJ.A0H(r1, r0)
        L_0x01b3:
            X.8kT r0 = r1.A04
            java.lang.String r2 = "bankSelected"
            X.0zf r0 = r0.A00
            r0.A08(r2)
            r1.A42(r7)
            java.lang.String r0 = "extra_previous_screen"
            java.lang.String r6 = "nav_bank_select"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "bankPicker"
            X.AnonymousClass3M9.A01(r7, r0)
            r5 = 1
            r1.A33(r7, r5)
            X.8cT r2 = r1.A0F
            boolean r0 = r1.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            java.lang.String r0 = r1.A09
            r2.A0P = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.Boolean r0 = X.C36441kJ.A0x(r0)
            r2.A04 = r0
            X.6c7 r0 = r4.A01
            if (r0 != 0) goto L_0x0216
            r0 = 0
        L_0x01ec:
            java.lang.String r0 = (java.lang.String) r0
            r2.A0Q = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r3)
            r2.A0J = r0
            r2.A0b = r6
            java.lang.String r0 = r1.A0b
            r2.A0Y = r0
            java.lang.String r0 = r1.A0e
            r2.A0a = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A08 = r0
            java.lang.String r0 = r1.A09
            r2.A0P = r0
            java.lang.Integer r0 = X.C36371kC.A0p()
            r2.A07 = r0
            X.AF7 r0 = r1.A0S
            r0.BOl(r2)
            return
        L_0x0216:
            java.lang.Object r0 = r0.A00
            goto L_0x01ec
        L_0x0219:
            java.lang.Object r0 = r13.A01
            X.1zC r0 = (X.C42671zC) r0
            java.lang.Object r2 = r13.A02
            X.34z r2 = (X.C597134z) r2
            java.lang.Object r1 = r13.A03
            X.3uw r1 = (X.C80153uw) r1
            int r5 = r13.A00
            X.1wb r0 = r0.A07
            X.4R8 r4 = r0.A0K
            X.141 r3 = r2.A01
            java.lang.String r2 = r1.A01
            X.2ol r1 = X.C52022ol.UNKNOWN
            X.34G r0 = new X.34G
            r0.<init>(r1, r2)
            r4.Bap(r0, r3, r5)
            return
        L_0x023a:
            java.lang.Object r2 = r13.A01
            X.4mL r2 = (X.C95824mL) r2
            java.lang.Object r1 = r13.A02
            X.56V r1 = (X.AnonymousClass56V) r1
            int r4 = r13.A00
            java.lang.Object r3 = r13.A03
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.08g r2 = r2.A0D
            X.6bq r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.BKt(r1, r0, r3)
            return
        L_0x0254:
            java.lang.Object r0 = r13.A01
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r0 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r0
            int r6 = r13.A00
            java.lang.Object r5 = r13.A02
            int[] r5 = (int[]) r5
            java.lang.Object r4 = r13.A03
            android.view.View r4 = (android.view.View) r4
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r3 = X.C90514aH.A0c(r0)
            X.AnonymousClass00C.A0B(r5)
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.0wg r0 = r3.A09
            X.AnonymousClass3TY.A03(r0, r5)
            r3.A0S(r5, r6)
            X.040 r2 = X.C109325Xd.A00(r3)
            r1 = 0
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1 r0 = new com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1
            r0.<init>(r3, r1, r5, r6)
            X.C36331k8.A1T(r0, r2)
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x0288:
            r1 = 47
            X.1j0 r0 = new X.1j0
            r0.<init>(r4, r5, r3, r1)
            r2.Boy(r0)
            return
        L_0x0293:
            java.lang.String r0 = "Default theme should not have download failed state"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135546cs.onClick(android.view.View):void");
    }
}

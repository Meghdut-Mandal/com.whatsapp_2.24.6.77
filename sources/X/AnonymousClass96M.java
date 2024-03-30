package X;

/* renamed from: X.96M  reason: invalid class name */
public abstract class AnonymousClass96M {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2.size() >= 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass2IR r14, X.C89004Uw r15, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r16, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout r17, X.C18820ts r18, X.AnonymousClass37E r19) {
        /*
            r4 = 0
            r0 = r19
            if (r19 == 0) goto L_0x003f
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.List r3 = r0.A02
            java.util.Iterator r2 = r3.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            X.3EY r1 = (X.AnonymousClass3EY) r1
            X.9uL r0 = r1.A02
            if (r0 != 0) goto L_0x000f
            r4.add(r1)
            goto L_0x000f
        L_0x0023:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.3EY r1 = (X.AnonymousClass3EY) r1
            X.9uL r0 = r1.A02
            if (r0 == 0) goto L_0x002b
            r2.add(r1)
            goto L_0x002b
        L_0x003f:
            r2 = r4
        L_0x0040:
            r9 = 0
            r11 = 8
            r1 = r16
            if (r15 == 0) goto L_0x0190
            boolean r0 = r15.BtT()
            if (r0 == 0) goto L_0x0190
            if (r4 == 0) goto L_0x0190
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0190
            X.3CO r0 = r14.A2X
            r1.A04(r0, r4)
            r1.setVisibility(r9)
        L_0x005d:
            r10 = r17
            if (r2 == 0) goto L_0x0199
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0199
            int r0 = r2.size()
            r8 = 0
            if (r0 <= 0) goto L_0x0076
            int r3 = r2.size()
            r1 = 3
            r0 = 1
            if (r3 < r1) goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            X.C18740tg.A0B(r0)
            com.whatsapp.TextEmojiLabel[] r7 = r10.A08
            r0 = r7[r9]
            r0.setVisibility(r11)
            android.view.View[] r6 = r10.A07
            r0 = r6[r9]
            r0.setVisibility(r11)
            r1 = 1
            r0 = r7[r1]
            r0.setVisibility(r11)
            r0 = r6[r1]
            r0.setVisibility(r11)
            android.view.View r12 = r10.A03
            r12.setVisibility(r11)
            android.view.View r4 = r10.A04
            r4.setVisibility(r11)
            java.util.List r5 = r10.A06
            r5.clear()
            r5.addAll(r2)
            r3 = 0
            java.lang.Object r0 = r5.get(r9)
            X.3EY r0 = (X.AnonymousClass3EY) r0
            X.9uL r1 = r0.A02
            if (r1 == 0) goto L_0x00c4
            X.005 r0 = r10.A00
            java.lang.Object r0 = r0.get()
            X.1am r0 = (X.C30791am) r0
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r1.A01
            X.AnonymousClass00C.A0D(r2, r9)
            X.1ao r0 = r0.A01
            r0.A00(r2, r1)
        L_0x00c4:
            r13 = -2
            r2 = 1
            android.widget.LinearLayout r0 = r10.A05
            r0.setOrientation(r2)
            r0 = -1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r13)
            r0 = r6[r9]
            r0.setLayoutParams(r1)
            r0 = r6[r2]
            r0.setLayoutParams(r1)
            int r0 = r5.size()
            if (r0 > r2) goto L_0x00e3
            r3 = 8
        L_0x00e3:
            r12.setVisibility(r3)
            r4.setVisibility(r11)
        L_0x00e9:
            int r0 = r5.size()
            if (r8 >= r0) goto L_0x0195
            java.lang.Object r11 = r5.get(r8)
            X.3EY r11 = (X.AnonymousClass3EY) r11
            X.C18740tg.A06(r11)
            X.9uL r12 = r11.A02
            if (r12 == 0) goto L_0x018e
            X.005 r0 = r10.A00
            java.lang.Object r0 = r0.get()
            X.1am r0 = (X.C30791am) r0
            java.lang.String r2 = r12.A00
            java.lang.String r1 = r12.A01
            X.AnonymousClass00C.A0D(r2, r9)
            X.1ao r0 = r0.A01
            X.9Yd r13 = r0.A00(r2, r1)
        L_0x0111:
            r2 = r7[r8]
            r4 = r6[r8]
            r2.setVisibility(r9)
            float r0 = r14.getTextFontSize()
            r2.setTextSize(r0)
            r4.setVisibility(r9)
            X.C18740tg.A06(r12)
            X.005 r0 = r10.A00
            java.lang.Object r0 = r0.get()
            X.1am r0 = (X.C30791am) r0
            java.lang.String r3 = r12.A00
            java.lang.String r1 = r12.A01
            X.AnonymousClass00C.A0D(r3, r9)
            X.1ao r0 = r0.A01
            X.9Yd r1 = r0.A00(r3, r1)
            if (r1 != 0) goto L_0x0185
            r3 = 0
        L_0x013d:
            r2.setText(r3)
            boolean r0 = r11.A00
            r2.setSelected(r0)
            if (r13 == 0) goto L_0x015b
            int r1 = r13.A03()
            r0 = -1
            if (r1 == r0) goto L_0x015b
            android.content.Context r0 = r10.getContext()
            r12 = r18
            X.4vb r0 = X.C91364bt.A00(r0, r12, r1)
            r2.A0G(r0)
        L_0x015b:
            boolean r0 = r11.A00
            r2 = 1
            if (r0 == 0) goto L_0x0178
            r4.setClickable(r9)
        L_0x0163:
            r4.setContentDescription(r3)
            X.C33521fV.A02(r4)
            r4.setLongClickable(r2)
            X.4k9 r0 = new X.4k9
            r0.<init>(r10, r3)
            X.C012005e.A0V(r4, r0)
            int r8 = r8 + 1
            goto L_0x00e9
        L_0x0178:
            r4.setClickable(r2)
            r1 = 3
            X.3YL r0 = new X.3YL
            r0.<init>(r11, r8, r1, r14)
            r4.setOnClickListener(r0)
            goto L_0x0163
        L_0x0185:
            android.content.Context r0 = r10.getContext()
            java.lang.String r3 = r1.A06(r0, r12)
            goto L_0x013d
        L_0x018e:
            r13 = 0
            goto L_0x0111
        L_0x0190:
            r1.setVisibility(r11)
            goto L_0x005d
        L_0x0195:
            r10.setVisibility(r9)
            return
        L_0x0199:
            r10.setVisibility(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96M.A00(X.2IR, X.4Uw, com.whatsapp.conversation.conversationrow.DynamicButtonsLayout, com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout, X.0ts, X.37E):void");
    }
}

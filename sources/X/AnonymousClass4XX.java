package X;

import android.view.View;

/* renamed from: X.4XX  reason: invalid class name */
public class AnonymousClass4XX implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XX(C70803fk r1, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.wds.components.actiontile.WDSActionTile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.whatsapp.wds.components.actiontile.WDSActionTile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0046;
                case 2: goto L_0x0092;
                case 3: goto L_0x00ab;
                case 4: goto L_0x020b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r0)
            android.view.View r0 = X.C36411kG.A0K(r0)
            int r0 = X.C36441kJ.A07(r0)
            r1.A0V(r0)
            r0 = 4
            r1.A0W(r0)
            r0 = 1
            r1.A0h = r0
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r1 = r10.A00
            X.3fk r1 = (X.C70803fk) r1
            int r2 = r19 - r17
            int r0 = r11.getHeight()
            if (r0 >= r2) goto L_0x003c
            X.1pF r0 = r1.A22
            r1 = 1
        L_0x0032:
            X.1uI r0 = r0.getViewModel()
            r0.A04 = r1
            X.C39931uI.A01(r0)
            return
        L_0x003c:
            int r0 = r11.getHeight()
            if (r0 <= r2) goto L_0x0022
            X.1pF r0 = r1.A22
            r1 = 0
            goto L_0x0032
        L_0x0046:
            java.lang.Object r4 = r10.A00
            X.3fk r4 = (X.C70803fk) r4
            android.widget.LinearLayout r0 = r4.A0e
            if (r0 == 0) goto L_0x0022
            r0.removeOnLayoutChangeListener(r10)
            java.util.HashSet r1 = X.C36441kJ.A16()
            X.005 r0 = r4.A79
            java.lang.Object r0 = r0.get()
            r1.add(r0)
            X.4V6 r0 = r4.A2l
            X.3HC r0 = r0.getConversationRowCustomizers()
            X.4Ux r0 = r0.A05
            r1.add(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x006d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            X.4Ux r2 = (X.C89014Ux) r2
            X.155 r1 = X.C70803fk.A0C(r4)
            android.widget.LinearLayout r0 = r4.A0e
            int r0 = r0.getWidth()
            r2.Bwg(r1, r0)
            boolean r0 = r2.BtI()
            if (r0 == 0) goto L_0x006d
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            r0.A05()
            goto L_0x006d
        L_0x0092:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r1 = r10.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            com.whatsapp.status.widget.StatusEditText r0 = r1.A0f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0022
            com.whatsapp.status.widget.StatusEditText r1 = r1.A0f
            int r0 = r0.length()
            r1.setCursorPosition(r0)
            return
        L_0x00ab:
            java.lang.Object r4 = r10.A00
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r4 = (com.whatsapp.wds.components.actiontile.WDSActionTileGroup) r4
            int r14 = r14 - r12
            X.0yC r1 = r4.A01
            if (r1 == 0) goto L_0x0183
            r0 = 7442(0x1d12, float:1.0428E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0183
            int r6 = r4.A00
            r3 = 0
            java.util.Iterator r5 = X.C36381kD.A12(r4)
            r2 = 0
        L_0x00c4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00df
            android.view.View r0 = X.C36431kI.A0K(r5)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00c4
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00c4
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x00df:
            if (r6 == r2) goto L_0x0022
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r9 = X.C36381kD.A12(r4)
            r7 = 1
            r2 = 1
        L_0x00eb:
            boolean r0 = r9.hasNext()
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0116
            android.view.View r5 = X.C36431kI.A0K(r9)
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00eb
            r8.add(r5)
            boolean r0 = r5 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x00eb
            com.whatsapp.wds.components.actiontile.WDSActionTile r5 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r5
            if (r5 == 0) goto L_0x00eb
            com.whatsapp.WaTextView r0 = r5.A03
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.getLineCount()
            if (r2 >= r0) goto L_0x00eb
            r2 = r0
            goto L_0x00eb
        L_0x0116:
            int r0 = r8.size()
            r4.A00 = r0
            if (r0 == 0) goto L_0x0022
            r9 = 0
            if (r0 != r7) goto L_0x0136
            java.lang.Object r1 = r8.get(r3)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x012c
            r6 = r1
            com.whatsapp.wds.components.actiontile.WDSActionTile r6 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r6
        L_0x012c:
            r0 = 120(0x78, float:1.68E-43)
            int r0 = X.C65723Tf.A00(r4, r0)
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup.A00(r6, r9, r0)
            return
        L_0x0136:
            android.content.res.Resources r0 = X.C36441kJ.A0J(r4)
            float r8 = (float) r14
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 160(0xa0, float:2.24E-43)
            float r0 = (float) r0
            float r1 = r1 / r0
            float r8 = r8 / r1
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x017d
            r4.setOrientation(r7)
        L_0x0154:
            java.util.Iterator r3 = X.C36381kD.A12(r4)
        L_0x0158:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            android.view.View r2 = X.C36431kI.A0K(r3)
            boolean r0 = r2 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x017b
            com.whatsapp.wds.components.actiontile.WDSActionTile r2 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r2
            if (r2 == 0) goto L_0x0174
            r2.setOrientation(r5)
            com.whatsapp.WaTextView r0 = r2.A03
            if (r0 == 0) goto L_0x0174
            r0.setLines(r7)
        L_0x0174:
            r1 = -1
            r0 = 1065353216(0x3f800000, float:1.0)
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup.A00(r2, r0, r1)
            goto L_0x0158
        L_0x017b:
            r2 = r6
            goto L_0x0174
        L_0x017d:
            r4.setOrientation(r3)
            r5 = 1
            r7 = r2
            goto L_0x0154
        L_0x0183:
            int r3 = r18 - r16
            if (r3 == r14) goto L_0x0022
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r6 = 0
            java.util.Iterator r7 = X.C36381kD.A12(r4)
        L_0x0190:
            boolean r0 = r7.hasNext()
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r2 = r7.next()
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0190
            r8.add(r2)
            goto L_0x0190
        L_0x01ab:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0022
            int r0 = r8.size()
            r2 = 0
            r7 = 0
            if (r0 != r5) goto L_0x01ce
            java.lang.Object r1 = r8.get(r6)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x01c4
            r2 = r1
            com.whatsapp.wds.components.actiontile.WDSActionTile r2 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r2
        L_0x01c4:
            r0 = 120(0x78, float:1.68E-43)
            int r0 = X.C65723Tf.A00(r4, r0)
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup.A00(r2, r7, r0)
            return
        L_0x01ce:
            android.content.res.Resources r0 = X.C36441kJ.A0J(r4)
            float r2 = (float) r14
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 160(0xa0, float:2.24E-43)
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 / r1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r4.setOrientation(r5)
        L_0x01ec:
            java.util.Iterator r2 = X.C36381kD.A12(r4)
        L_0x01f0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            android.view.View r1 = X.C36431kI.A0K(r2)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x01f0
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x01f0
            r1.setOrientation(r3)
            goto L_0x01f0
        L_0x0206:
            r4.setOrientation(r6)
            r3 = 1
            goto L_0x01ec
        L_0x020b:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r0)
            int r0 = r0.getHeight()
            X.C36351kA.A1G(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XX.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public AnonymousClass4XX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}

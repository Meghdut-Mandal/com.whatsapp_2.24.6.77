package X;

import android.view.View;

/* renamed from: X.2rs  reason: invalid class name and case insensitive filesystem */
public class C53782rs implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C53782rs(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.22r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.22s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.22r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.22r} */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016e, code lost:
        if (r2.A0D(r1) != false) goto L_0x0170;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0144;
                case 2: goto L_0x00d4;
                case 3: goto L_0x018e;
                case 4: goto L_0x008b;
                case 5: goto L_0x017f;
                case 6: goto L_0x0040;
                case 7: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            X.5L8 r2 = (X.AnonymousClass5L8) r2
            java.lang.Object r1 = r5.A01
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            int r0 = r7.getActionMasked()
            if (r0 != 0) goto L_0x001a
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r2.A00
            X.0I4 r0 = r0.A01
            r0.A0A(r1)
        L_0x001a:
            r0 = 0
            return r0
        L_0x001c:
            java.lang.Object r4 = r5.A00
            X.3LJ r4 = (X.AnonymousClass3LJ) r4
            java.lang.Object r3 = r5.A01
            android.view.View r3 = (android.view.View) r3
            r2 = 1
            r1 = 3
            X.AnonymousClass00C.A0D(r7, r1)
            int r0 = r7.getAction()
            if (r0 == 0) goto L_0x003b
            if (r0 == r2) goto L_0x0037
            if (r0 != r1) goto L_0x001a
            r4.A0E()
            goto L_0x001a
        L_0x0037:
            r3.performClick()
            goto L_0x001a
        L_0x003b:
            r4.A0D()
            goto L_0x0173
        L_0x0040:
            java.lang.Object r3 = r5.A00
            X.22s r3 = (X.AnonymousClass22s) r3
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            int r1 = r7.getActionMasked()
            r0 = 2
            if (r1 == r0) goto L_0x0083
            int r1 = r7.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x0083
            android.graphics.Point r4 = X.C36361kB.A0A(r7, r6)
            java.util.Iterator r1 = r2.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            boolean r0 = X.C38871qM.A02(r4, r2)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r2.A0D(r4)
            if (r0 == 0) goto L_0x005e
            goto L_0x0170
        L_0x0078:
            float r1 = r7.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0083
            goto L_0x0173
        L_0x0083:
            com.whatsapp.numberkeyboard.NumberEntryKeyboard r0 = r3.A01
            android.view.View$OnTouchListener r0 = r0.A0I
            r0.onTouch(r6, r7)
            goto L_0x001a
        L_0x008b:
            java.lang.Object r2 = r5.A00
            X.1qL r2 = (X.C38861qL) r2
            java.lang.Object r3 = r5.A01
            android.view.View r3 = (android.view.View) r3
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x001a
            float r1 = r7.getX()
            X.2Ka r4 = r2.A02
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            float r1 = r7.getX()
            int r0 = r4.getRight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00cf
            float r1 = r7.getY()
            int r0 = r3.getTop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            float r1 = r7.getY()
            int r0 = r3.getBottom()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
        L_0x00cf:
            r2.dismiss()
            goto L_0x0173
        L_0x00d4:
            java.lang.Object r3 = r5.A00
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r5.A01
            X.4Ue r1 = (X.C88824Ue) r1
            X.4Zx r1 = (X.C90314Zx) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00fb;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1g
            X.2MC r0 = r1.A0g
            boolean r0 = r0.A02()
            r2 = 0
            if (r0 != 0) goto L_0x001a
            X.6YP r0 = r1.A1E
            if (r0 == 0) goto L_0x001a
        L_0x00f6:
            r0.A0X(r7, r3, r2)
            goto L_0x001a
        L_0x00fb:
            java.lang.Object r1 = r1.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.3J6 r0 = r1.A0p
            boolean r0 = r0.A02()
            r2 = 0
            if (r0 != 0) goto L_0x001a
            X.6YP r0 = r1.A1G
            goto L_0x00f6
        L_0x010b:
            java.lang.Object r2 = r1.A00
            X.3fk r2 = (X.C70803fk) r2
            X.2MC r0 = r2.A3s
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x019b
            goto L_0x001a
        L_0x011b:
            java.lang.Object r4 = r5.A00
            X.3Tz r4 = (X.C65923Tz) r4
            java.lang.Object r3 = r5.A01
            android.os.Handler r3 = (android.os.Handler) r3
            int r1 = r7.getAction()
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0136
            if (r1 == r0) goto L_0x0132
            r0 = 3
            if (r1 == r0) goto L_0x0132
            goto L_0x001a
        L_0x0132:
            r3.removeMessages(r2)
            goto L_0x0173
        L_0x0136:
            X.4Sf r0 = r4.A02
            if (r0 == 0) goto L_0x0173
            r0.BRp()
            int r0 = X.C65923Tz.A0a
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x0173
        L_0x0144:
            java.lang.Object r3 = r5.A00
            X.22r r3 = (X.AnonymousClass22r) r3
            int r2 = r7.getActionMasked()
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x001a
            int r0 = r7.getActionMasked()
            if (r0 == r1) goto L_0x001a
            android.graphics.Point r1 = X.C36361kB.A0A(r7, r6)
            com.whatsapp.WaEditText r2 = r3.A04
            if (r2 == 0) goto L_0x0175
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L_0x0175
            boolean r0 = X.C38871qM.A02(r1, r2)
            if (r0 == 0) goto L_0x0175
            boolean r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x0175
        L_0x0170:
            r3.A0B(r2)
        L_0x0173:
            r0 = 1
            return r0
        L_0x0175:
            float r1 = r7.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            goto L_0x0173
        L_0x017f:
            java.lang.Object r0 = r5.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Object r1 = r5.A01
            X.3ez r1 = (X.C70333ez) r1
            android.widget.ImageButton r0 = r0.A0a
            boolean r0 = r1.Bds(r0, r7)
            return r0
        L_0x018e:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A01
            X.4Ue r0 = (X.C88824Ue) r0
            boolean r0 = r0.Bds(r1, r7)
            return r0
        L_0x019b:
            X.C70803fk.A0p(r2)
            X.C70803fk.A0j(r2)
            X.6YP r1 = r2.A5Z
            X.C18740tg.A06(r1)
            boolean r0 = r2.A6F
            boolean r0 = r1.A0X(r7, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53782rs.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

package X;

import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.6v6  reason: invalid class name and case insensitive filesystem */
public final class C146136v6 implements AnonymousClass1RR {
    public final /* synthetic */ WDSListItem A00;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
        if (r5 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016b, code lost:
        if (r2 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016d, code lost:
        r7.setVisibility(0);
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0172, code lost:
        if (r1 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0174, code lost:
        if (r0 == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0176, code lost:
        r2 = new X.C100744vb(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017c, code lost:
        r7.setIcon(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0188, code lost:
        if (r5 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZA(android.view.View r9, android.view.ViewGroup r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r9, r6)
            com.whatsapp.wds.components.list.listitem.WDSListItem r3 = r8.A00
            r1 = 2131626584(0x7f0e0a58, float:1.8880408E38)
            r0 = 1
            if (r12 != r1) goto L_0x0120
            com.whatsapp.wds.components.list.listitem.WDSListItem.A00(r3)
            r3.setClickable(r0)
            r3.setFocusable(r0)
            r0 = 2131433495(0x7f0b1817, float:1.8488777E38)
            android.view.View r1 = r3.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0029
            r0 = 2131626591(0x7f0e0a5f, float:1.8880423E38)
            r1.setLayoutResource(r0)
            r1.inflate()
        L_0x0029:
            r0 = 2131433501(0x7f0b181d, float:1.848879E38)
            android.view.View r1 = r3.findViewById(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r3.A02 = r1
            X.6Lw r5 = r3.A08
            if (r5 == 0) goto L_0x0041
            java.lang.String r0 = r5.A0Q
            if (r0 == 0) goto L_0x0041
            if (r1 == 0) goto L_0x0041
            r3.setText((java.lang.CharSequence) r0)
        L_0x0041:
            r0 = 2131433500(0x7f0b181c, float:1.8488787E38)
            android.view.View r1 = r3.findViewById(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r3.A01 = r1
            if (r5 == 0) goto L_0x0057
            java.lang.String r0 = r5.A0P
            if (r0 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            r3.setSubText((java.lang.CharSequence) r0)
        L_0x0057:
            r4 = 0
            if (r5 == 0) goto L_0x018f
            X.5ST r1 = r5.A0I
        L_0x005c:
            X.5ST r0 = X.AnonymousClass5ST.NONE
            if (r1 == r0) goto L_0x0188
            r0 = 2131433493(0x7f0b1815, float:1.8488773E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r5 == 0) goto L_0x018c
            X.5ST r0 = r5.A0I
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x013f
            r0 = 3
            if (r1 != r0) goto L_0x00b5
            boolean r0 = r2 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0084
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0 = 2131626595(0x7f0e0a63, float:1.888043E38)
            r2.setLayoutResource(r0)
            r2.inflate()
        L_0x0084:
            r0 = 2131433493(0x7f0b1815, float:1.8488773E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r3.A09 = r0
            int r1 = r5.A02
            if (r1 == 0) goto L_0x00b5
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r2 = X.C013105r.A01(r0, r1)
            boolean r0 = r5.A0T
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r7 = r3.A09
            if (r7 == 0) goto L_0x00b5
            if (r2 == 0) goto L_0x0181
            r7.setVisibility(r6)
            X.0ts r1 = r3.A03
            if (r1 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            X.4vb r0 = new X.4vb
            r0.<init>(r2, r1)
            r2 = r0
        L_0x00b2:
            r7.setImageDrawable(r2)
        L_0x00b5:
            X.5SS r1 = r5.A0G
        L_0x00b7:
            X.5SS r0 = X.AnonymousClass5SS.NONE
            if (r1 == r0) goto L_0x013c
            r0 = 2131433492(0x7f0b1814, float:1.8488771E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r5 == 0) goto L_0x00fb
            X.5SS r0 = r5.A0G
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0121
            r0 = 2
            if (r1 != r0) goto L_0x00f9
            boolean r0 = r2 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00df
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0 = 2131626589(0x7f0e0a5d, float:1.8880418E38)
            r2.setLayoutResource(r0)
            r2.inflate()
        L_0x00df:
            r0 = 2131433492(0x7f0b1814, float:1.8488771E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.wds.components.icon.WDSIcon r0 = (com.whatsapp.wds.components.icon.WDSIcon) r0
            r3.A06 = r0
            int r1 = r5.A00
            if (r1 == 0) goto L_0x00f9
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r0, r1)
            r3.setBadgeIcon(r0)
        L_0x00f9:
            X.5S1 r4 = r5.A0F
        L_0x00fb:
            X.5S1 r0 = X.AnonymousClass5S1.NONE
            if (r4 == r0) goto L_0x011a
            r0 = 2131433497(0x7f0b1819, float:1.8488781E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x011a
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0111
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r1.inflate()
        L_0x0111:
            r0 = 2131433497(0x7f0b1819, float:1.8488781E38)
            android.view.View r0 = r3.findViewById(r0)
            r3.A00 = r0
        L_0x011a:
            r3.A06()
            com.whatsapp.wds.components.list.listitem.WDSListItem.A00(r3)
        L_0x0120:
            return
        L_0x0121:
            boolean r0 = r2 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0130
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0 = 2131626590(0x7f0e0a5e, float:1.888042E38)
            r2.setLayoutResource(r0)
            r2.inflate()
        L_0x0130:
            r0 = 2131433492(0x7f0b1814, float:1.8488771E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = (com.whatsapp.wds.components.toggle.WDSSwitch) r0
            r3.A0A = r0
            goto L_0x00f9
        L_0x013c:
            if (r5 == 0) goto L_0x00fb
            goto L_0x00f9
        L_0x013f:
            boolean r0 = r2 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x014e
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0 = 2131626594(0x7f0e0a62, float:1.8880429E38)
            r2.setLayoutResource(r0)
            r2.inflate()
        L_0x014e:
            r0 = 2131433493(0x7f0b1815, float:1.8488773E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.wds.components.icon.WDSIcon r0 = (com.whatsapp.wds.components.icon.WDSIcon) r0
            r3.A07 = r0
            int r1 = r5.A01
            if (r1 == 0) goto L_0x00b5
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r2 = X.C013105r.A01(r0, r1)
            boolean r0 = r5.A0T
            com.whatsapp.wds.components.icon.WDSIcon r7 = r3.A07
            if (r7 == 0) goto L_0x00b5
            if (r2 == 0) goto L_0x0181
            r7.setVisibility(r6)
            X.0ts r1 = r3.A03
            if (r1 == 0) goto L_0x017c
            if (r0 == 0) goto L_0x017c
            X.4vb r0 = new X.4vb
            r0.<init>(r2, r1)
            r2 = r0
        L_0x017c:
            r7.setIcon((android.graphics.drawable.Drawable) r2)
            goto L_0x00b5
        L_0x0181:
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x00b5
        L_0x0188:
            if (r5 == 0) goto L_0x018c
            goto L_0x00b5
        L_0x018c:
            r1 = r4
            goto L_0x00b7
        L_0x018f:
            r1 = r4
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146136v6.BZA(android.view.View, android.view.ViewGroup, java.lang.String, int):void");
    }

    public C146136v6(WDSListItem wDSListItem) {
        this.A00 = wDSListItem;
    }
}

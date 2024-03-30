package X;

import android.view.View;

/* renamed from: X.3rH  reason: invalid class name and case insensitive filesystem */
public class C77923rH implements C88134Rn {
    public View A00;
    public final C65663Sz A01;

    public C77923rH(C65663Sz r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c1, code lost:
        if (r11 == 37) goto L_0x02c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BJ6(android.content.Context r24, android.view.View r25, android.view.ViewGroup r26, X.AnonymousClass1RY r27, java.util.List r28, java.util.List r29, java.util.List r30, java.util.List r31, boolean r32) {
        /*
            r23 = this;
            r9 = r25
            if (r25 != 0) goto L_0x0034
            r3 = r24
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131626282(0x7f0e092a, float:1.8879796E38)
            r2 = r26
            android.view.View r9 = X.C36361kB.A0E(r1, r2, r0)
            X.0tq r0 = X.C36371kC.A0P(r3)
            X.1yu r8 = new X.1yu
            r1 = r27
            r8.<init>(r3, r9, r0, r1)
            r9.setTag(r8)
        L_0x0021:
            r0 = r23
            r0.A00 = r9
            X.3Sz r0 = r0.A01
            r20 = r0
            com.whatsapp.jid.UserJid r0 = r0.A09
            r8.A06 = r0
            int r0 = r20.A02()
            r8.A01 = r0
            goto L_0x003b
        L_0x0034:
            java.lang.Object r8 = r9.getTag()
            X.1yu r8 = (X.C42491yu) r8
            goto L_0x0021
        L_0x003b:
            X.0tq r0 = r8.A0E     // Catch:{ all -> 0x0548 }
            r19 = r0
            X.004 r0 = r0.A7x     // Catch:{ all -> 0x0548 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0548 }
            X.1HT r1 = (X.AnonymousClass1HT) r1     // Catch:{ all -> 0x0548 }
            com.whatsapp.jid.UserJid r0 = r8.A06     // Catch:{ all -> 0x0548 }
            X.3T1 r7 = r1.A02(r0)     // Catch:{ all -> 0x0548 }
            boolean r0 = r20.A0B()
            r10 = 1
            r6 = 8
            r5 = 0
            r22 = r28
            if (r0 == 0) goto L_0x03a4
            X.3SF r11 = r8.A0G
            com.whatsapp.TextEmojiLabel r4 = r11.A01
            r0 = 2131891208(0x7f121408, float:1.941713E38)
            r4.setText(r0)
            r4.A0E()
            android.widget.FrameLayout r1 = r8.A09
            if (r7 == 0) goto L_0x039f
            android.content.Context r3 = r8.A07
            r0 = 2131891210(0x7f12140a, float:1.9417134E38)
            X.C36331k8.A0q(r3, r1, r0)
            r0 = 46
            X.AnonymousClass3Y8.A00(r1, r8, r0)
            r1.setVisibility(r5)
            android.widget.ImageView r2 = r8.A0A
            r0 = 2131232508(0x7f0806fc, float:1.8081127E38)
            r2.setImageResource(r0)
            boolean r1 = r22.isEmpty()
            r0 = 2131102302(0x7f060a5e, float:1.7817038E38)
            if (r1 == 0) goto L_0x0095
            r1 = 2130970786(0x7f0408a2, float:1.7550292E38)
            r0 = 2131102307(0x7f060a63, float:1.7817048E38)
            int r0 = X.C224514j.A00(r3, r1, r0)
        L_0x0095:
            int r1 = X.AnonymousClass00F.A00(r3, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x009e:
            com.whatsapp.jid.UserJid r0 = r8.A06
            boolean r0 = r0 instanceof X.C177638e7
            if (r0 != 0) goto L_0x0389
            android.widget.TextView r3 = r8.A0D
            r3.setVisibility(r5)
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            android.content.Context r2 = r8.A07
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            X.C36321k7.A0M(r2, r4, r1, r0)
            r4.A0E()
        L_0x00ba:
            java.lang.String r12 = ""
            r21 = r29
            if (r7 == 0) goto L_0x0323
            com.whatsapp.jid.UserJid r0 = r8.A06
            boolean r0 = r0 instanceof X.C177638e7
            if (r0 == 0) goto L_0x0256
            android.widget.ImageView r10 = r8.A0C
            r10.setTag(r12)
            X.1Pp r1 = X.C36361kB.A0V(r19)
            X.16D r0 = X.C36341k9.A0R(r19)
            X.16z r0 = r0.A04
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.141 r0 = (X.AnonymousClass141) r0
            r1.A07(r10, r0)
        L_0x00e0:
            int r12 = r22.size()
            int r15 = r21.size()
            int r11 = r30.size()
            int r1 = r12 + r15
            int r1 = r1 + r11
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x0206
            if (r1 == 0) goto L_0x0206
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            r10 = 1
            if (r12 <= 0) goto L_0x010f
            android.content.res.Resources r14 = r8.A08
            java.lang.Object[] r1 = new java.lang.Object[r10]
            X.AnonymousClass000.A1L(r1, r12, r5)
            r0 = 2131755123(0x7f100073, float:1.9141116E38)
            java.lang.String r0 = r14.getQuantityString(r0, r12, r1)
            r13.add(r0)
        L_0x010f:
            if (r15 <= 0) goto L_0x0122
            android.content.res.Resources r14 = r8.A08
            java.lang.Object[] r1 = new java.lang.Object[r10]
            X.AnonymousClass000.A1L(r1, r15, r5)
            r0 = 2131755323(0x7f10013b, float:1.9141522E38)
            java.lang.String r0 = r14.getQuantityString(r0, r15, r1)
            r13.add(r0)
        L_0x0122:
            if (r11 <= 0) goto L_0x0130
            android.content.res.Resources r1 = r8.A08
            r0 = 2131755071(0x7f10003f, float:1.914101E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r11, r5, r0)
            r13.add(r0)
        L_0x0130:
            int r1 = r13.size()
            r0 = 3
            r11 = 2
            if (r1 != r0) goto L_0x01f0
            r5 = 2131894925(0x7f12228d, float:1.9424669E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C36341k9.A1P(r13, r1)
            java.lang.Object r0 = r13.get(r11)
            r1[r11] = r0
        L_0x0146:
            java.lang.String r0 = r2.getString(r5, r1)
        L_0x014a:
            r3.setText(r0)
            if (r12 != 0) goto L_0x0150
            r10 = 0
        L_0x0150:
            r1 = 2131233283(0x7f080a03, float:1.80827E38)
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A02(r2, r1, r0)
            if (r10 == 0) goto L_0x0163
            r0 = 2131233232(0x7f0809d0, float:1.8082596E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r2, r0)
        L_0x0163:
            X.0ts r0 = r19.BxU()
            X.4vb r10 = new X.4vb
            r10.<init>(r1, r0)
            X.0ts r0 = r19.BxU()
            boolean r0 = X.C36401kF.A1X(r0)
            r5 = 0
            r1 = r10
            if (r0 == 0) goto L_0x0179
            r1 = r5
        L_0x0179:
            X.0ts r0 = r19.BxU()
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 != 0) goto L_0x0184
            r10 = r5
        L_0x0184:
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r10, r5)
        L_0x0187:
            android.widget.ImageView r1 = r8.A0C
            boolean r11 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r11 == 0) goto L_0x01ea
            r5 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r5
            r0 = 0
            r5.setProfileBadge(r0)
        L_0x0194:
            X.1CR r5 = X.C36371kC.A0j(r19)
            com.whatsapp.jid.UserJid r0 = r8.A06
            boolean r10 = r5.A0l(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x01a4
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x01a4:
            r4.setAlpha(r0)
            r3.setAlpha(r0)
            r1.setAlpha(r0)
            boolean r0 = r1 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r0 == 0) goto L_0x03eb
            r4 = 0
            if (r10 == 0) goto L_0x01e1
            r3 = 0
        L_0x01b5:
            r0 = r1
            com.whatsapp.status.ContactStatusThumbnail r0 = (com.whatsapp.status.ContactStatusThumbnail) r0
            java.util.Map r5 = r0.A05
            r5.clear()
            r0.A05(r4, r3)
            if (r10 != 0) goto L_0x047e
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x047e
            java.util.Iterator r4 = r22.iterator()
        L_0x01cc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03d2
            java.lang.Object r3 = r4.next()
            r0 = 2131102302(0x7f060a5e, float:1.7817038E38)
            int r0 = X.AnonymousClass00F.A00(r2, r0)
            X.C36421kH.A1M(r3, r5, r0)
            goto L_0x01cc
        L_0x01e1:
            int r3 = r20.A02()
            int r4 = r20.A03()
            goto L_0x01b5
        L_0x01ea:
            android.widget.ImageView r0 = r8.A0B
            r0.setVisibility(r6)
            goto L_0x0194
        L_0x01f0:
            int r0 = r13.size()
            if (r0 != r11) goto L_0x0200
            r5 = 2131895145(0x7f122369, float:1.9425115E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.C36341k9.A1P(r13, r1)
            goto L_0x0146
        L_0x0200:
            java.lang.String r0 = X.C36421kH.A0e(r13, r5)
            goto L_0x014a
        L_0x0206:
            r19.Bvc()
            X.0ts r11 = r19.BxU()
            X.0wo r10 = r19.Bvc()
            long r0 = r20.A05()
            long r0 = r10.A08(r0)
            java.lang.String r13 = X.AnonymousClass3UY.A0B(r11, r0)
            r3.setText(r13)
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            int r12 = r20.A03()
            int r11 = r20.A02()
            r10 = 1
            android.content.res.Resources r1 = r8.A08
            if (r12 <= 0) goto L_0x024e
            r0 = 2131755380(0x7f100174, float:1.9141638E38)
            java.lang.String r5 = X.C36321k7.A0B(r1, r12, r5, r0)
        L_0x0237:
            java.lang.StringBuilder r1 = X.C36381kD.A11(r13)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)
            r3.setContentDescription(r0)
            r3.setImportantForAccessibility(r10)
            r0 = 2131894898(0x7f122272, float:1.9424614E38)
            r8.A00 = r0
            goto L_0x0187
        L_0x024e:
            r0 = 2131755381(0x7f100175, float:1.914164E38)
            java.lang.String r5 = X.C36321k7.A0B(r1, r11, r5, r0)
            goto L_0x0237
        L_0x0256:
            boolean r0 = r7 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0273
            boolean r0 = r8.A0L
            if (r0 == 0) goto L_0x0273
            r0 = r7
            X.2bi r0 = (X.C46812bi) r0
            int r0 = X.C55482uh.A00(r2, r0)
            android.graphics.drawable.LayerDrawable r1 = X.C55502uj.A00(r2, r0)
            android.widget.ImageView r0 = r8.A0C
            r0.setTag(r12)
            r0.setImageDrawable(r1)
            goto L_0x00e0
        L_0x0273:
            boolean r0 = r7 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x029e
            r12 = r7
            X.2bU r12 = (X.AnonymousClass2bU) r12
            X.3Qj r11 = X.AnonymousClass2bU.A00(r12)
            if (r32 == 0) goto L_0x0291
            r0 = r19
            X.0tq r0 = r0.AfI
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A41
            java.lang.Object r0 = r0.get()
            X.3EG r0 = (X.AnonymousClass3EG) r0
            r0.A00(r7)
        L_0x0291:
            X.0wU r10 = r8.A0J
            r1 = 3
            X.737 r0 = new X.737
            r0.<init>(r8, r11, r12, r1)
            r10.Bp1(r0)
            goto L_0x00e0
        L_0x029e:
            int r11 = r7.A1I
            if (r11 == 0) goto L_0x02cb
            r0 = 27
            if (r11 == r0) goto L_0x02cb
            android.widget.ImageView r10 = r8.A0C
            r10.setTag(r12)
            r0 = 1
            if (r11 == r0) goto L_0x02c3
            r0 = 3
            if (r11 == r0) goto L_0x02c3
            r0 = 15
            r1 = 2131232820(0x7f080834, float:1.808176E38)
            if (r11 == r0) goto L_0x02c6
            r0 = 23
            if (r11 == r0) goto L_0x02c3
            r0 = 37
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            if (r11 != r0) goto L_0x02c6
        L_0x02c3:
            r1 = 2131232844(0x7f08084c, float:1.8081809E38)
        L_0x02c6:
            r10.setImageResource(r1)
            goto L_0x00e0
        L_0x02cb:
            android.widget.ImageView r10 = r8.A0C
            r10.setTag(r12)
            X.1DU r0 = X.C36391kE.A0j(r19)
            java.lang.String r1 = X.AnonymousClass3UN.A05(r0, r7)
            r0 = r7
            X.2bV r0 = (X.AnonymousClass2bV) r0
            com.whatsapp.TextData r0 = r0.A02
            android.graphics.drawable.Drawable r13 = r10.getDrawable()
            X.1H2 r16 = X.C36351kA.A0e(r19)
            X.0yb r15 = X.C36351kA.A0U(r19)
            X.0wg r17 = X.C36351kA.A0m(r19)
            int r12 = r1.length()
            r11 = 700(0x2bc, float:9.81E-43)
            if (r12 <= r11) goto L_0x02f9
            java.lang.String r1 = r1.substring(r5, r11)
        L_0x02f9:
            X.AnonymousClass00C.A0D(r2, r5)
            if (r0 == 0) goto L_0x0306
            int r11 = r0.fontStyle
            android.graphics.Typeface r12 = X.AnonymousClass3UN.A04(r2, r11)
            if (r12 != 0) goto L_0x0308
        L_0x0306:
            android.graphics.Typeface r12 = android.graphics.Typeface.SANS_SERIF
        L_0x0308:
            r11 = r2
            r14 = r0
            r18 = r1
            X.2g3 r11 = X.C55602ut.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r10 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r0 == 0) goto L_0x031e
            r0 = r10
            com.whatsapp.components.button.ThumbnailButton r0 = (com.whatsapp.components.button.ThumbnailButton) r0
            float r1 = r0.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r11.A00 = r1
        L_0x031e:
            r10.setImageDrawable(r11)
            goto L_0x00e0
        L_0x0323:
            android.widget.ImageView r1 = r8.A0C
            r1.setTag(r12)
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x0371
            X.0wQ r0 = X.C36351kA.A0N(r19)
            r0.A0G()
            X.142 r10 = r0.A0E
            if (r10 == 0) goto L_0x033e
            X.1RY r0 = r8.A0H
            r0.A08(r1, r10)
        L_0x033e:
            android.widget.ImageView r12 = r8.A0B
            boolean r10 = X.C222013h.A05
            r0 = 2131233334(0x7f080a36, float:1.8082803E38)
            if (r10 == 0) goto L_0x034a
            r0 = 2131233335(0x7f080a37, float:1.8082805E38)
        L_0x034a:
            r12.setBackgroundResource(r0)
            boolean r11 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r11 == 0) goto L_0x036d
            r10 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r10
            X.6K4 r0 = r8.A0K
            r10.setProfileBadge(r0)
        L_0x0359:
            r0 = 2131886427(0x7f12015b, float:1.9407433E38)
            r3.setText(r0)
            r0 = 2
            r3.setImportantForAccessibility(r0)
            r0 = 2131894897(0x7f122271, float:1.9424612E38)
            r8.A00 = r0
        L_0x0368:
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            goto L_0x0194
        L_0x036d:
            r12.setVisibility(r5)
            goto L_0x0359
        L_0x0371:
            r10 = 0
            r1.setImageDrawable(r10)
            r3.setText(r12)
            boolean r11 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r11 == 0) goto L_0x0383
            r0 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r0.setProfileBadge(r10)
            goto L_0x0368
        L_0x0383:
            android.widget.ImageView r0 = r8.A0B
            r0.setVisibility(r6)
            goto L_0x0368
        L_0x0389:
            android.content.Context r2 = r8.A07
            r0 = 2130970021(0x7f0405a5, float:1.754874E38)
            int r0 = X.C224314h.A01(r2, r0)
            X.C36331k8.A0r(r2, r4, r0)
            android.widget.TextView r3 = r8.A0D
            r3.setVisibility(r6)
            r11.A03(r10)
            goto L_0x00ba
        L_0x039f:
            r1.setVisibility(r6)
            goto L_0x009e
        L_0x03a4:
            X.16D r1 = X.C36341k9.A0R(r19)
            com.whatsapp.jid.UserJid r0 = r8.A06
            X.141 r1 = r1.A0D(r0)
            X.171 r0 = X.C36341k9.A0S(r19)
            java.lang.String r2 = r0.A0L(r1)
            X.3SF r11 = r8.A0G
            r0 = r31
            r11.A09(r0, r2)
            android.widget.FrameLayout r0 = r8.A09
            r0.setVisibility(r6)
            android.content.Context r1 = r8.A07
            r0 = 2131894901(0x7f122275, float:1.942462E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r10, r0)
            com.whatsapp.TextEmojiLabel r4 = r11.A01
            r4.setContentDescription(r0)
            goto L_0x009e
        L_0x03d2:
            java.util.Iterator r4 = r21.iterator()
        L_0x03d6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x047e
            java.lang.Object r3 = r4.next()
            r0 = 2131102306(0x7f060a62, float:1.7817046E38)
            int r0 = X.AnonymousClass00F.A00(r2, r0)
            X.C36421kH.A1M(r3, r5, r0)
            goto L_0x03d6
        L_0x03eb:
            if (r11 == 0) goto L_0x047e
            r5 = 0
            if (r10 == 0) goto L_0x0432
            r4 = 0
            r11 = 0
        L_0x03f2:
            java.util.HashSet r10 = new java.util.HashSet
            r0 = r22
            r10.<init>(r0)
            java.util.HashSet r12 = new java.util.HashSet
            r0 = r21
            r12.<init>(r0)
            r3 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r3 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r3
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            r13 = 0
        L_0x0408:
            if (r13 >= r4) goto L_0x0470
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x041e
            boolean r0 = X.C36381kD.A1Z(r10, r13)
            if (r0 == 0) goto L_0x041e
            X.5TU r0 = X.AnonymousClass5TU.ERROR
        L_0x0418:
            r2.add(r0)
            int r13 = r13 + 1
            goto L_0x0408
        L_0x041e:
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x042d
            boolean r0 = X.C36381kD.A1Z(r12, r13)
            if (r0 == 0) goto L_0x042d
        L_0x042a:
            X.5TU r0 = X.AnonymousClass5TU.UNSEEN
            goto L_0x0418
        L_0x042d:
            if (r13 < r11) goto L_0x042a
            X.5TU r0 = X.AnonymousClass5TU.SEEN
            goto L_0x0418
        L_0x0432:
            int r4 = r20.A02()
            r0 = 32
            if (r4 <= r0) goto L_0x046b
            int r0 = r20.A03()
            if (r0 > 0) goto L_0x0468
            int r0 = r21.size()
            if (r0 > 0) goto L_0x0468
            int r0 = r22.size()
            if (r0 <= 0) goto L_0x0465
            X.5TU r3 = X.AnonymousClass5TU.ERROR
        L_0x044e:
            r2 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            int r0 = r20.A02()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r2.setStatusIndicatorEnabled(r0)
            X.5QJ r0 = new X.5QJ
            r0.<init>(r3)
            r2.setProfileStatus(r0)
            goto L_0x047e
        L_0x0465:
            X.5TU r3 = X.AnonymousClass5TU.SEEN
            goto L_0x044e
        L_0x0468:
            X.5TU r3 = X.AnonymousClass5TU.UNSEEN
            goto L_0x044e
        L_0x046b:
            int r11 = r20.A03()
            goto L_0x03f2
        L_0x0470:
            X.5QK r0 = new X.5QK
            r0.<init>(r2)
            r3.setProfileStatus(r0)
            if (r4 <= 0) goto L_0x047b
            r5 = 1
        L_0x047b:
            r3.setStatusIndicatorEnabled(r5)
        L_0x047e:
            boolean r2 = r20.A0B()
            X.1Ua r0 = X.C36391kE.A0p(r19)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0527
            if (r2 == 0) goto L_0x0539
            if (r7 == 0) goto L_0x0539
            android.view.View r0 = r8.A02
            if (r0 != 0) goto L_0x04a2
            android.view.View r2 = r8.A0H
            r0 = 2131429327(0x7f0b07cf, float:1.8480324E38)
            android.view.View r0 = X.C36381kD.A0L(r2, r0)
            r8.A02 = r0
            r0.setVisibility(r6)
        L_0x04a2:
            android.view.View r0 = r8.A05
            if (r0 != 0) goto L_0x04b4
            android.view.View r2 = r8.A0H
            r0 = 2131429332(0x7f0b07d4, float:1.8480334E38)
            android.view.View r0 = X.C36381kD.A0L(r2, r0)
            r8.A05 = r0
            r0.setVisibility(r6)
        L_0x04b4:
            X.1Ua r0 = X.C36391kE.A0p(r19)
            X.0yC r2 = r0.A01
            X.0yV r3 = X.C21000yV.A01
            r0 = 6759(0x1a67, float:9.471E-42)
            boolean r0 = X.C20800yB.A01(r3, r2, r0)
            if (r0 == 0) goto L_0x04d6
            android.view.View r0 = r8.A03
            if (r0 != 0) goto L_0x04d6
            android.view.View r2 = r8.A0H
            r0 = 2131429329(0x7f0b07d1, float:1.8480328E38)
            android.view.View r0 = X.C36381kD.A0L(r2, r0)
            r8.A03 = r0
            r0.setVisibility(r6)
        L_0x04d6:
            X.1Ua r0 = X.C36391kE.A0p(r19)
            X.0yC r2 = r0.A01
            r0 = 6456(0x1938, float:9.047E-42)
            boolean r0 = X.C20800yB.A01(r3, r2, r0)
            if (r0 == 0) goto L_0x04f6
            android.view.View r0 = r8.A04
            if (r0 != 0) goto L_0x04f6
            android.view.View r2 = r8.A0H
            r0 = 2131429328(0x7f0b07d0, float:1.8480326E38)
            android.view.View r0 = X.C36381kD.A0L(r2, r0)
            r8.A04 = r0
            r0.setVisibility(r6)
        L_0x04f6:
            r0 = r19
            X.0tq r0 = r0.AfI
            X.0tt r2 = r0.A00
            X.004 r0 = r2.A4Q
            X.005 r0 = X.C18840tu.A00(r0)
            java.lang.Object r4 = r0.get()
            X.1i0 r4 = (X.C35011i0) r4
            X.004 r0 = r2.A4Q
            X.005 r0 = X.C18840tu.A00(r0)
            java.lang.Object r3 = r0.get()
            X.1i0 r3 = (X.C35011i0) r3
            X.1Ua r0 = X.C36391kE.A0p(r19)
            X.3uf r2 = new X.3uf
            r2.<init>(r8, r3, r0)
            X.005 r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.3Kt r0 = (X.C63623Kt) r0
            r0.A00 = r2
        L_0x0527:
            android.view.View r3 = r1.getRootView()
            android.view.View r2 = r1.getRootView()
            r1 = 4
            X.4Vd r0 = new X.4Vd
            r0.<init>(r3, r8, r1)
            X.C012005e.A0V(r2, r0)
            return r9
        L_0x0539:
            android.view.View r0 = r8.A02
            if (r0 == 0) goto L_0x0540
            r0.setVisibility(r6)
        L_0x0540:
            android.view.View r0 = r8.A05
            if (r0 == 0) goto L_0x0527
            r0.setVisibility(r6)
            goto L_0x0527
        L_0x0548:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77923rH.BJ6(android.content.Context, android.view.View, android.view.ViewGroup, X.1RY, java.util.List, java.util.List, java.util.List, java.util.List, boolean):android.view.View");
    }
}

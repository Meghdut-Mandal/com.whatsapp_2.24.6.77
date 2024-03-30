package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.profile.ViewProfilePhoto;
import java.util.Collection;

public class B79 extends C226815j {
    public Object A00;
    public final int A01;

    public B79(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r4.A05 != -1) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        if (r4.A05 == 0) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass11F r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c7;
                case 4: goto L_0x0009;
                case 5: goto L_0x0005;
                case 6: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A04(r9)
        L_0x0008:
            return
        L_0x0009:
            if (r9 == 0) goto L_0x0008
            java.lang.Object r1 = r8.A00
            X.8hw r1 = (X.C178848hw) r1
            com.whatsapp.jid.UserJid r0 = r1.A0E
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A4P()
            return
        L_0x001b:
            java.lang.Object r7 = r8.A00
            com.whatsapp.profile.ViewProfilePhoto r7 = (com.whatsapp.profile.ViewProfilePhoto) r7
            X.16D r2 = r7.A04
            X.141 r0 = r7.A09
            java.lang.Class<X.11F> r1 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r0.A06(r1)
            X.C18740tg.A06(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r2.A0D(r0)
            r7.A09 = r0
            com.whatsapp.jid.Jid r0 = r0.A06(r1)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "viewprofilephoto/onprofilephotochanged photo_full_id:"
            r2.append(r0)
            X.141 r1 = r7.A09
            int r0 = r1.A05
            r2.append(r0)
            java.lang.String r0 = " thumb_full_id:"
            r2.append(r0)
            int r0 = r1.A06
            X.C36321k7.A1Y(r2, r0)
            X.0yE r1 = r7.A08
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0I(r0)
            android.os.Handler r2 = r7.A0D
            r5 = 0
            r2.removeMessages(r5)
            r6 = 1
            if (r0 == 0) goto L_0x007b
            X.141 r0 = r7.A09
            int r1 = r0.A05
            if (r1 != 0) goto L_0x007b
            X.1O8 r0 = r7.A08
            r0.A01(r9, r1, r6)
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.sendEmptyMessageDelayed(r5, r0)
        L_0x007b:
            com.whatsapp.profile.ViewProfilePhoto.A07(r7)
            r7.invalidateOptionsMenu()
            X.141 r4 = r7.A09
            int r3 = r4.A06
            r0 = -1
            if (r3 != r0) goto L_0x008d
            int r2 = r4.A05
            r1 = 1
            if (r2 == r0) goto L_0x00bf
        L_0x008d:
            r1 = 0
            if (r3 != 0) goto L_0x00bf
            int r0 = r4.A05
            if (r0 != 0) goto L_0x00bf
        L_0x0094:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x0008
            r7.A0E = r5
            if (r1 == 0) goto L_0x00ae
            X.17Y r2 = r7.A05
            boolean r0 = r4.A0G()
            r1 = 2131893256(0x7f121c08, float:1.9421283E38)
            if (r0 == 0) goto L_0x00aa
            r1 = 2131890170(0x7f120ffa, float:1.9415024E38)
        L_0x00aa:
            r2.A06(r1, r5)
            return
        L_0x00ae:
            if (r6 == 0) goto L_0x0008
            X.17Y r2 = r7.A05
            boolean r0 = r4.A0G()
            r1 = 2131893257(0x7f121c09, float:1.9421285E38)
            if (r0 == 0) goto L_0x00aa
            r1 = 2131890171(0x7f120ffb, float:1.9415026E38)
            goto L_0x00aa
        L_0x00bf:
            r6 = 0
            goto L_0x0094
        L_0x00c1:
            java.lang.Object r0 = r8.A00
            X.AnonymousClass8W7.A0I(r0, r9)
            return
        L_0x00c7:
            java.lang.Object r2 = r8.A00
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.0wU r1 = r2.A04
            r0 = 25
            X.AVW.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B79.A04(X.11F):void");
    }

    public void A05(AnonymousClass11F r5) {
        switch (this.A01) {
            case 4:
                if (r5 != null) {
                    C178848hw r1 = (C178848hw) this.A00;
                    if (r5.equals(r1.A0E)) {
                        r1.A4P();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C180818mT r3 = (C180818mT) this.A00;
                AnonymousClass16D r2 = r3.A04;
                Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                Jid A06 = r3.A09.A06(cls);
                C18740tg.A06(A06);
                AnonymousClass141 A0D = r2.A0D((AnonymousClass11F) A06);
                r3.A09 = A0D;
                if (r5.equals(A0D.A06(cls))) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("viewprofilephoto/onProfilePhotoStartChanging photo_full_id:");
                    AnonymousClass141 r12 = r3.A09;
                    A0u.append(r12.A05);
                    A0u.append(" thumb_full_id:");
                    C36321k7.A1Y(A0u, r12.A06);
                    if (r3.A0D) {
                        r3.A0D = false;
                        return;
                    } else {
                        r3.A0E = true;
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.A05(r5);
                return;
        }
    }

    public void A06(UserJid userJid) {
        if (3 - this.A01 != 0) {
            super.A06(userJid);
            return;
        }
        BlockList blockList = (BlockList) this.A00;
        AVW.A00(blockList.A04, blockList, 25);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r10.equals(r5.A0O) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x001b;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00a6;
                case 4: goto L_0x006a;
                case 5: goto L_0x0005;
                case 6: goto L_0x007c;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A07(r10)
        L_0x0008:
            return
        L_0x0009:
            if (r10 == 0) goto L_0x0008
            java.lang.Object r1 = r9.A00
            com.whatsapp.biz.BusinessProfileExtraFieldsActivity r1 = (com.whatsapp.biz.BusinessProfileExtraFieldsActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A0B
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A3i()
            return
        L_0x001b:
            java.lang.Object r1 = r9.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            com.whatsapp.biz.cart.view.fragment.CartFragment.A08(r1)
            boolean r0 = r1.A12
            if (r0 == 0) goto L_0x0008
            com.whatsapp.mentions.MentionableEntry r0 = r1.A0p
            java.lang.String r0 = r0.getStringText()
            java.lang.String r7 = r0.trim()
            X.7yb r5 = r1.A0P
            X.7zo r4 = r1.A0O
            X.01I r3 = r1.A0i()
            X.01L r3 = (X.AnonymousClass01L) r3
            X.9Xp r6 = r1.A0W
            if (r10 == 0) goto L_0x0047
            com.whatsapp.jid.UserJid r0 = r5.A0O
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r4 == 0) goto L_0x0008
            if (r6 == 0) goto L_0x0008
            if (r0 == 0) goto L_0x0008
            X.185 r0 = r5.A0L
            com.whatsapp.jid.UserJid r2 = r5.A0O
            X.3L0 r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x005e
            java.lang.String r8 = r0.A08
        L_0x005a:
            X.C167697yb.A01(r3, r4, r5, r6, r7, r8)
            return
        L_0x005e:
            X.171 r1 = r5.A0M
            X.141 r0 = new X.141
            r0.<init>(r2)
            java.lang.String r8 = r1.A0H(r0)
            goto L_0x005a
        L_0x006a:
            if (r10 == 0) goto L_0x0008
            java.lang.Object r1 = r9.A00
            X.8hw r1 = (X.C178848hw) r1
            com.whatsapp.jid.UserJid r0 = r1.A0E
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A4P()
            return
        L_0x007c:
            java.lang.Object r2 = r9.A00
            X.8mT r2 = (X.C180818mT) r2
            X.16D r1 = r2.A04
            X.141 r0 = r2.A09
            X.11F r0 = X.C36331k8.A0G(r0)
            X.141 r0 = r1.A0D(r0)
            r2.A09 = r0
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0008
            X.171 r1 = r2.A05
            X.141 r0 = r2.A09
            java.lang.String r0 = r1.A0H(r0)
            r2.A3F(r0)
            return
        L_0x00a0:
            java.lang.Object r0 = r9.A00
            X.AnonymousClass8W7.A0I(r0, r10)
            return
        L_0x00a6:
            java.lang.Object r2 = r9.A00
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.0wU r1 = r2.A04
            r0 = 25
            X.AVW.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B79.A07(com.whatsapp.jid.UserJid):void");
    }

    public void A09(Collection collection) {
        switch (this.A01) {
            case 3:
                C224914p r2 = (C224914p) this.A00;
                AVW.A00(r2.A04, r2, 28);
                return;
            case 5:
                ((PaymentGroupParticipantPickerActivity) this.A00).A0D.notifyDataSetChanged();
                return;
            default:
                super.A09(collection);
                return;
        }
    }

    public void A0B(Collection collection) {
        switch (this.A01) {
            case 0:
                ((BusinessProfileExtraFieldsActivity) this.A00).A3i();
                return;
            case 3:
                BlockList blockList = (BlockList) this.A00;
                AVW.A00(blockList.A04, blockList, 25);
                return;
            case 6:
                ViewProfilePhoto.A01((ViewProfilePhoto) this.A00);
                return;
            default:
                super.A0B(collection);
                return;
        }
    }
}

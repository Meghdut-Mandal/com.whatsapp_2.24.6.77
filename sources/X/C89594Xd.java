package X;

import android.widget.AdapterView;

/* renamed from: X.4Xd  reason: invalid class name and case insensitive filesystem */
public class C89594Xd implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public C89594Xd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AdapterView adapterView, Object obj, int i) {
        adapterView.setOnItemClickListener(new C89594Xd(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.1nG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: X.1nV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: X.1nG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.1nG} */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x038f, code lost:
        r1.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0392, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ad, code lost:
        r7.showContextMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r0.A09 == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (r0 != false) goto L_0x015d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r16, android.view.View r17, int r18, long r19) {
        /*
            r15 = this;
            r3 = r18
            int r0 = r15.A01
            r7 = r17
            r1 = r16
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x00a1;
                case 2: goto L_0x00b3;
                case 3: goto L_0x02d1;
                case 4: goto L_0x02ee;
                case 5: goto L_0x0305;
                case 6: goto L_0x031d;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x033d;
                case 10: goto L_0x0371;
                case 11: goto L_0x037c;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r3 = r15.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r0 = r7.getTag()
            X.3Cb r0 = (X.C61483Cb) r0
            X.4Qi r1 = r0.A00
            boolean r0 = r1 instanceof X.C75083me
            if (r0 == 0) goto L_0x003c
            X.3me r1 = (X.C75083me) r1
            X.141 r4 = r1.A00
            X.1tr r2 = r3.A1H
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r1)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r2.A0U(r0)
            if (r0 == 0) goto L_0x03ab
            com.whatsapp.jid.Jid r0 = r4.A06(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 2
            com.whatsapp.group.GroupChatInfoActivity.A1G(r3, r1, r0)
        L_0x003b:
            return
        L_0x003c:
            boolean r0 = r1 instanceof X.C75073md
            if (r0 == 0) goto L_0x0045
            r0 = 0
            com.whatsapp.group.GroupChatInfoActivity.A1H(r3, r0)
            return
        L_0x0045:
            boolean r0 = r1 instanceof X.C75063mc
            if (r0 == 0) goto L_0x003b
            X.2E6 r1 = r3.A0Z
            r0 = 4
            X.C011504z.A06(r1, r0)
            X.09Y r2 = X.C36341k9.A0O(r3)
            com.whatsapp.group.GroupParticipantsSearchFragment r1 = new com.whatsapp.group.GroupParticipantsSearchFragment
            r1.<init>()
            r0 = 2131433594(0x7f0b187a, float:1.8488978E38)
            r2.A0B(r1, r0)
            X.2E6 r0 = r3.A0Z
            r1.A01 = r0
            r0 = 1
            r1.A00 = r0
            r0 = 0
            r1.A09 = r0
            r1.A0B = r0
            r0 = 0
            r2.A0J(r0)
            r2.A01()
            return
        L_0x0072:
            java.lang.Object r4 = r15.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            r5 = 1
            int r3 = r18 - r5
            if (r3 < 0) goto L_0x003b
            X.1nV r0 = r4.A0e
            int r0 = r0.getCount()
            if (r3 >= r0) goto L_0x003b
            X.1nV r2 = r4.A0e
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0393
            java.util.List r0 = r2.A02
            int r1 = X.C36371kC.A06(r0)
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x0393
            int r0 = r2.A01
            if (r3 != r0) goto L_0x0393
            X.1nV r1 = r4.A0e
            boolean r0 = r1.A03
            if (r0 == r5) goto L_0x003b
            r1.A03 = r5
            goto L_0x038f
        L_0x00a1:
            java.lang.Object r1 = r15.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            java.lang.Object r0 = r7.getTag()
            X.37n r0 = (X.C603537n) r0
            X.141 r0 = r0.A03
            if (r0 == 0) goto L_0x003b
            r1.A0L = r0
            goto L_0x03ad
        L_0x00b3:
            java.lang.Object r4 = r15.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.widget.ListView r0 = r4.A0D
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x00c7
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x00c7:
            X.2Gc r2 = (X.AnonymousClass2Gc) r2
            android.widget.ListView r0 = r4.A0D
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x00db
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r3 = r18 - r0
        L_0x00db:
            if (r3 < 0) goto L_0x003b
            int r0 = r2.getCount()
            if (r3 >= r0) goto L_0x003b
            java.util.List r0 = r2.A02
            java.lang.Object r11 = r0.get(r3)
            X.4Ph r11 = (X.C87564Ph) r11
            X.141 r10 = r11.getContact()
            if (r10 == 0) goto L_0x02bb
            X.3L0 r0 = r10.A0E
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.A09
            r14 = 1
            if (r0 != 0) goto L_0x00fd
        L_0x00fc:
            r14 = 0
        L_0x00fd:
            X.0yC r0 = r4.A1g
            r6 = 4471(0x1177, float:6.265E-42)
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x0149
            boolean r0 = r11 instanceof X.C70233eo
            if (r0 == 0) goto L_0x0149
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r10.A06(r5)
            if (r0 == 0) goto L_0x013c
            X.0v0 r13 = r4.A1C
            java.lang.String r12 = r0.getRawString()
            if (r12 == 0) goto L_0x013c
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r13)
            java.util.HashSet r0 = X.C36441kJ.A16()
            java.lang.String r2 = "contactless_jids_store"
            java.util.Set r0 = r1.getStringSet(r2, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            r1.add(r12)
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r13)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
        L_0x013c:
            com.whatsapp.jid.Jid r2 = r10.A06(r5)
            if (r2 == 0) goto L_0x0149
            X.0wU r1 = r4.A2L
            r0 = 10
            X.C80273v8.A00(r1, r4, r2, r0)
        L_0x0149:
            X.1NG r0 = r4.A0Z
            boolean r0 = X.C36331k8.A1Y(r0, r10)
            r1 = 0
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r4.A31
            if (r0 != 0) goto L_0x015d
            boolean r0 = r4.A33
            r2 = 2131895173(0x7f122385, float:1.9425172E38)
            if (r0 == 0) goto L_0x0160
        L_0x015d:
            r2 = 2131895172(0x7f122384, float:1.942517E38)
        L_0x0160:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.171 r0 = r4.A0p
            X.C36361kB.A1F(r0, r10, r1, r8)
            java.lang.String r2 = r4.A0o(r2, r1)
            r1 = 2131886926(0x7f12034e, float:1.9408445E38)
            X.2rT r0 = new X.2rT
            r0.<init>(r10, r4, r8)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = com.whatsapp.blocklist.UnblockDialogFragment.A03(r0, r2, r1, r8)
            X.01I r0 = r4.A0h()
            X.C36421kH.A1A(r1, r0)
        L_0x017e:
            boolean r0 = r4.A32
            if (r0 == 0) goto L_0x0190
            java.util.List r0 = r4.A2p
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x01f1
            X.3Pt r1 = r4.A23
            r0 = 3
        L_0x018d:
            r1.A03(r0)
        L_0x0190:
            boolean r0 = r4.A36
            if (r0 == 0) goto L_0x003b
            boolean r0 = r10.A0z
            if (r0 == 0) goto L_0x003b
            X.2Qd r1 = new X.2Qd
            r1.<init>()
            java.util.List r0 = r4.A2p
            boolean r0 = r0.contains(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            boolean r0 = r4.A20()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            boolean r0 = r10.A0G()
            if (r0 == 0) goto L_0x01de
            r0 = 2
        L_0x01ba:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01be:
            r1.A04 = r0
            java.util.List r0 = r4.A2m
            boolean r0 = r0.contains(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A02 = r0
            java.util.List r0 = r4.A2o
            boolean r0 = r0.contains(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A03 = r0
            X.0yW r0 = r4.A1i
            r0.Bly(r1)
            return
        L_0x01de:
            X.0yC r0 = r4.A1g
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r11 instanceof X.C70233eo
            if (r0 == 0) goto L_0x01ec
            r0 = 3
            goto L_0x01ba
        L_0x01ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x01be
        L_0x01f1:
            java.util.List r0 = r4.A2m
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x0190
            X.3Pt r1 = r4.A23
            r0 = 4
            goto L_0x018d
        L_0x01fd:
            if (r14 == 0) goto L_0x0225
            android.content.Context r0 = r4.A1D()
            X.14u r7 = X.C225314u.A0N(r0)
            if (r7 == 0) goto L_0x017e
            X.005 r0 = r4.A2R
            java.lang.Object r0 = r0.get()
            X.1K3 r0 = (X.AnonymousClass1K3) r0
            X.4WZ r5 = new X.4WZ
            r5.<init>(r4, r3, r9, r10)
            X.1K4 r0 = (X.AnonymousClass1K4) r0
            X.1K6 r2 = r0.A04
            java.lang.Integer r1 = X.C36401kF.A0i()
            X.2nm r0 = X.C51412nm.AGENT
            X.AnonymousClass1K6.A00(r7, r5, r2, r0, r1)
            goto L_0x017e
        L_0x0225:
            boolean r0 = r10.A0z
            if (r0 == 0) goto L_0x025e
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r0 == 0) goto L_0x023d
            r0 = r4
            com.whatsapp.contact.picker.VoipContactPickerFragment r0 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r0
            X.00T r0 = r0.A06
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x0256
        L_0x0238:
            com.whatsapp.contact.picker.ContactPickerFragment.A0E(r7, r4, r10)
            goto L_0x017e
        L_0x023d:
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment
            if (r0 != 0) goto L_0x0238
            boolean r0 = r4.A3A
            if (r0 != 0) goto L_0x0238
            boolean r0 = r4.A34
            if (r0 != 0) goto L_0x0238
            boolean r0 = r4.A38
            if (r0 != 0) goto L_0x0238
            java.util.Map r0 = r4.A3o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0256
            goto L_0x0238
        L_0x0256:
            java.lang.Integer.valueOf(r3)
            r4.A1p(r1, r10)
            goto L_0x017e
        L_0x025e:
            boolean r0 = r4.A36
            if (r0 != 0) goto L_0x026a
            boolean r0 = r4.A3A
            if (r0 != 0) goto L_0x026a
            boolean r0 = r4.A34
            if (r0 == 0) goto L_0x0284
        L_0x026a:
            boolean r0 = r11 instanceof X.C43272Fy
            if (r0 == 0) goto L_0x0284
            r0 = r11
            X.2Fy r0 = (X.C43272Fy) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r0 <= r9) goto L_0x0284
            X.171 r0 = r4.A0p
            java.lang.String r0 = r0.A0H(r10)
            r4.A1y(r0, r1)
            goto L_0x017e
        L_0x0284:
            X.0yC r0 = r4.A1g
            boolean r0 = X.C36401kF.A1Y(r0)
            if (r0 == 0) goto L_0x02ab
            android.content.Context r0 = r4.A1D()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.contactform.ContactFormActivity"
            r2.setClassName(r1, r0)
            android.os.Bundle r0 = X.C32811eE.A01(r10)
            r2.putExtras(r0)
            r0 = 24
            r4.startActivityForResult(r2, r0)
            goto L_0x017e
        L_0x02ab:
            X.11F r0 = X.C36351kA.A0j(r10)
            java.lang.String r0 = X.AnonymousClass3U8.A04(r0)
            java.util.Objects.requireNonNull(r0)
            com.whatsapp.contact.picker.ContactPickerFragment.A0J(r4, r0)
            goto L_0x017e
        L_0x02bb:
            boolean r0 = r11 instanceof X.C70253eq
            if (r0 == 0) goto L_0x003b
            X.0v5 r1 = r4.A0I
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x03b1
            r1.A02()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02d1:
            java.lang.Object r2 = r15.A00
            X.27v r2 = (X.AnonymousClass27v) r2
            r0 = 2131433816(0x7f0b1958, float:1.8489428E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r0.getTag()
            X.141 r1 = (X.AnonymousClass141) r1
            boolean r0 = r2.A48(r1)
            if (r0 == 0) goto L_0x03d3
            r2.A3y(r1)
            return
        L_0x02ee:
            java.lang.Object r1 = r15.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r1 = (com.whatsapp.contact.picker.PhoneContactsSelector) r1
            r0 = 2131433816(0x7f0b1958, float:1.8489428E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r0.getTag()
            X.3Gs r0 = (X.C62583Gs) r0
            com.whatsapp.contact.picker.PhoneContactsSelector.A0v(r0, r1)
            return
        L_0x0305:
            java.lang.Object r2 = r15.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r1 = r1.getItemAtPosition(r3)
            boolean r0 = r1 instanceof X.C70243ep
            if (r0 == 0) goto L_0x003b
            X.3ep r1 = (X.C70243ep) r1
            if (r1 == 0) goto L_0x003b
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity.A0F(r1, r2)
            return
        L_0x031d:
            java.lang.Object r2 = r15.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            android.widget.ListView r0 = r2.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r3 = r18 - r0
            if (r3 < 0) goto L_0x003b
            java.util.List r0 = r2.A0Q
            java.lang.Object r1 = r0.get(r3)
            X.3GY r1 = (X.AnonymousClass3GY) r1
            X.0V9 r0 = r2.A03
            if (r0 == 0) goto L_0x03d7
            com.whatsapp.documentpicker.DocumentPickerActivity.A0w(r1, r2)
            return
        L_0x033d:
            java.lang.Object r2 = r15.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r2 = (com.whatsapp.location.LiveLocationPrivacyActivity) r2
            int r1 = r18 + -1
            if (r1 < 0) goto L_0x003b
            X.1nT r0 = r2.A06
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x003b
            X.1nT r0 = r2.A06
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = r0.A00
            java.util.List r0 = r0.A0E
            java.lang.Object r0 = r0.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            X.3Qa r1 = (X.C64933Qa) r1
            X.1A1 r0 = r2.A08
            X.3T1 r1 = r0.A03(r1)
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r1 = r0.A1c(r2, r1)
            X.1Dv r0 = r2.A01
            r0.A07(r2, r1)
            return
        L_0x0371:
            java.lang.Object r4 = r15.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r1.getItemAtPosition(r3)     // Catch:{ IndexOutOfBoundsException -> 0x003b }
            X.3EW r3 = (X.AnonymousClass3EW) r3     // Catch:{ IndexOutOfBoundsException -> 0x003b }
            goto L_0x03df
        L_0x037c:
            java.lang.Object r1 = r15.A00
            X.1nG r1 = (X.C37821nG) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "SelectPhoneNumberDialog/phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A00
            if (r0 == r3) goto L_0x003b
            r1.A00 = r3
        L_0x038f:
            r1.notifyDataSetChanged()
            return
        L_0x0393:
            X.1nV r0 = r4.A0e
            java.util.List r0 = r0.A02
            if (r0 != 0) goto L_0x03a4
            r0 = 0
        L_0x039a:
            X.1Dv r2 = r4.A01
            X.190 r1 = X.C36441kJ.A0j()
            X.C36391kE.A1A(r4, r2, r0, r1)
            return
        L_0x03a4:
            java.lang.Object r0 = r0.get(r3)
            X.141 r0 = (X.AnonymousClass141) r0
            goto L_0x039a
        L_0x03ab:
            r3.A0z = r4
        L_0x03ad:
            r7.showContextMenu()
            return
        L_0x03b1:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "ad_creation_tapped"
            r0 = 1
            r2.putExtra(r1, r0)
            android.os.Bundle r1 = r4.A1Z()
            java.lang.String r0 = ""
            X.3Qa r0 = X.AnonymousClass3UJ.A03(r1, r0)
            if (r0 == 0) goto L_0x03ca
            X.AnonymousClass3UJ.A00(r2, r0)
        L_0x03ca:
            X.3cN r0 = r4.A0w
            r0.A03(r2)
            X.C68733cN.A01(r4)
            return
        L_0x03d3:
            r2.B2c(r1)
            return
        L_0x03d7:
            java.util.List r0 = java.util.Collections.singletonList(r1)
            com.whatsapp.documentpicker.DocumentPickerActivity.A10(r2, r0)
            return
        L_0x03df:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "country_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "cc"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "iso"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89594Xd.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}

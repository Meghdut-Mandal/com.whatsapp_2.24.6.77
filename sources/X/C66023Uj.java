package X;

/* renamed from: X.3Uj  reason: invalid class name and case insensitive filesystem */
public class C66023Uj implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C66023Uj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new C66023Uj(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C66023Uj(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0260, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0263, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0170, code lost:
        r2 = r3.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0176, code lost:
        if (X.AnonymousClass22g.A0r(r2) != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        if (r2.A0N.A00(r2.A0y) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0182, code lost:
        r10 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0186, code lost:
        r3.A01 = r10;
        r1 = r3.A00;
        r3.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0190, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        X.C38031nb.A00(r3, r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0197, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0198, code lost:
        r3.getFilter().filter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a8, code lost:
        r0 = r1.A05;
        r0.clear();
        r0.putAll(r10);
        r1.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x000b;
                case 1: goto L_0x00be;
                case 2: goto L_0x001d;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00e6;
                case 5: goto L_0x011a;
                case 6: goto L_0x0123;
                case 7: goto L_0x012c;
                case 8: goto L_0x0161;
                case 9: goto L_0x016a;
                case 10: goto L_0x01a0;
                case 11: goto L_0x01b4;
                case 12: goto L_0x01c4;
                case 13: goto L_0x01f6;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x01ff;
                case 20: goto L_0x023d;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0254;
                case 28: goto L_0x0264;
                case 29: goto L_0x0254;
                case 30: goto L_0x002e;
                case 31: goto L_0x0005;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x005d;
                case 40: goto L_0x02af;
                case 41: goto L_0x007f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.C36331k8.A1J(r0, r10)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r1 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            boolean r0 = X.AnonymousClass000.A1X(r10)
            if (r0 == 0) goto L_0x000a
            android.view.View r1 = r1.A07
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x001d:
            java.lang.Object r1 = r9.A00
            X.14o r1 = (X.AnonymousClass14o) r1
            boolean r0 = X.AnonymousClass000.A1X(r10)
            r1.A2C(r0)
            if (r0 != 0) goto L_0x000a
            r1.Beg()
            return
        L_0x002e:
            java.lang.Object r4 = r9.A00
            com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity r4 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity) r4
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            X.00T r0 = r4.A0H
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r3 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel) r3
            X.3Xd r2 = r4.A09
            r1 = 0
            if (r2 != 0) goto L_0x0048
            java.lang.String r0 = "integratorInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0048:
            com.whatsapp.WaEditText r0 = r4.A07
            if (r0 == 0) goto L_0x0050
            android.text.Editable r1 = r0.getText()
        L_0x0050:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r3.A0S(r2, r0)
            if (r10 == 0) goto L_0x000a
            r10.dismiss()
            return
        L_0x005d:
            java.lang.Object r2 = r9.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            int r1 = X.AnonymousClass000.A0I(r10)
            r0 = 1
            if (r1 == r0) goto L_0x0073
            r0 = 2
            if (r1 != r0) goto L_0x000a
            X.1qL r0 = r2.A0a
            if (r0 == 0) goto L_0x000a
            r0.dismiss()
            return
        L_0x0073:
            X.1qL r1 = r2.A0a
            if (r1 == 0) goto L_0x000a
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r2.A1Y
            int r0 = r0.A00
            r1.A00(r0)
            return
        L_0x007f:
            java.lang.Object r2 = r9.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r2.Bu1(r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r1 = r2.A0v
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = "newsletterViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0094:
            X.1Uw r4 = r2.A3v()
            r0 = 0
            X.4a9 r3 = new X.4a9
            r3.<init>(r2, r0)
            X.1Zi r2 = r1.A04
            X.1GQ r1 = r2.A0G
            boolean r0 = X.C36391kE.A1Z(r1)
            if (r0 == 0) goto L_0x000a
            X.12q r0 = r2.A0C
            boolean r0 = X.C65903Tx.A06(r0, r4, r1)
            if (r0 == 0) goto L_0x000a
            X.1Zo r1 = r2.A04
            if (r1 == 0) goto L_0x02b7
            X.2p1 r0 = X.C52182p1.NOT_VERIFIED
            X.2YH r0 = r1.A00(r0, r4, r3)
            r0.A01()
            return
        L_0x00be:
            java.lang.Object r0 = r9.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            X.C36401kF.A10(r0, r10)
            return
        L_0x00c8:
            java.lang.Object r0 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Number r10 = (java.lang.Number) r10
            int r4 = r10.intValue()
            com.whatsapp.group.GroupChatInfoActivity.A1E(r0, r4)
            android.widget.TextView r3 = r0.A0F
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755265(0x7f100101, float:1.9141404E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r10)
            X.C36351kA.A16(r2, r3, r0, r1, r4)
            return
        L_0x00e6:
            java.lang.Object r4 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            java.util.List r10 = (java.util.List) r10
            X.1vy r0 = r4.A1X
            r0.A02 = r10
            r0.A06()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0106
            android.view.View r1 = r4.A02
            r0 = 8
        L_0x00fd:
            r1.setVisibility(r0)
            X.1vy r0 = r4.A1X
            r0.A06()
            return
        L_0x0106:
            android.widget.TextView r3 = r4.A0C
            X.0ts r0 = r4.A0q
            java.text.NumberFormat r2 = r0.A0M()
            int r0 = r10.size()
            long r0 = (long) r0
            X.C36411kG.A1E(r3, r2, r0)
            android.view.View r1 = r4.A02
            r0 = 0
            goto L_0x00fd
        L_0x011a:
            java.lang.Object r0 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.util.List r10 = (java.util.List) r10
            X.1nb r3 = r0.A1C
            goto L_0x0170
        L_0x0123:
            java.lang.Object r0 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.util.Map r10 = (java.util.Map) r10
            X.1nb r1 = r0.A1C
            goto L_0x01a8
        L_0x012c:
            java.lang.Object r4 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.2E6 r3 = r4.A0Z
            android.view.View r2 = r4.A01
            android.widget.LinearLayout r1 = r4.A0A
            X.1nb r0 = r4.A1C
            r3.A0G(r2, r1, r0)
            X.1sk r2 = r4.A1F
            r0 = 0
            r2.A01 = r0
            X.00s r1 = r2.A02
            boolean r0 = r2.A00
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.C36341k9.A18(r1, r0)
            com.whatsapp.ui.media.MediaCard r0 = r4.A0U
            X.C18740tg.A04(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x015b
            X.2EH r0 = r4.A1V
            r0.A0S()
        L_0x015b:
            java.lang.String r0 = "group_info/updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0161:
            java.lang.Object r1 = r9.A00
            com.whatsapp.group.GroupMembersSelector r1 = (com.whatsapp.group.GroupMembersSelector) r1
            r0 = 0
            com.whatsapp.group.GroupMembersSelector.A0x(r1, r0)
            return
        L_0x016a:
            java.lang.Object r3 = r9.A00
            X.1nb r3 = (X.C38031nb) r3
            java.util.List r10 = (java.util.List) r10
        L_0x0170:
            com.whatsapp.group.GroupChatInfoActivity r2 = r3.A07
            boolean r0 = X.AnonymousClass22g.A0r(r2)
            if (r0 != 0) goto L_0x0182
            X.1EL r1 = r2.A0N
            X.141 r0 = r2.A0y
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0186
        L_0x0182:
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x0186:
            r3.A01 = r10
            java.lang.String r1 = r3.A00
            r3.A00 = r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0198
            java.util.List r0 = r3.A01
            X.C38031nb.A00(r3, r0)
            return
        L_0x0198:
            android.widget.Filter r0 = r3.getFilter()
            r0.filter(r1)
            return
        L_0x01a0:
            java.lang.Object r0 = r9.A00
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            java.util.Map r10 = (java.util.Map) r10
            X.1nb r1 = r0.A05
        L_0x01a8:
            java.util.Map r0 = r1.A05
            r0.clear()
            r0.putAll(r10)
            r1.notifyDataSetChanged()
            return
        L_0x01b4:
            java.lang.Object r1 = r9.A00
            X.1vy r1 = (X.C40701vy) r1
            java.util.List r10 = (java.util.List) r10
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A02 = r10
            r1.A06()
            return
        L_0x01c4:
            java.lang.Object r5 = r9.A00
            com.whatsapp.group.GroupProfileEmojiEditor r5 = (com.whatsapp.group.GroupProfileEmojiEditor) r5
            X.34m r10 = (X.C595834m) r10
            int r0 = r10.A00
            r4 = 1
            if (r0 != 0) goto L_0x01ed
            X.5zr r3 = r5.A0D
            android.widget.ImageView r2 = r5.A03
            android.graphics.drawable.Drawable r1 = r10.A01
            X.C18740tg.A06(r1)
            android.content.res.Resources r0 = r5.getResources()
            android.graphics.Bitmap r1 = r3.A00(r0, r1, r2)
            r5.A00 = r1
            if (r1 == 0) goto L_0x01ed
            android.widget.ImageView r0 = r5.A04
            r0.setImageBitmap(r1)
            r5.invalidateOptionsMenu()
            return
        L_0x01ed:
            X.17Y r1 = r5.A05
            r0 = 2131889301(0x7f120c95, float:1.9413262E38)
            r1.A06(r0, r4)
            return
        L_0x01f6:
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            goto L_0x0260
        L_0x01ff:
            java.lang.Object r1 = r9.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            boolean r8 = X.C36331k8.A1a(r1, r10)
            r10.dismiss()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = X.C36411kG.A0g(r1)
            com.whatsapp.WaEditText r0 = r1.A09
            r2 = 0
            if (r0 != 0) goto L_0x021c
            java.lang.String r0 = "titleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x021c:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x023b
            java.lang.String r4 = r0.toString()
        L_0x0226:
            java.lang.String r5 = com.whatsapp.inappbugreporting.InAppBugReportingActivity.A01(r1)
            android.net.Uri[] r7 = r1.A0M
            java.lang.String r6 = r1.A0L
            r3.A0T(r4, r5, r6, r7, r8)
            X.3Cf r1 = r1.A3i()
            r0 = 16
            r1.A00(r0, r2)
            return
        L_0x023b:
            r4 = r2
            goto L_0x0226
        L_0x023d:
            java.lang.Object r0 = r9.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r0 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r0
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            X.C36321k7.A0w(r0, r10)
            r10.dismiss()
            X.3Cf r2 = r0.A3i()
            r1 = 0
            r0 = 17
            r2.A00(r0, r1)
            return
        L_0x0254:
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            X.C36321k7.A0w(r1, r10)
            r10.dismiss()
        L_0x0260:
            r1.finish()
            return
        L_0x0264:
            java.lang.Object r7 = r9.A00
            com.whatsapp.inappsupport.ui.SupportAiActivity r7 = (com.whatsapp.inappsupport.ui.SupportAiActivity) r7
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            boolean r6 = X.C36331k8.A1a(r7, r10)
            r10.dismiss()
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext"
            android.os.Parcelable r5 = r1.getParcelableExtra(r0)
            java.lang.String r4 = "SupportAi:fallback:email"
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            r2.putExtra(r0, r3)
            if (r5 == 0) goto L_0x029c
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            r2.putExtra(r0, r5)
        L_0x029c:
            r7.A33(r2, r6)
            X.1ft r1 = r7.A00
            if (r1 == 0) goto L_0x02a8
            r0 = 5
            r1.A02(r0, r3)
            return
        L_0x02a8:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02af:
            java.lang.Object r0 = r9.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            com.whatsapp.newsletter.NewsletterInfoActivity.A11(r0)
            return
        L_0x02b7:
            java.lang.String r0 = "newsletterUpdateVerifiedStatusGraphqlHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66023Uj.BTH(java.lang.Object):void");
    }
}

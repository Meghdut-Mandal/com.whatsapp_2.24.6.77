package X;

/* renamed from: X.2A6  reason: invalid class name */
public class AnonymousClass2A6 implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public final int A01;

    public AnonymousClass2A6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0113;
                case 1: goto L_0x0106;
                case 2: goto L_0x0005;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00db;
                case 5: goto L_0x00c9;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00ae;
                case 8: goto L_0x0098;
                case 9: goto L_0x008f;
                case 10: goto L_0x0080;
                case 11: goto L_0x0065;
                case 12: goto L_0x0005;
                case 13: goto L_0x005c;
                case 14: goto L_0x004c;
                case 15: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.14u r0 = (X.C225314u) r0
            android.view.View r0 = r0.A00
            return r0
        L_0x000c:
            java.lang.Object r5 = r6.A00
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            java.util.List r0 = r5.A0h
            java.util.ArrayList r4 = X.AnonymousClass141.A00(r0)
            X.147 r3 = r5.A0W
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupMembersSelector"
            r2.setClassName(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0034
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r4)
            java.lang.String r0 = "selected"
            r2.putExtra(r0, r1)
        L_0x0034:
            if (r3 == 0) goto L_0x003f
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
        L_0x003f:
            r1 = 1
            java.lang.String r0 = "return_result"
            r2.putExtra(r0, r1)
            r0 = 14
            r5.startActivityForResult(r2, r0)
            goto L_0x0127
        L_0x004c:
            java.lang.Object r0 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            X.2Sc r1 = r0.A1A
            if (r1 == 0) goto L_0x0127
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A07 = r0
            goto L_0x0127
        L_0x005c:
            java.lang.Object r0 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A15(r0)
            goto L_0x0127
        L_0x0065:
            java.lang.Object r0 = r6.A00
            X.2tG r0 = (X.C54632tG) r0
            java.lang.Object r2 = r0.A00
            X.3fk r2 = (X.C70803fk) r2
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A3l
            if (r1 == 0) goto L_0x00ab
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0n
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.A0J
            r1.A0E(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A3l
            X.C70803fk.A0X(r0, r2)
            goto L_0x00ab
        L_0x0080:
            java.lang.Object r1 = r6.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 0
            r1.A6Y = r0
            boolean r0 = r1.A6C
            if (r0 != 0) goto L_0x00ab
            X.C70803fk.A0z(r1)
            goto L_0x00ab
        L_0x008f:
            java.lang.Object r1 = r6.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 0
            X.C70803fk.A1Q(r1, r0)
            goto L_0x00ab
        L_0x0098:
            java.lang.Object r1 = r6.A00
            X.3fk r1 = (X.C70803fk) r1
            r1.A1m()
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B
            if (r0 == 0) goto L_0x00a6
            r0.requestFocus()
        L_0x00a6:
            com.whatsapp.KeyboardPopupLayout r0 = r1.A1V
            X.C70803fk.A0W(r0, r1)
        L_0x00ab:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00ae:
            java.lang.Object r1 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A32
            if (r0 == 0) goto L_0x0127
            X.3Pt r1 = r1.A23
            r0 = 2
            goto L_0x00c5
        L_0x00ba:
            java.lang.Object r1 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A32
            if (r0 == 0) goto L_0x0127
            X.3Pt r1 = r1.A23
            r0 = 1
        L_0x00c5:
            r1.A03(r0)
            goto L_0x0127
        L_0x00c9:
            java.lang.Object r2 = r6.A00
            X.1uf r2 = (X.C40051uf) r2
            boolean r0 = r2.A09
            r0 = r0 ^ 1
            r2.A09 = r0
            X.0wk r1 = r2.A0t
            r0 = 41
            X.C81323wp.A00(r1, r2, r0)
            goto L_0x0127
        L_0x00db:
            java.lang.Object r0 = r6.A00
            X.1uf r0 = (X.C40051uf) r0
            X.3eS r2 = r0.A02
            r1 = 1
            X.1hi r0 = r2.A03
            X.C36341k9.A18(r0, r1)
            X.026 r1 = r2.A01
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.accept(r0)
            java.lang.Runnable r0 = r2.A04
            r0.run()
            goto L_0x0127
        L_0x00f7:
            java.lang.Object r0 = r6.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            X.2Sj r1 = r0.A15
            if (r1 == 0) goto L_0x0127
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A06 = r0
            goto L_0x0127
        L_0x0106:
            java.lang.Object r0 = r6.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r0
            boolean r0 = r0.onSearchRequested()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0113:
            java.lang.Object r3 = r6.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r3 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r3
            X.005 r0 = r3.A03
            java.lang.Object r2 = r0.get()
            X.1es r2 = (X.C33191es) r2
            r1 = 6
            r0 = 4
            r2.A00(r1, r0)
            r3.finish()
        L_0x0127:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2A6.invoke():java.lang.Object");
    }
}

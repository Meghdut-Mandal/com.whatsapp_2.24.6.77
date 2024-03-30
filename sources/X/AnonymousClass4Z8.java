package X;

/* renamed from: X.4Z8  reason: invalid class name */
public class AnonymousClass4Z8 implements AnonymousClass05G {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = X.AnonymousClass0A2.A00(r13, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r1 != X.AnonymousClass0AO.COROUTINE_SUSPENDED) goto L_0x087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x087d, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0776  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6N(java.lang.Object r12, X.C023509x r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x002f;
                case 2: goto L_0x0020;
                case 3: goto L_0x0055;
                case 4: goto L_0x005e;
                case 5: goto L_0x0096;
                case 6: goto L_0x0129;
                case 7: goto L_0x022c;
                case 8: goto L_0x0286;
                case 9: goto L_0x0330;
                case 10: goto L_0x033f;
                case 11: goto L_0x0359;
                case 12: goto L_0x0038;
                case 13: goto L_0x03dd;
                case 14: goto L_0x03fe;
                case 15: goto L_0x049f;
                case 16: goto L_0x0561;
                case 17: goto L_0x06bf;
                case 18: goto L_0x07c6;
                case 19: goto L_0x080b;
                case 20: goto L_0x0820;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3Ds r12 = (X.C61863Ds) r12
            java.lang.Object r1 = r12.A01
            monitor-enter(r1)
            boolean r0 = r12.A00     // Catch:{ all -> 0x000e }
            goto L_0x084b
        L_0x000e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0011:
            float r1 = X.C36441kJ.A03(r12)
            java.lang.Object r0 = r11.A00
            X.6fw r0 = (X.C137316fw) r0
            X.7n0 r0 = r0.A00
            r0.Bqu(r1)
            goto L_0x087b
        L_0x0020:
            java.lang.Object r1 = r11.A00
            X.4NZ r1 = (X.AnonymousClass4NZ) r1
            X.3ap r1 = (X.C67783ap) r1
            X.02h r4 = r1.A01
            r0 = 0
            androidx.lifecycle.LiveDataScopeImpl$emit$2 r3 = new androidx.lifecycle.LiveDataScopeImpl$emit$2
            r3.<init>(r1, r12, r0)
            goto L_0x004c
        L_0x002f:
            java.lang.Object r0 = r11.A00
            X.0r3 r0 = (X.C17300r3) r0
            java.lang.Object r1 = r0.Bpf(r12, r13)
            goto L_0x0050
        L_0x0038:
            X.3T1 r12 = (X.AnonymousClass3T1) r12
            if (r12 == 0) goto L_0x087b
            java.lang.Object r2 = r11.A00
            X.1uV r2 = (X.C40001uV) r2
            X.31B r1 = X.C40001uV.A02(r2, r12)
            X.02l r4 = r2.A0H
            r0 = 0
            com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$5$1$1 r3 = new com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$5$1$1
            r3.<init>(r1, r2, r0)
        L_0x004c:
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r13, r4, r3)
        L_0x0050:
            X.0AO r0 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x087b
            return r1
        L_0x0055:
            java.lang.Object r0 = r11.A00
            X.026 r0 = (X.AnonymousClass026) r0
            r0.accept(r12)
            goto L_0x087b
        L_0x005e:
            X.3Pq r12 = (X.C64843Pq) r12
            java.lang.Object r2 = r11.A00
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r2 = (com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet) r2
            android.widget.TextView r1 = r2.A00
            if (r1 == 0) goto L_0x0071
            int r0 = r12.A00
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
        L_0x0071:
            android.widget.TextView r0 = r2.A00
            if (r0 == 0) goto L_0x0084
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0084
            android.widget.TextView r1 = r2.A00
            if (r1 == 0) goto L_0x0084
            int r0 = r12.A00
            r1.setText(r0)
        L_0x0084:
            X.1wB r1 = r2.A01
            if (r1 == 0) goto L_0x0091
            java.util.List r0 = r12.A01
            r1.A01 = r0
            r1.A06()
            goto L_0x087b
        L_0x0091:
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x0096:
            X.011 r12 = (X.AnonymousClass011) r12
            java.lang.Object r4 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r4 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r4
            X.00T r0 = r4.A0A
            r0.getValue()
            java.lang.Object r8 = r12.first
            X.011 r8 = (X.AnonymousClass011) r8
            java.lang.Object r2 = r12.second
            X.2nP r0 = X.C51182nP.MEMBER
            r1 = 8
            if (r2 == r0) goto L_0x0124
            java.lang.Object r0 = r8.first
            int r0 = X.AnonymousClass000.A0I(r0)
            float r7 = (float) r0
            java.lang.Object r0 = r8.second
            int r0 = X.AnonymousClass000.A0I(r0)
            float r0 = (float) r0
            float r7 = r7 / r0
            double r2 = (double) r7
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0124
            r1 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0110
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0110
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity.A01(r4, r1)
            X.00T r0 = r4.A09
            java.lang.Object r6 = X.C36381kD.A0p(r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r7 = 2131891151(0x7f1213cf, float:1.9417014E38)
        L_0x00df:
            X.1e1 r5 = r4.A04
            if (r5 == 0) goto L_0x011f
            android.content.Context r3 = r6.getContext()
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            java.lang.Object r1 = r8.first
            r0 = 0
            r2[r0] = r1
            java.lang.Object r1 = r8.second
            r0 = 1
            java.lang.String r2 = X.C36391kE.A0v(r4, r1, r2, r0, r7)
            r0 = 28
            X.3wS r1 = new X.3wS
            r1.<init>((java.lang.Object) r4, (int) r0)
            java.lang.String r0 = "manage_groups_link"
            android.text.SpannableStringBuilder r0 = r5.A02(r3, r1, r2, r0)
            r6.setText(r0)
            X.0yC r0 = r6.getAbProps()
            X.C36331k8.A0z(r6, r4, r0)
            goto L_0x087b
        L_0x0110:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity.A01(r4, r1)
            X.00T r0 = r4.A09
            java.lang.Object r6 = X.C36381kD.A0p(r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r7 = 2131891152(0x7f1213d0, float:1.9417016E38)
            goto L_0x00df
        L_0x011f:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0124:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity.A01(r4, r1)
            goto L_0x087b
        L_0x0129:
            X.2re r12 = (X.C53642re) r12
            java.lang.Object r5 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r5 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r5
            boolean r0 = r12 instanceof X.AnonymousClass2FA
            if (r0 == 0) goto L_0x0143
            X.4t3 r0 = r5.A01
            if (r0 == 0) goto L_0x013a
            r0.A0N()
        L_0x013a:
            X.0FM r0 = r5.A00
            if (r0 == 0) goto L_0x087b
            r0.dismiss()
            goto L_0x087b
        L_0x0143:
            boolean r0 = r12 instanceof X.AnonymousClass2FH
            if (r0 == 0) goto L_0x015c
            r0 = 2131891264(0x7f121440, float:1.9417243E38)
        L_0x014a:
            java.lang.String r2 = X.C36361kB.A0m(r5, r0)
            android.view.View r1 = r5.A00
            r0 = 0
            X.4t3 r0 = X.C99304t3.A01(r1, r2, r0)
        L_0x0155:
            r0.A0P()
            r5.A01 = r0
            goto L_0x087b
        L_0x015c:
            boolean r0 = r12 instanceof X.AnonymousClass2FF
            if (r0 == 0) goto L_0x0190
            X.1qm r4 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131891154(0x7f1213d2, float:1.941702E38)
            r4.A0d(r0)
            r0 = 2131891153(0x7f1213d1, float:1.9417018E38)
            r4.A0c(r0)
            r2 = 2131896407(0x7f122857, float:1.9427674E38)
            r1 = 5
            X.2rZ r0 = new X.2rZ
            r0.<init>(r5, r1)
            r4.A0l(r5, r0, r2)
            r2 = 2131890876(0x7f1212bc, float:1.9416456E38)
            r1 = 2
            X.2rZ r0 = new X.2rZ
            r0.<init>(r5, r1)
            r4.A0m(r5, r0, r2)
        L_0x0188:
            X.0FM r0 = r4.A0b()
            r5.A00 = r0
            goto L_0x087b
        L_0x0190:
            boolean r0 = r12 instanceof X.AnonymousClass2FE
            if (r0 == 0) goto L_0x01d9
            X.2FE r12 = (X.AnonymousClass2FE) r12
            X.1qm r4 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131891154(0x7f1213d2, float:1.941702E38)
            r4.A0d(r0)
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131755205(0x7f1000c5, float:1.9141283E38)
            int r2 = r12.A01
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = r12.A00
            X.AnonymousClass000.A1J(r1, r0)
            X.AnonymousClass000.A1K(r1, r2)
            java.lang.String r0 = r6.getQuantityString(r3, r2, r1)
            r4.A0p(r0)
            r2 = 2131896407(0x7f122857, float:1.9427674E38)
            r1 = 4
            X.2rZ r0 = new X.2rZ
            r0.<init>(r5, r1)
            r4.A0l(r5, r0, r2)
            r0 = 2131891148(0x7f1213cc, float:1.9417008E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 6
            X.3UW r0 = new X.3UW
            r0.<init>(r12, r5, r1)
            r4.A0o(r5, r0, r2)
            goto L_0x0188
        L_0x01d9:
            boolean r0 = r12 instanceof X.AnonymousClass2FB
            if (r0 == 0) goto L_0x0213
            r4 = 2131755206(0x7f1000c6, float:1.9141285E38)
        L_0x01e0:
            X.2FD r12 = (X.AnonymousClass2FD) r12
            android.content.res.Resources r3 = r5.getResources()
            boolean r0 = r12 instanceof X.AnonymousClass2FI
            if (r0 == 0) goto L_0x0205
            X.2FI r12 = (X.AnonymousClass2FI) r12
            int r1 = r12.A00
        L_0x01ee:
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            boolean r2 = X.C36361kB.A1b(r0, r1)
            java.lang.String r1 = r3.getQuantityString(r4, r1, r0)
            X.AnonymousClass00C.A08(r1)
            android.view.View r0 = r5.A00
            X.4t3 r0 = X.C99304t3.A01(r0, r1, r2)
            goto L_0x0155
        L_0x0205:
            boolean r0 = r12 instanceof X.AnonymousClass2FC
            if (r0 == 0) goto L_0x020e
            X.2FC r12 = (X.AnonymousClass2FC) r12
            int r1 = r12.A00
            goto L_0x01ee
        L_0x020e:
            X.2FB r12 = (X.AnonymousClass2FB) r12
            int r1 = r12.A00
            goto L_0x01ee
        L_0x0213:
            boolean r0 = r12 instanceof X.AnonymousClass2FI
            if (r0 == 0) goto L_0x021b
            r4 = 2131755208(0x7f1000c8, float:1.9141289E38)
            goto L_0x01e0
        L_0x021b:
            boolean r0 = r12 instanceof X.AnonymousClass2FC
            if (r0 == 0) goto L_0x0223
            r4 = 2131755207(0x7f1000c7, float:1.9141287E38)
            goto L_0x01e0
        L_0x0223:
            boolean r0 = r12 instanceof X.AnonymousClass2FG
            if (r0 == 0) goto L_0x087b
            r0 = 2131889922(0x7f120f02, float:1.9414521E38)
            goto L_0x014a
        L_0x022c:
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r5 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r5 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r5
            X.1wJ r3 = r5.A06
            java.util.ArrayList r2 = X.C36341k9.A0l(r12)
            r2.addAll(r12)
            java.util.List r1 = r3.A00
            X.1v7 r0 = new X.1v7
            r0.<init>(r1, r2)
            X.C36341k9.A1A(r0, r3, r2, r1)
            X.00T r3 = r5.A0G
            java.lang.Object r2 = r3.getValue()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r2
            X.05K r0 = r2.A0I
            java.lang.Object r1 = r0.getValue()
            X.2nP r0 = X.C51182nP.ADMIN
            if (r1 != r0) goto L_0x087b
            X.0yC r1 = r2.A07
            r0 = 5078(0x13d6, float:7.116E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x087b
            java.lang.Object r0 = r3.getValue()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x087b
            androidx.appcompat.widget.Toolbar r3 = r5.A02
            if (r3 == 0) goto L_0x087b
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131755192(0x7f1000b8, float:1.9141256E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.C36331k8.A1W(r0, r4)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r3.setSubtitle((java.lang.CharSequence) r0)
            goto L_0x087b
        L_0x0286:
            X.3Pz r12 = (X.C64923Pz) r12
            int r1 = r12.A00
            r0 = 1
            if (r1 == r0) goto L_0x030d
            r0 = 2
            if (r1 != r0) goto L_0x087b
            java.lang.Object r6 = r11.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r6 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r6
            X.1qm r5 = X.AnonymousClass3LW.A00(r6)
            r2 = 2131894694(0x7f1221a6, float:1.94242E38)
            r1 = 43
            X.2rZ r0 = new X.2rZ
            r0.<init>(r6, r1)
            r5.A0m(r6, r0, r2)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 17
            X.C39001qm.A0E(r5, r6, r0, r1)
            X.00T r0 = r6.A0V
            java.lang.Object r0 = r0.getValue()
            r4 = 0
            if (r0 == 0) goto L_0x0301
            r0 = 2131624094(0x7f0e009e, float:1.8875358E38)
            android.view.View r7 = android.view.View.inflate(r6, r0, r4)
            r5.A0j(r7)
            java.util.ArrayList r0 = r6.A3o()
            int r3 = r0.size()
            android.content.res.Resources r2 = r6.getResources()
            X.00T r0 = r6.A0T
            boolean r0 = X.C36331k8.A1b(r0)
            r1 = 2131755040(0x7f100020, float:1.9140948E38)
            if (r0 == 0) goto L_0x02da
            r1 = 2131755038(0x7f10001e, float:1.9140944E38)
        L_0x02da:
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.C36331k8.A1W(r0, r3)
            java.lang.String r0 = r2.getQuantityString(r1, r3, r0)
            r5.A0q(r0)
            r0 = 2131429587(0x7f0b08d3, float:1.848085E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r7, r0)
            if (r1 == 0) goto L_0x02fc
            X.3Bc r0 = r12.A01
            if (r0 == 0) goto L_0x02f9
            java.lang.CharSequence r4 = r0.A00(r6)
        L_0x02f9:
            r1.setText(r4)
        L_0x02fc:
            r5.A0b()
            goto L_0x087b
        L_0x0301:
            X.3Bc r0 = r12.A01
            if (r0 == 0) goto L_0x0309
            java.lang.CharSequence r4 = r0.A00(r6)
        L_0x0309:
            r5.A0p(r4)
            goto L_0x02fc
        L_0x030d:
            java.lang.Object r3 = r11.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r3 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r3
            X.1N2 r1 = r3.A0C
            android.widget.ListView r0 = r3.getListView()
            r1.A01(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.util.ArrayList r0 = r3.A3o()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r0)
            java.lang.String r0 = "contacts"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r3, r2)
            goto L_0x087b
        L_0x0330:
            X.011 r12 = (X.AnonymousClass011) r12
            java.lang.Object r2 = r11.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r12.first
            java.lang.Object r0 = r12.second
            r2.put(r1, r0)
            goto L_0x087b
        L_0x033f:
            X.3Pl r12 = (X.C64793Pl) r12
            android.graphics.Bitmap r2 = r12.A00
            if (r2 == 0) goto L_0x087b
            java.lang.Object r0 = r11.A00
            com.whatsapp.conversation.CustomStickerConfirmationDialog r0 = (com.whatsapp.conversation.CustomStickerConfirmationDialog) r0
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x087b
            r0 = 2131429352(0x7f0b07e8, float:1.8480374E38)
            android.widget.ImageView r0 = X.C36341k9.A0L(r1, r0)
            r0.setImageBitmap(r2)
            goto L_0x087b
        L_0x0359:
            java.util.AbstractList r12 = (java.util.AbstractList) r12
            boolean r0 = X.C36411kG.A1a(r12)
            if (r0 == 0) goto L_0x087b
            java.lang.Object r0 = r11.A00
            X.8Z7 r0 = (X.AnonymousClass8Z7) r0
            com.whatsapp.conversation.conversationrow.ConversationRowCatalogPreview r5 = r0.A0B
            r2 = 0
            int r1 = r12.size()
            r0 = 3
            if (r1 >= r0) goto L_0x0376
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x087b
        L_0x0376:
            r5.setVisibility(r2)
            r0 = 2131430309(0x7f0b0ba5, float:1.8482315E38)
            android.widget.ImageView r8 = X.C36341k9.A0L(r5, r0)
            r0 = 2131433696(0x7f0b18e0, float:1.8489185E38)
            android.widget.ImageView r7 = X.C36341k9.A0L(r5, r0)
            r0 = 2131434650(0x7f0b1c9a, float:1.849112E38)
            android.widget.ImageView r6 = X.C36341k9.A0L(r5, r0)
            r0 = 2131433743(0x7f0b190f, float:1.848928E38)
            android.view.View r4 = X.C36361kB.A0G(r5, r0)
            java.lang.Object r3 = r12.get(r2)
            X.AnonymousClass00C.A08(r3)
            X.9up r3 = (X.C207269up) r3
            r0 = 1
            java.lang.Object r2 = r12.get(r0)
            X.AnonymousClass00C.A08(r2)
            X.9up r2 = (X.C207269up) r2
            r0 = 2
            java.lang.Object r1 = r12.get(r0)
            X.AnonymousClass00C.A08(r1)
            X.9up r1 = (X.C207269up) r1
            X.1tm r0 = r5.A00
            if (r0 == 0) goto L_0x03b9
            r0.A0S(r8, r3)
        L_0x03b9:
            X.1tm r0 = r5.A00
            if (r0 == 0) goto L_0x03c0
            r0.A0S(r7, r2)
        L_0x03c0:
            X.1tm r0 = r5.A00
            if (r0 == 0) goto L_0x03c7
            r0.A0S(r6, r1)
        L_0x03c7:
            r0 = 13
            X.AnonymousClass3YF.A00(r8, r5, r3, r0)
            r0 = 11
            X.AnonymousClass3YF.A00(r7, r5, r2, r0)
            r0 = 12
            X.AnonymousClass3YF.A00(r6, r5, r1, r0)
            r0 = 28
            X.C66953Xy.A00(r4, r5, r0)
            goto L_0x087b
        L_0x03dd:
            X.3Pm r12 = (X.C64803Pm) r12
            java.lang.Object r0 = r11.A00
            com.whatsapp.event.EventsActivity r0 = (com.whatsapp.event.EventsActivity) r0
            java.util.List r3 = r12.A00
            if (r3 == 0) goto L_0x087b
            X.1w3 r2 = r0.A02
            if (r2 != 0) goto L_0x03f2
            java.lang.String r0 = "eventsAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f2:
            java.util.List r1 = r2.A00
            X.1v8 r0 = new X.1v8
            r0.<init>(r1, r3)
            X.C36341k9.A1A(r0, r2, r3, r1)
            goto L_0x087b
        L_0x03fe:
            X.3QB r12 = (X.AnonymousClass3QB) r12
            java.lang.Object r8 = r11.A00
            com.whatsapp.events.EventCreateOrEditFragment r8 = (com.whatsapp.events.EventCreateOrEditFragment) r8
            com.whatsapp.location.PlaceInfo r10 = r12.A03
            r7 = 8
            if (r10 == 0) goto L_0x0485
            com.whatsapp.WaTextView r9 = r8.A08
            if (r9 == 0) goto L_0x044c
            java.lang.String r1 = r10.A06
            if (r1 == 0) goto L_0x0418
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0449
        L_0x0418:
            java.lang.String r1 = r10.A04
            if (r1 == 0) goto L_0x0422
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0449
        L_0x0422:
            X.1Xa r0 = r8.A0G
            if (r0 == 0) goto L_0x047e
            double r5 = r10.A01
            double r2 = r10.A02
            java.lang.String r0 = "###.######"
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            r4.<init>(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r4.format(r5)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r4.format(r2)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0449:
            r9.setText(r1)
        L_0x044c:
            java.lang.String r0 = r10.A09
            r2 = 0
            if (r0 == 0) goto L_0x0476
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0476
            X.1RJ r0 = r8.A0Q
            if (r0 == 0) goto L_0x0466
            android.widget.TextView r1 = X.C36441kJ.A0V(r0)
            if (r1 == 0) goto L_0x0466
            java.lang.String r0 = r10.A09
            r1.setText(r0)
        L_0x0466:
            X.1RJ r0 = r8.A0Q
            if (r0 == 0) goto L_0x046d
            r0.A03(r2)
        L_0x046d:
            X.1RJ r0 = r8.A0R
            if (r0 == 0) goto L_0x087b
            r0.A03(r2)
            goto L_0x087b
        L_0x0476:
            X.1RJ r0 = r8.A0Q
            if (r0 == 0) goto L_0x046d
            r0.A03(r7)
            goto L_0x046d
        L_0x047e:
            java.lang.String r0 = "eventMessageManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0485:
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x048f
            r0 = 2131889358(0x7f120cce, float:1.9413377E38)
            r1.setText(r0)
        L_0x048f:
            X.1RJ r0 = r8.A0R
            if (r0 == 0) goto L_0x0496
            r0.A03(r7)
        L_0x0496:
            X.1RJ r0 = r8.A0Q
            if (r0 == 0) goto L_0x087b
            r0.A03(r7)
            goto L_0x087b
        L_0x049f:
            X.3Q2 r12 = (X.AnonymousClass3Q2) r12
            java.lang.Object r4 = r11.A00
            com.whatsapp.events.EventCreateOrEditFragment r4 = (com.whatsapp.events.EventCreateOrEditFragment) r4
            X.2oU r0 = r12.A00
            int r6 = r0.ordinal()
            r5 = 1
            r0 = 2
            r2 = 8
            if (r6 == r0) goto L_0x0508
            r3 = 0
            if (r6 == r3) goto L_0x04d9
            if (r6 == r5) goto L_0x04f6
            r1 = 4
            r0 = 2131887345(0x7f1204f1, float:1.9409294E38)
            if (r6 == r1) goto L_0x04c2
            r0 = 3
            if (r6 != r0) goto L_0x04f1
            r0 = 2131889362(0x7f120cd2, float:1.9413385E38)
        L_0x04c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x04d9
            int r1 = r0.intValue()
            X.1qm r0 = X.AnonymousClass3LW.A04(r4)
            r0.A0c(r1)
            X.C39001qm.A04(r4, r0)
            r0.A0b()
        L_0x04d9:
            com.whatsapp.WaTextView r1 = r4.A09
            if (r1 == 0) goto L_0x04e3
            r0 = 2131889360(0x7f120cd0, float:1.9413381E38)
            r1.setText(r0)
        L_0x04e3:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r4.A0U
            if (r0 == 0) goto L_0x04ea
            r0.setChecked(r3)
        L_0x04ea:
            X.1RJ r0 = r4.A0S
            if (r0 == 0) goto L_0x04f1
            r0.A03(r2)
        L_0x04f1:
            com.whatsapp.events.EventCreateOrEditFragment.A05(r4)
            goto L_0x087b
        L_0x04f6:
            X.1RJ r0 = r4.A0S
            if (r0 == 0) goto L_0x04fd
            r0.A03(r3)
        L_0x04fd:
            com.whatsapp.WaTextView r1 = r4.A09
            if (r1 == 0) goto L_0x04f1
            r0 = 2131889373(0x7f120cdd, float:1.9413408E38)
            r1.setText(r0)
            goto L_0x04f1
        L_0x0508:
            com.whatsapp.WaTextView r1 = r4.A09
            if (r1 == 0) goto L_0x0512
            r0 = 2131889360(0x7f120cd0, float:1.9413381E38)
            r1.setText(r0)
        L_0x0512:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r4.A0U
            if (r0 == 0) goto L_0x0519
            r0.setChecked(r5)
        L_0x0519:
            X.1RJ r0 = r4.A0S
            if (r0 == 0) goto L_0x0520
            r0.A03(r2)
        L_0x0520:
            X.2nU r3 = r12.A01
            X.1RJ r0 = r4.A0O
            if (r0 == 0) goto L_0x04f1
            android.view.View r2 = r0.A01()
            if (r2 == 0) goto L_0x04f1
            r0 = 2131430049(0x7f0b0aa1, float:1.8481788E38)
            android.widget.TextView r1 = X.C36341k9.A0M(r2, r0)
            X.2nU r0 = X.C51232nU.WA_VIDEO_CALL
            if (r3 != r0) goto L_0x0553
            r0 = 2131896550(0x7f1228e6, float:1.9427964E38)
            r1.setText(r0)
            com.whatsapp.WaImageView r1 = r4.A07
            if (r1 == 0) goto L_0x0547
            r0 = 2131233878(0x7f080c56, float:1.8083906E38)
        L_0x0544:
            r1.setImageResource(r0)
        L_0x0547:
            boolean r0 = r2.hasOnClickListeners()
            if (r0 != 0) goto L_0x04f1
            r0 = 49
            X.AnonymousClass3Y0.A01(r2, r4, r0)
            goto L_0x04f1
        L_0x0553:
            r0 = 2131896551(0x7f1228e7, float:1.9427966E38)
            r1.setText(r0)
            com.whatsapp.WaImageView r1 = r4.A07
            if (r1 == 0) goto L_0x0547
            r0 = 2131233880(0x7f080c58, float:1.808391E38)
            goto L_0x0544
        L_0x0561:
            X.3S4 r12 = (X.AnonymousClass3S4) r12
            java.lang.Object r6 = r11.A00
            com.whatsapp.events.EventInfoBottomSheet r6 = (com.whatsapp.events.EventInfoBottomSheet) r6
            X.2o0 r4 = r12.A01
            boolean r9 = r12.A04
            X.01z r0 = r6.A0k()
            r0.A0T()
            X.01z r0 = r6.A0k()
            int r0 = r0.A0I()
            r8 = 1
            r3 = 0
            r10 = 0
            if (r0 <= 0) goto L_0x0611
            X.01z r2 = r6.A0k()
            X.01z r0 = r6.A0k()
            int r1 = r0.A0I()
            int r1 = r1 - r8
            java.util.ArrayList r0 = r2.A0C
            java.lang.Object r7 = r0.get(r1)
            X.09X r7 = (X.AnonymousClass09X) r7
        L_0x0594:
            int r4 = r4.ordinal()
            r2 = 2
            if (r4 != r2) goto L_0x05fd
            X.0ts r5 = r6.A03
            if (r5 == 0) goto L_0x06ba
            android.content.Context r1 = r6.A0a()
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            X.4vb r1 = new X.4vb
            r1.<init>(r0, r5)
            com.whatsapp.WaImageView r0 = r6.A01
            if (r0 == 0) goto L_0x05b6
            r0.setImageDrawable(r1)
        L_0x05b6:
            com.whatsapp.WaImageView r5 = r6.A01
            if (r5 == 0) goto L_0x05c3
            r1 = 3
            X.3Y1 r0 = new X.3Y1
            r0.<init>(r6, r1)
        L_0x05c0:
            r5.setOnClickListener(r0)
        L_0x05c3:
            com.whatsapp.WaTextView r1 = r6.A02
            if (r4 != r2) goto L_0x05f7
            if (r1 == 0) goto L_0x05f4
            r0 = 2131888991(0x7f120b5f, float:1.9412633E38)
        L_0x05cc:
            r1.setText(r0)
        L_0x05cf:
            if (r4 == r3) goto L_0x05f1
            if (r4 == r8) goto L_0x05f1
            if (r4 == r2) goto L_0x05f4
            r5 = 0
        L_0x05d6:
            if (r7 == 0) goto L_0x05dd
            r0 = r7
            X.09Y r0 = (X.AnonymousClass09Y) r0
            java.lang.String r10 = r0.A0B
        L_0x05dd:
            boolean r0 = X.AnonymousClass00C.A0J(r10, r5)
            if (r0 != 0) goto L_0x087b
            if (r4 == r3) goto L_0x0689
            if (r4 == r8) goto L_0x0680
            if (r4 == r2) goto L_0x0613
            r0 = 3
            if (r4 != r0) goto L_0x087b
            r6.A1b()
            goto L_0x087b
        L_0x05f1:
            java.lang.String r5 = "EVENT_INFO_FRAGMENT"
            goto L_0x05d6
        L_0x05f4:
            java.lang.String r5 = "EVENT_CREATION_FRAGMENT"
            goto L_0x05d6
        L_0x05f7:
            if (r1 == 0) goto L_0x05cf
            r0 = 2131889388(0x7f120cec, float:1.9413438E38)
            goto L_0x05cc
        L_0x05fd:
            com.whatsapp.WaImageView r1 = r6.A01
            if (r1 == 0) goto L_0x0607
            r0 = 2131232176(0x7f0805b0, float:1.8080454E38)
            r1.setImageResource(r0)
        L_0x0607:
            com.whatsapp.WaImageView r5 = r6.A01
            if (r5 == 0) goto L_0x05c3
            X.3Y1 r0 = new X.3Y1
            r0.<init>(r6, r2)
            goto L_0x05c0
        L_0x0611:
            r7 = r10
            goto L_0x0594
        L_0x0613:
            X.09Y r8 = X.C36411kG.A0S(r6)
            if (r9 == 0) goto L_0x0628
            r3 = 2130772051(0x7f010053, float:1.714721E38)
            r2 = 2130772053(0x7f010055, float:1.7147214E38)
            r1 = 2130772050(0x7f010052, float:1.7147207E38)
            r0 = 2130772054(0x7f010056, float:1.7147216E38)
            r8.A06(r3, r2, r1, r0)
        L_0x0628:
            r7 = 2131430072(0x7f0b0ab8, float:1.8481835E38)
            X.00T r0 = r6.A05
            com.whatsapp.jid.Jid r1 = X.C36441kJ.A0m(r0)
            X.00T r0 = r6.A08
            long r2 = X.C36351kA.A08(r0)
            X.1uu r0 = r6.A04
            if (r0 != 0) goto L_0x0642
            java.lang.String r0 = "eventInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0642:
            X.05K r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.3S4 r0 = (X.AnonymousClass3S4) r0
            X.2bT r0 = r0.A00
            if (r0 == 0) goto L_0x0652
            X.3Qa r4 = r0.A1J
            if (r4 != 0) goto L_0x065d
        L_0x0652:
            X.00T r0 = r6.A07
            java.lang.Object r4 = r0.getValue()
            X.3Qa r4 = (X.C64933Qa) r4
            X.AnonymousClass00C.A08(r4)
        L_0x065d:
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.os.Bundle r1 = X.C36331k8.A07(r1)
            java.lang.String r0 = "extra_quoted_message_row_id"
            r1.putLong(r0, r2)
            X.AnonymousClass3UJ.A08(r1, r4)
            com.whatsapp.events.EventCreateOrEditFragment r0 = new com.whatsapp.events.EventCreateOrEditFragment
            r0.<init>()
            r0.A17(r1)
            r8.A0B(r0, r7)
            r8.A0J(r5)
            r8.A01()
            goto L_0x087b
        L_0x0680:
            X.01z r0 = r6.A0k()
            r0.A0V()
            goto L_0x087b
        L_0x0689:
            if (r7 != 0) goto L_0x087b
            X.09Y r2 = X.C36411kG.A0S(r6)
            r1 = 2131430072(0x7f0b0ab8, float:1.8481835E38)
            com.whatsapp.events.EventInfoFragment r0 = new com.whatsapp.events.EventInfoFragment
            r0.<init>()
            r2.A0B(r0, r1)
            r2.A0J(r5)
            r2.A01()
            X.00T r0 = r6.A06
            java.lang.Object r1 = r0.getValue()
            X.2o0 r0 = X.C51552o0.EDIT
            if (r1 != r0) goto L_0x087b
            X.1uu r0 = r6.A04
            if (r0 != 0) goto L_0x06b5
            java.lang.String r0 = "eventInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06b5:
            r0.A0S(r3)
            goto L_0x087b
        L_0x06ba:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x06bf:
            X.3S4 r12 = (X.AnonymousClass3S4) r12
            X.2bT r5 = r12.A00
            if (r5 == 0) goto L_0x06fb
            java.lang.Object r4 = r11.A00
            com.whatsapp.events.EventInfoFragment r4 = (com.whatsapp.events.EventInfoFragment) r4
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x070c
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A09
            if (r1 == 0) goto L_0x06d5
            r0 = 0
            r1.setEnabled(r0)
        L_0x06d5:
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A09
            if (r1 == 0) goto L_0x06df
            r0 = 2131889370(0x7f120cda, float:1.9413402E38)
            r1.setText(r0)
        L_0x06df:
            r1 = 131072(0x20000, float:1.83671E-40)
            int r0 = r5.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x06fb
            X.02l r0 = r4.A0A
            if (r0 == 0) goto L_0x07ac
            X.041 r2 = X.C009403z.A02(r0)
            r1 = 0
            com.whatsapp.events.EventInfoFragment$cancelEventNotification$1 r0 = new com.whatsapp.events.EventInfoFragment$cancelEventNotification$1
            r0.<init>(r5, r4, r1)
            X.C36331k8.A1T(r0, r2)
        L_0x06fb:
            java.lang.Object r2 = r11.A00
            com.whatsapp.events.EventInfoFragment r2 = (com.whatsapp.events.EventInfoFragment) r2
            java.util.List r1 = r12.A02
            java.util.List r0 = r12.A03
            X.1wL r3 = r2.A07
            if (r3 != 0) goto L_0x079c
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x070c:
            X.2p2 r1 = r5.A02
            X.2p2 r0 = X.C52192p2.VALID
            boolean r0 = X.C36361kB.A1a(r1, r0)
            r3 = 8
            if (r0 == 0) goto L_0x078c
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0744
            X.0yC r2 = r4.A08
            if (r2 == 0) goto L_0x07b3
            X.0yV r1 = X.C21000yV.A01
            r0 = 7357(0x1cbd, float:1.031E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x078c
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A09
            if (r1 == 0) goto L_0x0736
            r0 = 2131888991(0x7f120b5f, float:1.9412633E38)
            r1.setText(r0)
        L_0x0736:
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A09
            if (r2 == 0) goto L_0x06df
            r0 = 37
            X.2hy r1 = X.C48742hy.A00(r4, r0)
        L_0x0740:
            r2.setOnClickListener(r1)
            goto L_0x06df
        L_0x0744:
            X.1Xa r0 = r4.A05
            if (r0 == 0) goto L_0x07bf
            boolean r0 = r0.A04(r5)
            if (r0 != 0) goto L_0x078c
            X.1Xa r0 = r4.A05
            if (r0 == 0) goto L_0x07b8
            X.2bd r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x075c
            X.2pC r3 = r0.A01
            if (r3 != 0) goto L_0x075e
        L_0x075c:
            X.2pC r3 = X.C52292pC.UNKNOWN
        L_0x075e:
            int r2 = r3.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x0784
            r0 = 2
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A09
            if (r2 == r0) goto L_0x077e
            if (r1 == 0) goto L_0x0772
            r0 = 2131889410(0x7f120d02, float:1.9413483E38)
        L_0x076f:
            r1.setText(r0)
        L_0x0772:
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A09
            if (r2 == 0) goto L_0x06df
            r0 = 21
            X.2iI r1 = new X.2iI
            r1.<init>(r5, r3, r4, r0)
            goto L_0x0740
        L_0x077e:
            if (r1 == 0) goto L_0x0772
            r0 = 2131889401(0x7f120cf9, float:1.9413465E38)
            goto L_0x076f
        L_0x0784:
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A09
            if (r1 == 0) goto L_0x0772
            r0 = 2131889385(0x7f120ce9, float:1.9413432E38)
            goto L_0x076f
        L_0x078c:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A09
            if (r0 == 0) goto L_0x0793
            r0.setVisibility(r3)
        L_0x0793:
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x06df
            r0.setVisibility(r3)
            goto L_0x06df
        L_0x079c:
            java.util.ArrayList r2 = X.C007103b.A0S(r0, r1)
            java.util.List r1 = r3.A00
            X.1v9 r0 = new X.1v9
            r0.<init>(r1, r2)
            X.C36341k9.A1A(r0, r3, r2, r1)
            goto L_0x087b
        L_0x07ac:
            java.lang.String r0 = "ioDispatcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07b3:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x07b8:
            java.lang.String r0 = "eventMessageManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07bf:
            java.lang.String r0 = "eventMessageManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07c6:
            X.2Ve r0 = X.C46132Ve.A00
            boolean r0 = X.AnonymousClass00C.A0J(r12, r0)
            if (r0 == 0) goto L_0x07e6
            r0 = 2131888229(0x7f120865, float:1.9411087E38)
        L_0x07d1:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.Object r0 = r11.A00
            X.14u r0 = (X.C225314u) r0
            int r2 = r1.intValue()
            X.17Y r1 = r0.A05
            r0 = 0
            r1.A06(r2, r0)
            goto L_0x087b
        L_0x07e6:
            X.2Vf r0 = X.C46142Vf.A00
            boolean r0 = X.AnonymousClass00C.A0J(r12, r0)
            if (r0 == 0) goto L_0x07f2
            r0 = 2131889290(0x7f120c8a, float:1.941324E38)
            goto L_0x07d1
        L_0x07f2:
            X.2Vg r0 = X.C46152Vg.A00
            boolean r0 = X.AnonymousClass00C.A0J(r12, r0)
            if (r0 == 0) goto L_0x07fe
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            goto L_0x07d1
        L_0x07fe:
            X.2Vh r0 = X.C46162Vh.A00
            boolean r0 = X.AnonymousClass00C.A0J(r12, r0)
            if (r0 != 0) goto L_0x087b
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x080b:
            X.3IR r12 = (X.AnonymousClass3IR) r12
            java.lang.Object r0 = r11.A00
            com.whatsapp.group.HistorySettingActivity r0 = (com.whatsapp.group.HistorySettingActivity) r0
            androidx.appcompat.widget.SwitchCompat r1 = r0.A00
            if (r1 == 0) goto L_0x087b
            boolean r0 = r12.A00
            r1.setChecked(r0)
            boolean r0 = r12.A01
            r1.setEnabled(r0)
            goto L_0x087b
        L_0x0820:
            java.lang.Object r1 = r11.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            boolean r0 = r12 instanceof X.C48582hY
            if (r0 == 0) goto L_0x083b
            r2 = 2131891495(0x7f121527, float:1.9417712E38)
        L_0x082b:
            X.01I r1 = r1.A0h()
            boolean r0 = r1 instanceof X.C225314u
            if (r0 == 0) goto L_0x087b
            X.14u r1 = (X.C225314u) r1
            if (r1 == 0) goto L_0x087b
            r1.BO5(r2)
            goto L_0x087b
        L_0x083b:
            boolean r0 = r12 instanceof X.C48572hX
            if (r0 == 0) goto L_0x0843
            r2 = 2131889676(0x7f120e0c, float:1.9414022E38)
            goto L_0x082b
        L_0x0843:
            boolean r0 = r12 instanceof X.C48592hZ
            if (r0 == 0) goto L_0x0880
            r2 = 2131895196(0x7f12239c, float:1.9425218E38)
            goto L_0x082b
        L_0x084b:
            monitor-exit(r1)
            if (r0 != 0) goto L_0x087b
            java.lang.String r1 = r12.A00()
            java.lang.Object r3 = r11.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r3 = (com.whatsapp.updates.viewmodels.SearchUsecase) r3
            X.3Ds r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x087e
            java.lang.String r0 = r0.A00()
        L_0x085f:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x087b
            java.lang.String r0 = r12.A00()
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 != 0) goto L_0x087b
            X.1Zi r1 = r3.A08
            java.lang.String r0 = r12.A00()
            X.2YD r0 = r1.A00(r3, r0, r2)
            r3.A01 = r0
        L_0x087b:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        L_0x087e:
            r0 = r2
            goto L_0x085f
        L_0x0880:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z8.B6N(java.lang.Object, X.09x):java.lang.Object");
    }
}

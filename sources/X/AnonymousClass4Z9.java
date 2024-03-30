package X;

/* renamed from: X.4Z9  reason: invalid class name */
public class AnonymousClass4Z9 implements AnonymousClass05G {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4Z9(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0327, code lost:
        r1.setValue(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B6N(java.lang.Object r15, X.C023509x r16) {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0098;
                case 2: goto L_0x00de;
                case 3: goto L_0x0156;
                case 4: goto L_0x0181;
                case 5: goto L_0x029a;
                case 6: goto L_0x02e1;
                case 7: goto L_0x032c;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3QB r15 = (X.AnonymousClass3QB) r15
            java.lang.Object r0 = r14.A00
            if (r0 != 0) goto L_0x004c
            java.lang.Object r4 = r14.A01
            com.whatsapp.events.EventCreateOrEditFragment r4 = (com.whatsapp.events.EventCreateOrEditFragment) r4
            X.2bT r3 = r15.A01
            if (r3 == 0) goto L_0x004c
            com.whatsapp.WaEditText r1 = r4.A06
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = r3.A05
            r1.setText(r0)
        L_0x001c:
            com.whatsapp.WaEditText r1 = r4.A04
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = r3.A03
            r1.setText(r0)
        L_0x0025:
            X.00T r0 = r4.A0Y
            java.lang.Object r2 = X.C36381kD.A0p(r0)
            java.util.Calendar r2 = (java.util.Calendar) r2
            long r0 = r3.A00
            r2.setTimeInMillis(r0)
            com.whatsapp.events.EventCreateOrEditFragment.A05(r4)
            com.whatsapp.events.EventCreateOrEditFragment.A03(r4)
            com.whatsapp.WaEditText r0 = r4.A06
            if (r0 == 0) goto L_0x003f
            r0.requestFocus()
        L_0x003f:
            com.whatsapp.WaEditText r1 = r4.A06
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = r3.A05
            int r0 = r0.length()
            r1.setSelection(r0)
        L_0x004c:
            X.0AJ r5 = X.AnonymousClass0AJ.A00
            return r5
        L_0x004f:
            r3 = r16
            boolean r0 = r3 instanceof X.C82543ys
            if (r0 == 0) goto L_0x0072
            r4 = r3
            X.3ys r4 = (X.C82543ys) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r4.label = r2
        L_0x0063:
            java.lang.Object r1 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r3) goto L_0x03f4
            X.AnonymousClass0AN.A00(r1)
            goto L_0x004c
        L_0x0072:
            X.3ys r4 = new X.3ys
            r4.<init>(r14, r3)
            goto L_0x0063
        L_0x0078:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r2 = r14.A00
            X.05G r2 = (X.AnonymousClass05G) r2
            java.util.Map r15 = (java.util.Map) r15
            java.util.Collection r1 = r15.values()
            java.lang.Object r0 = r14.A01
            com.whatsapp.community.CommunityMembersViewModel r0 = (com.whatsapp.community.CommunityMembersViewModel) r0
            X.3x7 r0 = r0.A0F
            java.util.List r0 = X.C007103b.A0c(r1, r0)
            r4.label = r3
            java.lang.Object r0 = r2.B6N(r0, r4)
            if (r0 != r5) goto L_0x004c
            return r5
        L_0x0098:
            X.2nP r15 = (X.C51182nP) r15
            java.lang.Object r6 = r14.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r6 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r6
            java.lang.Object r5 = r14.A00
            com.whatsapp.WaTextView r5 = (com.whatsapp.WaTextView) r5
            X.AnonymousClass00C.A07(r5)
            int r1 = r15.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00b6
            r0 = 1
            if (r1 != r0) goto L_0x004c
            r0 = 2131890966(0x7f121316, float:1.9416639E38)
            r5.setText(r0)
            goto L_0x004c
        L_0x00b6:
            X.1e1 r4 = r6.A04
            if (r4 == 0) goto L_0x03f9
            android.content.Context r3 = r5.getContext()
            r0 = 2131890965(0x7f121315, float:1.9416637E38)
            java.lang.String r2 = r6.getString(r0)
            r0 = 29
            X.3wS r1 = new X.3wS
            r1.<init>((java.lang.Object) r6, (int) r0)
            java.lang.String r0 = "community_settings_link"
            android.text.SpannableStringBuilder r0 = r4.A02(r3, r1, r2, r0)
            r5.setText(r0)
            X.0yC r0 = r5.getAbProps()
            X.C36331k8.A0z(r5, r6, r0)
            goto L_0x004c
        L_0x00de:
            X.2nO r15 = (X.C51172nO) r15
            int r2 = r15.ordinal()
            r4 = 0
            r1 = 8
            if (r2 == r4) goto L_0x0144
            r0 = 1
            if (r2 != r0) goto L_0x004c
            java.lang.Object r0 = r14.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r3 = r14.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r3 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r3
            X.00T r0 = r3.A0F
            X.C36341k9.A1R(r0, r4)
            X.00T r2 = r3.A0G
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            X.05K r0 = r0.A0I
            java.lang.Object r1 = r0.getValue()
            X.2nP r0 = X.C51182nP.MEMBER
            if (r1 == r0) goto L_0x004c
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            int r2 = r0.A00
            X.00T r0 = r3.A0D
            java.lang.Object r1 = r0.getValue()
            X.1RJ r1 = (X.AnonymousClass1RJ) r1
            if (r2 == 0) goto L_0x0127
            r0 = 8
            r1.A03(r0)
            goto L_0x004c
        L_0x0127:
            r1.A03(r4)
            X.00T r0 = r3.A0C
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891632(0x7f1215b0, float:1.941799E38)
            r1.setText(r0)
            X.00T r0 = r3.A0B
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891631(0x7f1215af, float:1.9417988E38)
            r1.setText(r0)
            goto L_0x004c
        L_0x0144:
            java.lang.Object r0 = r14.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            java.lang.Object r0 = r14.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            X.00T r0 = r0.A0F
            X.C36341k9.A1R(r0, r1)
            goto L_0x004c
        L_0x0156:
            X.2nP r15 = (X.C51182nP) r15
            java.lang.Object r4 = r14.A01
            X.14p r4 = (X.C224914p) r4
            java.lang.Object r3 = r14.A00
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            X.AnonymousClass00C.A07(r3)
            int r2 = r15.ordinal()
            r1 = 0
            r0 = 2131890956(0x7f12130c, float:1.9416618E38)
            if (r2 == r1) goto L_0x0173
            r0 = 1
            if (r2 != r0) goto L_0x03fe
            r0 = 2131890963(0x7f121313, float:1.9416633E38)
        L_0x0173:
            X.0ts r1 = r4.A00
            X.AnonymousClass00C.A07(r1)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)
            X.C55712v4.A00(r4, r3, r1, r0)
            goto L_0x004c
        L_0x0181:
            X.3QM r15 = (X.AnonymousClass3QM) r15
            java.lang.Object r5 = r14.A01
            com.whatsapp.conversation.CommentsBottomSheet r5 = (com.whatsapp.conversation.CommentsBottomSheet) r5
            X.1vY r0 = r5.A07
            if (r0 != 0) goto L_0x0190
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x0190:
            java.util.List r4 = r15.A04
            r0.A0M(r4)
            java.lang.Object r1 = r14.A00
            android.view.View r1 = (android.view.View) r1
            int r7 = r15.A00
            r0 = 2131429777(0x7f0b0991, float:1.8481236E38)
            android.view.View r3 = X.C36361kB.A0G(r1, r0)
            r0 = 2131428922(0x7f0b063a, float:1.8479502E38)
            X.1RJ r6 = X.C36341k9.A0X(r1, r0)
            r1 = 8
            r0 = 3
            if (r7 != r0) goto L_0x0207
            r3.setVisibility(r1)
            r6.A03(r1)
        L_0x01b4:
            boolean r2 = r15.A05
            X.00T r0 = r5.A0a
            android.view.View r1 = X.C36401kF.A0F(r0)
            if (r1 == 0) goto L_0x01c5
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
        L_0x01c5:
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L_0x01e4
            X.00T r1 = r5.A0Z
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0By r0 = r0.A0H
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0 = 0
        L_0x01df:
            r1.setItemAnimator(r0)
            goto L_0x004c
        L_0x01e4:
            if (r1 <= r0) goto L_0x004c
            X.00T r1 = r5.A0Z
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0By r0 = r0.A0H
            if (r0 != 0) goto L_0x004c
            java.lang.Object r0 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            int r0 = r0.getScrollState()
            if (r0 != 0) goto L_0x004c
            java.lang.Object r1 = r1.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.0C0 r0 = r5.A0R
            goto L_0x01df
        L_0x0207:
            r2 = 1
            r9 = 0
            if (r7 != r2) goto L_0x0255
            r3.setVisibility(r9)
            r6.A03(r1)
        L_0x0211:
            android.view.View r1 = r6.A01()
            r0 = 2131428910(0x7f0b062e, float:1.8479478E38)
            com.whatsapp.WaTextView r3 = X.C36411kG.A0Z(r1, r0)
            r0 = 2
            r1 = 2131887538(0x7f1205b2, float:1.9409686E38)
            if (r7 == r0) goto L_0x0295
            r0 = 4
            r1 = 2131888631(0x7f1209f7, float:1.9411903E38)
            if (r7 == r0) goto L_0x0295
            r0 = 5
            if (r7 == r0) goto L_0x025c
            r0 = 6
            if (r7 != r0) goto L_0x01b4
            X.0ts r10 = r5.A0B
            if (r10 == 0) goto L_0x040d
            r8 = 2131755033(0x7f100019, float:1.9140934E38)
            X.0yC r0 = r5.A0H
            if (r0 == 0) goto L_0x0408
            r7 = 4728(0x1278, float:6.625E-42)
            long r0 = X.C36441kJ.A0B(r0, r7)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0yC r2 = r5.A0H
            if (r2 == 0) goto L_0x0403
            int r2 = r2.A07(r7)
            X.AnonymousClass000.A1L(r6, r2, r9)
            java.lang.String r0 = r10.A0L(r6, r8, r0)
            r3.setText(r0)
            goto L_0x01b4
        L_0x0255:
            r3.setVisibility(r1)
            r6.A03(r9)
            goto L_0x0211
        L_0x025c:
            X.1e1 r8 = r5.A0L
            if (r8 == 0) goto L_0x041c
            android.view.View r0 = r6.A01()
            android.content.Context r7 = r0.getContext()
            android.view.View r0 = r6.A01()
            android.content.Context r6 = r0.getContext()
            r1 = 2131894755(0x7f1221e3, float:1.9424324E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "learn-more"
            java.lang.String r1 = X.C36391kE.A0v(r6, r2, r0, r9, r1)
            r0 = 16
            X.3v3 r0 = X.C80223v3.A00(r5, r0)
            android.text.SpannableStringBuilder r0 = r8.A02(r7, r0, r1, r2)
            r3.setText(r0)
            X.0yC r1 = r5.A0H
            if (r1 == 0) goto L_0x0417
            X.0yb r0 = r5.A08
            if (r0 == 0) goto L_0x0412
            X.C33521fV.A08(r3, r0, r1)
            goto L_0x01b4
        L_0x0295:
            r3.setText(r1)
            goto L_0x01b4
        L_0x029a:
            boolean r0 = X.AnonymousClass000.A1X(r15)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r3 = r14.A01
            X.8Z7 r3 = (X.AnonymousClass8Z7) r3
            X.141 r0 = r3.A03
            com.whatsapp.jid.UserJid r7 = X.C36351kA.A0l(r0)
            if (r7 == 0) goto L_0x02d6
            X.9Qd r2 = r3.A0E
            X.9Wc r1 = r3.A02
            r0 = 8
            r2.A00(r1, r7, r0)
            X.9Y1 r1 = r3.A0e
            r0 = 22
            r1.A01(r0)
            X.9R0 r0 = r3.getCatalogHomepageQplLogger()
            r0.A00()
            X.9XI r5 = r3.A0c
            X.155 r4 = r3.A0A
            X.9fJ r6 = r3.A0g
            X.3ty r0 = r5.A02(r7)
            r8 = 1
            X.3Vq r3 = new X.3Vq
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0A(r3)
        L_0x02d6:
            java.lang.Object r0 = r14.A00
            X.1tm r0 = (X.C39791tm) r0
            X.05L r1 = r0.A03
            java.lang.Boolean r0 = X.C36381kD.A0j()
            goto L_0x0327
        L_0x02e1:
            X.9up r15 = (X.C207269up) r15
            if (r15 == 0) goto L_0x004c
            java.lang.Object r2 = r14.A01
            X.8Z7 r2 = (X.AnonymousClass8Z7) r2
            X.141 r0 = r2.A03
            com.whatsapp.jid.UserJid r6 = X.C36351kA.A0l(r0)
            if (r6 == 0) goto L_0x0320
            X.9Qd r3 = r2.A0E
            X.9Wc r1 = r2.A02
            r0 = 7
            r3.A00(r1, r6, r0)
            X.0wQ r0 = r2.A0T
            boolean r11 = r0.A0M(r6)
            X.9Y1 r1 = r2.A0e
            r0 = 22
            r1.A01(r0)
            X.9R0 r0 = r2.getCatalogHomepageQplLogger()
            r0.A00()
            android.content.Context r3 = r2.getContext()
            java.lang.String r9 = r15.A0F
            r13 = 0
            r10 = 10
            r7 = 0
            X.9XI r4 = r2.A0c
            X.9fJ r5 = r2.A0g
            r8 = r7
            r12 = r11
            X.AnonymousClass3SM.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0320:
            java.lang.Object r0 = r14.A00
            X.1tm r0 = (X.C39791tm) r0
            X.05L r1 = r0.A04
            r0 = 0
        L_0x0327:
            r1.setValue(r0)
            goto L_0x004c
        L_0x032c:
            java.util.Collection r15 = (java.util.Collection) r15
            if (r15 == 0) goto L_0x0336
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0379
        L_0x0336:
            java.lang.Object r2 = r14.A01
            X.1uV r2 = (X.C40001uV) r2
            X.3Sj r0 = r2.A00
            if (r0 != 0) goto L_0x0345
            java.lang.String r0 = "commentListManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0345:
            java.util.concurrent.atomic.AtomicReference r0 = r0.A05
            java.lang.Object r1 = r0.get()
            X.2oI r0 = X.C51732oI.COMPLETE
            if (r1 != r0) goto L_0x0379
            X.05L r4 = r2.A0Q
        L_0x0351:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.3QM r2 = (X.AnonymousClass3QM) r2
            r1 = -1
            X.2HY r0 = new X.2HY
            r0.<init>(r1)
            java.util.List r9 = X.C36371kC.A11(r0)
            X.141 r7 = r2.A02
            X.3T1 r8 = r2.A03
            int r10 = r2.A00
            boolean r11 = r2.A05
            X.3J2 r6 = r2.A01
            X.3QM r5 = new X.3QM
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r4.B3B(r3, r5)
            if (r0 == 0) goto L_0x0351
            goto L_0x004c
        L_0x0379:
            X.AnonymousClass00C.A0B(r15)
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r14.A01
            X.1uV r2 = (X.C40001uV) r2
            java.util.ArrayList r3 = X.C36321k7.A0J(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x0390:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a5
            X.3T1 r0 = X.C36391kE.A0l(r1)
            X.AnonymousClass00C.A0B(r0)
            X.31B r0 = X.C40001uV.A02(r2, r0)
            r3.add(r0)
            goto L_0x0390
        L_0x03a5:
            java.util.ArrayList r7 = X.C36361kB.A0q(r3)
            X.0wQ r0 = r2.A04
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x03ce
            java.lang.Object r0 = r14.A00
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Kx r0 = r0.A0P()
            if (r0 == 0) goto L_0x03f2
            int r1 = r0.A00()
        L_0x03bf:
            int r0 = r15.size()
            if (r1 <= r0) goto L_0x03ce
            r1 = -1
            X.2HZ r0 = new X.2HZ
            r0.<init>(r1)
            r7.add(r0)
        L_0x03ce:
            X.05L r2 = r2.A0Q
        L_0x03d0:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.3QM r0 = (X.AnonymousClass3QM) r0
            X.141 r5 = r0.A02
            X.3T1 r6 = r0.A03
            int r8 = r0.A00
            boolean r9 = r0.A05
            X.3J2 r4 = r0.A01
            r0 = 2
            X.AnonymousClass00C.A0D(r7, r0)
            X.3QM r3 = new X.3QM
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.B3B(r1, r3)
            if (r0 == 0) goto L_0x03d0
            goto L_0x004c
        L_0x03f2:
            r1 = 0
            goto L_0x03bf
        L_0x03f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x03f9:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x03fe:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0403:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0408:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x040d:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0412:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0417:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x041c:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z9.B6N(java.lang.Object, X.09x):java.lang.Object");
    }
}

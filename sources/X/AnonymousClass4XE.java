package X;

import android.widget.RadioGroup;

/* renamed from: X.4XE  reason: invalid class name */
public class AnonymousClass4XE implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XE(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.RadioGroup r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x00ad;
                case 2: goto L_0x0113;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r6 = r7.A01
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r6 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.view.View r1 = X.C012005e.A02(r1, r9)
            boolean r0 = r1 instanceof android.widget.RadioButton
            if (r0 == 0) goto L_0x0156
            if (r1 == 0) goto L_0x0156
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0156
            java.lang.Object r5 = r1.getTag()
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            X.2ps[] r4 = X.C52612ps.values()
            r2 = 0
            int r1 = r4.length
        L_0x0033:
            if (r2 >= r1) goto L_0x0044
            r3 = r4[r2]
            java.lang.String r0 = r3.name()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 != 0) goto L_0x0046
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0044:
            X.2ps r3 = X.C39991uS.A0C
        L_0x0046:
            X.1uS r2 = r6.A01
            if (r2 != 0) goto L_0x004f
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x004f:
            r2.A00 = r3
            X.0wU r1 = r2.A07
            r0 = 29
            X.C36391kE.A1S(r1, r2, r3, r0)
            return
        L_0x0059:
            java.lang.Object r4 = r7.A00
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r4 = (com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet) r4
            java.lang.Object r3 = r7.A01
            android.view.View r3 = (android.view.View) r3
            r2 = 0
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0156
            r0 = 2131432124(0x7f0b12bc, float:1.8485997E38)
            if (r9 != r0) goto L_0x0089
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r4.A03
            if (r0 == 0) goto L_0x0072
            r0.setEnabled(r2)
        L_0x0072:
            X.00T r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r1 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r1
            X.147 r0 = r1.A02
            if (r0 == 0) goto L_0x014a
            X.1uw r1 = r1.A01
            if (r1 != 0) goto L_0x0146
            java.lang.String r0 = "cagSettingsViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0089:
            r0 = 2131432125(0x7f0b12bd, float:1.8485999E38)
            if (r9 != r0) goto L_0x014a
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r4.A02
            if (r0 == 0) goto L_0x0095
            r0.setEnabled(r2)
        L_0x0095:
            X.00T r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r1 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r1
            r2 = 1
            X.147 r0 = r1.A02
            if (r0 == 0) goto L_0x014a
            X.1uw r1 = r1.A01
            if (r1 != 0) goto L_0x0146
            java.lang.String r0 = "cagSettingsViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ad:
            java.lang.Object r5 = r7.A00
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r5 = (com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet) r5
            java.lang.Object r4 = r7.A01
            android.view.View r4 = (android.view.View) r4
            r6 = 0
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0156
            r0 = 2131432127(0x7f0b12bf, float:1.8486003E38)
            if (r9 != r0) goto L_0x00de
            X.00T r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r0 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r0
            r0.A0S(r6)
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r5.A07
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            r0.setEnabled(r6)
        L_0x00d1:
            r0 = 27
            X.3wS r2 = new X.3wS
            r2.<init>((java.lang.Object) r5, (int) r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            return
        L_0x00de:
            r0 = 2131432128(0x7f0b12c0, float:1.8486005E38)
            if (r9 != r0) goto L_0x00d1
            X.1T4 r0 = r5.A02
            if (r0 == 0) goto L_0x010c
            X.0yC r1 = r0.A00
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r1 = r1.A0E(r0)
            X.00T r0 = r5.A0B
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r3 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r3
            if (r1 == 0) goto L_0x0107
            X.147 r2 = r3.A03
            if (r2 == 0) goto L_0x0104
            X.0wU r1 = r3.A0C
            r0 = 20
            X.C80263v7.A00(r1, r3, r2, r0)
        L_0x0104:
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r5.A06
            goto L_0x00cc
        L_0x0107:
            r0 = 1
            r3.A0S(r0)
            goto L_0x0104
        L_0x010c:
            java.lang.String r0 = "communityABPropsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0113:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r7.A01
            com.whatsapp.mute.ui.MuteDialogFragment r2 = (com.whatsapp.mute.ui.MuteDialogFragment) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.view.View r1 = r1.findViewById(r9)
            boolean r0 = r1 instanceof android.widget.RadioButton
            if (r0 == 0) goto L_0x0156
            if (r1 == 0) goto L_0x0156
            java.lang.Object r1 = r1.getTag()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0156
            X.2pb r1 = X.C52542pb.valueOf(r1)
            if (r1 == 0) goto L_0x0156
            X.00T r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            r0.A01 = r1
            return
        L_0x0146:
            r0 = 4
            r1.Bwz(r0, r2)
        L_0x014a:
            r0 = 26
            X.3wS r2 = new X.3wS
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XE.onCheckedChanged(android.widget.RadioGroup, int):void");
    }
}

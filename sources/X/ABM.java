package X;

public class ABM implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        if (r8 instanceof AnonymousClass5J7) {
            AnonymousClass8NL r5 = r7.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r5);
            boolean z = ((AnonymousClass5J7) r8).A00;
            C172348Nm r0 = ((AnonymousClass8SQ) A0J.A00).initialSecurityNotificationSettingSync_;
            if (r0 == null) {
                r0 = C172348Nm.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            C172348Nm r1 = (C172348Nm) C90524aI.A0H(A0q);
            int i = C172348Nm.SECURITY_NOTIFICATION_ENABLED_FIELD_NUMBER;
            r1.bitField0_ |= 1;
            r1.securityNotificationEnabled_ = z;
            A0J.A0U(AnonymousClass91G.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC);
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(A0J);
            C172348Nm r02 = (C172348Nm) A0q.A0R();
            r02.getClass();
            A0A.initialSecurityNotificationSettingSync_ = r02;
            A0A.bitField0_ |= 128;
            r5.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08(C165567td.A0W(r8, "Message type is not supported ", AnonymousClass000.A0u()));
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        if (AnonymousClass97T.A00(r5) != AnonymousClass91G.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC) {
            return null;
        }
        AnonymousClass5J7 r1 = new AnonymousClass5J7(r5.A0C, r5.A04);
        C172348Nm r0 = C170918Hz.A0L(r5).initialSecurityNotificationSettingSync_;
        if (r0 == null) {
            r0 = C172348Nm.DEFAULT_INSTANCE;
        }
        r1.A00 = r0.securityNotificationEnabled_;
        return r1;
    }
}

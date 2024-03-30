package X;

/* renamed from: X.5Tu  reason: invalid class name and case insensitive filesystem */
public enum C108515Tu {
    A0J(r8, "REGISTRATION_FULL", 0, 0),
    A0A(r8, "INTERACTIVE_FULL", 1, 1),
    A08(r8, "INTERACTIVE_DELTA", 2, 2),
    A03(r8, "BACKGROUND_FULL", 3, 3),
    A02(r8, "BACKGROUND_DELTA", 4, 4),
    A0G(r32, "NOTIFICATION_CONTACT", 5, 5),
    A0C(r32, "INTERACTIVE_QUERY", 6, 6),
    A0I(r42, "NOTIFICATION_SIDELIST", 7, 7),
    A09(r42, "INTERACTIVE_DELTA_SIDELIST", 8, 8),
    A01(r32, "ADD_QUERY", 9, 9),
    A06(r48, "BACKGROUND_QUERY_PICTURES", 10, 16),
    A07(r48, "BACKGROUND_QUERY_PICTURES_PREVIEW", 11, 17),
    A05(r48, "BACKGROUND_MULTI_PROTOCOL_QUERY", 12, 21),
    A04(r48, "BACKGROUND_FULL_MULTI_PROTOCOL_QUERY", 13, 22),
    A0K(r48, "REGISTRATION_FULL_MULTI_PROTOCOL_QUERY", 14, 23),
    A0B(r48, "INTERACTIVE_MULTI_PROTOCOL_QUERY", 15, 24),
    A0F(r48, "MESSAGE_MULTI_PROTOCOL_QUERY", 16, 25),
    A0L(r48, "VOIP_MULTI_PROTOCOL_QUERY", 17, 26),
    A0H(r48, "NOTIFICATION_MULTI_PROTOCOL_QUERY", 18, 27),
    A0E(r48, "LID_MIGRATION_NOTIFICATION_MULTI_PROTOCOL_QUERY", 19, 28),
    A0D(r48, "LID_MIGRATION_MESSAGE_MULTI_PROTOCOL_QUERY", 20, 29);
    
    public final int code;
    public final C108335Tc context;
    public final AnonymousClass5TH mode;
    public final AnonymousClass5SE scope;

    /* access modifiers changed from: public */
    C108515Tu(AnonymousClass5SE r3, String str, int i, int i2) {
        this.context = r1;
        this.mode = r2;
        this.scope = r3;
        this.code = i2;
    }
}

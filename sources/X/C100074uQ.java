package X;

/* renamed from: X.4uQ  reason: invalid class name and case insensitive filesystem */
public final class C100074uQ extends C170918Hz implements C22901AyD {
    public static final int CALL_CREATOR_JID_FIELD_NUMBER = 12;
    public static final int CALL_ID_FIELD_NUMBER = 11;
    public static final int CALL_LINK_TOKEN_FIELD_NUMBER = 9;
    public static final int CALL_RESULT_FIELD_NUMBER = 1;
    public static final int CALL_TYPE_FIELD_NUMBER = 15;
    public static final C100074uQ DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int GROUP_JID_FIELD_NUMBER = 13;
    public static final int IS_CALL_LINK_FIELD_NUMBER = 8;
    public static final int IS_DND_MODE_FIELD_NUMBER = 2;
    public static final int IS_INCOMING_FIELD_NUMBER = 6;
    public static final int IS_VIDEO_FIELD_NUMBER = 7;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 14;
    public static final int SCHEDULED_CALL_ID_FIELD_NUMBER = 10;
    public static final int SILENCE_REASON_FIELD_NUMBER = 3;
    public static final int START_TIME_FIELD_NUMBER = 5;
    public int bitField0_;
    public String callCreatorJid_ = "";
    public String callId_ = "";
    public String callLinkToken_ = "";
    public int callResult_;
    public int callType_;
    public long duration_;
    public String groupJid_ = "";
    public boolean isCallLink_;
    public boolean isDndMode_;
    public boolean isIncoming_;
    public boolean isVideo_;
    public C23122B6c participants_ = AnonymousClass8I2.A02;
    public String scheduledCallId_ = "";
    public int silenceReason_;
    public long startTime_;

    static {
        C100074uQ r1 = new C100074uQ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100074uQ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(20);
                A1Z[1] = "callResult_";
                A1Z[2] = C141886nz.A00;
                A1Z[3] = "isDndMode_";
                A1Z[4] = "silenceReason_";
                A1Z[5] = C141906o1.A00;
                A1Z[6] = "duration_";
                A1Z[7] = "startTime_";
                A1Z[8] = "isIncoming_";
                A1Z[9] = "isVideo_";
                A1Z[10] = "isCallLink_";
                A1Z[11] = "callLinkToken_";
                A1Z[12] = "scheduledCallId_";
                A1Z[13] = "callId_";
                A1Z[14] = "callCreatorJid_";
                A1Z[15] = "groupJid_";
                A1Z[16] = "participants_";
                A1Z[17] = C99884u7.class;
                A1Z[18] = "callType_";
                A1Z[19] = C141896o0.A00;
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000e\u001b\u000fဌ\r", A1Z);
            case 3:
                return new C100074uQ();
            case 4:
                return new C99644tj();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100074uQ.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        C201979ko r03 = C21072A7j.A01;
                        r0 = C90524aI.A0G(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw AnonymousClass001.A0D();
        }
    }
}

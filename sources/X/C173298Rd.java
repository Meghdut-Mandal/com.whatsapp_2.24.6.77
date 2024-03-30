package X;

/* renamed from: X.8Rd  reason: invalid class name and case insensitive filesystem */
public final class C173298Rd extends C170918Hz implements C22901AyD {
    public static final C173298Rd DEFAULT_INSTANCE;
    public static final int ENABLEGLASSESABR_FIELD_NUMBER = 1;
    public static final int MAXSENDQUEUESIZE_FIELD_NUMBER = 8;
    public static final int MONITORINTERVALMS_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int QUEUEGROWTHMARGIN_FIELD_NUMBER = 7;
    public static final int QUEUEHIGHTHRESHOLD_FIELD_NUMBER = 6;
    public static final int QUEUELOWTHRESHOLD_FIELD_NUMBER = 5;
    public static final int SCALEDOWNINTERVALMS_FIELD_NUMBER = 3;
    public static final int SCALEUPINTERVALMS_FIELD_NUMBER = 4;
    public boolean enableGlassesAbr_;
    public int maxSendQueueSize_;
    public int monitorIntervalMs_;
    public int queueGrowthMargin_;
    public int queueHighThreshold_;
    public int queueLowThreshold_;
    public int scaleDownIntervalMs_;
    public int scaleUpIntervalMs_;

    static {
        C173298Rd r1 = new C173298Rd();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173298Rd.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b", new Object[]{"enableGlassesAbr_", "monitorIntervalMs_", "scaleDownIntervalMs_", "scaleUpIntervalMs_", "queueLowThreshold_", "queueHighThreshold_", "queueGrowthMargin_", "maxSendQueueSize_"});
            case 3:
                return new C173298Rd();
            case 4:
                return new AnonymousClass8IC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173298Rd.class) {
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

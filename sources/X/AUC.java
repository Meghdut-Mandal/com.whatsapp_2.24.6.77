package X;

import java.io.Serializable;

public class AUC implements Serializable {
    public static final long serialVersionUID = 6384729467713273834L;
    public String mAllowedProviders = "";
    public boolean mCompositeMetadataProviderEnabled;
    public boolean mDebugEventEnabled;
    public boolean mEnableBackgroundLogging;
    public boolean mEnableConcurrentEventQueue;
    public boolean mEnableHeartbeat;
    public boolean mEnableReportEventsOnRequestedPause;
    public boolean mEnableResetEvent;
    public boolean mEnableSendingEventsBasedOnSessionId;
    public boolean mEnableStartState;
    public boolean mEnableTagMetadataLogging;
    public boolean mEnabled;
    public long mHeartbeatDelayMs;
    public boolean mZeroLatencyEnabled;
}

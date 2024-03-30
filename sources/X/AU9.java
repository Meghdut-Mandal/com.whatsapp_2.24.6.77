package X;

import java.io.Serializable;

public class AU9 implements Serializable {
    public static final long serialVersionUID = 6345249807662078707L;
    public final boolean allowJoiningOnSetVolume = false;
    public final long allowJoiningTimeMs = 0;
    public final boolean fixClockSwitchJump = false;
    public final boolean fixClockSwitchJumpEnableFbEnded = false;
    public final int maxLoadTimeBeforeStallMs = 1000;
}

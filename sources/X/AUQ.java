package X;

import java.io.Serializable;

public class AUQ implements Serializable {
    public static final AUQ A00 = new AUQ();
    public static final long serialVersionUID = -7637639904338428974L;
    public final boolean allowLessThanMinSegmentsInCache = false;
    public final boolean allowPredictionAfterStartFromCache = false;
    public final boolean enableStartFromCache = false;
    public final int minSegmentsInCacheToStart = 1;
    public final boolean startFromCacheDynamicManifestOnly = false;

    static {
        new C1895594h();
    }
}

package X;

import java.util.Map;

/* renamed from: X.1IN  reason: invalid class name */
public class AnonymousClass1IN extends AnonymousClass1I0 {
    public final Map A00;

    public AnonymousClass1IN(Map map) {
        this.A00 = map;
        if (!map.containsKey(0)) {
            throw new IllegalArgumentException("Logging entry-point controller map must contain controller for NULL LoggingEntryPoint type");
        } else if (!map.containsKey(1)) {
            throw new IllegalArgumentException("Logging entry-point controller map must contain controller for CTWA_ADS LoggingEntryPoint type");
        } else if (!map.containsKey(2)) {
            throw new IllegalArgumentException("Logging entry-point controller map must contain controller for ORGANIC LoggingEntryPoint type");
        }
    }
}

package X;

import java.util.Map;

/* renamed from: X.5To  reason: invalid class name and case insensitive filesystem */
public enum C108455To {
    UNKNOWN(0, "Unknown error"),
    NO_DEVICE_IDENTITY_KEYS(1, "Missing device public keys"),
    DEVICE_IDENTITY_KEYS_MISMATCH(2, "service UUID from linking app does not match the registered UUID"),
    RESOURCE_BUSY(3, "Requested resource is busy"),
    BTC_ADDRESS_RETRIEVAL_FAIL(4, "Failed to get btcAddress for any paired device"),
    WIFI_ADDRESS_RETRIEVAL_FAIL(5, "Failed to get IP address for any paired device"),
    WIFI_DISABLED(6, "WiFi is disabled"),
    WIFI_DIRECT_GROUP_FAIL(7, "Failed to create WiFi Direct group"),
    WIFI_LOCATION_PERMISSIONS_DISABLED(8, "Location permissions are not granted for MWA"),
    WIFI_LOCATION_SERVICE_DISABLED(9, "Location service is not enabled on the phone"),
    WIFI_NEARBY_DEVICES_PERMISSIONS_DISABLED(10, "NEARBY_DEVICES permission is not granted for MWA"),
    HOTSPOT_ENABLED(11, "Failed to create WiFi Direct group as hotspot is enabled");
    
    public static final Map A00 = null;
    public final int error;
    public final String message;

    /* access modifiers changed from: public */
    static {
        int i;
        C12460i5 r4 = new C12460i5();
        for (C108455To r1 : values()) {
            r4.put(Integer.valueOf(r1.error), r1);
        }
        A00 = C000300d.A04(r4);
    }

    /* access modifiers changed from: public */
    C108455To(int i, String str) {
        this.error = i;
        this.message = str;
    }
}

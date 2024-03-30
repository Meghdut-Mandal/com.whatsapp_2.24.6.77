package X;

/* renamed from: X.5Ti  reason: invalid class name and case insensitive filesystem */
public enum C108395Ti {
    EXTRACTION_FAILED("Failed to decompress file"),
    CACHE_PUT_FAILED("Failed to cache asset"),
    CACHE_GET_AFTER_PUT_FAILED("Failed to retrieve cached asset"),
    NO_DOWNLOADSERVICE("Got exception when creating DownloadService"),
    NO_FILE_DOWNLOADED("No file downloaded"),
    MD5_FAIL("Md5 checksum mismatch"),
    INTERNAL_CANCEL("Download was cancelled internally"),
    DOWNLOAD_ERROR(""),
    MODEL_METADATA_DOWNLOAD_FAILURE("Failed to download the model metadata"),
    SCRIPTING_METADATA_DOWNLOAD_FAILURE("Failed to download the script package metadata"),
    MODEL_FETCH_FAILURE(""),
    SCRIPTING_PACKAGE_FETCH_FAILURE("Failed to fetch scripting package"),
    MODEL_CREATION_FAILURE("Failed to create model from local assets"),
    VOLTRON_MODULE_FAILURE("Failed to load voltron module"),
    ASSET_CACHE_KEY_MISSING("Asset cache key missing"),
    REQUEST_ASSET_CREATION_FAILURE("Failed to create request asset"),
    METADATA_FETCH_FAILED(""),
    EFFECT_FETCH_FAILED(""),
    INVALID_EFFECT(""),
    ASYNC_ASSET_FAILURE("failure for async assets"),
    DEVICE_OFFLINE("device is disconnected"),
    REQUEST_TIMEOUT("request exceeds the timeout"),
    REQUEST_INTERRUPT("request is interrupted"),
    ASSET_DECRYPTION_FAILURE("Failed to decrypt asset"),
    ASSET_ENCODING_FAILURE("Failed to encode asset"),
    CAPABILITY_SUPPORT_CHECK_FAILURE("Failed to check if capability supported"),
    OTHER("uncategorized");
    
    public final String mMessage;

    public static C1263463o A00() {
        C1263463o r1 = new C1263463o();
        r1.A00 = DOWNLOAD_ERROR;
        return r1;
    }

    /* access modifiers changed from: public */
    C108395Ti(String str) {
        this.mMessage = str;
    }
}

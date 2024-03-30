package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.910  reason: invalid class name */
public enum AnonymousClass910 implements C22899AyB {
    UNSPECIFIED(0),
    LINK_APP_REQUEST_TYPE(DefaultCrypto.BUFFER_SIZE),
    LINK_APP_RESPONSE_TYPE(8193),
    LINKED_APP_EVENT_TYPE(8194),
    UNLINK_APP_REQUEST_TYPE(8195),
    UNLINK_APP_RESPONSE_TYPE(8196),
    ENABLE_TRUST(8197),
    RELAY_BIND_TYPE(12288),
    RELAY_MESSAGE_TYPE(12289),
    RELAY_RESPONSE_TYPE(12290),
    RELAY_ERROR_TYPE(12291),
    RELAY_CONNECTED_TYPE(12304),
    RELAY_DISCONNECTED_TYPE(12305),
    RELAY_RESET_TYPE(16384),
    SERVICES_CHANGED_TYPE(20480),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BEY() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    AnonymousClass910(int i) {
        this.value = i;
    }
}

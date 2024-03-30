package X;

import java.util.Map;

/* renamed from: X.7Od  reason: invalid class name and case insensitive filesystem */
public final class C153387Od extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $enforcedDecryptedUniqueIdToMessageRowIdMap;
    public final /* synthetic */ C134876bk $enforcedEncryptedUniqueId;
    public final /* synthetic */ AnonymousClass1UJ $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153387Od(C134876bk r2, C134876bk r3, AnonymousClass1UJ r4) {
        super(0);
        this.$enforcedEncryptedUniqueId = r2;
        this.$xFamilyEncryptionHelper = r4;
        this.$enforcedDecryptedUniqueIdToMessageRowIdMap = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C134876bk r1 = this.$enforcedEncryptedUniqueId;
        AnonymousClass1UJ r4 = this.$xFamilyEncryptionHelper;
        AnonymousClass00C.A0D(r4, 2);
        String str2 = null;
        if (!(r1 == null || (str = (String) r1.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0)) {
            str2 = r4.A00(str);
        }
        Map map = (Map) this.$enforcedDecryptedUniqueIdToMessageRowIdMap.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER");
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}

package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7ON  reason: invalid class name */
public final class AnonymousClass7ON extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Map $crosspostingInfoMap;
    public final /* synthetic */ AnonymousClass1UJ $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ON(AnonymousClass1UJ r2, Map map) {
        super(0);
        this.$crosspostingInfoMap = map;
        this.$xFamilyEncryptionHelper = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        HashMap A0J = AnonymousClass001.A0J();
        Map map = this.$crosspostingInfoMap;
        AnonymousClass1UJ r6 = this.$xFamilyEncryptionHelper;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            long A09 = C36431kI.A09(A11.getKey());
            C134876bk r4 = ((C128556Cs) A11.getValue()).A02;
            AnonymousClass00C.A0D(r6, 2);
            if (r4 == null || (str = (String) r4.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0) {
                C18740tg.A0D(false, "XFamilyCrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
            } else {
                C36421kH.A1K(r6.A00(str), A0J, A09);
            }
        }
        return new C134876bk(new C135086c7(C146356vT.A00(), A0J.getClass(), A0J, "XFamilyUniqueIdToMessageRowIdMap"), 2);
    }
}

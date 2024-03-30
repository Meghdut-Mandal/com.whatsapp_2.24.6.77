package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8ue  reason: invalid class name and case insensitive filesystem */
public final class C185698ue extends C50492l0 {
    public static final ArrayList A00 = C165567td.A0e("view_once_expired", "view_once_opened");
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");

    public C185698ue(C185718ug r9, C185718ug r10, C185708uf r11, C185708uf r12, C185708uf r13, C185708uf r14, C185708uf r15, C185708uf r16, C185708uf r17, C185708uf r18, C185708uf r19, C16500pL r20, C185638uY r21, Long l, String str, String str2) {
        AnonymousClass6QB A0W = C165597tg.A0W();
        Long l2 = l;
        if (C203539oF.A0L(l2, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0W, "t", l2.longValue());
        }
        String str3 = str;
        if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0W, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        }
        AnonymousClass00C.A0D(A01, 2);
        AnonymousClass00C.A0D(A02, 2);
        A0W.A08(str2, "deleted_reason", A00);
        A0W.A05(r21.A00);
        C165577te.A1G(A0W, r11);
        C165577te.A1G(A0W, r9);
        C165577te.A1G(A0W, r12);
        C165577te.A1G(A0W, r13);
        C165577te.A1G(A0W, r14);
        C165577te.A1G(A0W, r15);
        C165577te.A1G(A0W, r16);
        C165577te.A1G(A0W, r10);
        C165577te.A1G(A0W, r17);
        C165577te.A1G(A0W, r18);
        C165577te.A1G(A0W, r19);
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0W, r20);
        C592133b.A00(A0W, this);
    }
}

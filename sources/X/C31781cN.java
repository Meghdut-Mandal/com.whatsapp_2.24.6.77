package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1cN  reason: invalid class name and case insensitive filesystem */
public class C31781cN {
    public final C31791cO A00;

    public static C195789Wa A00(C203399nx r8) {
        String A0e;
        int i;
        String A0e2;
        boolean z = false;
        String str = null;
        if (r8 == null) {
            return new C195789Wa((String) null, (String) null, 0, false);
        }
        C203399nx A0c = r8.A0c("status");
        C203399nx A0c2 = r8.A0c("can_appeal");
        C203399nx A0c3 = r8.A0c("reject_reason");
        C203399nx A0c4 = r8.A0c("commerce_url");
        if (A0c == null) {
            A0e = null;
        } else {
            A0e = A0c.A0e();
        }
        if (AnonymousClass14B.A0F(A0e) || "approved".equalsIgnoreCase(A0e)) {
            i = 0;
        } else {
            i = 1;
            if ("rejected".equalsIgnoreCase(A0e)) {
                i = 2;
            }
        }
        if (A0c3 == null) {
            A0e2 = null;
        } else {
            A0e2 = A0c3.A0e();
        }
        if (A0c4 != null) {
            str = A0c4.A0e();
        }
        if (A0c2 != null && Boolean.parseBoolean(A0c2.A0e())) {
            z = true;
        }
        return new C195789Wa(A0e2, str, i, z);
    }

    public C195929Wv A01(C203399nx r8) {
        String A0e;
        String A0e2;
        List<C203399nx> A0j = r8.A0j("product");
        ArrayList arrayList = new ArrayList();
        for (C203399nx A03 : A0j) {
            C207269up A032 = this.A00.A03(A03);
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        C203399nx A0c = r8.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C203399nx A0c2 = r8.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C203399nx A0c3 = r8.A0c("status_info");
        if (A0c == null) {
            A0e = null;
        } else {
            A0e = A0c.A0e();
        }
        if (A0c2 == null) {
            A0e2 = null;
        } else {
            A0e2 = A0c2.A0e();
        }
        if (A0e != null && A0e2 != null) {
            return new C195929Wv(A00(A0c3), (Integer) null, A0e, A0e2, arrayList);
        }
        Log.e("CollectionParser/parseCollectionNode/required fields missing");
        return null;
    }

    public C31781cN(C31791cO r1) {
        this.A00 = r1;
    }
}

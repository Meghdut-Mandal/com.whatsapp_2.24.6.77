package X;

import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Z4  reason: invalid class name */
public final class AnonymousClass1Z4 implements C236319f {
    public final AnonymousClass1E9 A00;

    public AnonymousClass1Z4(AnonymousClass1E9 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public int[] BCF() {
        return new int[]{249};
    }

    public boolean BJl(Message message, int i) {
        C203399nx r1;
        AnonymousClass00C.A0D(message, 1);
        if (i == 249) {
            Object obj = message.obj;
            if ((obj instanceof C203399nx) && (r1 = (C203399nx) obj) != null) {
                List<C203399nx> A0j = r1.A0j("notice");
                AnonymousClass00C.A08(A0j);
                ArrayList arrayList = new ArrayList();
                for (C203399nx A0i : A0j) {
                    String A0i2 = A0i.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                    if (A0i2 != null) {
                        arrayList.add(A0i2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                AnonymousClass1E9.A00(this.A00, arrayList2, 0);
                return true;
            }
        }
        return false;
    }
}

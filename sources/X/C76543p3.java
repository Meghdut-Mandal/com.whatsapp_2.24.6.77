package X;

import com.whatsapp.util.Log;

/* renamed from: X.3p3  reason: invalid class name and case insensitive filesystem */
public class C76543p3 implements C236119d {
    public C61473Ca A00;
    public final AnonymousClass19A A01;

    public void BVN(String str) {
        Log.e("delivery failure when setting member add mode");
        C61473Ca r0 = this.A00;
        if (r0 != null) {
            C40111uw r3 = r0.A00;
            AnonymousClass141 r02 = r3.A02;
            if (r02 != null) {
                C36341k9.A19(r3.A0C, AnonymousClass000.A1O(r02.A04));
            }
            r3.A0Q.A0T(3012, (Object) null);
        }
    }

    public void BWw(C203399nx r6, String str) {
        String str2;
        C20350xQ r1;
        int i;
        C203399nx A0c = r6.A0c("error");
        if (A0c != null && this.A00 != null) {
            int A0S = A0c.A0S("code", 0);
            C40111uw r3 = this.A00.A00;
            AnonymousClass141 r0 = r3.A02;
            if (r0 != null) {
                C36341k9.A19(r3.A0C, AnonymousClass000.A1O(r0.A04));
            }
            if (A0S != 0) {
                if (A0S == 403) {
                    r1 = r3.A0Q;
                    i = 3024;
                } else if (A0S == 423) {
                    r1 = r3.A0Q;
                    i = 3025;
                } else if (A0S == 429 || A0S == 500) {
                    r1 = r3.A0Q;
                    i = 3012;
                } else if (A0S == 400) {
                    str2 = "bad request when setting member add mode";
                } else if (A0S == 401) {
                    r1 = r3.A0Q;
                    i = 3023;
                } else {
                    return;
                }
                r1.A0T(i, (Object) null);
                return;
            }
            str2 = "unknown error when setting member add mode";
            Log.e(str2);
        }
    }

    public void BiM(C203399nx r2, String str) {
        Log.i("successfully set member add mode");
    }

    public C76543p3(AnonymousClass19A r1) {
        this.A01 = r1;
    }
}

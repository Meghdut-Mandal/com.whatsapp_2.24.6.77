package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3p6  reason: invalid class name and case insensitive filesystem */
public final class C76573p6 implements C236119d {
    public final C19700wN A00;
    public final AnonymousClass0AP A01;

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass0AP r1 = this.A01;
        C52812qD r0 = new C52812qD(str);
        AnonymousClass00C.A0D(r0, 0);
        C36351kA.A1T(r0, r1);
    }

    public void BWw(C203399nx r4, String str) {
        C36331k8.A1I(str, r4);
        AnonymousClass0AP r1 = this.A01;
        AnonymousClass5V6 r0 = new AnonymousClass5V6(r4, str);
        AnonymousClass00C.A0D(r0, 0);
        C36351kA.A1T(r0, r1);
    }

    public void BiM(C203399nx r14, String str) {
        AnonymousClass00C.A0D(r14, 1);
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx A0c = r14.A0c("sub_groups");
        if (A0c != null) {
            List A0j = A0c.A0j("group");
            AnonymousClass00C.A08(A0j);
            Iterator it = A0j.iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                try {
                    String A0i = A0s.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                    C18740tg.A06(A0i);
                    AnonymousClass147 A02 = AnonymousClass143.A02(A0i);
                    AnonymousClass00C.A08(A02);
                    String A0i2 = A0s.A0i("subject", (String) null);
                    long A012 = AnonymousClass6R8.A01(A0s.A0i("s_t", (String) null), 0) * 1000;
                    int A022 = AnonymousClass3UA.A02(A0s);
                    if (A022 == 0) {
                        A022 = 2;
                    }
                    if (A0i2 == null) {
                        A0i2 = "";
                    }
                    A0I.add(new AnonymousClass3QK(A02, A0i2, A022, A012));
                } catch (C19740wR e) {
                    C18740tg.A0A(e);
                    this.A00.A0E("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
                    C36351kA.A1T(e, this.A01);
                }
            }
            this.A01.resumeWith(new AnonymousClass0AK(A0I));
        }
    }

    public C76573p6(C19700wN r1, AnonymousClass0AP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

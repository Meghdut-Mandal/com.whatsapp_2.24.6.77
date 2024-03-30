package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3nO  reason: invalid class name and case insensitive filesystem */
public final class C75533nO implements AnonymousClass4TJ {
    public final /* synthetic */ C39671tD A00;

    public C75533nO(C39671tD r1) {
        this.A00 = r1;
    }

    public void BXM(UserJid userJid, int i) {
    }

    public void Bi6(UserJid userJid) {
        AnonymousClass3HW r2;
        String A1A;
        C39671tD r5 = this.A00;
        AnonymousClass5Lb r4 = r5.A04;
        UserJid userJid2 = r5.A02;
        if (userJid2 == null) {
            throw C36331k8.A0d("bizJid");
        }
        synchronized (r4) {
            r2 = (AnonymousClass3HW) r4.A02.get(userJid2);
        }
        UserJid userJid3 = r5.A02;
        if (userJid3 == null) {
            throw C36331k8.A0d("bizJid");
        }
        synchronized (r4) {
            A1A = C36431kI.A1A(userJid3, r4.A01);
        }
        if (A1A != null) {
            r5.A06.A0C(A1A);
        }
        if (r2 != null) {
            List list = r2.A00;
            if (C36401kF.A1a(list)) {
                ArrayList A0I = AnonymousClass001.A0I();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C63373Ju r9 = (C63373Ju) list.get(i);
                    if (!r9.A04.isEmpty()) {
                        C206759tv r12 = (C206759tv) r9.A04.get(0);
                        r5.A0A.add(new AnonymousClass3XV(r12, r9.A02, r9.A01, r9.A03, r9.A00));
                        String A0p = AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r12.A04), 0), AnonymousClass000.A0u());
                        AnonymousClass00C.A08(A0p);
                        A0I.add(new AnonymousClass3A6((Drawable) null, new C79123tD(r5, i), new AnonymousClass4ZA(r5, r12, 2), (String) null, (String) null, A0p));
                    }
                }
                r5.A08.A0C(A0I);
            }
        }
    }
}

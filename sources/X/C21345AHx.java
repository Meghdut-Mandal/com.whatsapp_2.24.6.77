package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.AHx  reason: case insensitive filesystem */
public class C21345AHx implements C236119d {
    public final C19420v0 A00;
    public final AnonymousClass19A A01;
    public final C19700wN A02;
    public final C194319Pe A03;

    public void BVN(String str) {
        AnonymousClass9XY r2 = this.A03.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("blocklistresponsehandler/general_request_timeout jid=");
        C36321k7.A1N(r2.A06.A04, A0u);
        r2.A03.Bp3(r2.A0D);
    }

    public C21345AHx(C19700wN r1, C194319Pe r2, C19420v0 r3, AnonymousClass19A r4) {
        this.A02 = r1;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r2;
    }

    public void BWw(C203399nx r3, String str) {
        this.A03.A00.A00(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r10, String str) {
        C203399nx A0a = r10.A0a();
        C203399nx.A0A(A0a, "list");
        if (A0a.A0h("matched").equals("false")) {
            HashSet A16 = C36441kJ.A16();
            C203399nx[] r8 = A0a.A02;
            if (r8 != null) {
                for (C203399nx r2 : r8) {
                    C203399nx.A0A(r2, "item");
                    A16.add(r2.A0X(UserJid.class, "jid"));
                }
            }
            if (TextUtils.equals(A0a.A0i("c_dhash", (String) null), this.A00.A0a())) {
                Log.w("blocklistv2setprotocolhelper/onSuccess/only dhash mis-match.");
                this.A03.A00(A0a.A0i("dhash", (String) null), A16, false);
                return;
            }
            Log.w("blocklistv2setprotocolhelper/onSuccess/dhash and c_dhash mis-match.");
            this.A03.A00((String) null, A16, true);
            return;
        }
        this.A03.A00.A01(C36391kE.A0x(A0a, "dhash"));
    }
}

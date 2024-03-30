package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2jZ  reason: invalid class name and case insensitive filesystem */
public class C49712jZ extends C132446Tt {
    public final C26861Lu A00;
    public final AnonymousClass16D A01;
    public final C21159AAt A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C131626Pu r0;
        UserJid userJid = this.A03;
        if (userJid == null) {
            String str = this.A04;
            if (str != null) {
                return this.A02.A02(C108515Tu.A01, str);
            }
            r0 = C131626Pu.A03;
        } else {
            AnonymousClass141 A0D = this.A01.A0D(userJid);
            String str2 = this.A05;
            if (str2 != null && !str2.isEmpty() && !str2.equals(A0D.A0a)) {
                A0D.A0a = str2;
                this.A00.A01(C80313vC.A00(this, A0D, 15));
            }
            if (A0D.A0F != null) {
                r0 = C131626Pu.A08;
            } else {
                r0 = this.A02.A04(C108515Tu.A01, userJid);
            }
        }
        return Pair.create(r0, (Object) null);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C77253qC r2 = (C77253qC) this.A06.get();
        if (r2 != null && !r2.A03) {
            r2.A00((C131626Pu) pair.first, (C194169Oj) pair.second);
        }
    }

    public C49712jZ(C26861Lu r2, AnonymousClass16D r3, C21159AAt aAt, UserJid userJid, C77253qC r6, String str, String str2) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = aAt;
        this.A06 = AnonymousClass001.A0F(r6);
        this.A03 = userJid;
        this.A05 = str;
        this.A04 = str2;
    }
}

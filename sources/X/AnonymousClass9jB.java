package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.9jB  reason: invalid class name */
public class AnonymousClass9jB {
    public int A00 = 0;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public C193429Lk A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass141 A0O;
    public final UserJid A0P;
    public final String A0Q;
    public final String A0R;

    public static void A03(AnonymousClass1O1 r3, AnonymousClass9jB r4, boolean z, boolean z2) {
        r4.A0F = true;
        r4.A0H = z;
        r4.A0N = z2;
        if (r3.A0F.A0E(4921)) {
            r4.A0M = true;
        }
    }

    public static void A01(AnonymousClass1O1 r1, AnonymousClass9jB r2, UserJid userJid) {
        AnonymousClass1EU r0 = r1.A0H;
        AnonymousClass1EU.A00(r0);
        r2.A05 = r0.A08.A00(userJid, r2.A0Q);
    }

    public C194179Ok A05() {
        boolean z;
        UserJid userJid = this.A0P;
        if (userJid instanceof C223313w) {
            AnonymousClass141 r0 = this.A0O;
            if (r0 == null || (!r0.A0n && !this.A0D)) {
                z = true;
            } else {
                z = false;
            }
            this.A0G = z;
        }
        this.A0H &= true ^ AnonymousClass143.A0I(userJid);
        return new C194179Ok(this);
    }

    public AnonymousClass9jB(UserJid userJid, String str) {
        this.A0P = userJid;
        this.A0Q = str;
        this.A0O = null;
        this.A0R = null;
    }

    public static long A00(AnonymousClass9jB r2, C231417i r3, UserJid userJid) {
        r2.A08 = r3.A07(userJid);
        r2.A03 = r3.A01(userJid);
        AnonymousClass3QO A052 = r3.A05(userJid);
        if (A052 != null) {
            return A052.A02;
        }
        return 0;
    }

    public static void A02(AnonymousClass1O1 r1, AnonymousClass9jB r2, Object obj, Map map) {
        r2.A07 = (String) map.get(obj);
        r2.A09 = (String) r1.A0M.get(obj);
    }

    public static void A04(AnonymousClass9jB r0, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A05());
    }

    public AnonymousClass9jB(AnonymousClass141 r4) {
        this.A0P = C36351kA.A0l(r4);
        this.A0O = r4;
        AnonymousClass3IL r0 = r4.A0F;
        if (r0 != null) {
            this.A0Q = r0.A01;
        } else {
            this.A0Q = null;
        }
        if (r4.A0z) {
            this.A04 = r4.A0D;
        }
        this.A0R = null;
    }

    public AnonymousClass9jB(String str) {
        this.A0R = str;
        this.A0P = null;
        this.A0Q = null;
        this.A0O = null;
    }
}

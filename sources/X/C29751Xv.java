package X;

import com.whatsapp.jid.UserJid;
import java.util.Random;

/* renamed from: X.1Xv  reason: invalid class name and case insensitive filesystem */
public final class C29751Xv {
    public final AnonymousClass16D A00;
    public final C21010yW A01;

    public C29751Xv(AnonymousClass16D r2, C21010yW r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final AnonymousClass2SE A00(UserJid userJid, C29751Xv r4, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        AnonymousClass141 A08;
        AnonymousClass141 A082;
        AnonymousClass2SE r2 = new AnonymousClass2SE();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r2.A06 = l;
        r2.A00 = bool;
        r2.A01 = bool2;
        r2.A07 = str;
        r2.A04 = num;
        Boolean bool3 = null;
        if (!(userJid == null || (A082 = r4.A00.A08(userJid)) == null)) {
            bool3 = Boolean.valueOf(A082.A0C());
        }
        r2.A02 = bool3;
        Boolean bool4 = null;
        if (!(userJid == null || (A08 = r4.A00.A08(userJid)) == null)) {
            bool4 = Boolean.valueOf(A08.A0B());
        }
        r2.A03 = bool4;
        if (userJid != null) {
            r2.A08 = userJid.user;
        }
        return r2;
    }

    public static final AnonymousClass2SO A01(UserJid userJid, C29751Xv r5, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        AnonymousClass2SO r3 = new AnonymousClass2SO();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r3.A07 = l;
        r3.A00 = bool;
        r3.A01 = bool2;
        r3.A08 = str;
        r3.A05 = num;
        Boolean bool3 = null;
        AnonymousClass16D r2 = r5.A00;
        AnonymousClass141 A08 = r2.A08(userJid);
        if (A08 != null) {
            bool3 = Boolean.valueOf(A08.A0C());
        }
        r3.A02 = bool3;
        Boolean bool4 = null;
        AnonymousClass141 A082 = r2.A08(userJid);
        if (A082 != null) {
            bool4 = Boolean.valueOf(A082.A0B());
        }
        r3.A03 = bool4;
        r3.A09 = String.valueOf(userJid);
        return r3;
    }
}

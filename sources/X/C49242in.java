package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2in  reason: invalid class name and case insensitive filesystem */
public class C49242in extends C132446Tt {
    public final C24531Cu A00;
    public final AnonymousClass141 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A00(C36351kA.A0k(this.A01));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        UserJid userJid;
        AnonymousClass2HO r2;
        C181248nA r5 = (C181248nA) obj;
        UserJid userJid2 = null;
        if (r5 != null) {
            UserJid userJid3 = r5.A00;
            userJid = r5.A01;
            if (userJid3 == null || userJid == null) {
                Log.e("ChangeNumberNotificationBanner/GetChangeNumberMessageTask trying to show change number message for non-user jids");
            } else {
                userJid2 = userJid3;
                r2 = (AnonymousClass2HO) this.A02.get();
                if (r2 != null && userJid2 != null && userJid != null) {
                    r2.A02 = userJid2;
                    r2.A03 = userJid;
                    boolean A0B = r2.A0B();
                    boolean A0C = r2.A0C();
                    if (A0B) {
                        if (A0C) {
                            AnonymousClass2HO.A00(r2);
                            return;
                        } else {
                            r2.A04.postDelayed(C80223v3.A00(r2, 42), 500);
                            return;
                        }
                    } else if (A0C) {
                        r2.A0A(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        userJid = null;
        r2 = (AnonymousClass2HO) this.A02.get();
        if (r2 != null) {
        }
    }

    public C49242in(AnonymousClass2HO r2, C24531Cu r3, AnonymousClass141 r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass001.A0F(r2);
    }
}

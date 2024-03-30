package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2kL  reason: invalid class name and case insensitive filesystem */
public abstract class C50182kL extends C132446Tt {
    public int A00;
    public C20070wy A01;
    public C20760y7 A02;
    public AnonymousClass147 A03;
    public UserJid A04;
    public final C20510xg A05;
    public final C19970wo A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass17Y r2;
        int i;
        if (this.A02 == null || this.A01 == null) {
            if (this instanceof AnonymousClass2XC) {
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) ((AnonymousClass2XC) this).A01.get();
                if (viewGroupInviteActivity != null) {
                    ViewGroupInviteActivity.A01(viewGroupInviteActivity, R.string.f12nameremoved);
                    return;
                }
                return;
            }
            AnonymousClass2XB r1 = (AnonymousClass2XB) this;
            C225314u A0W = C36411kG.A0W(r1.A01);
            if (A0W != null) {
                A0W.Bnv();
                r2 = r1.A00;
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        } else {
            if (this instanceof AnonymousClass2XC) {
                AnonymousClass2XC r12 = (AnonymousClass2XC) this;
                Activity A0D = C36441kJ.A0D(r12.A01);
                if (A0D != null) {
                    r12.A00.A06(R.string.f12nameremoved, 0);
                    A0D.finish();
                    return;
                }
                return;
            }
            AnonymousClass2XB r13 = (AnonymousClass2XB) this;
            C225314u A0W2 = C36411kG.A0W(r13.A01);
            if (A0W2 != null) {
                A0W2.Bnv();
                r2 = r13.A00;
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        r2.A06(i, 0);
    }

    public C50182kL(C19970wo r1, C20510xg r2, AnonymousClass147 r3, UserJid userJid) {
        this.A06 = r1;
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = userJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A05.A06(new AnonymousClass32N(this), this.A03, Collections.singletonList(this.A04)).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}

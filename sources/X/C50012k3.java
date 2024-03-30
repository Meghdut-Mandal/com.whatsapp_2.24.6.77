package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2k3  reason: invalid class name and case insensitive filesystem */
public class C50012k3 extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C20350xQ A03;
    public final C20510xg A04;
    public final AnonymousClass147 A05;
    public final WeakReference A06;
    public final List A07;
    public final List A08;
    public final C19970wo A09;

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A06);
        if (A0W != null && !A0W.isFinishing()) {
            A0W.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A06);
        if (A0W != null && !A0W.isFinishing()) {
            A0W.Bnv();
        }
    }

    public C50012k3(C225314u r2, AnonymousClass17Y r3, AnonymousClass16D r4, AnonymousClass171 r5, C19970wo r6, C20350xQ r7, C20510xg r8, AnonymousClass147 r9, List list, List list2) {
        this.A09 = r6;
        this.A00 = r3;
        this.A04 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r7;
        this.A06 = AnonymousClass001.A0F(r2);
        this.A05 = r9;
        this.A08 = list;
        this.A07 = list2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20510xg r7 = this.A04;
        AnonymousClass147 r8 = this.A05;
        List list = this.A08;
        List list2 = this.A07;
        C589631s r6 = new C589631s(this);
        AnonymousClass19A r12 = r7.A05;
        String A092 = r12.A09();
        ArrayList A0I = AnonymousClass001.A0I();
        if (!list.isEmpty()) {
            A0I.add(C20510xg.A00("promote", list));
        }
        if (!list2.isEmpty()) {
            A0I.add(C20510xg.A00("demote", list2));
        }
        C203399nx r5 = new C203399nx("admin", (AnonymousClass1AL[]) null, (C203399nx[]) A0I.toArray(new C203399nx[0]));
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
        C36331k8.A1R(A092, r3, 0);
        C36341k9.A1S(r3, 1);
        C36331k8.A1B(r8, "set", r3, 2);
        C203399nx A0m = C36391kE.A0m(r5, r3);
        C99424tL r52 = new C99424tL();
        r12.A0E(new C65833Tq(r52, r7, r6, 0), A0m, A092, 166, 32000);
        try {
            r52.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                try {
                    Thread.sleep(500 - elapsedRealtime2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e) {
            Log.w("modify-admins/timeout", e);
            C80253v6.A00(this.A00, this, 8);
        }
        return null;
    }
}

package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment;
import com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1NU  reason: invalid class name */
public final class AnonymousClass1NU {
    public int A00;
    public final AnonymousClass1NP A01;
    public final AnonymousClass1NT A02;
    public final C20810yC A03;

    public AnonymousClass1NU(AnonymousClass1NP r2, AnonymousClass1NT r3, C20810yC r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void A00(Context context, AnonymousClass01z r26, UserJid userJid, String str, boolean z) {
        DialogFragment marketingOptOutFragment;
        Context context2 = context;
        AnonymousClass00C.A0D(context2, 0);
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid2, 2);
        AnonymousClass1NT r0 = this.A02;
        String str2 = str;
        if (z) {
            C124425yA r15 = new C124425yA(Integer.valueOf(R.drawable.ic_campaign_filled), Integer.valueOf(R.drawable.green_alpha15_circle), Integer.valueOf(R.color.f6nameremoved), (Integer) null, (Integer) null, R.layout.f9nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
            C20810yC r12 = r0.A06;
            AnonymousClass17Y r7 = r0.A01;
            marketingOptOutFragment = new MarketingReOptInFragment(context2, r0.A00, r7, r0.A02, r15, r0.A03, r0.A04, r12, userJid2, str2);
        } else {
            C124425yA r152 = new C124425yA(Integer.valueOf(R.drawable.ic_megaphone_slash_filled), Integer.valueOf(R.drawable.green_alpha15_circle), Integer.valueOf(R.color.f6nameremoved), (Integer) null, Integer.valueOf(R.string.f12nameremoved), R.layout.f9nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
            C20810yC r3 = r0.A06;
            AnonymousClass17Y r72 = r0.A01;
            marketingOptOutFragment = new MarketingOptOutFragment(context2, r0.A00, r72, r0, r152, r0.A03, r0.A04, r3, userJid2, str2);
        }
        marketingOptOutFragment.A1f(r26, marketingOptOutFragment.getClass().getName());
    }

    public final boolean A01() {
        C20810yC r4 = this.A03;
        C21000yV r3 = C21000yV.A02;
        if (C20800yB.A01(r3, r4, 5484) && this.A00 % 2 == 0) {
            this.A00 = AnonymousClass0XG.A01.A03(1, 100);
        }
        return C20800yB.A01(r3, r4, 4512);
    }

    public final boolean A02(AnonymousClass3T1 r3) {
        String str;
        if (!(r3 instanceof C88854Uh) || (str = ((C88854Uh) r3).BIE().A04) == null || !"MARKETING".equals(str) || !A01()) {
            return false;
        }
        return true;
    }
}

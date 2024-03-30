package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3nP  reason: invalid class name and case insensitive filesystem */
public class C75543nP implements AnonymousClass4TJ {
    public C75033mZ A00;
    public boolean A01;
    public final Integer A02;
    public final int A03;
    public final Context A04;
    public final AnonymousClass3C0 A05;
    public final LinkedAccountsMediaCard A06;
    public final C201549jr A07;
    public final C206949uI A08;
    public final C207109uZ A09;
    public final C18820ts A0A;
    public final AnonymousClass5Lb A0B;
    public final boolean A0C;
    public final C24801Dv A0D;

    public static void A00(C75543nP r13) {
        C134766bZ r4;
        C206549ta r1 = r13.A09.A05;
        if (r1 != null) {
            LinkedAccountsMediaCard linkedAccountsMediaCard = r13.A06;
            if (linkedAccountsMediaCard.A00 != null) {
                int i = r13.A03;
                if (i == 0) {
                    r4 = r1.A00;
                } else if (i == 1) {
                    r4 = r1.A01;
                } else {
                    return;
                }
                if (r4 != null) {
                    Uri A002 = C53302r6.A00(r4, i);
                    C24801Dv r2 = r13.A0D;
                    Context context = r13.A04;
                    C201549jr r6 = r13.A07;
                    r6.A05(r13.A02, Integer.valueOf(r4.A00), linkedAccountsMediaCard.A00.getRawString(), 15, i, true);
                    C36361kB.A0y(context, A002, r2);
                    int i2 = 23;
                    if (i == 0) {
                        i2 = 20;
                    }
                    r6.A03(r13.A08, i2);
                }
            }
        }
    }

    public void A01(UserJid userJid) {
        UserJid userJid2;
        AnonymousClass3HW r2;
        int i = this.A03;
        AnonymousClass5Lb r1 = this.A0B;
        synchronized (r1) {
            userJid2 = userJid;
            if (i == 0) {
                r2 = (AnonymousClass3HW) r1.A00.get(userJid2);
            } else {
                r2 = (AnonymousClass3HW) r1.A02.get(userJid2);
            }
        }
        String string = this.A04.getString(R.string.f12nameremoved);
        if (r2 != null) {
            List list = r2.A00;
            if (!list.isEmpty()) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = this.A06;
                ArrayList A0I = AnonymousClass001.A0I();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C63373Ju r12 = (C63373Ju) list.get(i2);
                    if (!r12.A04.isEmpty()) {
                        C206759tv r0 = (C206759tv) r12.A04.get(0);
                        A0I2.add(new AnonymousClass3XV(r0, r12.A02, r12.A01, r12.A03, r12.A00));
                        A0I.add(new AnonymousClass3A6((Drawable) null, new C79143tF(linkedAccountsMediaCard.A03, userJid2, A0I2, i2), new AnonymousClass4ZA(r0, linkedAccountsMediaCard, 1), (String) null, string, AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r0.A04), 0), AnonymousClass000.A0u())));
                    }
                }
                linkedAccountsMediaCard.A08(A0I, Integer.MAX_VALUE);
                int i3 = R.drawable.ic_business_instagram;
                if (i == 0) {
                    i3 = R.drawable.ic_settings_fb;
                }
                C135436ch r02 = new C135436ch(this, 0);
                View openProfileView = linkedAccountsMediaCard.getOpenProfileView();
                openProfileView.setOnClickListener(r02);
                C36401kF.A0G(openProfileView, R.id.linked_account_icon).setImageResource(i3);
                linkedAccountsMediaCard.A00.addView(openProfileView);
                return;
            }
        }
        LinkedAccountsMediaCard linkedAccountsMediaCard2 = this.A06;
        C48732hx r13 = new C48732hx(this, 42);
        LinearLayout linearLayout = linkedAccountsMediaCard2.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        linkedAccountsMediaCard2.A07(r13, 3);
    }

    public boolean A02(UserJid userJid) {
        int i = this.A03;
        AnonymousClass5Lb r1 = this.A0B;
        synchronized (r1) {
            if (i == 0) {
                boolean A1V = AnonymousClass000.A1V(r1.A02.get(userJid));
                return A1V;
            }
            boolean A1V2 = AnonymousClass000.A1V(r1.A02.get(userJid));
            return A1V2;
        }
    }

    public void Bi6(UserJid userJid) {
        if (C1901797e.A00(this.A06.A00, userJid)) {
            A01(userJid);
        }
    }

    public C75543nP(C24801Dv r2, AnonymousClass3C0 r3, LinkedAccountsMediaCard linkedAccountsMediaCard, C201549jr r5, C206949uI r6, C207109uZ r7, C18820ts r8, AnonymousClass5Lb r9, Integer num, int i, boolean z) {
        this.A06 = linkedAccountsMediaCard;
        this.A03 = i;
        this.A09 = r7;
        this.A04 = linkedAccountsMediaCard.getContext();
        this.A0B = r9;
        this.A05 = r3;
        this.A0A = r8;
        this.A0D = r2;
        this.A02 = num;
        this.A08 = r6;
        this.A07 = r5;
        this.A0C = z;
    }

    public void BXM(UserJid userJid, int i) {
        C36321k7.A1S("LinkedAccountCardViewPresenter onFailure ", AnonymousClass000.A0u(), i);
        LinkedAccountsMediaCard linkedAccountsMediaCard = this.A06;
        if (C1901797e.A00(linkedAccountsMediaCard.A00, userJid)) {
            C48732hx r1 = new C48732hx(this, 42);
            LinearLayout linearLayout = linkedAccountsMediaCard.A00;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            linkedAccountsMediaCard.A07(r1, 3);
        }
    }
}

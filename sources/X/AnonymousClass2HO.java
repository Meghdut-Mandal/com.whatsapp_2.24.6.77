package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.2HO  reason: invalid class name */
public class AnonymousClass2HO extends C80183uz {
    public View A00;
    public AnonymousClass141 A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final C19730wQ A05;
    public final AnonymousClass16D A06;
    public final C24531Cu A07;
    public final UserJid A08;
    public final C19770wU A09;
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass171 A0C;

    public AnonymousClass2HO(ViewGroup viewGroup, C19730wQ r3, AnonymousClass16D r4, AnonymousClass171 r5, AnonymousClass4V7 r6, C24531Cu r7, AnonymousClass141 r8, UserJid userJid, C19770wU r10, boolean z, boolean z2) {
        super(r6, 15);
        this.A05 = r3;
        this.A09 = r10;
        this.A06 = r4;
        this.A0C = r5;
        this.A07 = r7;
        this.A08 = userJid;
        this.A04 = viewGroup;
        this.A0A = z;
        this.A0B = z2;
        this.A01 = r8;
    }

    public static void A00(AnonymousClass2HO r5) {
        int i;
        boolean A0L = r5.A05.A0L();
        boolean equals = r5.A08.equals(r5.A03);
        if (!A0L) {
            i = R.string.f12nameremoved;
            if (equals) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
            if (equals) {
                i = R.string.f12nameremoved;
            }
        }
        String A0H = r5.A0C.A0H(C36441kJ.A0i(r5.A06, r5.A03));
        String A0A2 = C36321k7.A0A(C80183uz.A05(r5), A0H, i);
        AnonymousClass9v1 r3 = new AnonymousClass9v1(9, A0H, r5);
        C66953Xy r2 = new C66953Xy(r5, 5);
        View view = r5.A00;
        if (view instanceof WDSBannerCompact) {
            WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
            wDSBannerCompact.setText((CharSequence) A0A2);
            wDSBannerCompact.setOnClickListener(r3);
            wDSBannerCompact.setOnDismissListener((View.OnClickListener) r2);
            return;
        }
        C18740tg.A04(view);
        C36371kC.A1E(view, A0A2, R.id.change_number_text);
        r5.A00.setOnClickListener(r3);
        r5.A00.findViewById(R.id.change_number_dismiss).setOnClickListener(r2);
    }
}

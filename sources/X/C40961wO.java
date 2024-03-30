package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.1wO  reason: invalid class name and case insensitive filesystem */
public final class C40961wO extends AnonymousClass0CZ {
    public final LayoutInflater A00;
    public final AnonymousClass1LI A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass1RY A03;
    public final C220412q A04;
    public final C20810yC A05;
    public final C28981Uw A06;
    public final NewsletterInfoActivity A07;
    public final List A08 = AnonymousClass001.A0I();
    public final List A09 = AnonymousClass001.A0I();
    public final AnonymousClass190 A0A;

    public C40961wO(LayoutInflater layoutInflater, AnonymousClass1LI r3, AnonymousClass171 r4, AnonymousClass1RY r5, C220412q r6, C20810yC r7, AnonymousClass190 r8, C28981Uw r9, NewsletterInfoActivity newsletterInfoActivity) {
        AnonymousClass00C.A0D(r7, 5);
        C36321k7.A13(r6, r4, r3);
        AnonymousClass00C.A0D(r8, 9);
        this.A07 = newsletterInfoActivity;
        this.A00 = layoutInflater;
        this.A03 = r5;
        this.A06 = r9;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A0A = r8;
    }

    public long A0E(int i) {
        return (long) i;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            return new AnonymousClass2Y0(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            return new AnonymousClass2Y1(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this);
        } else if (i == 2) {
            List list3 = AnonymousClass0D3.A0I;
            return new C46492Xz(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this);
        } else {
            throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown type: ", AnonymousClass000.A0u(), i));
        }
    }

    public int A0J() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r12, int i) {
        C42521yx r122 = (C42521yx) r12;
        AnonymousClass00C.A0D(r122, 0);
        C54792tY r2 = (C54792tY) this.A08.get(i);
        if (r122 instanceof AnonymousClass2Y0) {
            AnonymousClass00C.A0D(r2, 0);
            C18740tg.A0C(r2 instanceof AnonymousClass2Y3);
            WaTextView waTextView = ((AnonymousClass2Y0) r122).A00;
            waTextView.setText(((AnonymousClass2Y3) r2).A00);
            C33511fU.A03(waTextView);
        } else if (r122 instanceof C46492Xz) {
            C46492Xz r123 = (C46492Xz) r122;
            AnonymousClass00C.A0D(r2, 0);
            r123.A00.setText(R.string.f12nameremoved);
            C40961wO r4 = r123.A01;
            if (r4.A05.A0E(7245)) {
                AnonymousClass1RJ A0X = C36341k9.A0X(r123.A0H, R.id.invite_admins_button_viewstub);
                C65073Qp A092 = r4.A04.A09(r4.A06, false);
                AnonymousClass00C.A0E(A092, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
                A0X.A03(0);
                A0X.A05(new AnonymousClass9v5((Object) r4, (Object) A092, 6));
            }
        } else {
            AnonymousClass2Y1 r124 = (AnonymousClass2Y1) r122;
            AnonymousClass00C.A0D(r2, 0);
            C18740tg.A0C(r2 instanceof AnonymousClass2Y2);
            AnonymousClass141 r7 = ((AnonymousClass2Y2) r2).A00.A00;
            AnonymousClass3SF r5 = r124.A01;
            TextEmojiLabel textEmojiLabel = r5.A01;
            textEmojiLabel.setText((CharSequence) null);
            C40961wO r22 = r124.A03;
            NewsletterInfoActivity newsletterInfoActivity = r22.A07;
            C36321k7.A0M(newsletterInfoActivity, textEmojiLabel, R.attr.f4nameremoved, R.color.f6nameremoved);
            TextEmojiLabel textEmojiLabel2 = r124.A00;
            C36331k8.A0r(newsletterInfoActivity, textEmojiLabel2, R.color.f6nameremoved);
            AnonymousClass34G A0C = r22.A02.A0C(r7, 2);
            r5.A04(A0C, r7, (List) null, 2, r7.A0O());
            C36401kF.A19(r124.A02, textEmojiLabel2, r22.A03, r7);
            View view = r124.A0H;
            view.setBackgroundResource(R.drawable.selector_orange_gradient);
            AnonymousClass3YM.A00(view, r22, r7, A0C, 3);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.get(i);
        if (obj instanceof AnonymousClass2Y3) {
            return 0;
        }
        return C36391kE.A00(obj instanceof AnonymousClass2Y2 ? 1 : 0);
    }
}

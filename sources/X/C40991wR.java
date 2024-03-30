package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.1wR  reason: invalid class name and case insensitive filesystem */
public final class C40991wR extends AnonymousClass0CZ {
    public final LayoutInflater A00;
    public final C61423Bv A01;
    public final AnonymousClass1LI A02;
    public final AnonymousClass1RY A03;
    public final NewsletterInfoActivity A04;
    public final List A05 = AnonymousClass001.A0I();
    public final AnonymousClass00T A06 = C36431kI.A1I(new C84154Cd(this));
    public final boolean A07;

    public long A0E(int i) {
        return (long) i;
    }

    public final void A0L(List list) {
        AnonymousClass00C.A0D(list, 0);
        List list2 = this.A05;
        list2.clear();
        if (this.A07 || list.size() <= 10) {
            list2.addAll(list);
        } else {
            list2.addAll(list.subList(0, 10));
            list2.add(AnonymousClass2YT.A00);
        }
        A06();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            return new AnonymousClass2YV(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            return new AnonymousClass2YU(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this);
        } else {
            throw AnonymousClass000.A0d("View type not supported ", AnonymousClass000.A0u(), i);
        }
    }

    public int A0J() {
        return this.A05.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        C42531yy r102 = (C42531yy) r10;
        AnonymousClass00C.A0D(r102, 0);
        C54842te r1 = (C54842te) this.A05.get(i);
        if (r102 instanceof AnonymousClass2YV) {
            AnonymousClass2YV r103 = (AnonymousClass2YV) r102;
            AnonymousClass00C.A0D(r1, 0);
            C18740tg.A0C(r1 instanceof AnonymousClass2YS);
            AnonymousClass141 r4 = ((AnonymousClass2YS) r1).A00;
            AnonymousClass3SF r6 = r103.A01;
            TextEmojiLabel textEmojiLabel = r6.A01;
            textEmojiLabel.setText((CharSequence) null);
            C40991wR r3 = r103.A04;
            NewsletterInfoActivity newsletterInfoActivity = r3.A04;
            C36321k7.A0M(newsletterInfoActivity, textEmojiLabel, R.attr.f4nameremoved, R.color.f6nameremoved);
            TextEmojiLabel textEmojiLabel2 = r103.A00;
            C36331k8.A0r(newsletterInfoActivity, textEmojiLabel2, R.color.f6nameremoved);
            AnonymousClass1RJ r2 = r103.A03;
            C36331k8.A0r(newsletterInfoActivity, C36441kJ.A0V(r2), R.color.f6nameremoved);
            r2.A01().setBackgroundResource(R.drawable.group_info_label_gray);
            View A012 = r2.A01();
            AnonymousClass00C.A08(A012);
            A012.setVisibility(0);
            C36441kJ.A0V(r2).setText(R.string.f12nameremoved);
            r6.A05(r4);
            C36401kF.A19(r103.A02, textEmojiLabel2, r3.A03, r4);
            View view = r103.A0H;
            view.setClickable(true);
            view.setOnCreateContextMenuListener(new C90354a1(r4, r3, 3));
            AnonymousClass3Y4.A00(view, r103, 20);
            view.setBackgroundResource(R.drawable.selector_orange_gradient);
            return;
        }
        AnonymousClass2YU r104 = (AnonymousClass2YU) r102;
        C48752hz.A00(r104.A00, r104.A01, 41);
    }

    public int getItemViewType(int i) {
        Object obj = this.A05.get(i);
        if (obj instanceof AnonymousClass2YS) {
            return 0;
        }
        if (obj instanceof AnonymousClass2YT) {
            return 1;
        }
        throw C36441kJ.A18();
    }

    public C40991wR(LayoutInflater layoutInflater, C61423Bv r3, AnonymousClass1LI r4, AnonymousClass1RY r5, NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        C36321k7.A11(r4, r3, newsletterInfoActivity);
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = newsletterInfoActivity;
        this.A00 = layoutInflater;
        this.A03 = r5;
        this.A07 = z;
    }
}

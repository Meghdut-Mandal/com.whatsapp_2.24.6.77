package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2HR  reason: invalid class name */
public final class AnonymousClass2HR extends C41001wS {
    public final int A00;
    public final Context A01;
    public final AnonymousClass01z A02;
    public final C64723Pe A03;
    public final C89004Uw A04;
    public final List A05;

    public AnonymousClass2HR(Context context, AnonymousClass01z r8, C64723Pe r9, C89004Uw r10, C89014Ux r11, AnonymousClass2bZ r12) {
        Object next;
        int A012;
        String str;
        AnonymousClass00C.A0D(context, 1);
        C36321k7.A12(r8, r9, r11);
        AnonymousClass00C.A0D(r12, 6);
        this.A01 = context;
        this.A02 = r8;
        this.A03 = r9;
        C18740tg.A0B(C203369nr.A09(r12));
        List list = (List) r12.A01.A00;
        list = list == null ? C023409w.A00 : list;
        this.A05 = list;
        this.A04 = new AnonymousClass3RG(r10, r11);
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (!(A0l instanceof C23043B1o)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CarouselMessageAdapter/measureTextLines; unsupported message type for message: key=");
                C36331k8.A1P(A0l.A1J, A0u);
            } else {
                if (A0l instanceof AnonymousClass2c6) {
                    SpannableString A002 = this.A03.A00((C46852bm) A0l);
                    if (A002 != null) {
                        A012 = A01(A002, this.A01.getResources().getDimension(R.dimen.f7nameremoved));
                        if (A012 > 2) {
                            A012 = 2;
                        }
                    }
                } else {
                    C207219uk BA8 = ((C23043B1o) A0l).BA8();
                    A012 = A01((BA8 == null || (str = BA8.A09) == null) ? "" : str, this.A01.getResources().getDimension(R.dimen.f7nameremoved));
                }
                AnonymousClass000.A1F(A0J, A012);
            }
            A012 = 0;
            AnonymousClass000.A1F(A0J, A012);
        }
        Iterator it2 = A0J.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int A0I = AnonymousClass000.A0I(next);
                do {
                    Object next2 = it2.next();
                    int A0I2 = AnonymousClass000.A0I(next2);
                    if (A0I < A0I2) {
                        next = next2;
                        A0I = A0I2;
                    }
                } while (it2.hasNext());
            }
        }
        this.A00 = Math.max(1, C36381kD.A07(next));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        Context context = this.A01;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        CardView A002 = C41001wS.A00(frameLayout, viewGroup);
        A002.setCardBackgroundColor(0);
        A002.setBackgroundColor(0);
        A002.setRadius(0.0f);
        C65723Tf.A02(A002, new AnonymousClass3QI(0, 0, 0, 0));
        A002.setCardElevation(0.0f);
        A002.setElevation(0.0f);
        return new AnonymousClass2HU(context, A002, this.A02, this.A04, this.A00);
    }

    private final int A01(CharSequence charSequence, float f) {
        TextPaint textPaint = new TextPaint();
        Context context = this.A01;
        textPaint.setTypeface(C33511fU.A01());
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f);
        float f2 = (float) 2;
        int dimension = (int) ((context.getResources().getDimension(R.dimen.f7nameremoved) + (context.getResources().getDimension(R.dimen.f7nameremoved) * f2)) - (f2 * context.getResources().getDimension(R.dimen.f7nameremoved)));
        return new StaticLayout(charSequence, textPaint, dimension, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    public int A0J() {
        return this.A05.size();
    }

    public final int A0L(C64933Qa r4) {
        Iterator it = this.A05.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C36391kE.A0l(it).A1J.equals(r4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C42591z4 r22 = (C42591z4) r2;
        AnonymousClass00C.A0D(r22, 0);
        Object A0P = C007103b.A0P(this.A05, i);
        if (A0P != null) {
            r22.A0B(A0P);
        }
    }

    public int getItemViewType(int i) {
        Object A0P = C007103b.A0P(this.A05, i);
        if (A0P instanceof C46872bo) {
            return 1;
        }
        if (A0P instanceof C181778o1) {
            return 2;
        }
        if (A0P instanceof AnonymousClass2c6) {
            return 3;
        }
        return 0;
    }
}

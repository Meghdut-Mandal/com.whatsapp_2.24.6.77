package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mc  reason: invalid class name and case insensitive filesystem */
public final class C95994mc extends AnonymousClass0CZ {
    public int A00;
    public final C134606bJ A01;
    public final C157987fc A02;
    public final C134746bX A03;
    public final C109885Zm A04;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View A0Q = C90514aH.A0Q(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved);
        AnonymousClass5X0 A022 = AnonymousClass5X0.A02(this, 1);
        AnonymousClass00C.A0D(A0Q, 0);
        return new C96814nw(A0Q, A022);
    }

    public /* bridge */ /* synthetic */ void A0D(AnonymousClass0D3 r4, List list, int i) {
        View view;
        C96814nw r42 = (C96814nw) r4;
        C36321k7.A0v(r42, 0, list);
        Object A0M = C007103b.A0M(list);
        if (A0M instanceof Boolean) {
            boolean A1X = AnonymousClass000.A1X(A0M);
            boolean z = false;
            View view2 = r42.A00;
            if (A1X) {
                AnonymousClass00C.A07(view2);
                view2.setVisibility(0);
                view = r42.A0H;
                z = true;
            } else {
                AnonymousClass00C.A07(view2);
                view2.setVisibility(4);
                view = r42.A0H;
            }
            view.setSelected(z);
            return;
        }
        BSE(r42, i);
    }

    public int A0J() {
        return this.A03.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        Boolean bool;
        Context context;
        int i2;
        int i3;
        View view;
        C96814nw r102 = (C96814nw) r10;
        AnonymousClass00C.A0D(r102, 0);
        C134746bX r4 = this.A03;
        String str = ((C102234zX) r4.A01.get(i)).A00;
        C134656bO A002 = C129376Gr.A00(C129376Gr.A01(r4, i), this.A01, r4.A02);
        if (A002 != null) {
            bool = Boolean.valueOf(A002.A02);
        } else {
            bool = null;
        }
        boolean A1S = AnonymousClass000.A1S(i, this.A00);
        Boolean A0m = C36371kC.A0m();
        boolean A0J = AnonymousClass00C.A0J(bool, A0m);
        TextView textView = r102.A02;
        if (A0J) {
            textView.setText(str);
            context = textView.getContext();
            i2 = C36391kE.A04(textView.getContext());
        } else {
            SpannableString A0O = C36441kJ.A0O(str);
            A0O.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            textView.setText(A0O);
            context = textView.getContext();
            i2 = R.color.f6nameremoved;
        }
        textView.setTextColor(AnonymousClass00F.A00(context, i2));
        TextView textView2 = r102.A01;
        AnonymousClass00C.A07(textView2);
        textView2.setVisibility(C36381kD.A00(AnonymousClass00C.A0J(bool, A0m) ? 1 : 0));
        if (AnonymousClass00C.A0J(bool, A0m)) {
            textView2.setText((CharSequence) null);
        } else {
            if (C36371kC.A1X(bool, false)) {
                i3 = R.string.f12nameremoved;
            } else if (bool == null) {
                i3 = R.string.f12nameremoved;
            }
            textView2.setText(i3);
        }
        boolean z = false;
        View view2 = r102.A00;
        if (A1S) {
            AnonymousClass00C.A07(view2);
            view2.setVisibility(0);
            view = r102.A0H;
            z = true;
        } else {
            AnonymousClass00C.A07(view2);
            view2.setVisibility(4);
            view = r102.A0H;
        }
        view.setSelected(z);
    }

    public C95994mc(C134606bJ r1, C109885Zm r2, C157987fc r3, C134746bX r4, int i) {
        this.A03 = r4;
        this.A01 = r1;
        this.A02 = r3;
        this.A04 = r2;
        this.A00 = i;
    }
}

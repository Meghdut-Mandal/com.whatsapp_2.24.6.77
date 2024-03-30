package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vw  reason: invalid class name and case insensitive filesystem */
public final class C40681vw extends AnonymousClass0CZ {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final AnonymousClass171 A03;
    public final AnonymousClass1RY A04;
    public final C18820ts A05;
    public final C220412q A06;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        List list = AnonymousClass0D3.A0I;
        return new C42021y9(C36371kC.A0J(this.A02, viewGroup, R.layout.f9nameremoved, false));
    }

    public int A0J() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        Context context;
        int i2;
        C42021y9 r82 = (C42021y9) r8;
        AnonymousClass00C.A0D(r82, 0);
        List list = this.A00;
        if (list != null) {
            AnonymousClass141 r5 = (AnonymousClass141) list.get(i);
            TextView textView = r82.A01;
            String A0J = r5.A0J();
            if (A0J != null && A0J.length() > 0) {
                textView.setText(r5.A0J());
            } else if (r5.A0N()) {
                textView.setText(this.A03.A0S(r5, false));
                textView.setSingleLine(false);
            } else {
                String A0D = this.A06.A0D(C36351kA.A0j(r5));
                if (A0D == null || A0D.length() <= 0) {
                    String str = r5.A0a;
                    if (str == null || str.length() <= 0) {
                        A0D = AnonymousClass3U8.A02(this.A05, r5);
                        textView.setSingleLine(true);
                    } else {
                        A0D = AnonymousClass171.A03(this.A03, r5, R.string.f12nameremoved);
                        textView.setSingleLine(false);
                        context = this.A01;
                        i2 = R.color.f6nameremoved;
                        C36331k8.A0r(context, textView, i2);
                        textView.setText(A0D);
                        this.A04.A0B(r82.A00, r5, false);
                    }
                } else {
                    textView.setSingleLine(false);
                }
                context = this.A01;
                i2 = C36391kE.A04(context);
                C36331k8.A0r(context, textView, i2);
                textView.setText(A0D);
                this.A04.A0B(r82.A00, r5, false);
            }
            C36321k7.A0M(this.A01, textView, R.attr.f4nameremoved, R.color.f6nameremoved);
            this.A04.A0B(r82.A00, r5, false);
        }
    }

    public C40681vw(Context context, LayoutInflater layoutInflater, AnonymousClass171 r4, AnonymousClass1RY r5, C18820ts r6, C220412q r7) {
        C36321k7.A19(r7, layoutInflater, r4, r6);
        AnonymousClass00C.A0D(r5, 6);
        this.A01 = context;
        this.A06 = r7;
        this.A02 = layoutInflater;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }
}

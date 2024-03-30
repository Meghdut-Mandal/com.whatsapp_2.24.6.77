package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1w9  reason: invalid class name and case insensitive filesystem */
public class C40811w9 extends AnonymousClass0CZ {
    public int A00;
    public List A01;
    public final /* synthetic */ AnonymousClass3HI A02;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        LayoutInflater layoutInflater = this.A02.A02;
        if (i != 0) {
            return new C41871xu(layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false));
        }
        return new C42011y8(layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false));
    }

    public C40811w9(AnonymousClass3HI r1) {
        this.A02 = r1;
    }

    public int A0J() {
        int A06 = C36371kC.A06(this.A01);
        List list = this.A01;
        int i = this.A00;
        if (list != null) {
            i -= list.size();
        }
        if (i <= 0 || A06 <= 0) {
            return A06;
        }
        return A06 + 1;
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        int i2 = this.A00;
        if (list != null) {
            i2 -= list.size();
        }
        if (i2 <= 0 || i != this.A01.size()) {
            return 0;
        }
        return 1;
    }

    public void BSE(AnonymousClass0D3 r8, int i) {
        Context context;
        int i2;
        String A0S;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C42011y8 r82 = (C42011y8) r8;
            AnonymousClass141 r6 = (AnonymousClass141) this.A01.get(i);
            AnonymousClass3HI r4 = this.A02;
            List list = AnonymousClass0D3.A0I;
            TextView textView = r82.A01;
            if (!C36421kH.A1Y(r6)) {
                A0S = r6.A0J();
            } else if (r6.A0N()) {
                A0S = r4.A08.A0S(r6, false);
            } else {
                String A0D = r4.A0B.A0D(C36351kA.A0j(r6));
                if (!TextUtils.isEmpty(A0D)) {
                    textView.setSingleLine(false);
                } else if (!TextUtils.isEmpty(r6.A0a)) {
                    A0D = AnonymousClass171.A03(r4.A08, r6, R.string.f12nameremoved);
                    textView.setSingleLine(false);
                    context = r4.A01;
                    i2 = R.color.f6nameremoved;
                    C36331k8.A0r(context, textView, i2);
                    textView.setText(A0D);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    r4.A09.A0B(r82.A00, r6, false);
                } else {
                    A0D = AnonymousClass3U8.A02(r4.A0A, r6);
                    textView.setSingleLine(true);
                }
                context = r4.A01;
                i2 = C36391kE.A04(context);
                C36331k8.A0r(context, textView, i2);
                textView.setText(A0D);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                r4.A09.A0B(r82.A00, r6, false);
            }
            textView.setText(A0S);
            textView.setSingleLine(false);
            C36321k7.A0M(r4.A01, textView, R.attr.f4nameremoved, R.color.f6nameremoved);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            r4.A09.A0B(r82.A00, r6, false);
        } else if (itemViewType == 1) {
            List list2 = AnonymousClass0D3.A0I;
            TextView textView2 = ((C41871xu) r8).A00;
            Context context2 = this.A02.A01;
            Object[] objArr = new Object[1];
            List list3 = this.A01;
            int i3 = this.A00;
            if (list3 != null) {
                i3 -= list3.size();
            }
            AnonymousClass000.A1L(objArr, i3, 0);
            C36341k9.A0s(context2, textView2, objArr, R.string.f12nameremoved);
        }
    }
}

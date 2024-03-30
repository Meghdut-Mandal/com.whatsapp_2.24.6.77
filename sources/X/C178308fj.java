package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8fj  reason: invalid class name and case insensitive filesystem */
public final class C178308fj extends C168107zi {
    public final C02840Cc A00 = new C02840Cc((C02830Cb) new C23136B6u(2), (AnonymousClass0CZ) this);
    public final C24801Dv A01;
    public final AnonymousClass171 A02;

    public C178308fj(AnonymousClass012 r9, C24801Dv r10, AnonymousClass171 r11, AnonymousClass1RY r12, AnonymousClass3ET r13, C167707yf r14, boolean z) {
        super(r9, r12, r13, r14, z);
        this.A02 = r11;
        this.A01 = r10;
    }

    public void BSE(AnonymousClass0D3 r10, int i) {
        String str;
        AnonymousClass11F r0;
        AnonymousClass141 r02;
        AnonymousClass141 r7;
        AnonymousClass00C.A0D(r10, 0);
        C191909Ey r1 = (C191909Ey) this.A00.A03.get(i);
        if ((r1 instanceof C178268ff) && (r10 instanceof AnonymousClass804)) {
            C195829We r4 = ((C178268ff) r1).A00;
            AnonymousClass804 r102 = (AnonymousClass804) r10;
            AnonymousClass9Vi r6 = r4.A00;
            AnonymousClass3YM r5 = null;
            if (r6 != null) {
                AnonymousClass141 r2 = r6.A00;
                if (r2 == null) {
                    String str2 = r6.A01;
                    if (str2 != null) {
                        r102.A04.A02.A00(r102.A03, str2);
                    }
                } else {
                    r102.A04.A01.A08(r102.A03, r2);
                }
            }
            r102.A02.A0I(r4.A03);
            TextView textView = r102.A01;
            if (r6 == null || (r7 = r6.A00) == null) {
                str = null;
            } else {
                str = r102.A04.A02.A0E(r7, -1, false, true).A01;
            }
            textView.setText(str);
            View view = r102.A0H;
            view.setContentDescription(textView.getText());
            if (r6 == null || (r02 = r6.A00) == null) {
                r0 = null;
            } else {
                r0 = r02.A0H;
            }
            UserJid A0b = C36401kF.A0b(r0);
            if (A0b != null) {
                r5 = new AnonymousClass3YM(r102.A04, r102, A0b, 5);
            }
            view.setOnClickListener(r5);
            if (this.A04) {
                C167707yf r12 = this.A03;
                ImageView imageView = r102.A00;
                AnonymousClass3T1 r42 = r4.A01;
                AnonymousClass00C.A0D(imageView, 0);
                C001700s A0S = C36431kI.A0S();
                r12.A09.A0C(imageView, r42, new C203339no(imageView, A0S, 1));
                BA8.A01(this.A00, A0S, new C22427AmS(r102), 28);
            }
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        int i2;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            i2 = R.layout.f9nameremoved;
        } else {
            List list2 = AnonymousClass0D3.A0I;
            i2 = R.layout.f9nameremoved;
            if (i != 2) {
                return new AnonymousClass804(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), this);
            }
        }
        return new C168237zv(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, i2, false), this);
    }

    public int getItemViewType(int i) {
        return ((C191909Ey) this.A00.A03.get(i)).A00.ordinal();
    }
}

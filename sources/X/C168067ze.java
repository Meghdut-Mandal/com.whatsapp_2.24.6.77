package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ze  reason: invalid class name and case insensitive filesystem */
public final class C168067ze extends AnonymousClass0CZ {
    public final int A00;
    public final Activity A01;
    public final AnonymousClass1Pp A02;
    public final AnonymousClass1RY A03;
    public final AnonymousClass9ID A04;
    public final AnonymousClass1FR A05;
    public final List A06;
    public final List A07;

    public void BSE(AnonymousClass0D3 r8, int i) {
        AnonymousClass00C.A0D(r8, 0);
        int i2 = r8.A01;
        if (i2 == 0) {
            AnonymousClass80K r82 = (AnonymousClass80K) r8;
            C21668AUl aUl = (C21668AUl) this.A06.get(i);
            if (aUl.A06) {
                r82.A01.setText(this.A05.A0N(aUl.A03, (AnonymousClass11F) null, false));
                this.A02.A06(r82.A00, R.drawable.avatar_contact);
                return;
            }
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                if (AnonymousClass00C.A0J(A0f.A0H, aUl.A04)) {
                    this.A03.A08(r82.A00, A0f);
                    r82.A01.setText(this.A05.A0N(aUl.A03, A0f.A0H, false));
                    return;
                }
            }
        } else if (i2 == 1 && i == 3) {
            AnonymousClass80L r83 = (AnonymousClass80L) r8;
            r83.A01.setText(R.string.f12nameremoved);
            r83.A00.setImageResource(R.drawable.ic_view_all);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 r2;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            r2 = new AnonymousClass80K(C36371kC.A0J(this.A01.getLayoutInflater(), viewGroup, R.layout.f9nameremoved, false), this.A04);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            r2 = new AnonymousClass80L(C36371kC.A0J(this.A01.getLayoutInflater(), viewGroup, R.layout.f9nameremoved, false), this.A04);
        } else {
            throw AnonymousClass001.A08("Invalid view type");
        }
        return r2;
    }

    public int getItemViewType(int i) {
        return i <= 2 ? 0 : 1;
    }

    public int A0J() {
        int size = this.A06.size();
        if (size > 3) {
            return this.A00;
        }
        return size;
    }

    public C168067ze(Activity activity, AnonymousClass1Pp r3, AnonymousClass1RY r4, AnonymousClass9ID r5, AnonymousClass1FR r6, List list, List list2, int i) {
        C36321k7.A11(activity, r3, list);
        C36381kD.A1K(r4, 5, r6);
        this.A01 = activity;
        this.A02 = r3;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = r4;
        this.A00 = i;
        this.A05 = r6;
        this.A04 = r5;
    }
}

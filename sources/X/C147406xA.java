package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.6xA  reason: invalid class name and case insensitive filesystem */
public class C147406xA implements C160157kY {
    public int A00;
    public C129046Es A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final C95954mY A04;
    public final ArrayList A05 = AnonymousClass001.A0I();

    public void BcC(int i) {
        ArrayList arrayList;
        C162497og r2;
        int i2 = this.A00;
        if (i != i2) {
            int i3 = 0;
            while (true) {
                arrayList = this.A05;
                if (i3 < arrayList.size()) {
                    if (i2 == ((C1267165e) arrayList.get(i3)).A00()) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            this.A00 = i;
            int i4 = 0;
            while (true) {
                if (i4 < arrayList.size()) {
                    if (i == ((C1267165e) arrayList.get(i4)).A00()) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 != i3) {
                LinearLayoutManager linearLayoutManager = this.A03;
                int A1S = linearLayoutManager.A1S();
                int A1U = linearLayoutManager.A1U();
                int i5 = ((A1U - A1S) * 2) / 5;
                int i6 = i4 - i5;
                if (i6 < A1S) {
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    r2 = new C162497og(this.A02.getContext(), this, 4);
                    r2.A00 = i6;
                } else {
                    int i7 = i4 + i5;
                    if (i7 > A1U) {
                        if (i7 >= linearLayoutManager.A0M()) {
                            i7 = linearLayoutManager.A0M() - 1;
                        }
                        r2 = new C162497og(this.A02.getContext(), this, 4);
                        r2.A00 = i7;
                    }
                }
                linearLayoutManager.A0g(r2);
            }
            C129046Es r0 = this.A01;
            if (r0 != null) {
                r0.A05(i);
            }
            this.A04.A06();
        }
    }

    public void Bqd(C129046Es r4) {
        this.A01 = r4;
        if (r4 != null) {
            int A042 = r4.A04();
            if (A042 < 0) {
                C90494aF.A1J("AvatarPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, new Object[0]);
                A042 = 0;
            }
            BcC(A042);
        }
    }

    public C147406xA(View view) {
        this.A02 = view.findViewById(R.id.avatar_picker_header);
        RecyclerView A0J = C90504aG.A0J(view, R.id.avatar_header_recycler);
        A0J.A0U = false;
        LinearLayoutManager A0T = C36431kI.A0T();
        this.A03 = A0T;
        A0T.A1f(0);
        A0J.setLayoutManager(A0T);
        C95954mY r0 = new C95954mY(this);
        this.A04 = r0;
        A0J.setAdapter(r0);
    }

    public View BJ2() {
        return this.A02;
    }
}

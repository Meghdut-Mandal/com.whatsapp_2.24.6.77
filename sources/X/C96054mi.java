package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.4mi  reason: invalid class name and case insensitive filesystem */
public final class C96054mi extends AnonymousClass0CZ {
    public int A00 = -1;
    public CharSequence A01 = "";
    public final List A02;
    public final C006302t A03;
    public final boolean A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final AnonymousClass1N0 A07;
    public final AnonymousClass1H2 A08;
    public final C19890wg A09;

    public void A0K(AnonymousClass0D3 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 instanceof C96894o4) {
            C96894o4 r32 = (C96894o4) r3;
            C66803Xj r1 = r32.A01;
            if (r1 != null) {
                r32.A03.removeTextChangedListener(r1);
            }
            AnonymousClass2gA r12 = r32.A00;
            if (r12 != null) {
                r32.A03.removeTextChangedListener(r12);
            }
            r32.A01 = null;
            r32.A00 = null;
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            View A0Q = C90514aH.A0Q(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
            if (this.A04) {
                int A012 = C65103Qt.A01(viewGroup.getContext(), 16.0f);
                A0Q.setPadding(A012, 0, A012, 0);
            }
            return new C96564nX(A0Q);
        } else if (i == 1) {
            View A0Q2 = C90514aH.A0Q(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
            if (this.A04) {
                int A013 = C65103Qt.A01(viewGroup.getContext(), 8.0f);
                int A014 = C65103Qt.A01(viewGroup.getContext(), 16.0f);
                A0Q2.setPadding(A014, 0, A014, A013);
            }
            AnonymousClass1H2 r8 = this.A08;
            return new C96894o4(A0Q2, this.A05, this.A06, this.A07, r8, this.A09);
        } else {
            throw AnonymousClass001.A09("Unsupported view type");
        }
    }

    public int A0J() {
        return this.A02.size();
    }

    public void BSE(AnonymousClass0D3 r18, int i) {
        AnonymousClass0D3 r1 = r18;
        AnonymousClass00C.A0D(r1, 0);
        int i2 = r1.A01;
        boolean z = false;
        int i3 = i;
        if (i2 == 0) {
            C96564nX r12 = (C96564nX) r1;
            String str = ((AnonymousClass6B6) this.A02.get(i3)).A02;
            if (i3 == this.A00) {
                z = true;
            }
            C153127Nd r2 = new C153127Nd(this, i3);
            AppCompatRadioButton appCompatRadioButton = r12.A00;
            appCompatRadioButton.setText(str);
            appCompatRadioButton.setChecked(z);
            C36361kB.A18(appCompatRadioButton, r2, 13);
        } else if (i2 == 1) {
            C96894o4 r13 = (C96894o4) r1;
            String str2 = ((AnonymousClass6B6) this.A02.get(i3)).A02;
            boolean A1S = AnonymousClass000.A1S(i3, this.A00);
            CharSequence charSequence = this.A01;
            C153137Ne r5 = new C153137Ne(this, i3);
            AnonymousClass7S1 r4 = new AnonymousClass7S1(this);
            AppCompatRadioButton appCompatRadioButton2 = r13.A02;
            appCompatRadioButton2.setText(str2);
            appCompatRadioButton2.setChecked(A1S);
            C36361kB.A18(appCompatRadioButton2, r5, 12);
            WaEditText waEditText = r13.A03;
            C66803Xj r0 = r13.A01;
            if (r0 != null) {
                waEditText.removeTextChangedListener(r0);
            }
            r13.A01 = new C162917pM(r4, 0);
            AnonymousClass2gA r02 = r13.A00;
            if (r02 != null) {
                waEditText.removeTextChangedListener(r02);
            }
            AnonymousClass1H2 r10 = r13.A08;
            C21060yb r7 = r13.A05;
            C18820ts r8 = r13.A06;
            C19890wg r11 = r13.A09;
            r13.A00 = new AnonymousClass2gA(waEditText, r13.A04, r7, r8, r13.A07, r10, r11, 30, 30, false, false, false);
            waEditText.setText(charSequence);
            waEditText.addTextChangedListener(r13.A00);
            waEditText.addTextChangedListener(r13.A01);
            if (charSequence.length() > 0) {
                waEditText.requestFocus();
                waEditText.setSelection(waEditText.length());
            }
        }
    }

    public int getItemViewType(int i) {
        if (!"other".equalsIgnoreCase(((AnonymousClass6B6) this.A02.get(i)).A01) || this.A00 != i) {
            return 0;
        }
        return 1;
    }

    public C96054mi(C21060yb r2, C18820ts r3, AnonymousClass1N0 r4, AnonymousClass1H2 r5, C19890wg r6, List list, C006302t r8, boolean z) {
        this.A08 = r5;
        this.A05 = r2;
        this.A06 = r3;
        this.A02 = list;
        this.A09 = r6;
        this.A07 = r4;
        this.A04 = z;
        this.A03 = r8;
    }
}

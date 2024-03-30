package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.R;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.3Xh  reason: invalid class name and case insensitive filesystem */
public class C66783Xh implements InputFilter {
    public final /* synthetic */ AnonymousClass3OJ A00;

    public C66783Xh(AnonymousClass3OJ r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        Spanned spanned2 = spanned;
        boolean z2 = false;
        int i5 = i3;
        int i6 = i4;
        int A03 = AnonymousClass3UN.A03(spanned2, 0, spanned2.length()) - AnonymousClass3UN.A03(spanned2, i5, i6);
        int A032 = AnonymousClass3UN.A03(charSequence, i, i2) + A03;
        AnonymousClass3OJ r7 = this.A00;
        int A002 = (AnonymousClass3OJ.A00(spanned2, 0, spanned2.length()) - AnonymousClass3OJ.A00(spanned2, i5, i6)) + 1;
        int A003 = AnonymousClass3OJ.A00(charSequence, i, i2) + A002;
        StringBuilder sb = new StringBuilder(spanned2.toString());
        sb.replace(i5, i6, charSequence.subSequence(i, i2).toString());
        String A033 = r7.A0F.A03(sb.toString());
        int A034 = AnonymousClass3UN.A03(sb, 0, sb.length());
        int A004 = AnonymousClass3OJ.A00(sb.toString(), 0, sb.length()) + 1;
        int i7 = 5;
        int i8 = 350;
        if (A033 == null || r7.A06.getVisibility() == 0 || (A034 <= 350 && A004 <= 5)) {
            z = false;
        } else {
            z = true;
        }
        r7.A05 = z;
        if (A033 != null && !A033.equals(r7.A03) && !z) {
            z2 = true;
        }
        r7.A0L.A01 = z2;
        if (!z2) {
            i8 = 700;
            i7 = 10;
        }
        int i9 = i8 - A03;
        int i10 = i7 - A002;
        if (A032 <= i8 && A003 <= i7) {
            return null;
        }
        if (A03 < i8 && A002 < i7) {
            TextStatusComposerActivity textStatusComposerActivity = r7.A0M.A00;
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1J(A0M, i8);
            AnonymousClass000.A1K(A0M, i7);
            textStatusComposerActivity.BO6(textStatusComposerActivity.getString(R.string.f12nameremoved, A0M));
            return AnonymousClass3UN.A06(charSequence, i, i2, i10, i9);
        } else if (i2 - i <= 0) {
            return "";
        } else {
            TextStatusComposerActivity textStatusComposerActivity2 = r7.A0M.A00;
            Object[] A0M2 = AnonymousClass001.A0M();
            AnonymousClass000.A1J(A0M2, i8);
            AnonymousClass000.A1K(A0M2, i7);
            textStatusComposerActivity2.BO6(textStatusComposerActivity2.getString(R.string.f12nameremoved, A0M2));
            return "";
        }
    }
}

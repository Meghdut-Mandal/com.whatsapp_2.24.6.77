package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.6cH  reason: invalid class name and case insensitive filesystem */
public class C135176cH implements InputFilter {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ C160377ku A02;

    public C135176cH(C1271967i r1, C140456lc r2, C160377ku r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.replace(i3, i4, charSequence.toString());
        AnonymousClass6MO A04 = C1273868b.A04(C1273868b.A03(obj), stringBuffer.toString(), 1);
        C140456lc r0 = this.A01;
        C160377ku r2 = this.A02;
        if (C129316Gk.A01(AnonymousClass6JI.A00(C100674vP.A00(this.A00, r2, r0.A08), A04, r2))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}

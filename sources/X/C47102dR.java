package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2dR  reason: invalid class name and case insensitive filesystem */
public class C47102dR extends C47152dY {
    public WaImageView A00;
    public C18820ts A01;
    public C20810yC A02;
    public C38711pZ A03;
    public boolean A04;

    public void setMessage(C46972by r11, List list) {
        String string;
        C20810yC r2 = this.A02;
        if (!TextUtils.isEmpty(r11.A1b())) {
            string = r11.A1b();
        } else {
            string = getContext().getString(R.string.f12nameremoved);
        }
        String A002 = C55742v7.A00(r2, string, 3);
        String A022 = AnonymousClass3TF.A02(this.A01, r11.A00);
        String A003 = C55742v7.A00(this.A02, AnonymousClass1Ax.A02(r11.A05).toUpperCase(Locale.US), 1);
        if (TextUtils.isEmpty(A003) && !TextUtils.isEmpty(r11.A1b())) {
            A003 = AnonymousClass6YY.A07(r11.A1b()).toUpperCase(Locale.US);
        }
        this.A03.setTitleAndDescription(A002, (String) null, list);
        boolean A1Y = C36351kA.A1Y(this.A01);
        C38711pZ r3 = this.A03;
        Context context = getContext();
        Object[] objArr = new Object[2];
        if (A1Y) {
            objArr[0] = A022;
            r3.setSubText(C36391kE.A0v(context, A003, objArr, 1, R.string.f12nameremoved), (List) null);
        } else {
            objArr[0] = A003;
            r3.setSubText(C36391kE.A0v(context, A022, objArr, 1, R.string.f12nameremoved), (List) null);
        }
        this.A00.setImageDrawable(AnonymousClass3MS.A00(getContext(), r11));
    }

    public C47102dR(Context context) {
        super(context);
        A02();
        A03();
    }
}

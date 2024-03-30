package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1pW  reason: invalid class name and case insensitive filesystem */
public class C38691pW extends LinearLayout implements C18700tb {
    public TextView A00;
    public C21100yf A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(String str) {
        String A07 = this.A01.A07(C21100yf.A26);
        if (TextUtils.isEmpty(A07) || !C203419nz.A07(str)) {
            if (!TextUtils.isEmpty(A07)) {
                str = null;
            } else {
                setVisibility(8);
                return;
            }
        }
        setWhatsAppContactDetails(A07, str);
    }

    public C38691pW(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C36431kI.A0W(C36391kE.A0W(generatedComponent()));
        }
        this.A00 = C36391kE.A0P(C36411kG.A0J(C36351kA.A0C(this), this, R.layout.f9nameremoved), R.id.contact_bank_details);
    }

    private void setWhatsAppContactDetails(String str, String str2) {
        int i;
        Object[] objArr;
        boolean A07 = C203419nz.A07(str2);
        Context context = getContext();
        if (A07) {
            i = R.string.f12nameremoved;
            objArr = C36411kG.A1b(str);
            objArr[1] = str2;
        } else {
            i = R.string.f12nameremoved;
            objArr = new Object[]{str};
        }
        String string = context.getString(i, objArr);
        SpannableString A0O = C36441kJ.A0O(string);
        C36401kF.A15(A0O, AnonymousClass000.A0p("tel:", str, AnonymousClass000.A0u()), string, str);
        TextView textView = this.A00;
        textView.setText(A0O);
        textView.setVisibility(0);
    }
}

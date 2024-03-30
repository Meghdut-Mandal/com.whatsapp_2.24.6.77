package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1pX  reason: invalid class name and case insensitive filesystem */
public class C38701pX extends LinearLayout implements C18700tb {
    public ImageView A00;
    public TextView A01;
    public C24601Db A02;
    public AnonymousClass1QZ A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(C207249un r2, String str, String str2) {
        if (r2 == null || TextUtils.isEmpty(str) || !C203419nz.A07(str2)) {
            setVisibility(8);
        } else {
            setBankContactDetails(r2, str2, str);
        }
    }

    public C38701pX(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = (C24601Db) C36391kE.A0W(generatedComponent()).A6D.get();
        }
        View A0J = C36411kG.A0J(C36351kA.A0C(this), this, R.layout.f9nameremoved);
        this.A00 = C36391kE.A0N(A0J, R.id.bank_logo);
        this.A01 = C36391kE.A0P(A0J, R.id.contact_bank_details);
    }

    private void setBankContactDetails(C207249un r6, String str, String str2) {
        Context context = getContext();
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = r6.A0B;
        A1Q[1] = str2;
        String A0v = C36391kE.A0v(context, str, A1Q, 2, R.string.f12nameremoved);
        SpannableString A0O = C36441kJ.A0O(A0v);
        C36401kF.A15(A0O, AnonymousClass000.A0p("tel:", str2, AnonymousClass000.A0u()), A0v, str2);
        TextView textView = this.A01;
        textView.setText(A0O);
        Bitmap A0A = r6.A0A();
        if (A0A != null) {
            ImageView imageView = this.A00;
            imageView.setImageBitmap(A0A);
            imageView.setVisibility(0);
        }
        textView.setVisibility(0);
    }
}

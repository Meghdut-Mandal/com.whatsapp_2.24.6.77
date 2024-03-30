package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4fX  reason: invalid class name and case insensitive filesystem */
public class C93074fX extends LinearLayout implements C18700tb {
    public TextEmojiLabel A00;
    public AnonymousClass6LH A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    public C93074fX(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = (AnonymousClass6LH) C36391kE.A0W(generatedComponent()).A00.A0Y.get();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = C36401kF.A0O(this, R.id.beta_text);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFAQLink(String str) {
        AnonymousClass6LH.A00(getContext(), this.A00, this.A01, getContext().getString(R.string.f12nameremoved), "account-and-profile", str);
    }
}

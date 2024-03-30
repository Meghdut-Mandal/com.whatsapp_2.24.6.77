package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4er  reason: invalid class name and case insensitive filesystem */
public class C92844er extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final Context A02;
    public final ViewGroup.MarginLayoutParams A03;
    public final TextView A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92844er(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = context;
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A04 = C36391kE.A0O(this, R.id.title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A03 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        C90474aD.A0y(this);
    }
}

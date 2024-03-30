package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1pO  reason: invalid class name and case insensitive filesystem */
public class C38611pO extends LinearLayout implements C18700tb {
    public WaImageView A00;
    public WaTextView A01;
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

    public void setChecked(boolean z) {
        this.A00.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setText(int i) {
        this.A01.setText(i);
    }

    public C38611pO(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        C36361kB.A09(this).resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        this.A01 = C36401kF.A0Q(this, R.id.storage_usage_sort_row_text);
        this.A00 = C36431kI.A0X(this, R.id.storage_usage_sort_row_checkmark);
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.crop.CropImageView;

/* renamed from: X.1qv  reason: invalid class name and case insensitive filesystem */
public abstract class C39021qv extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C39021qv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CropImageView cropImageView = (CropImageView) this;
        if (!cropImageView.A00) {
            cropImageView.A00 = true;
            cropImageView.generatedComponent();
        }
    }
}

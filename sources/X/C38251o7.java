package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.1o7  reason: invalid class name and case insensitive filesystem */
public class C38251o7 extends FrameLayout implements C18700tb {
    public AnonymousClass2Ty A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final WaTextView A03;
    public final StorageUsageMediaPreviewOverflowOverlayView A04;

    public C38251o7(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        this.A04 = (StorageUsageMediaPreviewOverflowOverlayView) C012005e.A02(this, R.id.overflow_overlay_view);
        this.A03 = C36401kF.A0Q(this, R.id.overflow_text_view);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04.setFrameDrawable(drawable);
        AnonymousClass2Ty r0 = this.A00;
        if (r0 != null) {
            r0.setFrameDrawable(drawable);
        }
    }
}

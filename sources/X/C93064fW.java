package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4fW  reason: invalid class name and case insensitive filesystem */
public class C93064fW extends LinearLayout implements C18700tb {
    public int A00;
    public LinearLayout A01;
    public ThumbnailButton A02;
    public AnonymousClass1RJ A03;
    public AnonymousClass1QZ A04;
    public boolean A05;

    public C93064fW(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setOrientation(1);
        setGravity(1);
        this.A01 = C90514aH.A0U(this, R.id.contact_photo_layout);
        this.A02 = (ThumbnailButton) C012005e.A02(this, R.id.contact_photo);
        this.A03 = C36341k9.A0X(this, R.id.peers_not_in_face_pile_count_text_stub);
    }

    public int A00(int i) {
        Resources resources;
        int i2;
        if (this.A00 != 0) {
            resources = getResources();
            i2 = this.A00;
        } else {
            resources = getResources();
            if (i == 1) {
                i2 = R.dimen.f7nameremoved;
            } else {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                if (i >= 2) {
                    return dimensionPixelSize - ((i - 2) * getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                }
                return 0;
            }
        }
        return resources.getDimensionPixelSize(i2);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getContactPhoto() {
        return this.A02;
    }

    public LinearLayout getContactPhotoLayout() {
        return this.A01;
    }

    public void setFixedContactPhotoSizeRes(int i) {
        this.A00 = i;
    }
}

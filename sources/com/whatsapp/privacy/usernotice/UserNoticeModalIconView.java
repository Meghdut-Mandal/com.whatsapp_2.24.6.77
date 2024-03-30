package com.whatsapp.privacy.usernotice;

import X.AnonymousClass5HR;
import X.C18800tq;
import X.C36341k9;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;

public class UserNoticeModalIconView extends AnonymousClass5HR {
    public ImageView A00;
    public boolean A01;

    public void A03() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36341k9.A0T(A0W);
            this.A00 = C36341k9.A0Z(A0W);
        }
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setDefaultIconView(ImageView imageView) {
        this.A00 = imageView;
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public UserNoticeModalIconView(Context context) {
        super(context);
        A03();
    }
}

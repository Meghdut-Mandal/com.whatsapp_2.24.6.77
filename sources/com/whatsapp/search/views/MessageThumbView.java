package com.whatsapp.search.views;

import X.AnonymousClass1SV;
import X.AnonymousClass2bU;
import X.C148956zh;
import X.C160527l9;
import X.C181788o2;
import X.C181798o3;
import X.C18800tq;
import X.C33521fV;
import X.C36341k9;
import X.C36391kE;
import X.C36411kG;
import X.C46882bp;
import X.C46892bq;
import X.C47012ca;
import X.C66013Ui;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class MessageThumbView extends WaImageView {
    public int A00;
    public AnonymousClass1SV A01;
    public AnonymousClass2bU A02;
    public boolean A03;
    public final C160527l9 A04;

    private int getNotDownloadedContentDescription() {
        AnonymousClass2bU r1 = this.A02;
        if ((r1 instanceof C46882bp) || (r1 instanceof C46892bq) || (r1 instanceof C181788o2) || (r1 instanceof C181798o3) || (r1 instanceof C47012ca)) {
            return R.string.f12nameremoved;
        }
        return -1;
    }

    public void A03() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36341k9.A0T(A0W);
            this.A01 = (AnonymousClass1SV) A0W.A5I.get();
        }
    }

    public void setMessage(AnonymousClass2bU r3) {
        if (this.A01 != null) {
            this.A02 = r3;
            C160527l9 r1 = this.A04;
            r1.Btu(this);
            this.A01.A0C(this, r3, r1);
        }
    }

    public void setStatus(int i) {
        Resources resources;
        int i2;
        if (this.A00 != null && this.A02 != null) {
            C33521fV.A01(this);
            if (i == 0 || i == 1) {
                resources = getResources();
                i2 = R.string.f12nameremoved;
            } else if (i == 2 || i == 3) {
                resources = getResources();
                i2 = R.string.f12nameremoved;
            } else {
                C33521fV.A03(this, R.string.f12nameremoved);
                setOnClickListener((View.OnClickListener) null);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    setContentDescription(C36411kG.A0w(getResources(), C66013Ui.A0E(this.A00, this.A02.A00), new Object[1], 0, notDownloadedContentDescription));
                    return;
                }
                return;
            }
            setContentDescription(resources.getString(i2));
            setOnClickListener((View.OnClickListener) null);
        }
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A04 = new C148956zh(this);
    }

    public void setRadius(int i) {
        this.A00 = i;
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A04 = new C148956zh(this);
    }

    public MessageThumbView(Context context) {
        this(context, (AttributeSet) null);
    }
}

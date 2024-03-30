package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C33521fV;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C90104Zc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class CollapsingProfilePhotoView extends FrameLayout implements C18700tb {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ImageView A07;
    public C18820ts A08;
    public WDSProfilePhoto A09;
    public AnonymousClass1QZ A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;

    public void A02(int i, int i2) {
        if (i != -1 && i2 != -1) {
            this.A06 = i;
            this.A01 = i2;
            if (this.A02 != 0) {
                int i3 = (i - i2) / 2;
                if (!C36351kA.A1Y(this.A08)) {
                    i = (this.A02 - i2) - ((int) this.A00);
                }
                this.A04 = i - i3;
            }
        }
    }

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            this.A08 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0A;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public void setAnimationValue(float f) {
        float f2;
        float f3;
        if (!this.A0B) {
            this.A0B = AnonymousClass000.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        boolean A1Y = C36351kA.A1Y(this.A08);
        int i = this.A04;
        if (i != -1) {
            float f4 = this.A00;
            if (f4 != -1.0f) {
                float A012 = 1.0f - ((1.0f - (f4 / C36441kJ.A01(this.A09))) * f);
                float A013 = (C36441kJ.A01(this.A09) - this.A00) / 2.0f;
                if (A1Y) {
                    f2 = -(((float) (this.A05 - this.A04)) + A013);
                } else {
                    f2 = ((float) (this.A04 - this.A05)) - A013;
                }
                this.A09.setTranslationX(f2 * f);
                this.A09.setScaleX(A012);
                this.A09.setScaleY(A012);
                int width = this.A07.getWidth();
                if (this.A0C && width > 0) {
                    float f5 = this.A00;
                    float f6 = (float) width;
                    float f7 = 1.0f - ((1.0f - (f5 / f6)) * f);
                    float f8 = (f6 - f5) / 2.0f;
                    if (A1Y) {
                        f3 = -(((float) (this.A03 - this.A04)) + f8);
                    } else {
                        f3 = ((float) (this.A04 - this.A03)) - f8;
                    }
                    this.A07.setTranslationX(f3 * f);
                    this.A07.setScaleX(f7);
                    this.A07.setScaleY(f7);
                    return;
                }
                return;
            }
        }
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1L(A0M, i, 0);
        AnonymousClass000.A1I(A0M, this.A00, 1);
        String.format("Required values not set: profilePhotoCollapsedX = %s , targetDimen = %s", A0M);
    }

    public void setHaloEnabled(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            this.A07.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
    }

    public CollapsingProfilePhotoView(Context context) {
        super(context);
        A01();
        boolean A1X = C36421kH.A1X(this);
        this.A0E = C36391kE.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1X;
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A09 = (WDSProfilePhoto) C012005e.A02(this, R.id.wds_profile_picture);
        this.A07 = C36401kF.A0G(this, R.id.profile_photo_halo);
        C90104Zc.A00(this.A09.getViewTreeObserver(), this, 8);
        C33521fV.A03(this.A09, R.string.f12nameremoved);
    }

    public WDSProfilePhoto getProfileImage() {
        return this.A09;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            int left = this.A09.getLeft();
            this.A05 = left;
            this.A03 = left;
        }
    }

    public void setCollapsedProfilePhotoDimen(float f) {
        this.A00 = f;
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        boolean A1X = C36421kH.A1X(this);
        this.A0E = C36391kE.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1X;
        A00(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        boolean A1X = C36421kH.A1X(this);
        this.A0E = C36391kE.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1X;
        A00(context);
    }
}

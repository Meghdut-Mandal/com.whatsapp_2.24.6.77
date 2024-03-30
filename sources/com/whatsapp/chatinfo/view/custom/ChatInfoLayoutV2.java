package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00F;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RC;
import X.AnonymousClass2Dr;
import X.AnonymousClass2E3;
import X.C012005e;
import X.C19550w8;
import X.C224514j;
import X.C24801Dv;
import X.C36331k8;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C61953Ed;
import X.C90104Zc;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class ChatInfoLayoutV2 extends AnonymousClass2E3 {
    public float A00;
    public int A01 = 0;
    public ImageView A02;
    public ImageView A03;
    public CollapsingProfilePhotoView A04;
    public AnonymousClass1Pp A05;
    public boolean A06 = true;
    public int A07 = 0;
    public C61953Ed A08;

    public static void A01(ChatInfoLayoutV2 chatInfoLayoutV2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chatInfoLayoutV2.A0H.getLayoutParams();
        int i = 80;
        if (chatInfoLayoutV2.getWidth() >= chatInfoLayoutV2.getHeight()) {
            i = 17;
        }
        layoutParams.gravity = i;
        chatInfoLayoutV2.A0H.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2 r5) {
        /*
            X.3Ed r4 = r5.A08
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r2 = r5.A04
            boolean r0 = r5.A06
            r3 = 1
            if (r0 == 0) goto L_0x0014
            android.widget.ImageView r0 = r5.A02
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.setHaloEnabled(r0)
            if (r4 == 0) goto L_0x003d
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x003d
            android.widget.ImageView r2 = r5.A03
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r3)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x003a
            X.5TU r1 = X.AnonymousClass5TU.UNSEEN
        L_0x0031:
            X.5QJ r0 = new X.5QJ
            r0.<init>(r1)
            r2.setProfileStatus(r0)
        L_0x0039:
            return
        L_0x003a:
            X.5TU r1 = X.AnonymousClass5TU.SEEN
            goto L_0x0031
        L_0x003d:
            android.widget.ImageView r1 = r5.A03
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0039
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r0 = 0
            r1.setStatusIndicatorEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2.A02(com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2):void");
    }

    public void setStatusData(C61953Ed r1) {
        this.A08 = r1;
        A02(this);
    }

    public ChatInfoLayoutV2(Context context) {
        super(context);
    }

    private ImageView getProfilePhotoImage() {
        CollapsingProfilePhotoView collapsingProfilePhotoView = (CollapsingProfilePhotoView) C012005e.A02(this, R.id.collapsing_profile_photo_view);
        this.A04 = collapsingProfilePhotoView;
        WDSProfilePhoto wDSProfilePhoto = collapsingProfilePhotoView.A09;
        collapsingProfilePhotoView.A00 = (float) (this.A08 - (this.A01 * 2));
        collapsingProfilePhotoView.A02(this.A06, this.A05);
        return wDSProfilePhoto;
    }

    public int A08(int i) {
        return C36441kJ.A06(getResources(), R.dimen.f7nameremoved, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public void A09() {
        super.A09();
        this.A0O.setVisibility(0);
        A01(this);
    }

    public void A0A() {
        super.A0A();
        this.A01 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = C36431kI.A0H(this).orientation;
        this.A02 = C36401kF.A0G(this, R.id.picture);
        this.A03 = getProfilePhotoImage();
    }

    public void A0F(int i, int i2) {
        super.A0F(i, i2);
        CollapsingProfilePhotoView collapsingProfilePhotoView = this.A04;
        collapsingProfilePhotoView.A00 = (float) (this.A08 - (this.A01 * 2));
        collapsingProfilePhotoView.A02(this.A06, this.A05);
    }

    public void A0H() {
        int i;
        if (getContext() instanceof AnonymousClass2Dr) {
            AnonymousClass2Dr r3 = (AnonymousClass2Dr) C24801Dv.A01(getContext(), AnonymousClass2Dr.class);
            View view = r3.A01;
            if (view != null && view.getVisibility() == 0) {
                i = AnonymousClass00F.A00(r3, r3.A0F.getBackgroundColorRes());
            } else if (((int) (this.A02 * 255.0f)) > 0) {
                i = this.A07;
            } else if (C19550w8.A01()) {
                C36331k8.A0n(r3);
                return;
            } else {
                AnonymousClass1RC.A04(r3, C224514j.A00(r3, R.attr.f4nameremoved, R.color.f6nameremoved));
                return;
            }
            r3.getWindow().setStatusBarColor(i);
            if (Color.alpha(i) == 255) {
                AnonymousClass1RC.A09(r3.getWindow(), C224514j.A02(i));
            }
        }
    }

    public int getToolbarColorResId() {
        return R.color.f6nameremoved;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.A07;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.A07 = i2;
            CollapsingProfilePhotoView collapsingProfilePhotoView = this.A04;
            C90104Zc.A00(collapsingProfilePhotoView.A09.getViewTreeObserver(), collapsingProfilePhotoView, 8);
            this.A06 = true;
            A02(this);
        }
        A0D();
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A0B = onClickListener;
    }

    public void setRadius(float f) {
        this.A00 = f;
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

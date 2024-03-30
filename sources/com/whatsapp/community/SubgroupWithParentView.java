package com.whatsapp.community;

import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass1LV;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.C012005e;
import X.C18820ts;
import X.C20810yC;
import X.C27751Pr;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C38371oT;
import X.C68473bx;
import X.C87654Pq;
import X.C89844Yc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.Jid;

public class SubgroupWithParentView extends C38371oT implements C87654Pq {
    public int A00;
    public WaImageView A01;
    public AnonymousClass1LV A02;
    public ThumbnailButton A03;
    public AnonymousClass1Pp A04;
    public C18820ts A05;
    public C27751Pr A06;
    public C20810yC A07;
    public int A08;

    public SubgroupWithParentView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setBottomCommunityPhoto(AnonymousClass141 r6, AnonymousClass1RY r7) {
        Jid A062 = r6.A06(AnonymousClass147.class);
        if (A062 == null) {
            WaImageView waImageView = this.A01;
            C27751Pr r3 = this.A06;
            Context context = getContext();
            C68473bx r2 = C68473bx.A00;
            C36391kE.A1B(context.getTheme(), context.getResources(), waImageView, r2, r3);
            return;
        }
        AnonymousClass1LV r32 = this.A02;
        C36371kC.A1Q(r32.A0C, r32, A062, new C89844Yc(this, r7, 0), 17);
    }

    public View getTransitionView() {
        if (this.A08 == 3) {
            return this.A01;
        }
        return this.A03;
    }

    public void setSubgroupProfilePhoto(AnonymousClass141 r3, int i, AnonymousClass1RY r5) {
        this.A08 = i;
        r5.A0B(this.A03, r3, false);
        setBottomCommunityPhoto(r3, r5);
    }

    public void setSubgroupProfilePhotoBorderColor(int i) {
        this.A03.A02 = C36381kD.A05(this, i);
    }

    public SubgroupWithParentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = 0;
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A01 = C36431kI.A0X(this, R.id.parent_group_image);
        this.A03 = (ThumbnailButton) C012005e.A02(this, R.id.subgroup_pile_front_profile_photo);
    }

    public SubgroupWithParentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

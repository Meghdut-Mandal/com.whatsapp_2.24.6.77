package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass3T1;
import X.C005502l;
import X.C009403z;
import X.C023509x;
import X.C05250Oz;
import X.C19730wQ;
import X.C36331k8;
import X.C36381kD;
import X.C64933Qa;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

public final class ContactPictureView extends ThumbnailButton {
    public C19730wQ A00;
    public AnonymousClass1Pp A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C005502l A04;
    public C005502l A05;
    public boolean A06;
    public AnonymousClass3T1 A07;

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setContactAvatars(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setIoDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void A05(AnonymousClass1RY r4, AnonymousClass3T1 r5) {
        C64933Qa r1;
        AnonymousClass3T1 r0 = this.A07;
        if (r0 != null) {
            r1 = r0.A1J;
        } else {
            r1 = null;
        }
        if (!AnonymousClass00C.A0J(r1, r5.A1J)) {
            this.A07 = r5;
            getContactAvatars().A06(this, R.drawable.avatar_contact);
            C36331k8.A1T(new ContactPictureView$bind$1(r4, this, r5, (C023509x) null), C009403z.A02(getIoDispatcher()));
        }
    }

    public final AnonymousClass1Pp getContactAvatars() {
        AnonymousClass1Pp r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final C005502l getIoDispatcher() {
        C005502l r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("ioDispatcher");
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public ContactPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    public /* synthetic */ ContactPictureView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}

package com.whatsapp.thunderstorm;

import X.AnonymousClass00C;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass9S4;
import X.C18700tb;
import X.C18800tq;
import X.C27761Ps;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

public final class ThunderstormQrCodeCardView extends FrameLayout implements C18700tb {
    public TextEmojiLabel A00;
    public TextEmojiLabel A01;
    public ThumbnailButton A02;
    public AnonymousClass1Pp A03;
    public C27761Ps A04;
    public AnonymousClass1QZ A05;
    public View A06;
    public QrImageView A07;
    public boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormQrCodeCardView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01();
        A00(context);
    }

    public final void setContactAvatars(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setContactPhotosBitmapManager(C27761Ps r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setQrCode(AnonymousClass9S4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        QrImageView qrImageView = this.A07;
        if (qrImageView != null) {
            qrImageView.setQrCode(r2);
        }
        QrImageView qrImageView2 = this.A07;
        if (qrImageView2 != null) {
            qrImageView2.invalidate();
        }
    }

    public void A01() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36361kB.A0W(A0W);
            this.A03 = C36361kB.A0V(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1Pp getContactAvatars() {
        AnonymousClass1Pp r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final C27761Ps getContactPhotosBitmapManager() {
        C27761Ps r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotosBitmapManager");
    }

    private final void A00(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = (ThumbnailButton) findViewById(R.id.profile_picture);
        this.A01 = C36401kF.A0P(this, R.id.title);
        this.A00 = C36401kF.A0P(this, R.id.subtitle);
        this.A06 = findViewById(R.id.qr_code_container);
        this.A07 = (QrImageView) findViewById(R.id.qr_code);
    }

    public ThunderstormQrCodeCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormQrCodeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormQrCodeCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A01();
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormQrCodeCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01();
        A00(context);
    }
}

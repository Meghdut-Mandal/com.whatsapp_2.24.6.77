package com.whatsapp.thunderstorm;

import X.AnonymousClass07B;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass4LQ;
import X.C18800tq;
import X.C18830tt;
import X.C203279ni;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C81893xo;
import X.C89374Wh;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

public final class ThunderstormQrCodeActivity extends AnonymousClass155 {
    public C203279ni A00;
    public ThunderstormQrCodeCardView A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (C203279ni) r1.ACq.get();
        }
    }

    public ThunderstormQrCodeActivity(int i) {
        this.A02 = false;
        C89374Wh.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        ThunderstormQrCodeCardView thunderstormQrCodeCardView;
        super.onCreate(bundle);
        C36391kE.A15(this, R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        setContentView((int) R.layout.f9nameremoved);
        this.A01 = (ThunderstormQrCodeCardView) findViewById(R.id.contact_qr_card);
        AnonymousClass142 A0V = C36431kI.A0V(this);
        if (!(A0V == null || (thunderstormQrCodeCardView = this.A01) == null)) {
            if (A0V.A0f) {
                Bitmap A07 = thunderstormQrCodeCardView.getContactPhotosBitmapManager().A07(thunderstormQrCodeCardView.getContext(), A0V, C36441kJ.A00(thunderstormQrCodeCardView.getResources(), R.dimen.f7nameremoved), thunderstormQrCodeCardView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), false);
                ThumbnailButton thumbnailButton = thunderstormQrCodeCardView.A02;
                if (thumbnailButton != null) {
                    thumbnailButton.setImageBitmap(A07);
                }
            } else {
                ThumbnailButton thumbnailButton2 = thunderstormQrCodeCardView.A02;
                if (thumbnailButton2 != null) {
                    thunderstormQrCodeCardView.getContactAvatars().A07(thumbnailButton2, A0V);
                }
            }
            TextEmojiLabel textEmojiLabel = thunderstormQrCodeCardView.A01;
            if (textEmojiLabel != null) {
                textEmojiLabel.setText(A0V.A0a);
            }
            TextEmojiLabel textEmojiLabel2 = thunderstormQrCodeCardView.A00;
            if (textEmojiLabel2 != null) {
                textEmojiLabel2.setText(R.string.f12nameremoved);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C203279ni r0 = this.A00;
            if (r0 != null) {
                r0.A06().thenAcceptAsync(new C81893xo(new AnonymousClass4LQ(this)));
                return;
            }
            throw C36331k8.A0d("thunderstormManager");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = null;
        if (Build.VERSION.SDK_INT >= 30) {
            C203279ni r0 = this.A00;
            if (r0 != null) {
                r0.A07();
                return;
            }
            throw C36331k8.A0d("thunderstormManager");
        }
    }

    public ThunderstormQrCodeActivity() {
        this(0);
    }
}

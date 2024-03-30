package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.components.button.ThumbnailPickerButton;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.ScalingContactStatusThumbnail;

/* renamed from: X.288  reason: invalid class name */
public abstract class AnonymousClass288 extends WaImageView {
    public boolean A00;

    public void A03() {
        if (this instanceof C43142Fa) {
            C43142Fa r1 = (C43142Fa) this;
            if (r1 instanceof ScalingContactStatusThumbnail) {
                ScalingContactStatusThumbnail scalingContactStatusThumbnail = (ScalingContactStatusThumbnail) r1;
                if (!scalingContactStatusThumbnail.A00) {
                    scalingContactStatusThumbnail.A00 = true;
                    C36321k7.A0n(scalingContactStatusThumbnail);
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                C36321k7.A0n(r1);
            }
        } else if (this instanceof ContactLiveLocationThumbnail) {
            ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) this;
            if (!contactLiveLocationThumbnail.A03) {
                contactLiveLocationThumbnail.A03 = true;
                C36321k7.A0n(contactLiveLocationThumbnail);
            }
        } else if (this instanceof ContactPictureView) {
            ContactPictureView contactPictureView = (ContactPictureView) this;
            if (!contactPictureView.A06) {
                contactPictureView.A06 = true;
                C18800tq A0W = C36391kE.A0W(contactPictureView.generatedComponent());
                AnonymousClass5ZS.A00(contactPictureView, C36341k9.A0T(A0W));
                contactPictureView.A00 = C36351kA.A0N(A0W);
                contactPictureView.A01 = C36361kB.A0V(A0W);
                contactPictureView.A02 = C36341k9.A0R(A0W);
                contactPictureView.A03 = C36341k9.A0S(A0W);
                contactPictureView.A04 = C25141Fd.A00();
                contactPictureView.A05 = C24291Bw.A00();
            }
        } else if (this instanceof ThumbnailPickerButton) {
            ThumbnailPickerButton thumbnailPickerButton = (ThumbnailPickerButton) this;
            if (!thumbnailPickerButton.A00) {
                thumbnailPickerButton.A00 = true;
                C36321k7.A0n(thumbnailPickerButton);
            }
        } else if (this instanceof AnonymousClass2FZ) {
            AnonymousClass2FZ r12 = (AnonymousClass2FZ) this;
            if (!r12.A00) {
                r12.A00 = true;
                C36321k7.A0n(r12);
            }
        } else if (!this.A00) {
            this.A00 = true;
            C36321k7.A0n(this);
        }
    }

    public AnonymousClass288(Context context) {
        super(context);
        A03();
    }

    public static void A00(ThumbnailButton thumbnailButton, PopupNotification popupNotification, AnonymousClass3T1 r5) {
        thumbnailButton.A01 = popupNotification.getResources().getDimension(R.dimen.f7nameremoved);
        thumbnailButton.A00 = 1.0f;
        thumbnailButton.A02 = 1711276032;
        AnonymousClass1SV r2 = popupNotification.A1F;
        r2.A0D(thumbnailButton, r5, new C79273tS(thumbnailButton, r2, R.drawable.media_location));
        thumbnailButton.setOnClickListener(popupNotification.A05);
    }

    public AnonymousClass288(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public AnonymousClass288(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }
}

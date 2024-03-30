package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass141;
import X.AnonymousClass1RY;
import X.C013105r;
import X.C220412q;
import X.C222013h;
import X.C225314u;
import X.C27731Pn;
import X.C28981Uw;
import X.C36331k8;
import X.C65103Qt;
import X.C70143ef;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;

public class CreatorPrivacyNewsletterBottomSheet extends Hilt_CreatorPrivacyNewsletterBottomSheet {
    public WaImageView A00;
    public AnonymousClass1RY A01;
    public C27731Pn A02;
    public C220412q A03;
    public C70143ef A04;

    public void A1S(Bundle bundle, View view) {
        C28981Uw r0;
        String string;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C222013h.A05) {
            WaTextView waTextView2 = this.A04;
            if (waTextView2 != null) {
                waTextView2.setVisibility(8);
            }
            WaImageView waImageView = this.A03;
            if (waImageView != null) {
                waImageView.setImageResource(R.drawable.newsletter_mv_upsell_wds);
            }
        } else {
            AnonymousClass01I A0h = A0h();
            WaImageView waImageView2 = null;
            if ((A0h instanceof C225314u) && A0h != null) {
                C27731Pn r4 = this.A02;
                if (r4 != null) {
                    AnonymousClass1RY A06 = r4.A06("newsletter-admin-privacy", A0h.getResources().getDimension(R.dimen.f7nameremoved), C65103Qt.A01(A0h, 24.0f));
                    A0h.A06.A04(new ContactPhotos$LoaderLifecycleEventObserver(A06));
                    this.A01 = A06;
                    WaImageView waImageView3 = (WaImageView) view.findViewById(R.id.contact_photo);
                    if (waImageView3 != null) {
                        waImageView3.setVisibility(0);
                        C70143ef r1 = this.A04;
                        if (r1 != null) {
                            r1.A00 = R.drawable.ic_channels_privacy_sheet_newsletter_avatar;
                            waImageView3.setBackground(C013105r.A01(A0h, R.drawable.white_circle));
                            waImageView3.setClipToOutline(true);
                            AnonymousClass1RY r2 = this.A01;
                            if (r2 == null) {
                                throw C36331k8.A0d("contactPhotoLoader");
                            }
                            Bundle bundle2 = this.A0A;
                            if (bundle2 == null || (string = bundle2.getString("jid")) == null) {
                                r0 = null;
                            } else {
                                r0 = C28981Uw.A03.A01(string);
                            }
                            AnonymousClass141 r12 = new AnonymousClass141(r0);
                            C70143ef r02 = this.A04;
                            if (r02 != null) {
                                r2.A06(waImageView3, r02, r12, false);
                                waImageView2 = waImageView3;
                            } else {
                                throw C36331k8.A0d("contactPhotoDisplayer");
                            }
                        } else {
                            throw C36331k8.A0d("contactPhotoDisplayer");
                        }
                    }
                    this.A00 = waImageView2;
                } else {
                    throw C36331k8.A0d("contactPhotos");
                }
            }
        }
        PhoneNumberHiddenInNewsletterBottomSheet.A05(this.A00, R.drawable.ic_url);
        PhoneNumberHiddenInNewsletterBottomSheet.A05(this.A01, R.drawable.ic_hide);
        PhoneNumberHiddenInNewsletterBottomSheet.A05(this.A02, R.drawable.vec_ic_shield);
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
    }
}

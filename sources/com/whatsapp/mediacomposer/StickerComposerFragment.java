package com.whatsapp.mediacomposer;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass1Ax;
import X.AnonymousClass4CJ;
import X.AnonymousClass4CK;
import X.AnonymousClass4GZ;
import X.AnonymousClass5C8;
import X.AnonymousClass6VT;
import X.AnonymousClass7MJ;
import X.AnonymousClass7MK;
import X.AnonymousClass7ML;
import X.AnonymousClass7T9;
import X.AnonymousClass7TA;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C023509x;
import X.C109325Xd;
import X.C120215r9;
import X.C12560iI;
import X.C129126Fh;
import X.C132106Se;
import X.C146636vv;
import X.C160657lN;
import X.C160827le;
import X.C165177t0;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C85164Ga;
import X.C85174Gb;
import X.C90484aE;
import X.C90494aF;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;

public final class StickerComposerFragment extends Hilt_StickerComposerFragment {
    public int A00 = -1;
    public C120215r9 A01;
    public C132106Se A02;
    public boolean A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        bundle.putBoolean("key_already_processing_model", this.A03);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        boolean z;
        Integer num;
        int intValue;
        View findViewById;
        C129126Fh r0;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("position");
        } else {
            i = -1;
        }
        this.A00 = i;
        if (bundle != null) {
            z = bundle.getBoolean("key_already_processing_model", false);
        } else {
            z = false;
        }
        this.A03 = z;
        DisplayMetrics A0P = C90484aE.A0P();
        int i2 = A0P.widthPixels;
        int i3 = A0P.heightPixels;
        int max = Math.max(i2, i3);
        int min = Math.min(i2, i3);
        ImagePreviewContentLayout imagePreviewContentLayout = this.A04;
        int i4 = 0;
        if (this.A00 == 0) {
            i4 = 4;
        }
        imagePreviewContentLayout.setVisibility(i4);
        imagePreviewContentLayout.setMinScale(((float) max) / ((float) min));
        imagePreviewContentLayout.setTranslateTouchPoints(2);
        imagePreviewContentLayout.setOnFlingEnabled(false);
        if (bundle == null) {
            C160827le A1a = A1a();
            if (A1a != null) {
                num = Integer.valueOf(C90494aF.A09((Activity) A1a));
            } else {
                num = null;
            }
            if (!(this.A00 != 0 || this.A03 || this.A00 == null || num == null || (intValue = num.intValue()) == 42 || intValue == 44)) {
                C120215r9 r02 = this.A01;
                if (r02 == null) {
                    throw C36331k8.A0d("stickerMakerConfigs");
                } else if (AnonymousClass1Ax.A03(r02.A01, 7507)) {
                    this.A03 = true;
                    A03(false);
                    C160827le A1a2 = A1a();
                    if (!(A1a2 == null || (r0 = ((MediaComposerActivity) A1a2).A10) == null)) {
                        r0.A09(false);
                    }
                    C165177t0.A00(A0m(), ((StickerComposerViewModel) this.A04.getValue()).A00, new AnonymousClass7T9(this), 40);
                    AnonymousClass00T r4 = this.A05;
                    C165177t0.A00(A0m(), ((UTwoNetViewModel) r4.getValue()).A01, new AnonymousClass7TA(this), 39);
                    AnonymousClass01I A0h = A0h();
                    if (!(A0h == null || (findViewById = A0h.findViewById(R.id.progress)) == null)) {
                        findViewById.setVisibility(0);
                    }
                    UTwoNetViewModel uTwoNetViewModel = (UTwoNetViewModel) r4.getValue();
                    uTwoNetViewModel.A01.A0D(AnonymousClass5C8.A00);
                    C36331k8.A1T(new UTwoNetViewModel$fetch$1(uTwoNetViewModel, (C023509x) null), C109325Xd.A00(uTwoNetViewModel));
                    return;
                }
            }
            this.A04.setVisibility(0);
        }
    }

    public void A1h(AnonymousClass6VT r3, C146636vv r4, C129126Fh r5) {
        View findViewById;
        AnonymousClass00C.A0D(r5, 0);
        C36321k7.A0x(r4, r3);
        super.A1h(r3, r4, r5);
        r5.A0I.setCropToolVisibility(8);
        r4.A01();
        AnonymousClass01I A0h = A0h();
        if (A0h != null && (findViewById = A0h.findViewById(R.id.media_composer_layout)) != null) {
            findViewById.setBackgroundResource(R.drawable.ic_background_checker);
        }
    }

    public static final void A00(StickerComposerFragment stickerComposerFragment) {
        C129126Fh r0;
        View findViewById;
        AnonymousClass01I A0h = stickerComposerFragment.A0h();
        if (!(A0h == null || (findViewById = A0h.findViewById(R.id.progress)) == null)) {
            findViewById.setVisibility(8);
        }
        stickerComposerFragment.A04.setVisibility(0);
        stickerComposerFragment.A03(true);
        C160827le A1a = stickerComposerFragment.A1a();
        if (A1a != null && (r0 = ((MediaComposerActivity) A1a).A10) != null) {
            r0.A09(true);
        }
    }

    public StickerComposerFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass7MK(new AnonymousClass7MJ(this)));
        C019308f A1A = C36441kJ.A1A(UTwoNetViewModel.class);
        this.A05 = new C12560iI(new AnonymousClass7ML(A002), new C85174Gb(this, A002), new C85164Ga(A002), A1A);
        C019308f A1A2 = C36441kJ.A1A(StickerComposerViewModel.class);
        this.A04 = new C12560iI(new AnonymousClass4CJ(this), new AnonymousClass4CK(this), new AnonymousClass4GZ(this), A1A2);
    }

    private final void A03(boolean z) {
        C160657lN r0;
        View findViewById;
        View findViewById2;
        AnonymousClass01I A0h = A0h();
        if (!(A0h == null || (findViewById = A0h.findViewById(R.id.bottom_bar)) == null || (findViewById2 = findViewById.findViewById(R.id.send)) == null)) {
            findViewById2.setEnabled(z);
        }
        C160827le A1a = A1a();
        if (A1a != null && (r0 = ((MediaComposerActivity) A1a).A0w) != null) {
            r0.Bqq(z);
        }
    }
}

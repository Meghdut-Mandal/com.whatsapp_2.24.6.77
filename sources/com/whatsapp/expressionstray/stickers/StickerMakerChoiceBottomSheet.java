package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass3Y1;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class StickerMakerChoiceBottomSheet extends WDSBottomSheetDialogFragment {
    public final AnonymousClass00S A00;
    public final AnonymousClass00S A01;
    public final int A02;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass3Y1.A00(view.findViewById(R.id.use_photo_button), this, 48);
        AnonymousClass3Y1.A00(view.findViewById(R.id.use_ai_button), this, 49);
        AnonymousClass3Y1.A00(view.findViewById(R.id.close_image_frame), this, 47);
    }

    public StickerMakerChoiceBottomSheet(AnonymousClass00S r2, AnonymousClass00S r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = R.layout.f9nameremoved;
    }

    public int A1i() {
        return this.A02;
    }

    public StickerMakerChoiceBottomSheet() {
        this((AnonymousClass00S) null, (AnonymousClass00S) null);
    }
}

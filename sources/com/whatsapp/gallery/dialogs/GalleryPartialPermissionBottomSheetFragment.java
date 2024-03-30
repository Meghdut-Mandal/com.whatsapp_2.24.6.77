package com.whatsapp.gallery.dialogs;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass3NG;
import X.AnonymousClass3Y2;
import X.C012005e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class GalleryPartialPermissionBottomSheetFragment extends Hilt_GalleryPartialPermissionBottomSheetFragment {
    public AnonymousClass00S A00;
    public AnonymousClass00S A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass3Y2.A00(C012005e.A02(view, R.id.select_more_photos_container), this, 16);
        AnonymousClass3Y2.A00(C012005e.A02(view, R.id.go_to_settings_container), this, 15);
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A01 = -1;
    }
}

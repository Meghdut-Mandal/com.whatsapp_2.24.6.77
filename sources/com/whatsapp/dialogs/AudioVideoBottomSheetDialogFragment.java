package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass15A;
import X.AnonymousClass3Y0;
import X.C012005e;
import X.C16550pQ;
import X.C36361kB;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class AudioVideoBottomSheetDialogFragment extends Hilt_AudioVideoBottomSheetDialogFragment implements C16550pQ {
    public AnonymousClass15A A00;

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        View A02 = C012005e.A02(A0E, R.id.audio_call_item);
        View A022 = C012005e.A02(A0E, R.id.video_call_item);
        AnonymousClass3Y0.A01(A02, this, 10);
        AnonymousClass3Y0.A01(A022, this, 11);
        return A0E;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass15A) {
            this.A00 = (AnonymousClass15A) context;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Activity must implement ");
        throw AnonymousClass000.A0g(AnonymousClass15A.class.getSimpleName(), A0u);
    }
}

package com.whatsapp.voipcalling;

import X.AnonymousClass00T;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass4EY;
import X.AnonymousClass4EZ;
import X.AnonymousClass4HO;
import X.C012005e;
import X.C019308f;
import X.C05480Pw;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;

public final class ScreenSharePermissionDialogFragment extends WaDialogFragment {
    public final AnonymousClass00T A00;

    public ScreenSharePermissionDialogFragment() {
        C019308f A1A = C36441kJ.A1A(ScreenShareViewModel.class);
        this.A00 = C36441kJ.A0a(new AnonymousClass4EY(this), new AnonymousClass4EZ(this), new AnonymousClass4HO(this), A1A);
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        View A0D = C36421kH.A0D(A0a(), R.layout.f9nameremoved);
        int i = 0;
        A0D.setPadding(0, A0D.getPaddingTop(), 0, A0D.getPaddingBottom());
        ImageView A0G = C36401kF.A0G(A0D, R.id.permission_image_1);
        A0G.setImageResource(R.drawable.vec_ic_screen_share);
        int dimensionPixelSize = A0G.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        C36391kE.A0O(A0D, R.id.permission_message).setText(C05480Pw.A00(A0n(A0b.getInt("BodyTextId", 0))));
        C36351kA.A1E(C012005e.A02(A0D, R.id.submit), this, 14);
        TextView A0O = C36391kE.A0O(A0D, R.id.cancel);
        if (!A0b.getBoolean("CancelEnabled", true)) {
            i = 8;
        }
        A0O.setVisibility(i);
        A0O.setText(R.string.f12nameremoved);
        C36351kA.A1E(A0O, this, 13);
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0j(A0D);
        A04.A0r(true);
        AnonymousClass0FM A0O2 = C36371kC.A0O(A04);
        Window window = A0O2.getWindow();
        if (window != null) {
            C36341k9.A0r(A0a(), window, R.color.f6nameremoved);
        }
        return A0O2;
    }
}

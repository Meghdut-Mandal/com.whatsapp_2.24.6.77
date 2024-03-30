package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass3LW;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WallpaperDownloadFailedDialogFragment extends Hilt_WallpaperDownloadFailedDialogFragment {
    public Dialog A1a(Bundle bundle) {
        int i = A0b().getInt("ERROR_STATE_KEY");
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0L(R.string.f12nameremoved);
        int i2 = R.string.f12nameremoved;
        if (i == 5) {
            i2 = R.string.f12nameremoved;
        }
        A03.A0K(i2);
        A03.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        A03.A0a(false);
        return A03.create();
    }
}

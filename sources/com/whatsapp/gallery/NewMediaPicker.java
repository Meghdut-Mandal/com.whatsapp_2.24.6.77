package com.whatsapp.gallery;

import X.AnonymousClass00C;
import X.AnonymousClass0V9;
import X.AnonymousClass1RC;
import X.C224514j;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.MediaPicker;

public final class NewMediaPicker extends MediaPicker {
    public void Bii(AnonymousClass0V9 r3) {
        AnonymousClass00C.A0D(r3, 0);
        super.Bii(r3);
        AnonymousClass1RC.A04(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && (i == 1 || i == 36)) {
            setResult(-1, intent);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}

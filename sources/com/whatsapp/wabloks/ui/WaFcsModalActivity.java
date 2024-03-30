package com.whatsapp.wabloks.ui;

import X.AnonymousClass5OT;
import X.AnonymousClass6EW;
import X.AnonymousClass708;
import X.C36411kG;
import android.os.Bundle;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Queue;

public class WaFcsModalActivity extends AnonymousClass5OT {
    public FdsContentFragmentManager A00;

    public void A1r() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (queue.isEmpty()) {
                    break;
                }
                C36411kG.A1O(queue.remove());
            }
        }
        super.A1r();
    }

    public void onPause() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6EW r2 = this.A00;
        if (r2 != null) {
            AnonymousClass6EW.A00(r2, AnonymousClass708.class, this, 28);
        }
    }
}

package com.whatsapp.backup.encryptedbackup;

import X.C012005e;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C48812i6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ForcedRegLandingFragment extends Hilt_ForcedRegLandingFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1Q(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36331k8.A0A(this);
        C48812i6.A00(C012005e.A02(view, R.id.enc_backup_validate_password_continue_button), encBackupViewModel, this, 5);
        C48812i6.A00(C012005e.A02(view, R.id.enc_backup_validate_password_turn_off_button), encBackupViewModel, this, 6);
        if (encBackupViewModel.A0S() == 9) {
            C36391kE.A0O(view, R.id.enc_backup_validate_password_info_subtitle_info).setText(R.string.f12nameremoved);
        }
    }
}

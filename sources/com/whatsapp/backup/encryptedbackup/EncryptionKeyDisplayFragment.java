package com.whatsapp.backup.encryptedbackup;

import X.C36331k8;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public abstract class EncryptionKeyDisplayFragment extends WaFragment {
    public RelativeLayout A00;
    public EncBackupViewModel A01;

    public boolean A1W(MenuItem menuItem) {
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
        if (menuItem.getItemId() != 0) {
            return true;
        }
        EncBackupViewModel encBackupViewModel = this.A01;
        ClipboardManager A09 = encBackupViewModel.A0C.A09();
        String str = (String) encBackupViewModel.A02.A04();
        if (A09 == null || str == null) {
            return true;
        }
        A09.setPrimaryClip(ClipData.newPlainText(str, str));
        return true;
    }

    public void A1S(Bundle bundle, View view) {
        this.A01 = (EncBackupViewModel) C36331k8.A0A(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, R.string.f12nameremoved);
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg_pressed);
    }
}

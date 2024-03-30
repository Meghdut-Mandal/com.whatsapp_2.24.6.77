package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.4YR  reason: invalid class name */
public class AnonymousClass4YR implements ActionMode.Callback {
    public Object A00;
    public final int A01;

    public AnonymousClass4YR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipData primaryClip;
        String str;
        if (this.A01 == 0) {
            int itemId = menuItem.getItemId();
            if (itemId != 16908322 && itemId != 16908337) {
                return false;
            }
            EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
            EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
            C21060yb r6 = encBackupViewModel.A0C;
            ClipboardManager A09 = r6.A09();
            if (!(A09 == null || (primaryClip = A09.getPrimaryClip()) == null)) {
                C001700s r5 = encBackupViewModel.A02;
                String str2 = (String) r5.A04();
                String replace = primaryClip.getItemAt(0).getText().toString().replaceAll("\\s", "").toLowerCase(Locale.US).replace(1089, 'c');
                if (!TextUtils.isEmpty(str2) && replace.length() != 64) {
                    if (str2 != null) {
                        replace = AnonymousClass000.A0p(str2.replaceAll("\\s", ""), replace, AnonymousClass000.A0u());
                        if (replace.length() > 64) {
                            AnonymousClass3T3.A03(r6);
                        }
                    }
                }
                r5.A0D(replace);
            }
            encryptionKeyFragment.A1Z((String) encryptionKeyFragment.A01.A02.A04());
            return true;
        } else if (menuItem == null) {
            return false;
        } else {
            EditText editText = (EditText) this.A00;
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            if (selectionStart > selectionEnd) {
                int i = selectionEnd;
                selectionEnd = selectionStart;
                selectionStart = i;
            }
            int itemId2 = menuItem.getItemId();
            if (itemId2 == R.id.bold) {
                str = "*";
            } else if (itemId2 == R.id.italic) {
                str = "_";
            } else if (itemId2 == R.id.strikethrough) {
                str = "~";
            } else if (itemId2 != R.id.monospace) {
                return false;
            } else {
                str = "```";
            }
            Editable text = editText.getText();
            if (text == null) {
                return true;
            }
            while (selectionEnd > selectionStart) {
                int i2 = selectionEnd - 1;
                if (!Character.isSpaceChar(text.charAt(i2))) {
                    break;
                }
                selectionEnd = i2;
            }
            if (selectionEnd < text.length()) {
                char charAt = text.charAt(selectionEnd);
                if (!(Character.isSpaceChar(charAt) || charAt == '*' || charAt == '_' || charAt == '~')) {
                    text.insert(selectionEnd, " ");
                }
            }
            text.insert(selectionEnd, str);
            while (selectionStart < selectionEnd && Character.isSpaceChar(text.charAt(selectionStart))) {
                selectionStart++;
            }
            if (selectionStart > 0) {
                char charAt2 = text.charAt(selectionStart - 1);
                if (!(Character.isSpaceChar(charAt2) || charAt2 == '*' || charAt2 == '_' || charAt2 == '~')) {
                    text.insert(selectionStart, " ");
                    selectionStart++;
                }
            }
            text.insert(selectionStart, str);
            return true;
        }
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.A01 == 0) {
            return true;
        }
        if (actionMode == null) {
            return false;
        }
        MenuInflater menuInflater = actionMode.getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(R.menu.f11nameremoved, menu);
            return true;
        }
        Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
        return true;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.A01 != 0 || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        menu.removeItem(16908355);
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }
}

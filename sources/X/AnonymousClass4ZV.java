package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;

/* renamed from: X.4ZV  reason: invalid class name */
public class AnonymousClass4ZV implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        AnonymousClass01I A0h;
        switch (this.A01) {
            case 0:
                Activity activity = (Activity) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                activity.finish();
                return true;
            case 1:
                AnonymousClass02E r2 = (AnonymousClass02E) this.A00;
                if (i != 4 || keyEvent.getAction() != 1 || (A0h = r2.A0h()) == null) {
                    return false;
                }
                A0h.onBackPressed();
                return true;
            case 2:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                if (i != 4 || !sharedTextPreviewDialogFragment.A06.isShowing()) {
                    return false;
                }
                sharedTextPreviewDialogFragment.A06.dismiss();
                return true;
            case 3:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                AnonymousClass00C.A0D(keyEvent, 3);
                if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                    return false;
                }
                dialogFragment.A1b();
                return true;
            case 4:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
                if (i != 4) {
                    return false;
                }
                StorageUsageGalleryActivity.A01(storageUsageGalleryActivity);
                return true;
            default:
                AnonymousClass02E r22 = (AnonymousClass02E) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                r22.A0i().finish();
                return true;
        }
    }
}

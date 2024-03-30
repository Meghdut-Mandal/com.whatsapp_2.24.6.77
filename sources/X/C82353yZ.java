package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Collection;
import java.util.TimerTask;

/* renamed from: X.3yZ  reason: invalid class name and case insensitive filesystem */
public final class C82353yZ extends TimerTask {
    public final /* synthetic */ UpdatesViewModel A00;

    public C82353yZ(UpdatesViewModel updatesViewModel) {
        this.A00 = updatesViewModel;
    }

    public void run() {
        UpdatesViewModel updatesViewModel = this.A00;
        Collection collection = (Collection) updatesViewModel.A0T.A04();
        if (collection == null || collection.isEmpty()) {
            UpdatesViewModel.A07(updatesViewModel);
        } else {
            UpdatesViewModel.A05(updatesViewModel);
        }
    }
}

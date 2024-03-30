package X;

import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import java.util.List;

/* renamed from: X.3eV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70043eV implements C32041cr {
    public final /* synthetic */ LinkedDevicesViewModel A00;

    public /* synthetic */ C70043eV(LinkedDevicesViewModel linkedDevicesViewModel) {
        this.A00 = linkedDevicesViewModel;
    }

    public final void BcD(List list, List list2) {
        LinkedDevicesViewModel linkedDevicesViewModel = this.A00;
        linkedDevicesViewModel.A00 = list;
        linkedDevicesViewModel.A06.A0D((Object) null);
        if (!list.isEmpty() || !list2.isEmpty()) {
            linkedDevicesViewModel.A08.A0D(list);
            linkedDevicesViewModel.A07.A0D(list2);
            return;
        }
        linkedDevicesViewModel.A05.A0D((Object) null);
    }
}

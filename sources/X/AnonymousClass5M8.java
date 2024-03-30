package X;

import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.5M8  reason: invalid class name */
public final class AnonymousClass5M8 extends C132446Tt {
    public final Integer A00;
    public final String A01;
    public final /* synthetic */ PrivacyDisclosureContainerViewModel A02;

    public AnonymousClass5M8(PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel, Integer num, String str) {
        this.A02 = privacyDisclosureContainerViewModel;
        this.A00 = num;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C160877lj r0;
        C128136Ba r3 = (C128136Ba) obj;
        AnonymousClass00C.A0D(r3, 0);
        this.A02.A03.A0D(r3);
        if (r3.A00 == AnonymousClass5SN.SUCCESS && r3.A01 == null) {
            WeakReference weakReference = AnonymousClass6M9.A00;
            if (!(weakReference == null || (r0 = (C160877lj) weakReference.get()) == null)) {
                r0.Bbj();
            }
            AnonymousClass6M9.A00 = null;
        }
    }
}

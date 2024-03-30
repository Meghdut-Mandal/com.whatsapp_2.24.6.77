package X;

import android.content.Intent;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;

/* renamed from: X.3l3  reason: invalid class name and case insensitive filesystem */
public final class C74093l3 implements AnonymousClass4T5 {
    public final /* synthetic */ ConsumerDisclosureActivity A00;

    public C74093l3(ConsumerDisclosureActivity consumerDisclosureActivity) {
        this.A00 = consumerDisclosureActivity;
    }

    public void BQe() {
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        ((ConsumerDisclosureViewModel) consumerDisclosureActivity.A02.getValue()).A0S((AnonymousClass11F) null, (Boolean) null);
        AnonymousClass3N9 r0 = consumerDisclosureActivity.A00;
        if (r0 != null) {
            C21010yW r3 = r0.A00;
            AnonymousClass2PT r2 = new AnonymousClass2PT();
            Integer A0i = C36361kB.A0i();
            r2.A01 = A0i;
            r2.A00 = A0i;
            r2.A02 = 1L;
            r3.Bly(r2);
            Intent intent = (Intent) consumerDisclosureActivity.getIntent().getParcelableExtra("extra_next_intent");
            if (intent != null) {
                consumerDisclosureActivity.startActivity(intent);
            }
            consumerDisclosureActivity.finish();
            return;
        }
        throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
    }

    public void BT2() {
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        AnonymousClass3N9 r0 = consumerDisclosureActivity.A00;
        if (r0 != null) {
            C21010yW r2 = r0.A00;
            AnonymousClass2PT r1 = new AnonymousClass2PT();
            r1.A01 = C36361kB.A0i();
            AnonymousClass2PT.A00(r2, r1, 2);
            consumerDisclosureActivity.finishAndRemoveTask();
            return;
        }
        throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
    }
}

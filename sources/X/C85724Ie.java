package X;

import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;

/* renamed from: X.4Ie  reason: invalid class name and case insensitive filesystem */
public final class C85724Ie extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BonsaiDiscoveryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85724Ie(BonsaiDiscoveryActivity bonsaiDiscoveryActivity) {
        super(1);
        this.this$0 = bonsaiDiscoveryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r5 = (AnonymousClass141) obj;
        if (r5 != null) {
            AnonymousClass11F r3 = r5.A0H;
            BonsaiDiscoveryActivity bonsaiDiscoveryActivity = this.this$0;
            bonsaiDiscoveryActivity.startActivity(C36441kJ.A0j().A1Z(bonsaiDiscoveryActivity, r3, 21));
            this.this$0.setResult(-1);
            BonsaiDiscoveryActivity bonsaiDiscoveryActivity2 = this.this$0;
            if (!bonsaiDiscoveryActivity2.A04) {
                bonsaiDiscoveryActivity2.finish();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

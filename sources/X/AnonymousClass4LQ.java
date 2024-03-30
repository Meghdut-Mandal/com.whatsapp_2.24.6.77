package X;

import com.whatsapp.thunderstorm.ThunderstormQrCodeActivity;
import com.whatsapp.thunderstorm.ThunderstormQrCodeCardView;

/* renamed from: X.4LQ  reason: invalid class name */
public final class AnonymousClass4LQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ThunderstormQrCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LQ(ThunderstormQrCodeActivity thunderstormQrCodeActivity) {
        super(1);
        this.this$0 = thunderstormQrCodeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ThunderstormQrCodeCardView thunderstormQrCodeCardView;
        AnonymousClass9S4 r2 = (AnonymousClass9S4) obj;
        if (!(r2 == null || (thunderstormQrCodeCardView = this.this$0.A01) == null)) {
            thunderstormQrCodeCardView.setQrCode(r2);
        }
        return AnonymousClass0AJ.A00;
    }
}

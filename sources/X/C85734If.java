package X;

import com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.4If  reason: invalid class name and case insensitive filesystem */
public final class C85734If extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass00T $vm$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85734If(AnonymousClass00T r2) {
        super(1);
        this.$vm$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BonsaiDiscoveryViewModel bonsaiDiscoveryViewModel = (BonsaiDiscoveryViewModel) this.$vm$delegate.getValue();
        int i = 2;
        switch (C36411kG.A07((Number) obj)) {
            case VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT /*720*/:
            case 840:
            case 960:
                i = 3;
                break;
            case VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH /*1280*/:
            case 1440:
                i = 4;
                break;
            case 1600:
            case 1920:
            case 2240:
                i = 5;
                break;
        }
        bonsaiDiscoveryViewModel.A06.A0E(Integer.valueOf(i));
        return AnonymousClass0AJ.A00;
    }
}

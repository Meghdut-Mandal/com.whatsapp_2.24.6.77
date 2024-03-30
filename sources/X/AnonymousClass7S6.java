package X;

import android.location.Location;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;

/* renamed from: X.7S6  reason: invalid class name */
public final class AnonymousClass7S6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BaseGPSLocationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7S6(BaseGPSLocationManager baseGPSLocationManager) {
        super(1);
        this.this$0 = baseGPSLocationManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Location location = (Location) obj;
        BaseGPSLocationManager baseGPSLocationManager = this.this$0;
        if (location != null) {
            BaseGPSLocationManager.A01(location, baseGPSLocationManager);
        }
        return AnonymousClass0AJ.A00;
    }
}

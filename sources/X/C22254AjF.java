package X;

import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityRequest;
import java.util.UUID;

/* renamed from: X.AjF  reason: case insensitive filesystem */
public final class C22254AjF extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AppLinkDeviceIdentityRequest $appLinkDeviceIdentityRequest;
    public final /* synthetic */ C009003v $callback;
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22254AjF(AppLinkDeviceIdentityRequest appLinkDeviceIdentityRequest, C203689oX r3, UUID uuid, C009003v r5) {
        super(0);
        this.this$0 = r3;
        this.$appLinkDeviceIdentityRequest = appLinkDeviceIdentityRequest;
        this.$callback = r5;
        this.$serviceUUID = uuid;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C203689oX r3 = this.this$0;
        C204419py r6 = r3.A01;
        if (r6 != null) {
            AppLinkDeviceIdentityRequest appLinkDeviceIdentityRequest = this.$appLinkDeviceIdentityRequest;
            C165977up r0 = new C165977up(r3, this.$serviceUUID, this.$callback);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                boolean A1Q = C165597tg.A1Q(obtain, appLinkDeviceIdentityRequest);
                obtain.writeStrongInterface(r0);
                r6.A00.transact(3, obtain, obtain2, A1Q ? 1 : 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

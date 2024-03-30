package X;

import android.os.Parcel;

/* renamed from: X.AgQ  reason: case insensitive filesystem */
public final class C22079AgQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22079AgQ(C203689oX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6YR.A06("lam:LinkedAppManager", "listenToDeviceConnectionState:");
        C203689oX r0 = this.this$0;
        C204419py r4 = r0.A01;
        if (r4 != null) {
            C165987uq r1 = new C165987uq(r0);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.facebook.wearable.applinks.IAppLinkServiceV2");
                obtain.writeStrongInterface(r1);
                AnonymousClass000.A15(r4.A00, obtain, obtain2, 5);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

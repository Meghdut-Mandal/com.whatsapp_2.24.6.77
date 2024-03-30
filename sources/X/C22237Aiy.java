package X;

import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;

/* renamed from: X.Aiy  reason: case insensitive filesystem */
public final class C22237Aiy extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AppLinkRegisterRequest $appLinkRegisterRequest;
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22237Aiy(AppLinkRegisterRequest appLinkRegisterRequest, C203689oX r3) {
        super(0);
        this.this$0 = r3;
        this.$appLinkRegisterRequest = appLinkRegisterRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C203689oX r2 = this.this$0;
        C204419py r5 = r2.A01;
        if (r5 != null) {
            AppLinkRegisterRequest appLinkRegisterRequest = this.$appLinkRegisterRequest;
            C166007us r0 = new C166007us(r2);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                boolean A1Q = C165597tg.A1Q(obtain, appLinkRegisterRequest);
                obtain.writeStrongInterface(r0);
                r5.A00.transact(2, obtain, obtain2, A1Q ? 1 : 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityResponse;
import com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.7up  reason: invalid class name and case insensitive filesystem */
public final class C165977up extends Binder implements IAppLinkDeviceIdentityResponseCallback {
    public final /* synthetic */ C203689oX A00;
    public final /* synthetic */ UUID A01;
    public final /* synthetic */ C009003v A02;

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                if (i == 2) {
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(AppLinkDeviceIdentityResponse.CREATOR);
                    AnonymousClass00C.A0D(createTypedArrayList, 0);
                    if (createTypedArrayList.isEmpty()) {
                        AnonymousClass6YR.A09("lam:LinkedAppManager", "getDeviceIdentity: onResult empty. Retry.", (Throwable) null);
                    }
                    AppLinkDeviceIdentityResponse appLinkDeviceIdentityResponse = (AppLinkDeviceIdentityResponse) createTypedArrayList.get(createTypedArrayList.size() - 1);
                    byte[] bArr = appLinkDeviceIdentityResponse.serviceUUID;
                    AnonymousClass00C.A07(bArr);
                    UUID A0t = C165597tg.A0t(bArr);
                    byte[] bArr2 = appLinkDeviceIdentityResponse.devicePublicKey;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("serviceUUID=");
                    A0u.append(A0t);
                    A0u.append(" devicePublicKey=");
                    AnonymousClass00C.A0B(bArr2);
                    AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0q(AnonymousClass02R.A0A(C22510Ans.A00, bArr2), A0u));
                    this.A02.invoke(A0t, bArr2);
                    return true;
                } else if (i == 3) {
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("getDeviceIdentity: onError ");
                    A0u2.append(readInt);
                    A0u2.append(". ");
                    A0u2.append(readString);
                    AnonymousClass6YR.A09("lam:LinkedAppManager", AnonymousClass000.A0t(A0u2, '.'), (Throwable) null);
                    this.A02.invoke(this.A01, (Object) null);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C165977up(C203689oX r1, UUID uuid, C009003v r3) {
        this();
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = uuid;
    }

    public C165977up() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
    }
}

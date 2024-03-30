package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.facebook.wearable.applinks.AppLinkDeviceStateResponse;
import com.facebook.wearable.applinks.IAppLinkDeviceStateCallback;
import java.util.UUID;

/* renamed from: X.7uq  reason: invalid class name and case insensitive filesystem */
public final class C165987uq extends Binder implements IAppLinkDeviceStateCallback {
    public final /* synthetic */ C203689oX A00;

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass95H r0;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
                if (i == 2) {
                    AppLinkDeviceStateResponse appLinkDeviceStateResponse = (AppLinkDeviceStateResponse) C165567td.A0R(parcel, AppLinkDeviceStateResponse.CREATOR);
                    AnonymousClass00C.A0D(appLinkDeviceStateResponse, 0);
                    byte[] bArr = appLinkDeviceStateResponse.serviceUUID;
                    AnonymousClass00C.A07(bArr);
                    UUID A0t = C165597tg.A0t(bArr);
                    C203689oX r4 = this.A00;
                    AppLinkDeviceHardwareState appLinkDeviceHardwareState = appLinkDeviceStateResponse.deviceHardwareState;
                    if (appLinkDeviceHardwareState != null) {
                        switch (appLinkDeviceHardwareState.ordinal()) {
                            case 0:
                                r0 = C169828Av.A00;
                                break;
                            case 1:
                                r0 = C169818Au.A00;
                                break;
                            case 2:
                                r0 = AnonymousClass8B2.A00;
                                break;
                            case 3:
                                r0 = AnonymousClass8B3.A00;
                                break;
                            case 4:
                                r0 = AnonymousClass8B4.A00;
                                break;
                            case 5:
                                r0 = AnonymousClass8B5.A00;
                                break;
                            default:
                                throw C36441kJ.A18();
                        }
                    } else {
                        AppLinkDevicePeakPowerState appLinkDevicePeakPowerState = appLinkDeviceStateResponse.devicePeakPowerState;
                        if (appLinkDevicePeakPowerState != null) {
                            switch (appLinkDevicePeakPowerState.ordinal()) {
                                case 0:
                                    r0 = C169838Aw.A00;
                                    break;
                                case 1:
                                    r0 = C169858Ay.A00;
                                    break;
                                case 2:
                                    r0 = C169868Az.A00;
                                    break;
                                case 3:
                                    r0 = AnonymousClass8B0.A00;
                                    break;
                                case 4:
                                    r0 = C169848Ax.A00;
                                    break;
                                case 5:
                                    r0 = AnonymousClass8B1.A00;
                                    break;
                                default:
                                    throw C36441kJ.A18();
                            }
                        } else {
                            AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus = appLinkDeviceStateResponse.deviceConnectionStatus;
                            if (appLinkDeviceConnectionStatus != null) {
                                int ordinal = appLinkDeviceConnectionStatus.ordinal();
                                if (ordinal == 0) {
                                    r0 = C169788Ar.A00;
                                } else if (ordinal == 1) {
                                    r0 = C169798As.A00;
                                } else if (ordinal == 2) {
                                    r0 = C169808At.A00;
                                } else if (ordinal == 3) {
                                    r0 = AnonymousClass8B6.A00;
                                }
                            }
                            throw C36441kJ.A18();
                        }
                    }
                    AnonymousClass886 r2 = new AnonymousClass886(r0, A0t);
                    AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(r2, "onDeviceStateUpdate: status=", AnonymousClass000.A0u()));
                    C006302t r02 = r4.A06;
                    if (r02 != null) {
                        r02.invoke(r2);
                    }
                    if (appLinkDeviceStateResponse.deviceConnectionStatus == AppLinkDeviceConnectionStatus.CONNECTED) {
                        AnonymousClass00S r03 = r4.A02;
                        if (r03 != null) {
                            r03.invoke();
                        }
                        r4.A02 = null;
                        return true;
                    }
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
            }
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C165987uq(C203689oX r1) {
        this();
        this.A00 = r1;
    }

    public C165987uq() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
    }
}

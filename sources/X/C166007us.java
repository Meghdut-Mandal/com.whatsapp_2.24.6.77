package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkRegisterResponse;
import com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.7us  reason: invalid class name and case insensitive filesystem */
public final class C166007us extends Binder implements IAppLinkRegisterResponseCallback {
    public final /* synthetic */ C203689oX A00;

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback");
                if (i == 2) {
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(AppLinkRegisterResponse.CREATOR);
                    AnonymousClass00C.A0D(createTypedArrayList, 0);
                    if (createTypedArrayList.isEmpty()) {
                        AnonymousClass6YR.A09("lam:LinkedAppManager", "registerLinkableAppService: No devices to connect", (Throwable) null);
                        C203689oX r1 = this.A00;
                        r1.A02 = new C22080AgR(r1);
                        return true;
                    }
                    C203689oX r3 = this.A00;
                    r3.A02 = null;
                    ArrayList A0I = AnonymousClass001.A0I();
                    Iterator it = createTypedArrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArr = ((AppLinkRegisterResponse) it.next()).serviceUUID;
                        AnonymousClass00C.A07(bArr);
                        UUID A0t = C165597tg.A0t(bArr);
                        A0I.add(A0t);
                        C006302t r0 = r3.A03;
                        if (r0 != null) {
                            r0.invoke(A0t);
                        }
                        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(A0t, "serviceUUID=", AnonymousClass000.A0u()));
                    }
                    if (!r3.A09.A02) {
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        Iterator it2 = A0I.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass9GS r12 = new AnonymousClass9GS();
                            C203689oX.A08(r3, (UUID) it2.next(), new C22551Aob(r12, r3));
                            r12.A01.block();
                            AnonymousClass0AK r02 = r12.A00;
                            if (r02 != null) {
                                Object obj = r02.value;
                                AnonymousClass0AN.A00(obj);
                                AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(obj, "deviceConfig=", AnonymousClass000.A0u()));
                                A0I2.add(obj);
                            } else {
                                throw AnonymousClass001.A09("Result not assigned but condition variable opened");
                            }
                        }
                        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(A0I2, "calling onDeviceConfig ", AnonymousClass000.A0u()));
                        C006302t r03 = r3.A05;
                        if (r03 != null) {
                            r03.invoke(A0I2);
                            return true;
                        }
                    } else {
                        Iterator it3 = A0I.iterator();
                        while (it3.hasNext()) {
                            C203689oX.A08(r3, (UUID) it3.next(), new C22547AoX(r3));
                        }
                    }
                } else if (i == 3) {
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    StringBuilder A0t2 = C36401kF.A0t(readString, 1);
                    A0t2.append("onError: error=");
                    A0t2.append(readInt);
                    AnonymousClass6YR.A09("lam:LinkedAppManager", AnonymousClass000.A0p(" message=", readString, A0t2), (Throwable) null);
                }
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C166007us(C203689oX r1) {
        this();
        this.A00 = r1;
    }

    public C166007us() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback");
    }
}

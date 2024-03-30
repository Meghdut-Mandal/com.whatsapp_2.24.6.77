package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.4cA  reason: invalid class name and case insensitive filesystem */
public abstract class C91534cA extends Binder implements IInterface {
    public boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        C99164sj r1;
        Object obj;
        AnonymousClass74N r12;
        String str;
        C99174sk r4 = (C99174sk) this;
        if (i != 13) {
            switch (i) {
                case 1:
                    DataHolder dataHolder = (DataHolder) AnonymousClass000.A0W(parcel, DataHolder.CREATOR);
                    AnonymousClass74N A00 = AnonymousClass74N.A00(dataHolder, r4, 16);
                    try {
                        String valueOf = String.valueOf(dataHolder);
                        int i3 = dataHolder.A00;
                        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf) + 18);
                        A0h.append(valueOf);
                        return !C99174sk.A00(r4, AnonymousClass000.A0r(", rows=", A0h, i3), A00, "onDataItemChanged") ? true : true;
                    } finally {
                        dataHolder.close();
                    }
                case 2:
                    obj = AnonymousClass000.A0W(parcel, C98794s2.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 17);
                    str = "onMessageReceived";
                    break;
                case 3:
                    obj = AnonymousClass000.A0W(parcel, C98834s6.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 18);
                    str = "onPeerConnected";
                    break;
                case 4:
                    obj = AnonymousClass000.A0W(parcel, C98834s6.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 19);
                    str = "onPeerDisconnected";
                    break;
                case 5:
                    obj = parcel.createTypedArrayList(C98834s6.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 20);
                    str = "onConnectedNodes";
                    break;
                case 6:
                    obj = AnonymousClass000.A0W(parcel, C98854s8.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 22);
                    str = "onNotificationReceived";
                    break;
                case 7:
                    obj = AnonymousClass000.A0W(parcel, C98804s3.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 24);
                    str = "onChannelEvent";
                    break;
                case 8:
                    obj = AnonymousClass000.A0W(parcel, C98814s4.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 21);
                    str = "onConnectedCapabilityChanged";
                    break;
                case 9:
                    obj = AnonymousClass000.A0W(parcel, C98824s5.CREATOR);
                    r12 = AnonymousClass74N.A00(obj, r4, 23);
                    str = "onEntityUpdate";
                    break;
                default:
                    return false;
            }
            C99174sk.A00(r4, obj, r12, str);
            return true;
        }
        C98794s2 r3 = (C98794s2) AnonymousClass000.A0W(parcel, C98794s2.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof C99164sj) {
                r1 = (C99164sj) queryLocalInterface;
            } else {
                r1 = new C99164sj(readStrongBinder);
            }
        }
        C99174sk.A00(r4, r3, new C1503374w(r1, r3, r4), "onRequestReceived");
        return true;
    }

    public final IBinder asBinder() {
        return this;
    }

    public C91534cA(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A01(i, parcel, parcel2, i2);
    }
}

package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* renamed from: X.7uo  reason: invalid class name and case insensitive filesystem */
public final class C165967uo extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface queryLocalInterface;
        IInterface queryLocalInterface2;
        Parcel obtain;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        queryLocalInterface = null;
                    } else {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                            queryLocalInterface = new C208059xZ(readStrongBinder);
                        }
                    }
                    String readString = parcel.readString();
                    AnonymousClass00C.A0D(queryLocalInterface, 0);
                    int i3 = 0;
                    if (readString != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
                        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                        synchronized (remoteCallbackList) {
                            int i4 = multiInstanceInvalidationService.A00 + 1;
                            multiInstanceInvalidationService.A00 = i4;
                            Integer valueOf = Integer.valueOf(i4);
                            if (remoteCallbackList.register(queryLocalInterface, valueOf)) {
                                multiInstanceInvalidationService.A02.put(valueOf, readString);
                                i3 = i4;
                            } else {
                                multiInstanceInvalidationService.A00--;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                } else if (i == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        queryLocalInterface2 = null;
                    } else {
                        queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                            queryLocalInterface2 = new C208059xZ(readStrongBinder2);
                        }
                    }
                    int readInt = parcel.readInt();
                    AnonymousClass00C.A0D(queryLocalInterface2, 0);
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.A00;
                    RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
                    synchronized (remoteCallbackList2) {
                        remoteCallbackList2.unregister(queryLocalInterface2);
                        multiInstanceInvalidationService2.A02.remove(Integer.valueOf(readInt));
                    }
                    parcel2.writeNoException();
                    return true;
                } else if (i == 3) {
                    int readInt2 = parcel.readInt();
                    String[] createStringArray = parcel.createStringArray();
                    AnonymousClass00C.A0D(createStringArray, 1);
                    MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.A00;
                    RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
                    synchronized (remoteCallbackList3) {
                        Map map = multiInstanceInvalidationService3.A02;
                        String str = (String) C36371kC.A0r(map, readInt2);
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                        } else {
                            int beginBroadcast = remoteCallbackList3.beginBroadcast();
                            int i5 = 0;
                            while (i5 < beginBroadcast) {
                                try {
                                    Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i5);
                                    AnonymousClass00C.A0E(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                    int A0H = C90514aH.A0H(broadcastCookie);
                                    String str2 = (String) C36371kC.A0r(map, A0H);
                                    if (readInt2 != A0H && str.equals(str2)) {
                                        try {
                                            C208059xZ r1 = (C208059xZ) ((IMultiInstanceInvalidationCallback) remoteCallbackList3.getBroadcastItem(i5));
                                            obtain = Parcel.obtain();
                                            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                            obtain.writeStringArray(createStringArray);
                                            r1.A00.transact(1, obtain, (Parcel) null, 1);
                                            obtain.recycle();
                                        } catch (RemoteException e) {
                                            Log.w("ROOM", "Error invoking a remote callback", e);
                                        } catch (Throwable th) {
                                            obtain.recycle();
                                            throw th;
                                        }
                                    }
                                    i5++;
                                } catch (Throwable th2) {
                                    remoteCallbackList3.finishBroadcast();
                                    throw th2;
                                }
                            }
                            remoteCallbackList3.finishBroadcast();
                        }
                    }
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C165967uo(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
    }

    public C165967uo() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}

package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* renamed from: X.8Ek  reason: invalid class name and case insensitive filesystem */
public final class C170688Ek extends AnonymousClass3HO {
    public final C170648Eg A00;

    public final SparseArray A00(C192439Gz r7) {
        C170128Cb[] r0;
        C170168Cf r5 = new C170168Cf();
        AnonymousClass9MP r1 = r7.A01;
        r5.A00 = r1.A00;
        r5.A01 = r1.A01;
        r5.A03 = r1.A03;
        r5.A02 = r1.A02;
        r5.A04 = r1.A04;
        ByteBuffer byteBuffer = r7.A00;
        C170648Eg r12 = this.A00;
        AnonymousClass006.A01(byteBuffer);
        if (!AnonymousClass000.A1V(r12.A00())) {
            r0 = new C170128Cb[0];
        } else {
            try {
                AnonymousClass0LR r3 = new AnonymousClass0LR(byteBuffer);
                Object A002 = r12.A00();
                AnonymousClass006.A01(A002);
                C204469q3 r2 = (C204469q3) ((C23094B4j) A002);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(r2.A00);
                obtain.writeStrongBinder(r3.asBinder());
                obtain.writeInt(1);
                r5.writeToParcel(obtain, 0);
                Parcel A003 = r2.A00(obtain);
                r0 = (C170128Cb[]) A003.createTypedArray(C170128Cb.CREATOR);
                A003.recycle();
            } catch (RemoteException e) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                r0 = new C170128Cb[0];
            }
        }
        SparseArray sparseArray = new SparseArray(r5);
        for (C170128Cb r22 : r0) {
            sparseArray.append(r22.A0C.hashCode(), r22);
        }
        return sparseArray;
    }

    public final boolean A02() {
        return AnonymousClass000.A1V(this.A00.A00());
    }

    public C170688Ek(C170648Eg r1) {
        this.A00 = r1;
    }

    public final void A01() {
        super.A01();
        this.A00.A02();
    }

    public C170688Ek() {
        throw AnonymousClass001.A09("Default constructor called");
    }
}

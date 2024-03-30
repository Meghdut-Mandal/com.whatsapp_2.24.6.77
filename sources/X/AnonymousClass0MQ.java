package X;

import android.os.Parcel;

/* renamed from: X.0MQ  reason: invalid class name */
public abstract class AnonymousClass0MQ extends AnonymousClass0E1 implements C17390rG {
    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AnonymousClass0LR r0 = new AnonymousClass0LR(((AnonymousClass0LQ) this).A03());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(r0.asBinder());
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = ((AnonymousClass0LQ) this).A00;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
    }

    public AnonymousClass0MQ() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}

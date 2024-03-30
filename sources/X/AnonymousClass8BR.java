package X;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.8BR  reason: invalid class name */
public final class AnonymousClass8BR extends AnonymousClass0JS {
    public final C170148Cd A00;

    public AnonymousClass8BR(C170148Cd r2, AnonymousClass0XK r3) {
        super(C130476Lf.A07, r3);
        this.A00 = r2;
    }

    public final /* synthetic */ C16780q5 A03(Status status) {
        return status;
    }

    public final /* synthetic */ void A0A(C15900oC r8) {
        C07560Yg r82 = (C07560Yg) r8;
        AnonymousClass8DS r6 = new AnonymousClass8DS(this);
        try {
            C170148Cd r5 = this.A00;
            AnonymousClass8DQ r3 = r5.A08;
            int A04 = r3.A04();
            r3.A00 = A04;
            byte[] bArr = new byte[A04];
            C202569mD r0 = new C202569mD(bArr, A04);
            r3.A03(r0);
            ByteBuffer byteBuffer = r0.A02;
            if (byteBuffer.remaining() == 0) {
                r5.A01 = bArr;
                C204479q4 r1 = (C204479q4) ((C23093B4i) r82.A04());
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                obtain.writeStrongBinder(r6.asBinder());
                obtain.writeInt(1);
                r5.writeToParcel(obtain, 0);
                try {
                    r1.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            } else {
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, byteBuffer.remaining(), 0);
                throw AnonymousClass001.A09(String.format("Did not write as much data as expected, %s bytes remaining.", A0L));
            }
        } catch (IOException e) {
            throw C90524aI.A0e("Serializing to a byte array threw an IOException (should never happen).", e);
        } catch (RuntimeException e2) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e2);
            A0B(new Status(10, "MessageProducer"));
        }
    }
}

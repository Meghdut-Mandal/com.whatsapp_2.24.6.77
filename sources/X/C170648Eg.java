package X;

import android.content.Context;
import android.os.Parcel;

/* renamed from: X.8Eg  reason: invalid class name and case insensitive filesystem */
public final class C170648Eg extends C128996En {
    public final AnonymousClass8CM A00;

    public C170648Eg(Context context, AnonymousClass8CM r4) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.A00 = r4;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object A01(android.content.Context r6, X.AnonymousClass0Z3 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r1 = r7.A09(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r4 = r1.queryLocalInterface(r0)
            boolean r0 = r4 instanceof X.C23095B4k
            if (r0 == 0) goto L_0x0018
            X.B4k r4 = (X.C23095B4k) r4
            if (r4 != 0) goto L_0x001d
        L_0x0017:
            return r3
        L_0x0018:
            X.8Ds r4 = new X.8Ds
            r4.<init>(r1)
        L_0x001d:
            X.0LR r3 = new X.0LR
            r3.<init>(r6)
            X.8CM r2 = r5.A00
            X.AnonymousClass006.A01(r2)
            X.9q3 r4 = (X.C204469q3) r4
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r0 = r4.A00
            r1.writeInterfaceToken(r0)
            android.os.IBinder r0 = r3.asBinder()
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r2.writeToParcel(r1, r0)
            android.os.Parcel r2 = r4.A00(r1)
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x004c
            r3 = 0
        L_0x0048:
            r2.recycle()
            return r3
        L_0x004c:
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r3 = r1.queryLocalInterface(r0)
            boolean r0 = r3 instanceof X.C23094B4j
            if (r0 != 0) goto L_0x0048
            X.8Dr r3 = new X.8Dr
            r3.<init>(r1)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170648Eg.A01(android.content.Context, X.0Z3):java.lang.Object");
    }

    public final void A03() {
        if (A00() != null) {
            Object A002 = A00();
            AnonymousClass006.A01(A002);
            C204469q3 r2 = (C204469q3) ((C23094B4j) A002);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r2.A00);
            r2.A01(obtain);
        }
    }
}

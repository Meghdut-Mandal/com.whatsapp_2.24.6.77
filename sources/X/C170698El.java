package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* renamed from: X.8El  reason: invalid class name and case insensitive filesystem */
public final class C170698El extends AnonymousClass3HO {
    public boolean A00 = true;
    public final C170658Eh A01;
    public final C197709cF A02 = new C197709cF();
    public final Object A03 = C36441kJ.A11();

    public final SparseArray A00(C192439Gz r20) {
        AnonymousClass9N5[] r8;
        AnonymousClass9DI[] r13;
        AnonymousClass9DH[] r11;
        int i;
        C192439Gz r1 = r20;
        ByteBuffer byteBuffer = r1.A00;
        synchronized (this.A03) {
            if (this.A00) {
                C170658Eh r2 = this.A01;
                AnonymousClass006.A01(byteBuffer);
                C170168Cf r6 = new C170168Cf();
                AnonymousClass9MP r12 = r1.A01;
                r6.A00 = r12.A00;
                r6.A01 = r12.A01;
                r6.A03 = r12.A03;
                r6.A02 = r12.A02;
                r6.A04 = r12.A04;
                if (!AnonymousClass000.A1V(r2.A00())) {
                    r8 = new AnonymousClass9N5[0];
                } else {
                    try {
                        AnonymousClass0LR r4 = new AnonymousClass0LR(byteBuffer);
                        Object A002 = r2.A00();
                        AnonymousClass006.A01(A002);
                        AnonymousClass8Dt r22 = (AnonymousClass8Dt) ((C23098B4n) A002);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r22.A00);
                        int A1U = AnonymousClass000.A1U(r4.asBinder(), obtain);
                        r6.writeToParcel(obtain, 0);
                        Parcel A003 = r22.A00(obtain);
                        AnonymousClass8CE[] r7 = (AnonymousClass8CE[]) A003.createTypedArray(AnonymousClass8CE.CREATOR);
                        A003.recycle();
                        int length = r7.length;
                        r8 = new AnonymousClass9N5[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            AnonymousClass8CE r112 = r7[i2];
                            int i3 = r112.A0B;
                            PointF pointF = new PointF(r112.A00, r112.A01);
                            float f = r112.A02;
                            float f2 = r112.A03;
                            AnonymousClass8CB[] r14 = r112.A0C;
                            if (r14 == null) {
                                r13 = new AnonymousClass9DI[A1U];
                            } else {
                                int length2 = r14.length;
                                r13 = new AnonymousClass9DI[length2];
                                for (int i4 = 0; i4 < length2; i4++) {
                                    AnonymousClass8CB r0 = r14[i4];
                                    r13[i4] = new AnonymousClass9DI(new PointF(r0.A00, r0.A01));
                                }
                            }
                            C169948Bj[] r142 = r112.A0D;
                            if (r142 == null) {
                                r11 = new AnonymousClass9DH[A1U];
                            } else {
                                int length3 = r142.length;
                                r11 = new AnonymousClass9DH[length3];
                                for (int i5 = 0; i5 < length3; i5++) {
                                    r11[i5] = new AnonymousClass9DH(r142[i5].A01);
                                }
                            }
                            r8[i2] = new AnonymousClass9N5(pointF, r11, r13, f, f2, i3);
                        }
                    } catch (RemoteException e) {
                        Log.e("FaceNativeHandle", "Could not call native face detector", e);
                        r8 = new AnonymousClass9N5[0];
                    }
                }
            } else {
                throw AnonymousClass001.A09("Cannot use detector after release()");
            }
        }
        HashSet A16 = C36441kJ.A16();
        SparseArray sparseArray = new SparseArray(r12);
        int i6 = 0;
        for (AnonymousClass9N5 r62 : r8) {
            int i7 = r62.A02;
            i6 = Math.max(i6, i7);
            if (C36381kD.A1Z(A16, i7)) {
                i7 = i6 + 1;
                i6 = i7;
            }
            AnonymousClass000.A1F(A16, i7);
            C197709cF r42 = this.A02;
            synchronized (C197709cF.A03) {
                SparseIntArray sparseIntArray = r42.A00;
                i = sparseIntArray.get(i7, -1);
                if (i == -1) {
                    i = C197709cF.A02;
                    C197709cF.A02 = i + 1;
                    sparseIntArray.append(i7, i);
                    r42.A01.append(i, i7);
                }
            }
            sparseArray.append(i, r62);
        }
        return sparseArray;
    }

    public final boolean A02() {
        return AnonymousClass000.A1V(this.A01.A00());
    }

    public final void finalize() {
        try {
            synchronized (this.A03) {
                if (this.A00) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    A01();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public C170698El(C170658Eh r2) {
        this.A01 = r2;
    }

    public final void A01() {
        super.A01();
        synchronized (this.A03) {
            if (this.A00) {
                this.A01.A02();
                this.A00 = false;
            }
        }
    }

    public C170698El() {
        throw AnonymousClass001.A09("Default constructor called");
    }
}

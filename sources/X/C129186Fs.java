package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.6Fs  reason: invalid class name and case insensitive filesystem */
public class C129186Fs {
    public AnonymousClass60M A00;
    public final IGoogleMapDelegate A01;

    public final AnonymousClass68Y A00() {
        IProjectionDelegate iProjectionDelegate;
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A02 = r2.A02(26, C133816a2.A00(r2));
            IBinder readStrongBinder = A02.readStrongBinder();
            if (readStrongBinder == null) {
                iProjectionDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (queryLocalInterface instanceof IProjectionDelegate) {
                    iProjectionDelegate = (IProjectionDelegate) queryLocalInterface;
                } else {
                    iProjectionDelegate = new C98994sS(readStrongBinder);
                }
            }
            A02.recycle();
            return new AnonymousClass68Y(iProjectionDelegate);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final AnonymousClass60M A01() {
        IUiSettingsDelegate iUiSettingsDelegate;
        try {
            AnonymousClass60M r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A02 = r2.A02(25, C133816a2.A00(r2));
            IBinder readStrongBinder = A02.readStrongBinder();
            if (readStrongBinder == null) {
                iUiSettingsDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (queryLocalInterface instanceof IUiSettingsDelegate) {
                    iUiSettingsDelegate = (IUiSettingsDelegate) queryLocalInterface;
                } else {
                    iUiSettingsDelegate = new C99004sT(readStrongBinder);
                }
            }
            A02.recycle();
            AnonymousClass60M r02 = new AnonymousClass60M(iUiSettingsDelegate);
            this.A00 = r02;
            return r02;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final CameraPosition A02() {
        Parcelable parcelable;
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A02 = r2.A02(1, C133816a2.A00(r2));
            Parcelable.Creator creator = CameraPosition.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            CameraPosition cameraPosition = (CameraPosition) parcelable;
            A02.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final C129116Fg A03(C98884sB r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, r4);
            Parcel A02 = r2.A02(11, A002);
            C161377me A003 = C99124sf.A00(A02.readStrongBinder());
            A02.recycle();
            if (A003 != null) {
                return new C129116Fg(A003);
            }
            return null;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A04() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(94, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A05() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeFloat(16.0f);
            r2.A03(93, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A06() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(14, C133816a2.A00(r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A07(int i) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(i);
            r2.A03(16, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A08(int i, int i2, int i3, int i4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(i);
            A002.writeInt(i2);
            A002.writeInt(i3);
            A002.writeInt(i4);
            r2.A03(39, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A09(C115065iH r4) {
        try {
            AnonymousClass006.A02(r4, "CameraUpdate must not be null.");
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(5, AnonymousClass6UO.A00(r4.A00, r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0A(C115065iH r4) {
        try {
            AnonymousClass006.A02(r4, "CameraUpdate must not be null.");
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(4, AnonymousClass6UO.A00(r4.A00, r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0B(C115065iH r4, C159117iq r5) {
        C99034sW r0;
        IBinder iBinder;
        try {
            AnonymousClass006.A02(r4, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r4.A00;
            if (r5 == null) {
                r0 = null;
            } else {
                r0 = new C99034sW(r5);
            }
            C133816a2 r2 = (C133816a2) iGoogleMapDelegate;
            Parcel A002 = AnonymousClass6UO.A00(iObjectWrapper, r2);
            if (r0 == null) {
                iBinder = null;
            } else {
                iBinder = r0.asBinder();
            }
            A002.writeStrongBinder(iBinder);
            r2.A03(6, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0C(C115065iH r5, C159117iq r6) {
        C99034sW r2;
        IBinder iBinder;
        try {
            AnonymousClass006.A02(r5, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r5.A00;
            if (r6 == null) {
                r2 = null;
            } else {
                r2 = new C99034sW(r6);
            }
            C133816a2 r3 = (C133816a2) iGoogleMapDelegate;
            Parcel A002 = AnonymousClass6UO.A00(iObjectWrapper, r3);
            A002.writeInt(400);
            if (r2 == null) {
                iBinder = null;
            } else {
                iBinder = r2.asBinder();
            }
            A002.writeStrongBinder(iBinder);
            r3.A03(7, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0D(AnonymousClass7f1 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(33, AnonymousClass6UO.A00(new C99064sZ(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0E(AnonymousClass7f2 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(99, AnonymousClass6UO.A00(new C99104sd(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0F(AnonymousClass7f3 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(96, AnonymousClass6UO.A00(new C99084sb(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0G(AnonymousClass7f4 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(32, AnonymousClass6UO.A00(new C99054sY(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0H(AnonymousClass7f5 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(28, AnonymousClass6UO.A00(new C99114se(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0I(AnonymousClass7f6 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            r2.A03(30, AnonymousClass6UO.A00(new C99024sV(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public void A0J(C98864s9 r4) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            AnonymousClass6UO.A01(A002, r4);
            Parcel A02 = r2.A02(91, A002);
            A02.readInt();
            A02.recycle();
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0K(boolean z) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(z ? 1 : 0);
            Parcel A02 = r2.A02(20, A002);
            A02.readInt();
            A02.recycle();
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0L(boolean z) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(z ? 1 : 0);
            r2.A03(22, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final void A0M(boolean z) {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(z ? 1 : 0);
            r2.A03(18, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final boolean A0N() {
        try {
            C133816a2 r2 = (C133816a2) this.A01;
            Parcel A02 = r2.A02(17, C133816a2.A00(r2));
            boolean A1P = AnonymousClass000.A1P(A02.readInt());
            A02.recycle();
            return A1P;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public C129186Fs(IGoogleMapDelegate iGoogleMapDelegate) {
        AnonymousClass006.A01(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }
}

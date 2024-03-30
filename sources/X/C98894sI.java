package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4sI  reason: invalid class name and case insensitive filesystem */
public final class C98894sI extends C07040Wc {
    public C15970oL A00;
    public final Context A01;
    public final ViewGroup A02;
    public final GoogleMapOptions A03;
    public final List A04 = AnonymousClass001.A0I();

    public final void A00(C15970oL r5) {
        IMapViewDelegate iMapViewDelegate;
        this.A00 = r5;
        if (r5 != null && this.A01 == null) {
            try {
                Context context = this.A01;
                AnonymousClass6II.A00(context);
                C161387mk A012 = C129856Is.A01(context);
                AnonymousClass0LR r1 = new AnonymousClass0LR(context);
                GoogleMapOptions googleMapOptions = this.A03;
                C133816a2 r2 = (C133816a2) A012;
                Parcel A002 = AnonymousClass6UO.A00(r1, r2);
                AnonymousClass6UO.A01(A002, googleMapOptions);
                Parcel A022 = r2.A02(3, A002);
                IBinder readStrongBinder = A022.readStrongBinder();
                if (readStrongBinder == null) {
                    iMapViewDelegate = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (queryLocalInterface instanceof IMapViewDelegate) {
                        iMapViewDelegate = (IMapViewDelegate) queryLocalInterface;
                    } else {
                        iMapViewDelegate = new C98984sR(readStrongBinder);
                    }
                }
                A022.recycle();
                if (iMapViewDelegate != null) {
                    C15970oL r22 = this.A00;
                    C141426nE r0 = new C141426nE(this.A02, iMapViewDelegate);
                    C07040Wc r3 = ((C10480eJ) r22).A00;
                    r3.A01 = r0;
                    Iterator it = r3.A02.iterator();
                    while (it.hasNext()) {
                        ((C17090qh) it.next()).Bxp(r3.A01);
                    }
                    r3.A02.clear();
                    r3.A00 = null;
                    List<AnonymousClass7f7> list = this.A04;
                    for (AnonymousClass7f7 A003 : list) {
                        ((C141426nE) this.A01).A00(A003);
                    }
                    list.clear();
                }
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            } catch (AnonymousClass0O8 unused) {
            }
        }
    }

    public C98894sI(Context context, ViewGroup viewGroup, GoogleMapOptions googleMapOptions) {
        this.A02 = viewGroup;
        this.A01 = context;
        this.A03 = googleMapOptions;
    }
}

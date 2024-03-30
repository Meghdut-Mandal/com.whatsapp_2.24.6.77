package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;

/* renamed from: X.7tO  reason: invalid class name and case insensitive filesystem */
public class C165417tO implements AnonymousClass7f7 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C165417tO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void BaS(C129186Fs r14) {
        C98864s9 r0;
        C98864s9 r02;
        C1267965o r7;
        C161367md r8;
        if (this.A04 != 0) {
            AnonymousClass5BG r6 = (AnonymousClass5BG) this.A00;
            C98864s9 r2 = (C98864s9) this.A01;
            LatLng latLng = (LatLng) this.A02;
            View view = (View) this.A03;
            if (AnonymousClass1RC.A0A(r6.getContext())) {
                r02 = C98864s9.A00(r6.getContext(), R.raw.night_map_style_json);
            } else {
                r02 = null;
            }
            if (r2 == null) {
                r2 = r02;
            }
            A00(r6, view, r14, latLng, r2);
            C1267965o r03 = r6.A00;
            if (r03 != null) {
                try {
                    C133816a2 r22 = (C133816a2) r03.A00;
                    r22.A03(1, C133816a2.A00(r22));
                } catch (RemoteException e) {
                    throw AnonymousClass78K.A00(e);
                }
            }
            Integer num = r6.A01;
            if (num != null) {
                double intValue = (double) num.intValue();
                double d = latLng.A00;
                double d2 = latLng.A01;
                int width = view.getWidth() * 2;
                int height = view.getHeight() * 2;
                Context context = r6.getContext();
                if (width <= 0 || height <= 0) {
                    r7 = null;
                } else {
                    C98874sA r12 = new C98874sA();
                    r12.A05 = C90524aI.A0F(d, d2);
                    r12.A01 = 6.0f;
                    r12.A04 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
                    r12.A03 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
                    r12.A00 = intValue;
                    try {
                        C133816a2 r9 = (C133816a2) r14.A01;
                        Parcel A002 = C133816a2.A00(r9);
                        AnonymousClass6UO.A01(A002, r12);
                        Parcel A022 = r9.A02(35, A002);
                        IBinder readStrongBinder = A022.readStrongBinder();
                        if (readStrongBinder == null) {
                            r8 = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                            if (queryLocalInterface instanceof C161367md) {
                                r8 = (C161367md) queryLocalInterface;
                            } else {
                                r8 = new C98944sN(readStrongBinder);
                            }
                        }
                        A022.recycle();
                        r7 = new C1267965o(r8);
                        int min = Math.min(width, height);
                        LatLng A0F = C90524aI.A0F(d, d2);
                        AnonymousClass67D r4 = new AnonymousClass67D();
                        double d3 = intValue / 6371009.0d;
                        r4.A01(C90484aE.A0R(A0F, 0.0d, d3));
                        r4.A01(C90484aE.A0R(A0F, 90.0d, d3));
                        r4.A01(C90484aE.A0R(A0F, 180.0d, d3));
                        r4.A01(C90484aE.A0R(A0F, 270.0d, d3));
                        LatLngBounds A003 = r4.A00();
                        AnonymousClass006.A02(A003, "bounds must not be null");
                        try {
                            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = AnonymousClass6UP.A00;
                            AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                            C133816a2 r23 = (C133816a2) iCameraUpdateFactoryDelegate;
                            Parcel A004 = C133816a2.A00(r23);
                            AnonymousClass6UO.A01(A004, A003);
                            A004.writeInt(min);
                            A004.writeInt(min);
                            A004.writeInt(50);
                            r14.A0A(new C115065iH(C133816a2.A01(A004, r23, 11)));
                        } catch (RemoteException e2) {
                            throw AnonymousClass78K.A00(e2);
                        }
                    } catch (RemoteException e3) {
                        throw AnonymousClass78K.A00(e3);
                    }
                }
                r6.A00 = r7;
                return;
            }
            return;
        }
        View view2 = (View) this.A00;
        C98864s9 r42 = (C98864s9) this.A01;
        LatLng latLng2 = (LatLng) this.A02;
        View view3 = (View) this.A03;
        if (AnonymousClass1RC.A0A(view2.getContext())) {
            r0 = C98864s9.A00(view2.getContext(), R.raw.night_map_style_json);
        } else {
            r0 = null;
        }
        if (r42 == null) {
            r42 = r0;
        }
        A00(view2, view3, r14, latLng2, r42);
    }

    public static void A00(View view, View view2, C129186Fs r4, LatLng latLng, C98864s9 r6) {
        r4.A0J(r6);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        r4.A08(0, dimensionPixelSize * 2, dimensionPixelSize, dimensionPixelSize);
        AnonymousClass67C r1 = new AnonymousClass67C();
        AnonymousClass006.A02(latLng, "location must not be null.");
        r1.A03 = latLng;
        r1.A00 = 15.0f;
        r4.A0A(AnonymousClass6UP.A00(r1.A00()));
        C18740tg.A04(view2);
        view2.setVisibility(0);
    }
}

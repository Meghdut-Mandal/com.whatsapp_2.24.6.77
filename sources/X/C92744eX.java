package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import java.util.LinkedList;

/* renamed from: X.4eX  reason: invalid class name and case insensitive filesystem */
public class C92744eX extends FrameLayout {
    public final C98894sI A00;

    public static CameraPosition A00(LatLng latLng, AnonymousClass5B9 r8) {
        float f = r8.A00;
        LatLng A01 = AnonymousClass5B9.A01(latLng, (double) f);
        AnonymousClass67C r2 = new AnonymousClass67C();
        r2.A01 = Math.max(Math.min(r8.A02, 67.5f), 0.0f);
        r2.A02 = f;
        r2.A00 = Math.max(r8.A01, 15.0f);
        AnonymousClass006.A02(A01, "location must not be null.");
        r2.A03 = A01;
        CameraPosition A002 = r2.A00();
        r8.A0A = true;
        return A002;
    }

    public void A02() {
        C98894sI r1 = this.A00;
        C17240qx r0 = r1.A01;
        if (r0 != null) {
            try {
                C133816a2 r2 = (C133816a2) ((C141426nE) r0).A01;
                r2.A03(5, C133816a2.A00(r2));
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            }
        } else {
            C07040Wc.A00(r1, 1);
        }
    }

    public void A03() {
        C98894sI r1 = this.A00;
        C17240qx r0 = r1.A01;
        if (r0 != null) {
            try {
                C133816a2 r2 = (C133816a2) ((C141426nE) r0).A01;
                r2.A03(4, C133816a2.A00(r2));
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            }
        } else {
            C07040Wc.A00(r1, 5);
        }
    }

    public void A04() {
        C98894sI r2 = this.A00;
        C10490eK r1 = new C10490eK(r2);
        C17240qx r0 = r2.A01;
        if (r0 != null) {
            r1.Bxp(r0);
            return;
        }
        LinkedList linkedList = r2.A02;
        if (linkedList == null) {
            linkedList = C90524aI.A0l();
            r2.A02 = linkedList;
        }
        linkedList.add(r1);
        r2.A00(r2.A03);
    }

    public void A06(Bundle bundle) {
        C98894sI r1 = this.A00;
        C17240qx r0 = r1.A01;
        if (r0 != null) {
            C141426nE r02 = (C141426nE) r0;
            try {
                Bundle A07 = AnonymousClass001.A07();
                AnonymousClass6U8.A01(bundle, A07);
                C133816a2 r2 = (C133816a2) r02.A01;
                Parcel A002 = C133816a2.A00(r2);
                AnonymousClass6UO.A01(A002, A07);
                Parcel A02 = r2.A02(7, A002);
                if (A02.readInt() != 0) {
                    A07.readFromParcel(A02);
                }
                A02.recycle();
                AnonymousClass6U8.A01(A07, bundle);
            } catch (RemoteException e) {
                throw AnonymousClass78K.A00(e);
            }
        } else {
            Bundle bundle2 = r1.A00;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
    }

    public void A07(AnonymousClass7f7 r4) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            AnonymousClass006.A02(r4, "callback must not be null.");
            C98894sI r1 = this.A00;
            C17240qx r0 = r1.A01;
            if (r0 != null) {
                ((C141426nE) r0).A00(r4);
            } else {
                r1.A04.add(r4);
            }
        } else {
            throw AnonymousClass001.A09("getMapAsync() must be called on the main thread");
        }
    }

    public C92744eX(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new C98894sI(context, this, googleMapOptions);
        setClickable(true);
    }

    public void A05(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            C98894sI r2 = this.A00;
            C10500eL r1 = new C10500eL(bundle, r2);
            C17240qx r0 = r2.A01;
            if (r0 != null) {
                r1.Bxp(r0);
            } else {
                LinkedList linkedList = r2.A02;
                if (linkedList == null) {
                    linkedList = C90524aI.A0l();
                    r2.A02 = linkedList;
                }
                linkedList.add(r1);
                if (bundle != null) {
                    Bundle bundle2 = r2.A00;
                    if (bundle2 == null) {
                        r2.A00 = (Bundle) bundle.clone();
                    } else {
                        bundle2.putAll(bundle);
                    }
                }
                r2.A00(r2.A03);
            }
            if (r2.A01 == null) {
                C02610Bd r8 = C02610Bd.A00;
                Context context = getContext();
                int A02 = r8.A02(context, 12451000);
                String A01 = C07680Yv.A01(context, A02);
                Resources resources = context.getResources();
                int i = R.string.f12nameremoved;
                if (A02 != 1) {
                    i = R.string.f12nameremoved;
                    if (A02 != 2) {
                        i = R.string.f12nameremoved;
                        if (A02 != 3) {
                            i = 17039370;
                        }
                    }
                }
                String string = resources.getString(i);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(A01);
                linearLayout.addView(textView);
                Intent A03 = r8.A03(context, (String) null, A02);
                if (A03 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(string);
                    linearLayout.addView(button);
                    button.setOnClickListener(new C09030bi(context, A03));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

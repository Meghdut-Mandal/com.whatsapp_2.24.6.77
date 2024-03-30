package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Er  reason: invalid class name and case insensitive filesystem */
public abstract class C170758Er extends C91534cA implements IInterface {
    public C170758Er() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static UnsupportedOperationException A00(Parcel parcel, Parcelable.Creator creator) {
        AnonymousClass6RQ.A00(parcel, creator);
        return new UnsupportedOperationException();
    }

    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        C170738Ep r3;
        Object obj;
        switch (i) {
            case 2:
                throw A00(parcel, C170038Bs.CREATOR);
            case 3:
                throw A00(parcel, AnonymousClass8C1.CREATOR);
            case 4:
                throw A00(parcel, C170068Bv.CREATOR);
            case 5:
                throw A00(parcel, DataHolder.CREATOR);
            case 6:
                throw A00(parcel, C169958Bk.CREATOR);
            case 7:
                AnonymousClass8C2 r2 = (AnonymousClass8C2) AnonymousClass000.A0W(parcel, AnonymousClass8C2.CREATOR);
                if (this instanceof C170728Eo) {
                    r3 = (C170738Ep) this;
                    obj = new C141636nZ(AnonymousClass95X.A00(r2.A00), r2.A01);
                    break;
                } else {
                    throw AnonymousClass001.A0D();
                }
            case 8:
                throw A00(parcel, C170088Bx.CREATOR);
            case 9:
                throw A00(parcel, C170098By.CREATOR);
            case 10:
                C170058Bu r22 = (C170058Bu) AnonymousClass000.A0W(parcel, C170058Bu.CREATOR);
                if (this instanceof C170718En) {
                    r3 = (C170738Ep) this;
                    ArrayList A0I = AnonymousClass001.A0I();
                    List list = r22.A01;
                    if (list != null) {
                        A0I.addAll(list);
                    }
                    obj = new C68353bl(AnonymousClass95X.A00(r22.A00), A0I);
                    break;
                } else {
                    throw AnonymousClass001.A0D();
                }
            case 11:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                if (!(this instanceof C170708Em)) {
                    throw AnonymousClass001.A0D();
                }
                break;
            case 12:
                throw A00(parcel, AnonymousClass8C9.CREATOR);
            case 13:
                throw A00(parcel, C170048Bt.CREATOR);
            case 14:
                throw A00(parcel, C170108Bz.CREATOR);
            case 15:
                throw A00(parcel, C169918Be.CREATOR);
            case 16:
                throw A00(parcel, C169918Be.CREATOR);
            case 17:
                throw A00(parcel, C169988Bn.CREATOR);
            case 18:
                throw A00(parcel, C169998Bo.CREATOR);
            case 19:
                throw A00(parcel, C169898Bc.CREATOR);
            case 20:
                throw A00(parcel, C169908Bd.CREATOR);
            case 22:
                throw A00(parcel, C169978Bm.CREATOR);
            case 23:
                throw A00(parcel, C169968Bl.CREATOR);
            case 26:
                throw A00(parcel, C169928Bf.CREATOR);
            case 27:
                throw A00(parcel, C169938Bg.CREATOR);
            case 28:
                throw A00(parcel, C170008Bp.CREATOR);
            case 29:
                throw A00(parcel, C170018Bq.CREATOR);
            case 30:
                throw A00(parcel, AnonymousClass8C6.CREATOR);
            case 34:
                throw A00(parcel, AnonymousClass8C8.CREATOR);
            case 35:
                throw A00(parcel, C170078Bw.CREATOR);
            case 36:
                throw A00(parcel, AnonymousClass8C0.CREATOR);
            case 37:
                throw A00(parcel, C170028Br.CREATOR);
            default:
                return false;
        }
        C16790q6 r0 = r3.A00;
        if (r0 != null) {
            r0.Bs2(obj);
            r3.A00 = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

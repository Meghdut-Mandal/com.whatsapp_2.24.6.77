package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.0JL  reason: invalid class name */
public final class AnonymousClass0JL extends C07590Yl {
    public static final AnonymousClass0JC A01;
    public static final AnonymousClass0QI A02;
    public static final C06190Sq A03;
    public final String A00 = C06920Vp.A00();

    static {
        AnonymousClass0QI r3 = new AnonymousClass0QI();
        A02 = r3;
        AnonymousClass0J7 r2 = new AnonymousClass0J7();
        A01 = r2;
        A03 = new C06190Sq(r2, r3, "Auth.Api.Identity.SignIn.API");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0JL(android.app.Activity r8, X.C10060dd r9) {
        /*
            r7 = this;
            X.0Sq r5 = A03
            X.0WU r6 = X.AnonymousClass0WU.A02
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = X.C06920Vp.A00()
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JL.<init>(android.app.Activity, X.0dd):void");
    }

    public final C04410Kn A04(Intent intent) {
        if (intent != null) {
            Status status = (Status) A00(intent, Status.CREATOR, "status");
            if (status == null) {
                throw new ApiException(Status.A05);
            } else if (status.A01 <= 0) {
                C04410Kn r0 = (C04410Kn) A00(intent, C04410Kn.CREATOR, "sign_in_credential");
                if (r0 != null) {
                    return r0;
                }
                throw new ApiException(Status.A07);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.A07);
        }
    }

    public static SafeParcelable A00(Intent intent, Parcelable.Creator creator, String str) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        AnonymousClass006.A01(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public AnonymousClass0JL(Context context, C10060dd r4) {
        super(context, (C17370rB) r4, A03, AnonymousClass0WU.A02);
    }
}

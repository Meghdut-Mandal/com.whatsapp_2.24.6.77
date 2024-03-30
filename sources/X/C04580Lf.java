package X;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.0Lf  reason: invalid class name and case insensitive filesystem */
public final class C04580Lf extends C03280Dy implements IInterface {
    public final Context A00;

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        BasePendingResult A06;
        BasePendingResult A062;
        if (i == 1) {
            A01();
            Context context = this.A00;
            C07550Yf A002 = C07550Yf.A00(context);
            GoogleSignInAccount A01 = A002.A01();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0D;
            if (A01 != null) {
                googleSignInOptions = A002.A02();
            }
            AnonymousClass006.A01(googleSignInOptions);
            AnonymousClass0JF r0 = new AnonymousClass0JF(context, googleSignInOptions);
            AnonymousClass0XK r5 = r0.A05;
            Context context2 = r0.A01;
            boolean A1S = AnonymousClass000.A1S(AnonymousClass0JF.A00(r0), 3);
            AnonymousClass0UT r1 = C06900Vn.A00;
            if (A01 != null) {
                r1.A00("Revoking access");
                String A03 = C07550Yf.A00(context2).A03("refreshToken");
                C06900Vn.A00(context2);
                if (A1S) {
                    AnonymousClass0UT r02 = C12070hS.A02;
                    if (A03 == null) {
                        Status status = new Status(4, (String) null);
                        A062 = new AnonymousClass0JR(status);
                        A062.A06(status);
                    } else {
                        C12070hS r12 = new C12070hS(A03);
                        new Thread(r12).start();
                        A062 = r12.A00;
                    }
                } else {
                    A062 = r5.A06(new C04010Iv(r5));
                }
                C06910Vo.A00(A062, new C10420eD());
                return true;
            }
            r1.A00("Signing out");
            C06900Vn.A00(context2);
            if (A1S) {
                Status status2 = Status.A09;
                AnonymousClass006.A02(status2, "Result must not be null");
                A06 = new AnonymousClass0JQ(r5);
                A06.A06(status2);
            } else {
                A06 = r5.A06(new C04000Iu(r5));
            }
            C06910Vo.A00(A06, new C10420eD());
            return true;
        } else if (i != 2) {
            return false;
        } else {
            A01();
            C07170Wp.A00(this.A00).A01();
            return true;
        }
    }

    private final void A01() {
        if (!AnonymousClass0QQ.A00(this.A00, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Calling UID ");
            A0u.append(callingUid);
            throw new SecurityException(AnonymousClass000.A0q(" is not Google Play services.", A0u));
        }
    }

    public C04580Lf(Context context) {
        this();
        this.A00 = context;
    }

    public C04580Lf() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}

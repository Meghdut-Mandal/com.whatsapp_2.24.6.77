package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.0KF  reason: invalid class name */
public class AnonymousClass0KF extends C10440eF {
    public static final C04520Ky[] A0E = new C04520Ky[0];
    public static final Scope[] A0F = new Scope[0];
    public static final Parcelable.Creator CREATOR = new C08690b9();
    public int A00;
    public int A01;
    public Account A02;
    public Bundle A03;
    public IBinder A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public C04520Ky[] A08;
    public C04520Ky[] A09;
    public Scope[] A0A;
    public String A0B;
    public final int A0C;
    public final int A0D;

    public final void writeToParcel(Parcel parcel, int i) {
        C08690b9.A00(parcel, this, i);
    }

    public AnonymousClass0KF(Account account, Bundle bundle, IBinder iBinder, String str, String str2, C04520Ky[] r12, C04520Ky[] r13, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Account account2;
        Object r2;
        Parcelable parcelable;
        scopeArr = scopeArr == null ? A0F : scopeArr;
        bundle = bundle == null ? AnonymousClass001.A07() : bundle;
        r12 = r12 == null ? A0E : r12;
        r13 = r13 == null ? A0E : r13;
        this.A0C = i;
        this.A0D = i2;
        this.A00 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A05 = "com.google.android.gms";
        } else {
            this.A05 = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    r2 = (IAccountAccessor) queryLocalInterface;
                } else {
                    r2 = new AnonymousClass0MN(iBinder);
                }
                account2 = null;
                if (r2 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        AnonymousClass0MN r22 = (AnonymousClass0MN) r2;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r22.A00);
                        Parcel A002 = r22.A00(2, obtain);
                        Parcelable.Creator creator = Account.CREATOR;
                        if (A002.readInt() == 0) {
                            parcelable = null;
                        } else {
                            parcelable = (Parcelable) creator.createFromParcel(A002);
                        }
                        Account account3 = (Account) parcelable;
                        A002.recycle();
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                account2 = null;
            }
            this.A02 = account2;
        } else {
            this.A04 = iBinder;
            this.A02 = account;
        }
        this.A0A = scopeArr;
        this.A03 = bundle;
        this.A08 = r12;
        this.A09 = r13;
        this.A06 = z;
        this.A01 = i4;
        this.A07 = z2;
        this.A0B = str2;
    }
}

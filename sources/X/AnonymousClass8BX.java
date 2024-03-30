package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.8BX  reason: invalid class name */
public final class AnonymousClass8BX extends C04270Jz {
    public final int A00;
    public final AnonymousClass9DG A01 = new AnonymousClass9DG();
    public final ClientAppContext A02;

    public final String A07() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    public final String A08() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final void A0G(int i) {
        String str;
        if (i != 1) {
            str = "CLIENT_DISCONNECTED";
        } else {
            str = "ACTIVITY_STOPPED";
        }
        if (isConnected()) {
            AnonymousClass8C4 r2 = new AnonymousClass8C4((ClientAppContext) null, 1, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                C165587tf.A1M("Emitting client lifecycle event %s", "NearbyMessagesClient", new Object[]{str});
            }
            C204409px r1 = (C204409px) A04();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r1.A01);
            obtain.writeInt(1);
            r2.writeToParcel(obtain, 0);
            try {
                r1.A00.transact(9, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            C165587tf.A1M("Failed to emit client lifecycle event %s due to GmsClient being disconnected", "NearbyMessagesClient", new Object[]{str});
        }
    }

    public final void B5X() {
        try {
            A0G(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", AnonymousClass000.A1b(e)));
            }
        }
        this.A01.A00.clear();
        super.B5X();
    }

    public final int BEG() {
        return 12451000;
    }

    public AnonymousClass8BX(Context context, Looper looper, C17610rh r12, C17620ri r13, AnonymousClass0TT r14) {
        super(context, looper, r12, r13, r14, 62);
        int i;
        String str = r14.A02;
        if (context instanceof Activity) {
            i = 1;
        } else if (context instanceof Application) {
            i = 2;
        } else {
            i = 0;
            if (context instanceof Service) {
                i = 3;
            }
        }
        this.A02 = new ClientAppContext(str, (String) null, (String) null, 1, i, false);
        this.A00 = -1;
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (!(queryLocalInterface instanceof C170428Dj)) {
            return new C170428Dj(iBinder);
        }
        return queryLocalInterface;
    }

    public final boolean BoR() {
        return C197069b5.A00(this.A0F);
    }

    public final Bundle A03() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("NearbyPermissions", this.A00);
        A07.putParcelable("ClientAppContext", this.A02);
        return A07;
    }
}

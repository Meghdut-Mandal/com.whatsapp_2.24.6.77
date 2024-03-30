package X;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.6En  reason: invalid class name and case insensitive filesystem */
public abstract class C128996En {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final Object A04 = C36441kJ.A11();
    public final String A05;
    public final String A06;
    public final String A07;

    public abstract Object A01(Context context, AnonymousClass0Z3 r2);

    public abstract void A03();

    public final Object A00() {
        Object obj;
        synchronized (this.A04) {
            obj = this.A00;
            if (obj == null) {
                AnonymousClass0Z3 r5 = null;
                try {
                    r5 = AnonymousClass0Z3.A04(this.A03, AnonymousClass0Z3.A08, this.A06);
                } catch (AnonymousClass0OB unused) {
                    Object[] A0M = AnonymousClass001.A0M();
                    A0M[0] = "com.google.android.gms.vision";
                    String str = this.A07;
                    A0M[1] = str;
                    String format = String.format("%s.%s", A0M);
                    Object[] objArr = {format};
                    if (C90494aF.A1a("Vision")) {
                        Log.d("Vision", String.format("Cannot load thick client module, fall back to load optional module %s", objArr));
                    }
                    try {
                        r5 = AnonymousClass0Z3.A04(this.A03, AnonymousClass0Z3.A09, format);
                    } catch (AnonymousClass0OB e) {
                        C109725Yr.A00("Error loading optional module %s", e, format);
                        if (!this.A01) {
                            Object[] objArr2 = {str};
                            if (C90494aF.A1a("Vision")) {
                                Log.d("Vision", String.format("Broadcasting download intent for dependency %s", objArr2));
                            }
                            Intent A0D = C36431kI.A0D();
                            A0D.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                            A0D.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                            A0D.setAction("com.google.android.gms.vision.DEPENDENCY");
                            this.A03.sendBroadcast(A0D);
                            this.A01 = true;
                        }
                    }
                }
                if (r5 != null) {
                    try {
                        this.A00 = A01(this.A03, r5);
                    } catch (AnonymousClass0OB | RemoteException e2) {
                        Log.e(this.A05, "Error creating remote native handle", e2);
                    }
                }
                boolean z = this.A02;
                if (!z && this.A00 == null) {
                    Log.w(this.A05, "Native handle not yet available. Reverting to no-op handle.");
                    this.A02 = true;
                } else if (z && this.A00 != null) {
                    Log.w(this.A05, "Native handle is now available.");
                }
                obj = this.A00;
            }
        }
        return obj;
    }

    public final void A02() {
        synchronized (this.A04) {
            if (this.A00 != null) {
                try {
                    A03();
                } catch (RemoteException e) {
                    Log.e(this.A05, "Could not finalize native handle", e);
                }
            }
        }
    }

    public C128996En(Context context, String str, String str2) {
        String str3;
        this.A03 = context;
        this.A05 = str;
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(valueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.A06 = str3;
        this.A07 = str2;
    }
}

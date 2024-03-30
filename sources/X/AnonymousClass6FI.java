package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import java.io.IOException;

/* renamed from: X.6FI  reason: invalid class name */
public class AnonymousClass6FI {
    public int A00 = 0;
    public AnonymousClass6ZI A01 = null;
    public String A02;
    public final Context A03;
    public final C19700wN A04;
    public final C116235kG A05;
    public final AnonymousClass005 A06;
    public final Context A07;

    public AnonymousClass5KJ A01() {
        AnonymousClass5KJ r0;
        synchronized (this) {
            this.A00++;
            r0 = new AnonymousClass5KJ(this);
        }
        return r0;
    }

    public C1495371p A02() {
        C1495371p r0;
        synchronized (this) {
            this.A00++;
            r0 = new C1495371p(this);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r3.getFileDescriptor() == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r7 = this;
            java.lang.String r6 = "GoogleMigrateClient/hasWhatsAppData()"
            r5 = 0
            X.5KJ r4 = r7.A01()     // Catch:{ 5VG | SecurityException -> 0x0048, all -> 0x0043 }
            android.os.IInterface r0 = r4.A00()     // Catch:{ all -> 0x0039 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch:{ all -> 0x0039 }
            android.os.ParcelFileDescriptor r3 = r0.BBq()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x001a
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x002d }
            r2 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData; hasFileDescriptor = "
            X.C36321k7.A1X(r0, r1, r2)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0029
            r3.close()     // Catch:{ all -> 0x0039 }
        L_0x0029:
            r4.close()     // Catch:{ 5VG | SecurityException -> 0x0048, all -> 0x0043 }
            return r2
        L_0x002d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0039 }
        L_0x0038:
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 5VG | SecurityException -> 0x0048, all -> 0x0043 }
        L_0x0042:
            throw r1     // Catch:{ 5VG | SecurityException -> 0x0048, all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            return r5
        L_0x0048:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData(): "
            X.C36321k7.A1K(r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FI.A04():boolean");
    }

    public boolean A05(String str) {
        try {
            ApplicationInfo applicationInfo = this.A07.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (!applicationInfo.enabled) {
                return false;
            }
            int i = applicationInfo.flags;
            boolean A1P = AnonymousClass000.A1P(i & 1);
            boolean A1P2 = AnonymousClass000.A1P(i & 128);
            if (A1P || A1P2) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public AnonymousClass6FI(Context context, C19700wN r3, C116235kG r4, AnonymousClass005 r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A07 = context;
        this.A06 = r5;
        this.A05 = r4;
    }

    public ParcelFileDescriptor A00(String str) {
        Parcel obtain;
        Parcel obtain2;
        Object obj;
        try {
            AnonymousClass5KJ A012 = A01();
            try {
                C141386nA r1 = (C141386nA) ((IAppDataReaderService) A012.A00());
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                obtain.writeString(str);
                AnonymousClass000.A15(r1.A00, obtain, obtain2, 2);
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                if (obtain2.readInt() != 0) {
                    obj = creator.createFromParcel(obtain2);
                } else {
                    obj = null;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                obtain2.recycle();
                obtain.recycle();
                A012.close();
                return parcelFileDescriptor;
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
        } catch (Exception e) {
            throw new IOException(str, e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A03() {
        Parcel obtain;
        Parcel obtain2;
        try {
            AnonymousClass5KJ A012 = A01();
            try {
                C141386nA r1 = (C141386nA) ((IAppDataReaderService) A012.A00());
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                AnonymousClass000.A15(r1.A00, obtain, obtain2, 4);
                obtain2.recycle();
                obtain.recycle();
                A012.close();
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
        } catch (Exception e) {
            throw new IOException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}

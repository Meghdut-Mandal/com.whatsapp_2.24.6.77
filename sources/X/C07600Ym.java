package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Ym  reason: invalid class name and case insensitive filesystem */
public final class C07600Ym {
    public int A00 = -1;
    public int A01;
    public int A02 = 8388613;
    public int A03;
    public int A04 = 0;
    public int A05 = 1;
    public int A06 = 80;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = AnonymousClass001.A0I();
    public ArrayList A0D = AnonymousClass001.A0I();

    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C07600Ym r2 = new C07600Ym();
        r2.A0C = new ArrayList(this.A0C);
        r2.A05 = this.A05;
        r2.A08 = this.A08;
        r2.A0D = new ArrayList(this.A0D);
        r2.A09 = this.A09;
        r2.A01 = this.A01;
        r2.A02 = this.A02;
        r2.A00 = this.A00;
        r2.A04 = this.A04;
        r2.A03 = this.A03;
        r2.A06 = this.A06;
        r2.A07 = this.A07;
        r2.A0B = this.A0B;
        r2.A0A = this.A0A;
        return r2;
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public void A04(C07700Yy r12) {
        int i;
        Notification.Action.Builder A002;
        Icon A082;
        Bundle A072 = AnonymousClass001.A07();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C07250Wx r8 = (C07250Wx) it.next();
                int i2 = Build.VERSION.SDK_INT;
                IconCompat A003 = r8.A00();
                if (i2 >= 23) {
                    if (A003 == null) {
                        A082 = null;
                    } else {
                        A082 = A003.A08();
                    }
                    A002 = AnonymousClass0PV.A00(r8.A01, A082, r8.A02);
                } else {
                    if (A003 == null || A003.A05() != 2) {
                        i = 0;
                    } else {
                        i = A003.A04();
                    }
                    A002 = A00(r8.A01, r8.A02, i);
                }
                Bundle bundle = new Bundle(r8.A07);
                boolean z = r8.A03;
                bundle.putBoolean("android.support.allowGeneratedReplies", z);
                if (i2 >= 24) {
                    AnonymousClass0PW.A00(A002, z);
                    if (i2 >= 31) {
                        AnonymousClass0PX.A00(A002);
                    }
                }
                A03(A002, bundle);
                AnonymousClass0TH[] r82 = r8.A08;
                if (r82 != null) {
                    int length = r82.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        remoteInputArr[i3] = AnonymousClass0VG.A00(r82[i3]);
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        A02(A002, remoteInputArr[i4]);
                    }
                }
                arrayList2.add(A01(A002));
            }
            A072.putParcelableArrayList("actions", arrayList2);
        }
        int i5 = this.A05;
        if (i5 != 1) {
            A072.putInt("flags", i5);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            A072.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList3 = this.A0D;
        if (!arrayList3.isEmpty()) {
            A072.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            A072.putParcelable("background", bitmap);
        }
        int i6 = this.A01;
        if (i6 != 0) {
            A072.putInt("contentIcon", i6);
        }
        int i7 = this.A02;
        if (i7 != 8388613) {
            A072.putInt("contentIconGravity", i7);
        }
        int i8 = this.A00;
        if (i8 != -1) {
            A072.putInt("contentActionIndex", i8);
        }
        int i9 = this.A04;
        if (i9 != 0) {
            A072.putInt("customSizePreset", i9);
        }
        int i10 = this.A03;
        if (i10 != 0) {
            A072.putInt("customContentHeight", i10);
        }
        int i11 = this.A06;
        if (i11 != 80) {
            A072.putInt("gravity", i11);
        }
        int i12 = this.A07;
        if (i12 != 0) {
            A072.putInt("hintScreenTimeout", i12);
        }
        String str = this.A0B;
        if (str != null) {
            A072.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            A072.putString("bridgeTag", str2);
        }
        Bundle bundle2 = r12.A0G;
        if (bundle2 == null) {
            bundle2 = AnonymousClass001.A07();
            r12.A0G = bundle2;
        }
        bundle2.putBundle("android.wearable.EXTENSIONS", A072);
    }

    public static void A02(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A03(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }
}

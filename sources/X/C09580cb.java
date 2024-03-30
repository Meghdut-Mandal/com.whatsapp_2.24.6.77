package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0cb  reason: invalid class name and case insensitive filesystem */
public class C09580cb implements C15690np {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final Context A03;
    public final Bundle A04 = AnonymousClass001.A07();
    public final C07700Yy A05;
    public final List A06 = AnonymousClass001.A0I();

    public static Notification.Builder A02(Notification.Builder builder) {
        return builder.setSubText((CharSequence) null);
    }

    public C09580cb(C07700Yy r26) {
        Notification.Builder builder;
        Icon A09;
        ArrayList arrayList;
        int i;
        Bundle[] bundleArr;
        int i2;
        Notification.Action.Builder A002;
        Icon icon;
        Bitmap A062;
        C07700Yy r7 = r26;
        this.A05 = r7;
        Context context = r7.A0F;
        this.A03 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = C07620Yp.A00(context, r7.A0M);
        } else {
            builder = new Notification.Builder(context);
        }
        this.A02 = builder;
        Notification notification = r7.A0B;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing(AnonymousClass000.A1P(notification.flags & 2)).setOnlyAlertOnce(AnonymousClass000.A1P(notification.flags & 8)).setAutoCancel(AnonymousClass000.A1P(notification.flags & 16)).setDefaults(notification.defaults).setContentTitle(r7.A0K).setContentText(r7.A0J).setContentInfo((CharSequence) null).setContentIntent(r7.A0D).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(r7.A0E, AnonymousClass000.A1P(notification.flags & 128)).setNumber(r7.A08).setProgress(r7.A01, r7.A00, r7.A05);
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder2 = this.A02;
        IconCompat iconCompat = r7.A0I;
        if (i3 < 23) {
            if (iconCompat == null) {
                A062 = null;
            } else {
                A062 = iconCompat.A06();
            }
            builder2.setLargeIcon(A062);
        } else {
            if (iconCompat == null) {
                A09 = null;
            } else {
                A09 = iconCompat.A09(context);
            }
            AnonymousClass0XU.A01(builder2, A09);
        }
        int i4 = Build.VERSION.SDK_INT;
        A0A(A03(A02(this.A02), r7.A0Y), r7.A09);
        Iterator it = r7.A0Q.iterator();
        while (it.hasNext()) {
            C07250Wx r9 = (C07250Wx) it.next();
            IconCompat A003 = r9.A00();
            if (i4 >= 23) {
                if (A003 != null) {
                    icon = A003.A08();
                } else {
                    icon = null;
                }
                A002 = AnonymousClass0XU.A00(r9.A01, icon, r9.A02);
            } else {
                if (A003 != null) {
                    i2 = A003.A04();
                } else {
                    i2 = 0;
                }
                A002 = A00(r9.A01, r9.A02, i2);
            }
            AnonymousClass0TH[] r13 = r9.A08;
            if (r13 != null) {
                int length = r13.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i5 = 0; i5 < length; i5++) {
                    remoteInputArr[i5] = AnonymousClass0VG.A00(r13[i5]);
                }
                for (int i6 = 0; i6 < length; i6++) {
                    A06(A002, remoteInputArr[i6]);
                }
            }
            Bundle bundle = new Bundle(r9.A07);
            boolean z = r9.A03;
            bundle.putBoolean("android.support.allowGeneratedReplies", z);
            if (i4 >= 24) {
                AnonymousClass0XV.A00(A002, z);
            }
            int i7 = r9.A06;
            bundle.putInt("android.support.action.semanticAction", i7);
            if (i4 >= 28) {
                AnonymousClass0VE.A00(A002, i7);
                if (i4 >= 29) {
                    AnonymousClass0XW.A00(A002);
                    if (i4 >= 31) {
                        AnonymousClass0PY.A00(A002);
                    }
                }
            }
            bundle.putBoolean("android.support.action.showsUserInterface", r9.A04);
            A07(A002, bundle);
            A08(A01(A002), this.A02);
        }
        Bundle bundle2 = r7.A0G;
        if (bundle2 != null) {
            this.A04.putAll(bundle2);
        }
        this.A01 = r7.A0H;
        A0L(this.A02, r7.A0W);
        A0K(this.A02, r7.A0V);
        A0H(this.A02, r7.A0N);
        A0I(this.A02, r7.A0P);
        A0J(this.A02, r7.A0U);
        this.A00 = r7.A07;
        A0G(this.A02, r7.A0L);
        A09(this.A02, r7.A06);
        A0B(this.A02, r7.A0A);
        A0C(this.A02, r7.A0C);
        A0D(this.A02, notification.sound, notification.audioAttributes);
        if (i4 < 28) {
            ArrayList arrayList2 = r7.A0S;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass0UW r1 = (AnonymousClass0UW) it2.next();
                String str = r1.A03;
                if (str == null) {
                    CharSequence charSequence = r1.A01;
                    if (charSequence != null) {
                        str = AnonymousClass000.A0l(charSequence, "name:", AnonymousClass000.A0u());
                    } else {
                        str = "";
                    }
                }
                arrayList3.add(str);
            }
            ArrayList arrayList4 = r7.A0R;
            C000000a r0 = new C000000a(arrayList3.size() + arrayList4.size());
            r0.addAll(arrayList3);
            r0.addAll(arrayList4);
            arrayList = new ArrayList(r0);
        } else {
            arrayList = r7.A0R;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                A0F(this.A02, AnonymousClass001.A0C(it3));
            }
        }
        ArrayList arrayList5 = r7.A04;
        if (arrayList5.size() > 0) {
            Bundle bundle3 = r7.A0G;
            if (bundle3 == null) {
                bundle3 = AnonymousClass001.A07();
                r7.A0G = bundle3;
            }
            Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? AnonymousClass001.A07() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle A07 = AnonymousClass001.A07();
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                String num = Integer.toString(i8);
                C07250Wx r12 = (C07250Wx) arrayList5.get(i8);
                Bundle A072 = AnonymousClass001.A07();
                IconCompat A004 = r12.A00();
                if (A004 != null) {
                    i = A004.A04();
                } else {
                    i = 0;
                }
                A072.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
                A072.putCharSequence("title", r12.A02);
                A072.putParcelable("actionIntent", r12.A01);
                Bundle bundle6 = new Bundle(r12.A07);
                bundle6.putBoolean("android.support.allowGeneratedReplies", r12.A03);
                A072.putBundle("extras", bundle6);
                AnonymousClass0TH[] r02 = r12.A08;
                AnonymousClass0TH[] r16 = r02;
                if (r02 == null) {
                    bundleArr = null;
                } else {
                    int length2 = r02.length;
                    int i9 = length2;
                    bundleArr = new Bundle[length2];
                    for (int i10 = 0; i10 < i9; i10++) {
                        AnonymousClass0TH r15 = r16[i10];
                        Bundle A073 = AnonymousClass001.A07();
                        A073.putString("resultKey", r15.A02);
                        A073.putCharSequence("label", r15.A01);
                        A073.putCharSequenceArray("choices", r15.A04);
                        A073.putBoolean("allowFreeFormInput", true);
                        A073.putBundle("extras", r15.A00);
                        Set set = r15.A03;
                        Set<Object> set2 = set;
                        if (!set.isEmpty()) {
                            ArrayList arrayList6 = new ArrayList(set2.size());
                            for (Object add : set2) {
                                arrayList6.add(add);
                            }
                            A073.putStringArrayList("allowedDataTypes", arrayList6);
                        }
                        bundleArr[i10] = A073;
                    }
                }
                A072.putParcelableArray("remoteInputs", bundleArr);
                A072.putBoolean("showsUserInterface", r12.A04);
                A072.putInt("semanticAction", r12.A06);
                A07.putBundle(num, A072);
            }
            Bundle bundle7 = A07;
            bundle4.putBundle("invisible_actions", bundle7);
            bundle5.putBundle("invisible_actions", bundle7);
            Bundle bundle8 = r7.A0G;
            if (bundle8 == null) {
                bundle8 = AnonymousClass001.A07();
                r7.A0G = bundle8;
            }
            String str2 = "android.car.EXTENSIONS";
            bundle8.putBundle(str2, bundle4);
            this.A04.putBundle(str2, bundle5);
        }
        if (i4 >= 23) {
            Object obj = r7.A03;
            if (obj != null) {
                AnonymousClass0XU.A02(this.A02, obj);
            }
            if (i4 >= 24) {
                A0E(this.A02, r7.A0G);
                AnonymousClass0XV.A01(this.A02);
                RemoteViews remoteViews = r7.A0H;
                if (remoteViews != null) {
                    AnonymousClass0XV.A02(this.A02, remoteViews);
                }
                if (i4 >= 26) {
                    C07620Yp.A01(this.A02);
                    C07620Yp.A02(this.A02);
                    C07620Yp.A05(this.A02, r7.A0O);
                    C07620Yp.A03(this.A02);
                    C07620Yp.A04(this.A02, r7.A07);
                    if (!TextUtils.isEmpty(r7.A0M)) {
                        this.A02.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
                    }
                    if (i4 >= 28) {
                        Iterator it4 = r7.A0S.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass0VE.A01(this.A02, ((AnonymousClass0UW) it4.next()).A00());
                        }
                        if (i4 >= 29) {
                            AnonymousClass0XW.A02(this.A02, r7.A0T);
                            AnonymousClass0XW.A01(this.A02);
                        }
                    }
                }
            }
        }
        if (r7.A0X) {
            if (this.A05.A0U) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A02.setVibrate((long[]) null);
            this.A02.setSound((Uri) null);
            int i11 = notification.defaults & -2;
            notification.defaults = i11;
            int i12 = i11 & -3;
            notification.defaults = i12;
            this.A02.setDefaults(i12);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.A05.A0N)) {
                    A0H(this.A02, "silent");
                }
                C07620Yp.A04(this.A02, this.A00);
            }
        }
    }

    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static void A0D(Notification.Builder builder, Uri uri, Object obj) {
        builder.setSound(uri, (AudioAttributes) obj);
    }

    public Notification A0M() {
        RemoteViews remoteViews;
        Notification A042;
        C07700Yy r3 = this.A05;
        AnonymousClass0YE r2 = r3.A02;
        if (r2 != null) {
            r2.A0B(this);
            remoteViews = r2.A08(this);
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            A042 = A04(this.A02);
        } else {
            Notification.Builder builder = this.A02;
            if (i >= 24) {
                A042 = A04(builder);
            } else {
                A0E(builder, this.A04);
                A042 = A04(builder);
                RemoteViews remoteViews2 = this.A01;
                if (remoteViews2 != null) {
                    A042.contentView = remoteViews2;
                }
            }
            int i2 = this.A00;
            if (i2 != 0) {
                if (!(A05(A042) == null || (A042.flags & 512) == 0 || i2 != 2)) {
                    A042.sound = null;
                    A042.vibrate = null;
                    int i3 = A042.defaults & -2;
                    A042.defaults = i3;
                    A042.defaults = i3 & -3;
                }
                if (A05(A042) != null && (A042.flags & 512) == 0 && i2 == 1) {
                    A042.sound = null;
                    A042.vibrate = null;
                    int i4 = A042.defaults & -2;
                    A042.defaults = i4;
                    A042.defaults = i4 & -3;
                }
            }
        }
        if (!(remoteViews == null && (remoteViews = r3.A0H) == null)) {
            A042.contentView = remoteViews;
        }
        if (r2 != null) {
            RemoteViews A07 = r2.A07(this);
            if (A07 != null) {
                A042.bigContentView = A07;
            }
            Bundle bundle = A042.extras;
            if (bundle != null) {
                r2.A0A(bundle);
            }
        }
        return A042;
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Builder A03(Notification.Builder builder, boolean z) {
        return builder.setUsesChronometer(z);
    }

    public static Notification A04(Notification.Builder builder) {
        return builder.build();
    }

    public static String A05(Notification notification) {
        return notification.getGroup();
    }

    public static void A06(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A07(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }

    public static void A08(Notification.Action action, Notification.Builder builder) {
        builder.addAction(action);
    }

    public static void A09(Notification.Builder builder, int i) {
        builder.setColor(i);
    }

    public static void A0A(Notification.Builder builder, int i) {
        builder.setPriority(i);
    }

    public static void A0B(Notification.Builder builder, int i) {
        builder.setVisibility(i);
    }

    public static void A0C(Notification.Builder builder, Notification notification) {
        builder.setPublicVersion(notification);
    }

    public static void A0E(Notification.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void A0F(Notification.Builder builder, String str) {
        builder.addPerson(str);
    }

    public static void A0G(Notification.Builder builder, String str) {
        builder.setCategory(str);
    }

    public static void A0H(Notification.Builder builder, String str) {
        builder.setGroup(str);
    }

    public static void A0I(Notification.Builder builder, String str) {
        builder.setSortKey(str);
    }

    public static void A0J(Notification.Builder builder, boolean z) {
        builder.setGroupSummary(z);
    }

    public static void A0K(Notification.Builder builder, boolean z) {
        builder.setLocalOnly(z);
    }

    public static void A0L(Notification.Builder builder, boolean z) {
        builder.setShowWhen(z);
    }
}

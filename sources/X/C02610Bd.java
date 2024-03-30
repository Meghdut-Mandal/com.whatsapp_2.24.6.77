package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.whatsapp.R;

/* renamed from: X.0Bd  reason: invalid class name and case insensitive filesystem */
public class C02610Bd extends C02600Bc {
    public static final C02610Bd A00 = new C02610Bd();
    public static final Object A01 = new Object();

    public static final AlertDialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, AnonymousClass0ZQ r7, int i) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C07680Yv.A01(context, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        int i2 = R.string.f12nameremoved;
        if (i != 1) {
            i2 = R.string.f12nameremoved;
            if (i != 2) {
                i2 = R.string.f12nameremoved;
                if (i != 3) {
                    i2 = 17039370;
                }
            }
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = C07680Yv.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    public final void A05(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            new AnonymousClass0MJ(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = C07680Yv.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = C07680Yv.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(R.string.f12nameremoved);
            }
            if (i == 6 || i == 19) {
                String A002 = C07680Yv.A00(context);
                Resources resources = context.getResources();
                String A03 = C07680Yv.A03(context, "common_google_play_services_resolution_required_text");
                if (A03 == null) {
                    A03 = resources.getString(R.string.f12nameremoved);
                }
                format = String.format(resources.getConfiguration().locale, A03, new Object[]{A002});
            } else {
                format = C07680Yv.A01(context, i);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            AnonymousClass006.A01(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C07700Yy r2 = new C07700Yy(context, (String) null);
            r2.A0V = true;
            r2.A0I(true);
            r2.A0F(A02);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A0C(format);
            r2.A0C(notificationCompat$BigTextStyle);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = C02660Bi.A00;
            if (bool == null) {
                boolean z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                C02660Bi.A00 = bool;
            }
            if (bool.booleanValue()) {
                r2.A0B.icon = context.getApplicationInfo().icon;
                r2.A09 = 2;
                if (C02660Bi.A00(context)) {
                    r2.A08(R.drawable.common_full_open_on_phone, resources2.getString(R.string.f12nameremoved), pendingIntent);
                } else {
                    r2.A0D = pendingIntent;
                }
            } else {
                r2.A0B.icon = 17301642;
                r2.A0G(resources2.getString(R.string.f12nameremoved));
                r2.A09(System.currentTimeMillis());
                r2.A0D = pendingIntent;
                r2.A0E(format);
            }
            if (AnonymousClass0VW.A00()) {
                synchronized (A01) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R.string.f12nameremoved);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    r2.A0M = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                r2.A0M = "com.google.android.gms.availability";
            }
            Notification A05 = r2.A05();
            if (i == 1 || i == 2 || i == 3) {
                C02620Be.A02.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, A05);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof AnonymousClass01I) {
                AnonymousClass01z r2 = ((AnonymousClass01I) activity).A04.A00.A03;
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                AnonymousClass006.A02(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.A00 = dialog;
                supportErrorDialogFragment.A01 = onCancelListener;
                supportErrorDialogFragment.A1f(r2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        AnonymousClass0DV r1 = new AnonymousClass0DV();
        AnonymousClass006.A02(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        r1.A00 = dialog;
        r1.A01 = onCancelListener;
        r1.show(fragmentManager, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (android.os.Build.VERSION.CODENAME.charAt(0) == 'T') goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C03080Dc A04(android.content.Context r6, X.C06300Tb r7) {
        /*
            r5 = this;
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>(r0)
            java.lang.String r0 = "package"
            r4.addDataScheme(r0)
            X.0Dc r3 = new X.0Dc
            r3.<init>(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0035
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 84
            if (r1 == r0) goto L_0x0035
            r6.registerReceiver(r3, r4)
        L_0x0025:
            r3.A00 = r6
            boolean r0 = X.C02620Be.A03(r6)
            if (r0 != 0) goto L_0x004b
            r7.A00()
            r3.A00()
            r0 = 0
            return r0
        L_0x0035:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0046
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            r0 = 0
            char r2 = r1.charAt(r0)
            r1 = 84
            if (r2 != r1) goto L_0x0047
        L_0x0046:
            r0 = 2
        L_0x0047:
            r6.registerReceiver(r3, r4, r0)
            goto L_0x0025
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02610Bd.A04(android.content.Context, X.0Tb):X.0Dc");
    }
}

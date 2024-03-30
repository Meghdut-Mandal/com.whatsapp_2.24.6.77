package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Iq  reason: invalid class name and case insensitive filesystem */
public abstract class C26041Iq {
    public List A01(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr;
        String str6;
        String str7;
        String str8;
        if (this instanceof C26081Iu) {
            str6 = "com.miui.miuilite";
            str7 = "com.miui.miuihome";
            str8 = "com.miui.miuihome2";
        } else if (this instanceof C26091Iv) {
            str6 = "com.sonyericsson.home";
            str7 = "com.sonymobile.home";
            str8 = "com.sonymobile.launcher";
        } else if (this instanceof C26051Ir) {
            return null;
        } else {
            if (this instanceof C26071It) {
                str2 = "com.sec.android.app.launcher";
                str3 = "com.sec.android.app.twlauncher";
                str4 = "com.sec.android.app.easylauncher";
                str5 = "com.sec.android.emergencylauncher";
            } else {
                if (this instanceof C26121Iy) {
                    C26121Iy r5 = (C26121Iy) this;
                    String str9 = Build.MANUFACTURER;
                    if (str9.equalsIgnoreCase("OPPO") || str9.equalsIgnoreCase("realme")) {
                        String str10 = Build.BRAND;
                        if (str10.equalsIgnoreCase("oppo") || str10.equalsIgnoreCase("realme")) {
                            boolean z = false;
                            try {
                                z = !TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.version.oplusrom"}));
                            } catch (Exception e) {
                                Log.e("Error while checking oppo launcher information", e);
                            }
                            if (z) {
                                if (C20800yB.A01(C21000yV.A02, r5.A00, 503)) {
                                    str = "com.android.launcher";
                                }
                            }
                        }
                    }
                    str = "com.oppo.launcher";
                } else if (this instanceof C26111Ix) {
                    str = "com.huawei.android.launcher";
                } else if (this instanceof C26101Iw) {
                    if (C26101Iw.A00(context, (C26101Iw) this) < 4.0f) {
                        return new ArrayList();
                    }
                    str = "com.htc.launcher";
                } else if (this instanceof C26131Iz) {
                    if (!C20800yB.A01(C21000yV.A02, ((C26131Iz) this).A00, 2337)) {
                        return Collections.emptyList();
                    }
                    str = "com.hihonor.android.launcher";
                } else {
                    str2 = "com.asus.launcher";
                    str3 = "com.lge.launcher";
                    str4 = "com.lge.launcher2";
                    str5 = "com.lge.launcher3";
                }
                return Collections.singletonList(str);
            }
            strArr = new String[]{str2, str3, str4, str5};
            return Arrays.asList(strArr);
        }
        strArr = new String[]{str6, str7, str8};
        return Arrays.asList(strArr);
    }

    public void A02(int i, Notification notification) {
        if ((this instanceof C26081Iu) && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
                Log.e("Could not set badge for Xiaomi notification");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A[SYNTHETIC, Splitter:B:29:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd A[Catch:{ Exception -> 0x00d2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Context r21, X.C21060yb r22, int r23) {
        /*
            r20 = this;
            r2 = r20
            boolean r0 = r2 instanceof X.C26081Iu
            r10 = r21
            r9 = r23
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x002a }
            java.lang.Class r1 = r2.getClass()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "messageCount"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x002a }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x002a }
            r1.set(r2, r0)     // Catch:{ Exception -> 0x002a }
            return
        L_0x002a:
            java.lang.String r0 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r10.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = "com.whatsapp.Main"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "android.intent.extra.update_application_component_name"
            r2.putExtra(r0, r1)
            if (r23 != 0) goto L_0x005c
            java.lang.String r0 = ""
        L_0x0054:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "android.intent.extra.update_application_message_text"
            goto L_0x0122
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x0054
        L_0x0061:
            boolean r0 = r2 instanceof X.AnonymousClass1J0
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r2.addCategory(r0)
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ RuntimeException -> 0x0084 }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ RuntimeException -> 0x0084 }
            if (r0 == 0) goto L_0x008a
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ RuntimeException -> 0x0084 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = r0.packageName     // Catch:{ RuntimeException -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "Exception while getting launcher name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008a:
            java.lang.String r4 = ""
        L_0x008c:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "package"
            r3.putString(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "class"
            r3.putString(r0, r1)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r9)
            java.lang.String r0 = "com.transsion.XOSLauncher"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r2 = "change_badge"
            if (r0 == 0) goto L_0x00bd
            X.0ya r1 = r22.A0O()     // Catch:{ Exception -> 0x00d2 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x00d2 }
            android.net.Uri r0 = X.AnonymousClass1J0.A01     // Catch:{ Exception -> 0x00d2 }
            r1.A04(r0, r3, r2)     // Catch:{ Exception -> 0x00d2 }
            return
        L_0x00bd:
            java.lang.String r0 = "com.transsion.hilauncher"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x0128
            X.0ya r1 = r22.A0O()     // Catch:{ Exception -> 0x00d2 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x00d2 }
            android.net.Uri r0 = X.AnonymousClass1J0.A00     // Catch:{ Exception -> 0x00d2 }
            r1.A04(r0, r3, r2)     // Catch:{ Exception -> 0x00d2 }
            return
        L_0x00d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "badger/getbadger "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x00ec:
            boolean r0 = r2 instanceof X.C26091Iv
            if (r0 == 0) goto L_0x0129
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "com.sonymobile.home.resourceprovider"
            r4 = 0
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r0, r4)
            if (r0 != 0) goto L_0x0300
            java.lang.String r0 = "com.sonyericsson.home.action.UPDATE_BADGE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"
            r2.putExtra(r0, r1)
            if (r23 <= 0) goto L_0x0117
            r4 = 1
        L_0x0117:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r2.putExtra(r0, r4)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.MESSAGE"
        L_0x0122:
            r2.putExtra(r0, r1)
            r10.sendBroadcast(r2)
        L_0x0128:
            return
        L_0x0129:
            boolean r0 = r2 instanceof X.C26051Ir
            if (r0 == 0) goto L_0x0130
            android.os.ConditionVariable r0 = X.C18740tg.A00
            return
        L_0x0130:
            boolean r0 = r2 instanceof X.C26121Iy
            if (r0 == 0) goto L_0x0147
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "app_badge_count"
            r3.putInt(r0, r9)
            java.lang.String r1 = "com.whatsapp"
            java.lang.String r0 = "app_badge_packageName"
            r3.putString(r0, r1)
            goto L_0x033a
        L_0x0147:
            boolean r0 = r2 instanceof X.C26111Ix
            if (r0 == 0) goto L_0x0174
            java.lang.String r4 = "com.huawei.android.launcher"
            long r5 = X.AnonymousClass1L0.A00(r10, r4)
            r1 = 63006(0xf61e, double:3.1129E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0128
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "package"
            r3.putString(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "class"
            r3.putString(r0, r1)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r9)
            goto L_0x034d
        L_0x0174:
            boolean r0 = r2 instanceof X.C26101Iw
            if (r0 == 0) goto L_0x02b7
            X.1Iw r2 = (X.C26101Iw) r2
            float r1 = X.C26101Iw.A00(r10, r2)
            r8 = 16
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01ad
            java.lang.String r0 = "com.htc.launcher.action.SET_NOTIFICATION"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r3.setFlags(r8)
            java.lang.String r2 = r10.getPackageName()
            java.lang.String r1 = "com.whatsapp.Main"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            java.lang.String r1 = r0.flattenToShortString()
            java.lang.String r0 = "com.htc.launcher.extra.COMPONENT"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.htc.launcher.extra.COUNT"
            r3.putExtra(r0, r9)
            r10.sendBroadcast(r3)
            return
        L_0x01ad:
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0128
            java.lang.String r7 = "com.htc.launcher.action.UPDATE_SHORTCUT"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r7)
            r6.setFlags(r8)
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r5 = "packagename"
            r6.putExtra(r5, r0)
            java.lang.String r4 = "count"
            r6.putExtra(r4, r9)
            r10.sendBroadcast(r6)
            X.0ya r14 = r22.A0O()
            X.C18740tg.A06(r14)
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.lang.String r0 = "content://com.htc.launcher.settings/favorites"
            android.net.Uri r15 = android.net.Uri.parse(r0)
            java.lang.String r1 = "_id"
            java.lang.String r0 = "intent"
            java.lang.String[] r16 = new java.lang.String[]{r1, r0}
            r2 = 1
            java.lang.String[] r11 = new java.lang.String[r2]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "%"
            r12.append(r3)
            java.lang.String r2 = r10.getPackageName()
            r12.append(r2)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r2 = 0
            r11[r2] = r12
            java.lang.String r17 = "intent LIKE ?"
            r19 = 0
            r18 = r11
            android.database.Cursor r11 = r14.A03(r15, r16, r17, r18, r19)
            if (r11 == 0) goto L_0x025d
            int r1 = r11.getColumnIndex(r1)     // Catch:{ all -> 0x037a }
            int r12 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x037a }
            r11.moveToFirst()     // Catch:{ all -> 0x037a }
        L_0x021d:
            boolean r0 = r11.isAfterLast()     // Catch:{ all -> 0x037a }
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = r11.getString(r12)     // Catch:{ all -> 0x037a }
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r2)     // Catch:{ URISyntaxException -> 0x0256 }
            android.content.ComponentName r15 = r0.getComponent()     // Catch:{ all -> 0x037a }
            if (r15 == 0) goto L_0x0256
            java.lang.String r14 = r10.getPackageName()     // Catch:{ all -> 0x037a }
            java.lang.String r0 = r15.getPackageName()     // Catch:{ all -> 0x037a }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x037a }
            if (r0 == 0) goto L_0x0256
            java.lang.String r14 = "com.whatsapp.Main"
            java.lang.String r0 = r15.getClassName()     // Catch:{ all -> 0x037a }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x037a }
            if (r0 == 0) goto L_0x0256
            int r0 = r11.getInt(r1)     // Catch:{ all -> 0x037a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x037a }
            r13.add(r0)     // Catch:{ all -> 0x037a }
        L_0x0256:
            r11.moveToNext()     // Catch:{ all -> 0x037a }
            goto L_0x021d
        L_0x025a:
            r11.close()
        L_0x025d:
            java.util.Iterator r14 = r13.iterator()
        L_0x0261:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r14.next()
            java.lang.Number r1 = (java.lang.Number) r1
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r7)
            r6.setFlags(r8)
            java.lang.String r0 = r10.getPackageName()
            r11.putExtra(r5, r0)
            long r0 = r1.longValue()
            java.lang.String r12 = "favorite_item_id"
            r11.putExtra(r12, r0)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.Main"
            android.content.ComponentName r13 = new android.content.ComponentName
            r13.<init>(r1, r0)
            r0 = 1
            java.lang.String[] r12 = new java.lang.String[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r13.flattenToShortString()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r12[r2] = r0
            java.lang.String r0 = "selectArgs"
            r11.putExtra(r0, r12)
            r11.putExtra(r4, r9)
            r10.sendBroadcast(r11)
            goto L_0x0261
        L_0x02b7:
            boolean r0 = r2 instanceof X.C26131Iz
            if (r0 == 0) goto L_0x02e5
            X.1Iz r2 = (X.C26131Iz) r2
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "package"
            r3.putString(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "class"
            r3.putString(r0, r1)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r9)
            X.0yC r2 = r2.A00
            r1 = 2337(0x921, float:3.275E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0128
            goto L_0x0384
        L_0x02e5:
            java.lang.String r0 = "android.intent.action.BADGE_COUNT_UPDATE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "badge_count"
            r2.putExtra(r0, r9)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "badge_count_package_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "badge_count_class_name"
            goto L_0x0122
        L_0x0300:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "badge_count"
            r3.put(r0, r1)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "package_name"
            r3.put(r0, r1)
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = "activity_name"
            r3.put(r0, r1)
            X.0ya r2 = r22.A0O()
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = "content://com.sonymobile.home.resourceprovider/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0336 }
            X.AnonymousClass00C.A0D(r1, r4)     // Catch:{ Exception -> 0x0336 }
            android.content.ContentResolver r0 = X.C21050ya.A00(r2)     // Catch:{ Exception -> 0x0336 }
            r0.insert(r1, r3)     // Catch:{ Exception -> 0x0336 }
            return
        L_0x0336:
            r1 = move-exception
            java.lang.String r0 = "badger/sony/updatebadge"
            goto L_0x039e
        L_0x033a:
            X.0ya r2 = r22.A0O()     // Catch:{ Exception -> 0x039b }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "content://com.android.badge/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "setAppBadgeCount"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x039b }
            return
        L_0x034d:
            X.0ya r2 = r22.A0O()     // Catch:{ Exception -> 0x0360 }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r0 = "content://com.huawei.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r0 = "change_badge"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x0360 }
            return
        L_0x0360:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Unexpected exception, launcher version = "
            r2.append(r0)
            long r0 = X.AnonymousClass1L0.A00(r10, r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e(r0, r3)
            return
        L_0x037a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x037f }
            throw r1
        L_0x037f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0384:
            X.0ya r2 = r22.A0O()     // Catch:{ Exception -> 0x0397 }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = "content://com.hihonor.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = "change_badge"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x0397 }
            return
        L_0x0397:
            r1 = move-exception
            java.lang.String r0 = "Unexpected exception while honor badging"
            goto L_0x039e
        L_0x039b:
            r1 = move-exception
            java.lang.String r0 = "cannot update badge"
        L_0x039e:
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Iq.A03(android.content.Context, X.0yb, int):void");
    }
}

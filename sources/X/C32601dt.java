package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;
import com.whatsapp.R;
import com.whatsapp.TellAFriendReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1dt  reason: invalid class name and case insensitive filesystem */
public class C32601dt {
    public final AnonymousClass17Y A00;
    public final C19460v5 A01;
    public final C32611du A02;
    public final C21060yb A03;
    public final AnonymousClass13J A04;

    public void A00(Context context, Uri uri, Integer num, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("app/sms ");
            sb.append(queryIntentActivities.size());
            Log.i(sb.toString());
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (!TextUtils.isEmpty(defaultSmsPackage)) {
                intent.setPackage(defaultSmsPackage);
            } else {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                defaultSmsPackage = activityInfo.packageName;
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("sms_body", str);
            }
            context.startActivity(intent);
            Integer num2 = num;
            if (num != null) {
                this.A02.A01(num2, defaultSmsPackage, 3, 1);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public void A01(Context context, Integer num) {
        Integer num2 = num;
        if (num != null) {
            Context context2 = context;
            String string = context2.getString(R.string.f12nameremoved);
            String string2 = context2.getString(R.string.f12nameremoved, new Object[]{"https://whatsapp.com/dl/"});
            StringBuilder sb = new StringBuilder();
            sb.append(context2.getString(R.string.f12nameremoved, new Object[]{"https://whatsapp.com/dl/"}));
            sb.append("\n\n");
            String obj = sb.toString();
            String string3 = context2.getString(R.string.f12nameremoved);
            PackageManager packageManager = context2.getPackageManager();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Intent[] intentArr = {new Intent("android.intent.action.VIEW").setType("vnd.android-dir/mms-sms").putExtra("sms_body", string2), new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", " ").putExtra("android.intent.extra.TEXT", obj).putExtra("android.intent.extra.SUBJECT", string3)};
            Intent intent = null;
            int i = 0;
            do {
                Intent intent2 = intentArr[i];
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str = activityInfo.name;
                        String str2 = activityInfo.applicationInfo.packageName;
                        StringBuilder sb2 = new StringBuilder();
                        Intent intent3 = intent;
                        sb2.append("app/tell ");
                        sb2.append(i);
                        sb2.append(" | ");
                        sb2.append(str2);
                        sb2.append(" | ");
                        sb2.append(str);
                        Log.i(sb2.toString());
                        if (!str2.contains("bluetooth") && !str2.equals("com.sec.android.app.FileTransferClient") && !str2.equals("com.sec.android.app.FileShareClient") && !str2.equals("com.sec.android.widgetapp.diotek.smemo") && !str2.equals("com.threebanana.notes") && !str2.equals("com.evernote") && !str2.equals("com.android.apps.tag") && !str2.equals("com.andrewshu.android.reddit") && !str2.equals("com.dataviz.stargate") && !str2.equals("com.dropbox.android") && !str2.equals("com.google.zxing.client.android") && !str2.equals("com.lg.valle.phone2chrome") && !str2.equals("com.motorola.blur.socialshare") && !str2.equals("com.whatsapp") && !str2.equals("com.whatsapp.w4b") && !str2.equals("la.droid.qr") && !str2.equals("com.google.android.apps.translate") && !str2.equals("com.google.android.apps.docs") && !str2.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str2.equals("com.world.newspapers") && !str2.equals("lysesoft.andftp") && !str2.equals("com.klye.ime.latin") && !str2.equals("com.ideashower.readitlater.pro") && !str2.equals("com.springpad") && !str2.equals("ch.teamtasks.tasks.paid") && !str2.equals("flipboard.app") && !str2.equals("jp.naver.cafe") && !str2.equals("org.mozilla.firefox") && !str2.equals("com.linkedin.android") && !str2.equals("com.tenthbit.juliet") && !str2.equals("com.bumptech.bumpga")) {
                            intent = (Intent) intent2.clone();
                            intent.setClassName(str2, str);
                            intent.setPackage(str2);
                            if (str2.equals("mobi.qiss.plurq") || str2.equals("com.htc.socialnetwork.plurk") || str2.equals("com.facebook.orca") || str2.equals("com.google.android.apps.plus") || str2.equals("com.google.android.apps.googlevoice") || str2.equals("com.google.android.apps.messaging") || str2.equals("com.thedeck.android.app") || str2.equals("com.twitter.android") || str2.equals("tw.anddev.aplurk")) {
                                intent.removeExtra("android.intent.extra.EMAIL");
                                intent.putExtra("android.intent.extra.TEXT", string2);
                            } else if (str2.equals("com.facebook.katana")) {
                                intent.putExtra("android.intent.extra.TEXT", "https://www.whatsapp.com/download/");
                            }
                            if (!hashSet.contains(str2)) {
                                arrayList.add(intent);
                                hashSet.add(str2);
                                if (str.equals("com.lge.message.activity.compose.ComposeMessageActivity")) {
                                }
                            }
                        }
                        intent = intent3;
                    }
                }
                i++;
            } while (i < 2);
            int size = arrayList.size();
            if (size != 0) {
                String replace = Build.MANUFACTURER.replace(' ', '_');
                String replace2 = Build.MODEL.replace(' ', '_');
                StringBuilder sb3 = new StringBuilder();
                sb3.append(replace);
                sb3.append("-");
                sb3.append(replace2);
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("app/packagedintents/device ");
                sb4.append(obj2);
                Log.i(sb4.toString());
                if (!obj2.equals("LGE-LU2300")) {
                    if (size > 1) {
                        int i2 = size - 1;
                        Object obj3 = arrayList.get(i2);
                        arrayList.remove(i2);
                        arrayList.add(0, obj3);
                    }
                    context2.startActivity(AnonymousClass3UJ.A01(C65743Th.A01(context2, 0, new Intent(context2, TellAFriendReceiver.class).putExtra("extra_invite_source", num2), 134217728).getIntentSender(), string, arrayList));
                } else if (intent != null) {
                    Log.i("app/tell/override");
                    context2.startActivity(intent);
                }
                this.A02.A00(num2);
            }
            Log.w("app/tell/none");
            this.A00.A04(R.string.f12nameremoved, 0);
            this.A02.A00(num2);
        }
    }

    public C32601dt(C19460v5 r1, AnonymousClass17Y r2, C32611du r3, C21060yb r4, AnonymousClass13J r5) {
        this.A00 = r2;
        this.A01 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}

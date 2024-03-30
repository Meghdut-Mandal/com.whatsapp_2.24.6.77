package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6yy  reason: invalid class name and case insensitive filesystem */
public final class C148506yy implements C158487ha {
    public static final Set A04 = C90504aG.A0w(new String[]{"com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasFamilyConsistency"});
    public final C19630wG A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1Q1 A02;
    public final C20410xW A03;

    public AnonymousClass37T BHS(Context context, String str, List list) {
        Object obj;
        Intent intent;
        Intent intent2;
        Object obj2;
        C18740tg.A00();
        AnonymousClass37T r3 = new AnonymousClass37T();
        AnonymousClass6K3 A002 = AnonymousClass6K3.A02.A00(context, this.A03, list);
        int i = A002.A00;
        if (i != 0) {
            Map map = A002.A01;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator A0z = AnonymousClass000.A0z(map);
            while (A0z.hasNext()) {
                try {
                    obj2 = FileProvider.A00(this.A00.A00, ((C120205r8) A0z.next()).A00, C19430v1.A07);
                } catch (Throwable th) {
                    obj2 = C90524aI.A0t(th);
                }
                if (AnonymousClass0AK.A00(obj2) != null) {
                    this.A01.A0H(new C1503274v(26, str, this.A02));
                    Log.w("getSharingIntent: Attempting to share file failed");
                    return null;
                } else if (obj2 != null) {
                    A0I.add(obj2);
                }
            }
            Intent A0D = C36431kI.A0D();
            String str2 = "*/*";
            switch (i) {
                case 1:
                case 4:
                    str2 = "image/png";
                    break;
                case 2:
                case 5:
                    str2 = "audio/ogg; codecs=opus";
                    break;
                case 7:
                    break;
                default:
                    str2 = "video/mp4";
                    break;
            }
            Intent type = A0D.setType(str2);
            AnonymousClass00C.A08(type);
            if (A0I.size() == 1) {
                type.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", (Parcelable) A0I.get(0));
            } else if (A0I.size() > 1) {
                type.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0I);
            }
            ArrayList A0I2 = AnonymousClass001.A0I();
            try {
                obj = this.A00.A00.getPackageManager().queryIntentActivities(type, 65536);
            } catch (Throwable th2) {
                obj = C90524aI.A0t(th2);
            }
            Object obj3 = C023409w.A00;
            if (obj instanceof AnonymousClass03N) {
                obj = obj3;
            }
            List<ResolveInfo> list2 = (List) obj;
            if (!list2.isEmpty()) {
                if (Build.VERSION.SDK_INT < 29) {
                    int size = list2.size();
                    boolean z = false;
                    for (ResolveInfo resolveInfo : list2) {
                        String str3 = resolveInfo.activityInfo.name;
                        AnonymousClass00C.A0B(str3);
                        if (!AnonymousClass098.A07(str3, "com.facebook.", false)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            AnonymousClass00C.A07(activityInfo);
                            Intent intent3 = new Intent(type);
                            intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            A0I2.add(intent3);
                        } else if (!z && A04.contains(str3)) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            AnonymousClass00C.A07(activityInfo2);
                            Intent intent4 = new Intent(type);
                            intent4.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            A0I2.add(intent4);
                            z = true;
                        }
                    }
                    if (size != A0I2.size() && z) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 29) {
                            intent = Intent.createChooser(type, (CharSequence) null);
                            AnonymousClass00C.A08(intent);
                        } else {
                            if (i2 >= 23) {
                                intent2 = C36431kI.A0D();
                            } else {
                                intent2 = (Intent) A0I2.remove(0);
                            }
                            intent = Intent.createChooser(intent2, (CharSequence) null);
                            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) A0I2.toArray(new Parcelable[0]));
                        }
                        intent.addFlags(268435456);
                        r3.A02 = A0I;
                        r3.A01 = intent;
                        return r3;
                    }
                }
                intent = Intent.createChooser(type, (CharSequence) null);
                if (intent == null) {
                    return r3;
                }
                intent.addFlags(268435456);
                r3.A02 = A0I;
                r3.A01 = intent;
                return r3;
            }
        }
        return r3;
    }

    public C148506yy(AnonymousClass17Y r1, C19630wG r2, AnonymousClass1Q1 r3, C20410xW r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}

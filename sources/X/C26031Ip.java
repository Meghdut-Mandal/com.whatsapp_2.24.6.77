package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Ip  reason: invalid class name and case insensitive filesystem */
public class C26031Ip {
    public C26041Iq A00;
    public final C26041Iq A01 = new C26051Ir();
    public final C26041Iq A02;
    public final C26041Iq[] A03;

    public synchronized C26041Iq A00(Context context) {
        C26041Iq r0;
        C26041Iq r02;
        r0 = this.A00;
        if (r0 == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                r02 = new C26081Iu();
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = it.next().activityInfo.packageName;
                            StringBuilder sb = new StringBuilder();
                            sb.append("badger/homepackage/");
                            sb.append(str);
                            Log.i(sb.toString());
                            C26041Iq[] r4 = this.A03;
                            int i = 0;
                            while (true) {
                                C26041Iq r1 = r4[i];
                                if (!r1.A01(context.getApplicationContext()).contains(str)) {
                                    i++;
                                    if (i >= 9) {
                                        break;
                                    }
                                } else {
                                    this.A00 = r1;
                                    break;
                                }
                            }
                            if (this.A00 != null) {
                                break;
                            }
                        }
                    } else {
                        Log.e("badger/nohome");
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("badger/getbadger ");
                    sb2.append(e.getMessage());
                    Log.e(sb2.toString(), e);
                }
                if (this.A00 == null) {
                    Log.i("badger/getbadger/notfound/default");
                    r02 = this.A02;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("badger/getbadger ");
                sb3.append(Arrays.asList(this.A03).indexOf(this.A00));
                Log.i(sb3.toString());
                r0 = this.A00;
            }
            this.A00 = r02;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("badger/getbadger ");
            sb32.append(Arrays.asList(this.A03).indexOf(this.A00));
            Log.i(sb32.toString());
            r0 = this.A00;
        }
        return r0;
    }

    public C26031Ip(C20810yC r5) {
        C26061Is r3 = new C26061Is();
        this.A02 = r3;
        this.A03 = new C26041Iq[]{new C26071It(), new C26081Iu(), new C26091Iv(), new C26101Iw(), new C26111Ix(), new C26121Iy(r5), new C26131Iz(r5), new AnonymousClass1J0(), r3};
    }
}

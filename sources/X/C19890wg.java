package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0wg  reason: invalid class name and case insensitive filesystem */
public class C19890wg {
    public static final Set A04;
    public final Context A00;
    public final C19880wf A01;
    public final AtomicInteger A02 = new AtomicInteger();
    public final Map A03 = new HashMap();

    public synchronized SharedPreferences A00(String str) {
        boolean z;
        SharedPreferences sharedPreferences;
        StringBuilder sb;
        if (A04.contains(str)) {
            z = true;
        } else {
            ConditionVariable conditionVariable = C18740tg.A00;
            z = false;
        }
        Map map = this.A03;
        sharedPreferences = (SharedPreferences) map.get(str);
        if (sharedPreferences == null) {
            Boolean bool = C18750th.A03;
            String str2 = C19430v1.A0A;
            if (str2.equals(str)) {
                sharedPreferences = this.A00.getSharedPreferences(str2, 0);
            } else {
                Context context = this.A00;
                File file = new File(context.getFilesDir().getParent(), "shared_prefs");
                if (!file.exists()) {
                    try {
                        file.mkdir();
                        if (!file.exists()) {
                            sb = new StringBuilder();
                            sb.append("SharedPreferencesFactory/Failed to create preference dir ");
                            sb.append(file.getAbsolutePath());
                        } else if (!file.isDirectory() || !file.canRead() || !file.canWrite()) {
                            sb = new StringBuilder();
                            sb.append("SharedPreferencesFactory/Invalid preference dir ");
                            sb.append(file.getAbsolutePath());
                            sb.append(", isDirectory=");
                            sb.append(file.isDirectory());
                            sb.append(", canRead=");
                            sb.append(file.canRead());
                            sb.append(", canWrite=");
                            sb.append(file.canWrite());
                        }
                        Log.e(sb.toString());
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    } catch (SecurityException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SharedPreferencesFactory/Unable to create LightSharedPreferences: ");
                        sb2.append(file.getAbsolutePath());
                        Log.e(sb2.toString(), e);
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".xml");
                sharedPreferences = new C19920wj(new C19910wi(new File(file, sb3.toString())), this.A01, this.A02.getAndIncrement(), z);
            }
            map.put(str, sharedPreferences);
        }
        return sharedPreferences;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append("_preferences");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.whatsapp");
        sb2.append("_preferences_payments_debug");
        A04 = new HashSet(Arrays.asList(new String[]{sb.toString(), "ab-props", "ab-prechatd-props", "startup_prefs", "field-stats-events-sampling", "server_prop_preferences", "forced_blocked_shared_prefs", "debug_drawer", "com.whatsapp_payment_debug_preferences", sb2.toString()}));
    }

    public boolean A01() {
        File file = new File(this.A00.getFilesDir().getParent(), "shared_prefs");
        StringBuilder sb = new StringBuilder();
        sb.append("ab-props-backup");
        sb.append(".xml");
        return new File(file, sb.toString()).exists();
    }

    public C19890wg(Context context, C19880wf r3) {
        this.A00 = context;
        this.A01 = r3;
    }
}

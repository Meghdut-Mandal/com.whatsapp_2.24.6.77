package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Y4  reason: invalid class name */
public class AnonymousClass0Y4 {
    public final AnonymousClass0X5 A00;

    public AnonymousClass0X5 A00() {
        AnonymousClass0X5 r1 = this.A00;
        if (!TextUtils.isEmpty(r1.A0K)) {
            Intent[] intentArr = r1.A0P;
            if (intentArr != null && intentArr.length != 0) {
                return r1;
            }
            throw AnonymousClass001.A08("Shortcut must have an intent");
        }
        throw AnonymousClass001.A08("Shortcut must have a non-empty label");
    }

    public AnonymousClass0Y4(Context context, ShortcutInfo shortcutInfo) {
        int i;
        AnonymousClass0UW[] r6;
        AnonymousClass0X5 r5 = new AnonymousClass0X5();
        this.A00 = r5;
        r5.A02 = context;
        r5.A0M = shortcutInfo.getId();
        r5.A04 = shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        r5.A0P = (Intent[]) Arrays.copyOf(intents, intents.length);
        r5.A0F = shortcutInfo.getActivity();
        r5.A0K = shortcutInfo.getShortLabel();
        r5.A0L = shortcutInfo.getLongLabel();
        r5.A0J = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            i = shortcutInfo.getDisabledReason();
        } else {
            i = 3;
            if (shortcutInfo.isEnabled()) {
                i = 0;
            }
        }
        r5.A00 = i;
        r5.A0N = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            r6 = null;
        } else {
            int i2 = extras.getInt("extraPersonCount");
            r6 = new AnonymousClass0UW[i2];
            int i3 = 0;
            while (i3 < i2) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("extraPerson_");
                int i4 = i3 + 1;
                A0u.append(i4);
                r6[i3] = AnonymousClass0VF.A01(extras.getPersistableBundle(A0u.toString()));
                i3 = i4;
            }
        }
        r5.A0Q = r6;
        r5.A03 = shortcutInfo.getUserHandle();
        r5.A01 = shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            r5.A07 = shortcutInfo.isCached();
        }
        r5.A09 = shortcutInfo.isDynamic();
        r5.A0C = shortcutInfo.isPinned();
        r5.A08 = shortcutInfo.isDeclaredInManifest();
        r5.A0B = shortcutInfo.isImmutable();
        r5.A0A = shortcutInfo.isEnabled();
        r5.A05 = shortcutInfo.hasKeyFieldsOnly();
        r5.A0H = AnonymousClass0X5.A00(shortcutInfo);
        r5.A0E = shortcutInfo.getRank();
        r5.A0G = shortcutInfo.getExtras();
    }

    public AnonymousClass0Y4(Context context, String str) {
        AnonymousClass0X5 r0 = new AnonymousClass0X5();
        this.A00 = r0;
        r0.A02 = context;
        r0.A0M = str;
    }

    public AnonymousClass0Y4(AnonymousClass0X5 r4) {
        AnonymousClass0X5 r2 = new AnonymousClass0X5();
        this.A00 = r2;
        r2.A02 = r4.A02;
        r2.A0M = r4.A0M;
        r2.A04 = r4.A04;
        Intent[] intentArr = r4.A0P;
        r2.A0P = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        r2.A0F = r4.A0F;
        r2.A0K = r4.A0K;
        r2.A0L = r4.A0L;
        r2.A0J = r4.A0J;
        r2.A00 = r4.A00;
        r2.A0I = r4.A0I;
        r2.A06 = r4.A06;
        r2.A03 = r4.A03;
        r2.A01 = r4.A01;
        r2.A07 = r4.A07;
        r2.A09 = r4.A09;
        r2.A0C = r4.A0C;
        r2.A08 = r4.A08;
        r2.A0B = r4.A0B;
        r2.A0A = r4.A0A;
        r2.A0H = r4.A0H;
        r2.A0O = r4.A0O;
        r2.A05 = r4.A05;
        r2.A0E = r4.A0E;
        AnonymousClass0UW[] r1 = r4.A0Q;
        if (r1 != null) {
            r2.A0Q = (AnonymousClass0UW[]) Arrays.copyOf(r1, r1.length);
        }
        Set set = r4.A0N;
        if (set != null) {
            r2.A0N = new HashSet(set);
        }
        PersistableBundle persistableBundle = r4.A0G;
        if (persistableBundle != null) {
            r2.A0G = persistableBundle;
        }
        r2.A0D = r4.A0D;
    }
}

package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.01X  reason: invalid class name */
public class AnonymousClass01X {
    public ArrayList A00;
    public Random A01;
    public final Bundle A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final transient Map A07;
    public final /* synthetic */ AnonymousClass01G A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass01X(AnonymousClass01G r1) {
        this();
        this.A08 = r1;
    }

    private void A00(String str) {
        Map map = this.A03;
        if (map.get(str) == null) {
            int nextInt = this.A01.nextInt(2147418112);
            while (true) {
                Map map2 = this.A05;
                Integer valueOf = Integer.valueOf(nextInt + 65536);
                if (map2.containsKey(valueOf)) {
                    nextInt = this.A01.nextInt(2147418112);
                } else {
                    map2.put(valueOf, str);
                    map.put(str, valueOf);
                    return;
                }
            }
        }
    }

    public final void A03(int i, Object obj) {
        C009604b r1;
        String str = (String) this.A05.get(Integer.valueOf(i));
        if (str != null) {
            C009704c r0 = (C009704c) this.A07.get(str);
            if (r0 == null || (r1 = r0.A00) == null) {
                this.A02.remove(str);
                this.A04.put(str, obj);
            } else if (this.A00.remove(str)) {
                r1.BQj(obj);
            }
        }
    }

    public void A04(AnonymousClass04Z r12, AnonymousClass0YW r13, Object obj, int i) {
        AnonymousClass01G r3 = this.A08;
        AnonymousClass0SE A012 = r12.A01(r3, obj);
        int i2 = i;
        if (A012 != null) {
            new Handler(Looper.getMainLooper()).post(new C11720gt(this, A012, i));
            return;
        }
        Intent A002 = r12.A00(r3, obj);
        Bundle bundle = null;
        if (A002.getExtras() != null && A002.getExtras().getClassLoader() == null) {
            A002.setExtrasClassLoader(r3.getClassLoader());
        }
        if (A002.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = A002.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            A002.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (r13 != null) {
            bundle = r13.A03();
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A002.getAction())) {
            String[] stringArrayExtra = A002.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C03570Gk.A0C(r3, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A002.getAction())) {
            C08770bI r0 = (C08770bI) A002.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AnonymousClass0XN.A01(r3, r0.A02, r0.A03, bundle, i2, r0.A00, r0.A01, 0);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new C11730gu(e, this, i));
            }
        } else {
            AnonymousClass0XN.A02(r3, A002, bundle, i);
        }
    }

    public final void A05(String str) {
        Object remove;
        if (!this.A00.contains(str) && (remove = this.A03.remove(str)) != null) {
            this.A05.remove(remove);
        }
        this.A07.remove(str);
        Map map = this.A04;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            map.remove(str);
        }
        Bundle bundle = this.A02;
        if (bundle.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            bundle.remove(str);
        }
        Map map2 = this.A06;
        AnonymousClass0AW r4 = (AnonymousClass0AW) map2.get(str);
        if (r4 != null) {
            ArrayList arrayList = r4.A01;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r4.A00.A05((AnonymousClass00N) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    public final boolean A06(Intent intent, int i, int i2) {
        C009604b r1;
        String str = (String) this.A05.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C009704c r2 = (C009704c) this.A07.get(str);
        if (r2 == null || (r1 = r2.A00) == null || !this.A00.contains(str)) {
            this.A04.remove(str);
            this.A02.putParcelable(str, new C009804d(i2, intent));
            return true;
        }
        r1.BQj(r2.A01.A02(intent, i2));
        this.A00.remove(str);
        return true;
    }

    public final C18100sc A01(C009604b r6, AnonymousClass04Z r7, AnonymousClass012 r8, String str) {
        AnonymousClass01M lifecycle = r8.getLifecycle();
        AnonymousClass01N r2 = (AnonymousClass01N) lifecycle;
        if (r2.A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("LifecycleOwner ");
            sb.append(r8);
            sb.append(" is attempting to register while current state is ");
            sb.append(r2.A02);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        A00(str);
        Map map = this.A06;
        AnonymousClass0AW r22 = (AnonymousClass0AW) map.get(str);
        if (r22 == null) {
            r22 = new AnonymousClass0AW(lifecycle);
        }
        ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, r6, r7, str);
        r22.A00.A04(activityResultRegistry$1);
        r22.A01.add(activityResultRegistry$1);
        map.put(str, r22);
        return new C18100sc(this, r7, str, 0);
    }

    public final C18100sc A02(C009604b r3, AnonymousClass04Z r4, String str) {
        A00(str);
        this.A07.put(str, new C009704c(r3, r4));
        Map map = this.A04;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            r3.BQj(obj);
        }
        Bundle bundle = this.A02;
        C009804d r0 = (C009804d) bundle.getParcelable(str);
        if (r0 != null) {
            bundle.remove(str);
            r3.BQj(r4.A02(r0.A01, r0.A00));
        }
        return new C18100sc(this, r4, str, 1);
    }

    public AnonymousClass01X() {
        this.A01 = new Random();
        this.A05 = new HashMap();
        this.A03 = new HashMap();
        this.A06 = new HashMap();
        this.A00 = new ArrayList();
        this.A07 = new HashMap();
        this.A04 = new HashMap();
        this.A02 = new Bundle();
    }
}

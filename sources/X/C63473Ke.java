package X;

import android.content.SharedPreferences;

/* renamed from: X.3Ke  reason: invalid class name and case insensitive filesystem */
public abstract class C63473Ke {
    public volatile Object A00;

    public Object A00() {
        Integer valueOf;
        AnonymousClass4W8 r0 = (AnonymousClass4W8) this;
        int i = r0.A01;
        Object obj = r0.A00;
        if (i != 0) {
            String string = C25011Eq.A00(((C24971Em) obj).A03).getString("consent_status", "unset");
            if (string != null) {
                return string;
            }
            return "unset";
        }
        int A0O = ((C25661He) obj).A00.A00.A0O("bonsai_feature_state", -1);
        if (A0O == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(A0O);
        }
        for (C52232p6 r6 : C52232p6.values()) {
            int i2 = r6.value;
            if (valueOf != null && i2 == valueOf.intValue()) {
                return r6;
            }
        }
        return C52232p6.BEFORE_WAITLIST;
    }

    public void A02(Object obj) {
        AnonymousClass4W8 r2 = (AnonymousClass4W8) this;
        if (r2.A01 != 0) {
            String str = (String) obj;
            AnonymousClass00C.A0D(str, 0);
            boolean equals = str.equals("no");
            C25011Eq r0 = ((C24971Em) r2.A00).A03;
            if (equals) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = C25011Eq.A00(r0).edit();
                edit.putString("consent_status", "no");
                edit.putLong("consent_last_dismissed_timestamp", currentTimeMillis);
                edit.apply();
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            SharedPreferences.Editor edit2 = C25011Eq.A00(r0).edit();
            edit2.putString("consent_status", str);
            edit2.putLong("consent_last_fetch_timestamp", currentTimeMillis2);
            edit2.apply();
            return;
        }
        C52232p6 r6 = (C52232p6) obj;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass1HY r02 = ((C25661He) r2.A00).A00;
        r02.A00.A1c("bonsai_feature_state", r6.value);
    }

    public final synchronized void A03(Object obj, boolean z) {
        if (z) {
            if (AnonymousClass00C.A0J(this.A00, obj)) {
            }
        }
        this.A00 = obj;
        A02(obj);
    }

    public final Object A01() {
        Object obj;
        Object obj2 = this.A00;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == null) {
                obj = A00();
                this.A00 = obj;
            }
        }
        return obj;
    }
}

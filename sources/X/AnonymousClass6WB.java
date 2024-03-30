package X;

import android.os.Bundle;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.6WB  reason: invalid class name */
public class AnonymousClass6WB {
    public static final Integer A0G;
    public static final Integer A0H;
    public static final Integer A0I;
    public static final Integer A0J;
    public C134476b6 A00;
    public final C1271967i A01;
    public final C134916bo A02;
    public final C134596bI A03;
    public final C134596bI A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final int A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        X.AnonymousClass6RS.A00((X.C1271967i) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(android.os.Bundle r4, java.lang.Class r5, java.lang.String r6) {
        /*
            r0 = -1
            int r4 = r4.getInt(r6, r0)
            if (r4 != r0) goto L_0x0009
            r3 = 0
        L_0x0008:
            return r3
        L_0x0009:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = X.C113845gD.A01     // Catch:{ ClassCastException -> 0x002d }
            monitor-enter(r2)     // Catch:{ ClassCastException -> 0x002d }
            android.util.SparseArray r1 = X.C113845gD.A00     // Catch:{ all -> 0x002a }
            int r0 = r1.indexOfKey(r4)     // Catch:{ all -> 0x002a }
            if (r0 >= 0) goto L_0x001d
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r3
        L_0x001d:
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x002a }
            r1.delete(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            throw r0     // Catch:{ ClassCastException -> 0x002d }
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.AnonymousClass6RS.A00(r3, r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WB.A01(android.os.Bundle, java.lang.Class, java.lang.String):java.lang.Object");
    }

    static {
        Integer num = C023109s.A00;
        A0I = num;
        A0J = num;
        A0G = num;
        A0H = num;
    }

    public static AnonymousClass6WB A00(Bundle bundle) {
        Integer num;
        Bundle bundle2 = bundle;
        bundle2.setClassLoader(AnonymousClass6WB.class.getClassLoader());
        int i = bundle2.getInt("container_id");
        C1271967i r4 = (C1271967i) A01(bundle2, C1271967i.class, "dark_mode_provider");
        Integer A002 = AnonymousClass6IM.A00(bundle2.getString("drag_to_dismiss", "auto"));
        Integer A003 = AnonymousClass6RW.A00(bundle2.getString("mode", "full_sheet"));
        Integer A004 = AnonymousClass6RU.A00(bundle2.getString("background_mode", "static"));
        Integer A005 = AnonymousClass6RV.A00(bundle2.getString("dimmed_background_tap_to_dismiss", "auto"));
        if (bundle2.containsKey("keyboard_soft_input_mode")) {
            num = Integer.valueOf(bundle2.getInt("keyboard_soft_input_mode"));
        } else {
            num = null;
        }
        Integer A006 = C109535Xy.A00(bundle2.getString("animation_type", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
        A01(bundle2, AnonymousClass7cV.class, "custom_loading_view_resolver");
        boolean z = bundle2.getBoolean("custom_loading_view_resolver", false);
        boolean z2 = bundle2.getBoolean("native_disable_cancel_button_on_loading_screen", false);
        return new AnonymousClass6WB(r4, (C134476b6) A01(bundle2, C134476b6.class, "on_dismiss_callback"), (C134916bo) bundle2.getParcelable("bottom_sheet_margins"), (C134596bI) bundle2.getParcelable("dimmed_background_color"), (C134596bI) bundle2.getParcelable("background_overlay_color"), A002, A003, A004, A005, num, A006, bundle2.getString("bloks_screen_id", (String) null), i, bundle2.getBoolean("clear_top_activity", false), z, z2);
    }

    public static void A02(Bundle bundle, Object obj, String str) {
        if (obj != null) {
            int incrementAndGet = C113845gD.A02.incrementAndGet();
            synchronized (C113845gD.A01) {
                C113845gD.A00.append(incrementAndGet, obj);
            }
            bundle.putInt(str, incrementAndGet);
        }
    }

    public AnonymousClass6WB(C1271967i r2, C134476b6 r3, C134916bo r4, C134596bI r5, C134596bI r6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A0F = i;
        this.A01 = r2;
        this.A08 = num;
        this.A0A = num2;
        this.A06 = num3;
        this.A07 = num4;
        this.A09 = num5;
        this.A05 = num6;
        this.A00 = r3;
        this.A0D = z2;
        this.A0C = z3;
        this.A0E = z;
        this.A04 = r5;
        this.A03 = r6;
        this.A02 = r4;
        this.A0B = str;
    }

    public Bundle A03() {
        String str;
        String str2;
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("container_id", this.A0F);
        switch (this.A08.intValue()) {
            case 1:
                str = "enabled";
                break;
            case 2:
                str = "disabled";
                break;
            default:
                str = "auto";
                break;
        }
        A072.putString("drag_to_dismiss", str);
        A072.putString("mode", AnonymousClass6RW.A01(this.A0A));
        A072.putString("background_mode", AnonymousClass6RU.A01(this.A06));
        A072.putString("dimmed_background_tap_to_dismiss", AnonymousClass6RV.A01(this.A07));
        Integer num = this.A09;
        if (num != null) {
            A072.putInt("keyboard_soft_input_mode", num.intValue());
        }
        Integer num2 = this.A05;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "fade";
                    break;
                case 2:
                    str2 = "none";
                    break;
                default:
                    str2 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
                    break;
            }
            A072.putString("animation_type", str2);
        }
        A02(A072, this.A00, "on_dismiss_callback");
        A072.putBoolean("native_use_slide_animation_for_full_screen", this.A0D);
        A072.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0C);
        A072.putBoolean("clear_top_activity", this.A0E);
        A072.putParcelable("dimmed_background_color", this.A04);
        A072.putParcelable("background_overlay_color", this.A03);
        A072.putParcelable("bottom_sheet_margins", this.A02);
        A072.setClassLoader(AnonymousClass6WB.class.getClassLoader());
        String str3 = this.A0B;
        if (str3 != null) {
            A072.putString("bloks_screen_id", str3);
        }
        A02(A072, this.A01, "dark_mode_provider");
        return A072;
    }
}

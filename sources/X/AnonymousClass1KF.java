package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1KF  reason: invalid class name */
public final class AnonymousClass1KF {
    public final AnonymousClass16J A00;
    public final AnonymousClass1KG A01;
    public final AnonymousClass1K7 A02;
    public final AnonymousClass1KH A03;
    public final C21060yb A04;

    public AnonymousClass1KF(AnonymousClass1KG r2, AnonymousClass1K7 r3, AnonymousClass1KH r4, C21060yb r5, AnonymousClass16J r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r2, 4);
        this.A04 = r5;
        this.A00 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public static final void A00(C225314u r6, AnonymousClass1KF r7) {
        C225314u r2 = r6;
        if (r6 != null && !r6.isDestroyed() && !r6.isFinishing()) {
            View findViewById = r6.findViewById(16908298);
            AnonymousClass00C.A0B(findViewById);
            new AnonymousClass3ZU(findViewById, (AnonymousClass012) r2, r7.A04, (List) new ArrayList(), (int) R.string.f12nameremoved, 2000, false).A02();
        }
    }

    public final void A01(C225314u r8, AnonymousClass3T1 r9) {
        String rawString;
        C64933Qa r6 = r9.A1J;
        AnonymousClass11F r0 = r6.A00;
        if (r0 != null && (rawString = r0.getRawString()) != null) {
            AnonymousClass1KG r3 = this.A01;
            Map A032 = C000300d.A03(new AnonymousClass011("origination_flag", Integer.valueOf(r9.A0F())));
            HashMap hashMap = r3.A00;
            hashMap.clear();
            hashMap.putAll(A032);
            AnonymousClass1KH r2 = this.A03;
            String str = r6.A01;
            AnonymousClass00C.A07(str);
            r2.A00(rawString, str, (String) null, 0);
            A00(r8, this);
        }
    }

    public final void A02(C225314u r12, AnonymousClass3T1 r13, AnonymousClass00S r14) {
        String str;
        String str2;
        boolean z = r13 instanceof C46882bp;
        this.A00.registerObserver(new AAI(this, new WeakReference(r12), r14));
        AnonymousClass1KG r5 = this.A01;
        C64933Qa r8 = r13.A1J;
        LinkedHashMap A07 = C000400e.A07(new AnonymousClass011("chat_jid", r8.A00), new AnonymousClass011("message_key_id", r8.A01), new AnonymousClass011("origination_flag", Integer.valueOf(r13.A0F())));
        HashMap hashMap = r5.A00;
        hashMap.clear();
        hashMap.putAll(A07);
        AnonymousClass1K7 r52 = this.A02;
        AnonymousClass011[] r3 = new AnonymousClass011[2];
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        r3[0] = new AnonymousClass011("is_image_feedback", str);
        if (C20800yB.A01(C21000yV.A02, r52.A04, 6527)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r3[1] = new AnonymousClass011("is_multi_feedback_abprop_enabled", str2);
        LinkedHashMap A072 = C000400e.A07(r3);
        AnonymousClass1K8 r2 = r52.A06;
        JSONObject jSONObject = new JSONObject(C000300d.A03(new AnonymousClass011("server_params", A072)));
        r12.Bu2(0, R.string.f12nameremoved);
        WeakReference weakReference = new WeakReference(r12);
        boolean A0A = AnonymousClass1RC.A0A(r12);
        C19730wQ r0 = r2.A00;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        ((C1266064r) r2.A01.get()).A00(new AnonymousClass713(weakReference), (C134906bn) null, "com.bloks.www.whatsapp.bonsai.feedback.async", phoneUserJid.getRawString(), jSONObject.toString(), weakReference, A0A);
    }
}

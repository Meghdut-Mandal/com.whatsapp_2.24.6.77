package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2FQ  reason: invalid class name */
public class AnonymousClass2FQ extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final AnonymousClass19A A02;

    public String A0B() {
        return "critical_block";
    }

    public String A0C() {
        return "setting_pushName";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        String[] strArr = r12.A06;
        C199769fw r3 = r12.A01;
        AnonymousClass8SS r2 = r12.A03;
        if (strArr.length != 1 || !"setting_pushName".equals(strArr[0]) || !C199769fw.A03.equals(r3) || r2 == null || !r2.A0u() || (r2.bitField0_ & 64) == 0) {
            return null;
        }
        AnonymousClass8OM r0 = r2.pushNameSetting_;
        AnonymousClass8OM r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8OM.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null) {
            r1 = AnonymousClass8OM.DEFAULT_INSTANCE;
        }
        return new AnonymousClass2Lh(r12.A02, str, r1.name_, r2.timestamp_);
    }

    public List A0D(boolean z) {
        return Collections.singletonList(new AnonymousClass2Lh((C201539jo) null, (String) null, this.A00.A0A.A02(), C19970wo.A00(this.A01)));
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r6) {
        AnonymousClass2Lh r62 = (AnonymousClass2Lh) r6;
        C19730wQ r0 = this.A00;
        String str = r62.A00;
        r0.A0J(str);
        this.A02.A0J(Message.obtain((Handler) null, 0, 3, 0, str));
        A06(r62);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        AnonymousClass2Lh r62 = (AnonymousClass2Lh) r6;
        if (r7 == null || r7.A04 < r62.A04) {
            String str = r62.A00;
            if (!str.isEmpty()) {
                this.A00.A0J(str);
                this.A02.A0J(Message.obtain((Handler) null, 0, 3, 0, str));
            } else {
                Log.e("PushNameSettingHandler/handleMutation/invalid: push name is empty.");
            }
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public AnonymousClass2FQ(C19730wQ r1, C19970wo r2, AnonymousClass1AC r3, AnonymousClass19A r4) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }
}

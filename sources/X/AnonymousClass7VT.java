package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7VT  reason: invalid class name */
public final class AnonymousClass7VT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $invalidateFileCache = true;
    public final /* synthetic */ C006302t $onError;
    public final /* synthetic */ C006302t $onSuccess;
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ C130456Ld this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VT(C130456Ld r2, C006302t r3, C006302t r4, int i) {
        super(1);
        this.this$0 = r2;
        this.$qplInstanceKey = i;
        this.$onSuccess = r3;
        this.$onError = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass17Y r5;
        Runnable r1;
        C134586bH r15 = (C134586bH) obj;
        AnonymousClass00C.A0D(r15, 0);
        this.this$0.A02.A01(this.$qplInstanceKey, "received_pose_entity");
        C130456Ld r52 = this.this$0;
        boolean z = this.$invalidateFileCache;
        int i = this.$qplInstanceKey;
        C006302t r3 = this.$onSuccess;
        C006302t r4 = this.$onError;
        List<C134646bN> list = r15.A00;
        if (list == null) {
            r5 = r52.A00;
            r1 = new C81133wW((Object) r4, 0);
        } else {
            C24261Bt r12 = r52.A01;
            JSONArray A0u = C90524aI.A0u();
            for (C134646bN r11 : list) {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("url", r11.A01);
                String str = r11.A00;
                if (str != null) {
                    A1B.put("emojis", str);
                }
                A0u.put(A1B);
            }
            C36341k9.A0x(C36351kA.A0A(r12.A01), "pref_avatar_profile_photo_poses", A0u.toString());
            List A00 = C130456Ld.A00(r52, list, z, false);
            r52.A02.A01(i, "poses_downloaded");
            boolean isEmpty = A00.isEmpty();
            r5 = r52.A00;
            if (isEmpty) {
                r1 = new C1497372o(r4, 49);
            } else {
                r5.A0H(new C1498072v(r3, A00, 47));
                return AnonymousClass0AJ.A00;
            }
        }
        r5.A0H(r1);
        return AnonymousClass0AJ.A00;
    }
}

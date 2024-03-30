package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.rendercore.RootHostView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.6Zw  reason: invalid class name and case insensitive filesystem */
public class C133756Zw implements Handler.Callback {
    public final /* synthetic */ C142106oL A00;

    public C133756Zw(C142106oL r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        if (!C132926Vv.A03()) {
            C91604cJ r2 = this.A00.A04;
            r2.A00(r2.obtainMessage(message.what, message.obj));
        } else {
            int i = message.what;
            if (i == 1) {
                C142106oL r3 = this.A00;
                Object obj = message.obj;
                Objects.requireNonNull(obj);
                C97564pt r22 = (C97564pt) obj;
                try {
                    AnonymousClass6PY r0 = r3.A01;
                    if (r0 != null) {
                        r0.A02();
                    }
                    RootHostView rootHostView = r3.A00;
                    if (rootHostView == null) {
                        C142106oL.A00(r3, 8);
                    } else {
                        r22.A01.A03(rootHostView);
                    }
                    return true;
                } finally {
                    r3.A01 = r22.A01;
                    C142106oL.A00(r3, r22.A00);
                }
            } else if (i != 2) {
                return false;
            } else {
                C142106oL r7 = this.A00;
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2);
                C97554ps r11 = (C97554ps) obj2;
                AnonymousClass6PY r23 = r7.A01;
                if (r23 != null) {
                    Map map = r7.A08;
                    map.putAll(r11.A01);
                    HashMap hashMap = new HashMap(map);
                    Set set = r7.A09;
                    HashSet A0k = C90524aI.A0k(set);
                    try {
                        if (r23.A04.get()) {
                            AnonymousClass6RS.A01("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
                        }
                        C1271967i r8 = r23.A02;
                        List<C121065sX> list = r11.A00;
                        for (C121065sX r5 : list) {
                            if (!A0k.contains(r5)) {
                                HashMap A03 = AnonymousClass6XK.A03(r5.A00.A02, hashMap);
                                AnonymousClass6JI.A00(C131756Qk.A00(r5, r8, A03), C1273868b.A04(C1273868b.A00(), r8, 0), r5.A01);
                                A0k.add(r5);
                            }
                        }
                        set.addAll(list);
                        C142106oL.A00(r7, 13);
                        return true;
                    } catch (Throwable th) {
                        set.addAll(r11.A00);
                        C142106oL.A00(r7, 13);
                        throw th;
                    }
                }
            }
        }
        return true;
    }
}

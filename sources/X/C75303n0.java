package X;

import android.os.ConditionVariable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3n0  reason: invalid class name and case insensitive filesystem */
public class C75303n0 implements C160437l0 {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C31211bS A01;
    public final /* synthetic */ StringBuffer A02;

    public /* synthetic */ void BUJ(String str) {
    }

    public C75303n0(ConditionVariable conditionVariable, C31211bS r2, StringBuffer stringBuffer) {
        this.A01 = r2;
        this.A02 = stringBuffer;
        this.A00 = conditionVariable;
    }

    public void BWo(String str) {
        C36321k7.A1P("debug-builder/uploadLogsInternal Error received: ", str, AnonymousClass000.A0u());
    }

    public void Bez(String str, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            A0y.next();
        }
        List list = (List) map.get("X-Uploaded-File-Id");
        if (list != null && !list.isEmpty()) {
            this.A02.append((String) C36391kE.A0t(list));
        }
        this.A00.open();
    }

    public void BVA(long j) {
    }
}

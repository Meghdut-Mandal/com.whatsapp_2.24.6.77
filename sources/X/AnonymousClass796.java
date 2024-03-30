package X;

import java.util.HashMap;

/* renamed from: X.796  reason: invalid class name */
public class AnonymousClass796 extends HashMap<String, Object> {
    public final /* synthetic */ C92794ej this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public AnonymousClass796(C92794ej r3, String str, long j) {
        this.this$0 = r3;
        this.val$currentTime = j;
        this.val$surface = str;
        double d = C92794ej.A0n;
        put("duration", C90504aG.A0h(j, r3.A0K));
        put("surface", str == null ? "unknown" : str);
    }
}

package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;

/* renamed from: X.9cB  reason: invalid class name and case insensitive filesystem */
public class C197679cB {
    public static final int A02 = TriggerRegistry.A00.A02("WhatsApp");
    public final ArrayList A00;
    public final boolean A01;

    public C197679cB() {
        ArrayList A10 = C36351kA.A10(new String[]{"stack_trace", "qpl", "system_counters", "high_freq_main_thread_counters"});
        this.A00 = A10;
        if (!"x86_64".equals(C131896Re.A02())) {
            A10.add("atrace");
        }
        boolean A1P = C36431kI.A1P((Math.random() > 0.5d ? 1 : (Math.random() == 0.5d ? 0 : -1)));
        this.A01 = A1P;
        if (A1P) {
            A10.add("wall_time_stack_trace");
        }
    }
}

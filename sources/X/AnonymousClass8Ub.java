package X;

import java.util.List;

/* renamed from: X.8Ub  reason: invalid class name */
public class AnonymousClass8Ub extends C198659dz {
    public AnonymousClass8Ub() {
        super("call_log");
        List A00 = C198659dz.A00(this, "call_log", "_id");
        C198659dz.A02("call_link", "_id", A00);
        C198659dz.A02("call_log_participant_v2", "_id", A00);
        C198659dz.A02("joinable_call_log", "call_log_row_id", A00);
    }
}

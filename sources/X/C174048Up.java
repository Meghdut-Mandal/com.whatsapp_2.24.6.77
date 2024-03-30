package X;

import java.util.List;

/* renamed from: X.8Up  reason: invalid class name and case insensitive filesystem */
public class C174048Up extends C198659dz {
    public C174048Up() {
        super("receipt");
        List A00 = C198659dz.A00(this, "receipt_user", "_id");
        C198659dz.A02("receipt_device", "_id", A00);
        C198659dz.A02("message_add_on_receipt_device", "receipt_device_id", A00);
        C198659dz.A02("receipt_orphaned", "_id", A00);
        C198659dz.A02("played_self_receipt", "message_row_id", A00);
    }
}

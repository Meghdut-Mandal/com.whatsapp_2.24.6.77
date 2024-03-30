package X;

import java.util.List;

/* renamed from: X.Ab3  reason: case insensitive filesystem */
public class C21827Ab3 extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields = null;

    public C21827Ab3() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

package X;

/* renamed from: X.A7v  reason: case insensitive filesystem */
public class C21084A7v implements C22904AyG {
    public boolean B6t(C200269h0 r3, C200269h0 r4, AnonymousClass9LX r5) {
        boolean z = r3 instanceof AnonymousClass8T6;
        if (!z && !(r4 instanceof AnonymousClass8T6)) {
            throw new C21831Ab9("Failed to evaluate exists expression");
        } else if (z) {
            boolean booleanValue = ((AnonymousClass8T6) r3).A00.booleanValue();
            if (r4 instanceof AnonymousClass8T6) {
                return AnonymousClass000.A1S(booleanValue ? 1 : 0, ((AnonymousClass8T6) r4).A00.booleanValue() ? 1 : 0);
            }
            throw C173738Sv.A00("Expected boolean node");
        } else {
            throw C173738Sv.A00("Expected boolean node");
        }
    }
}

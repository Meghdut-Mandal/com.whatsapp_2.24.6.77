package X;

/* renamed from: X.5UI  reason: invalid class name */
public enum AnonymousClass5UI implements C22899AyB {
    Connected(0),
    Rejected(1),
    Cancelled(2),
    AcceptedElsewhere(3),
    Missed(4),
    Invalid(5),
    Unavailable(6),
    Upcoming(7),
    Failed(8),
    Abandoned(9),
    Ongoing(10);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass5UI(int i) {
        this.value = i;
    }

    public static AnonymousClass5UI A00(int i) {
        switch (i) {
            case 0:
                return Connected;
            case 1:
                return Rejected;
            case 2:
                return Cancelled;
            case 3:
                return AcceptedElsewhere;
            case 4:
                return Missed;
            case 5:
                return Invalid;
            case 6:
                return Unavailable;
            case 7:
                return Upcoming;
            case 8:
                return Failed;
            case 9:
                return Abandoned;
            case 10:
                return Ongoing;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}

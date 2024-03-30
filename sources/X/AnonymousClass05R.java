package X;

/* renamed from: X.05R  reason: invalid class name */
public enum AnonymousClass05R {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static AnonymousClass05R A00(AnonymousClass01P r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            return ON_DESTROY;
        }
        if (ordinal == 3) {
            return ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return ON_PAUSE;
    }

    public AnonymousClass01P A01() {
        switch (ordinal()) {
            case 0:
            case 4:
                return AnonymousClass01P.CREATED;
            case 1:
            case 3:
                return AnonymousClass01P.STARTED;
            case 2:
                return AnonymousClass01P.RESUMED;
            case 5:
                return AnonymousClass01P.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}

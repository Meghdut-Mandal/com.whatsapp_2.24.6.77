package X;

/* renamed from: X.91F  reason: invalid class name */
public enum AnonymousClass91F implements C22899AyB {
    BOT_FEEDBACK_POSITIVE(0),
    BOT_FEEDBACK_NEGATIVE_GENERIC(1),
    BOT_FEEDBACK_NEGATIVE_HELPFUL(2),
    BOT_FEEDBACK_NEGATIVE_INTERESTING(3),
    BOT_FEEDBACK_NEGATIVE_ACCURATE(4),
    BOT_FEEDBACK_NEGATIVE_SAFE(5),
    BOT_FEEDBACK_NEGATIVE_OTHER(6),
    BOT_FEEDBACK_NEGATIVE_CAUTIOUS(7),
    BOT_FEEDBACK_NEGATIVE_NOT_VISUALLY_APPEALING(8),
    BOT_FEEDBACK_NEGATIVE_NOT_RELEVANT_TO_TEXT(9);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass91F(int i) {
        this.value = i;
    }

    public static AnonymousClass91F A00(int i) {
        switch (i) {
            case 0:
                return BOT_FEEDBACK_POSITIVE;
            case 1:
                return BOT_FEEDBACK_NEGATIVE_GENERIC;
            case 2:
                return BOT_FEEDBACK_NEGATIVE_HELPFUL;
            case 3:
                return BOT_FEEDBACK_NEGATIVE_INTERESTING;
            case 4:
                return BOT_FEEDBACK_NEGATIVE_ACCURATE;
            case 5:
                return BOT_FEEDBACK_NEGATIVE_SAFE;
            case 6:
                return BOT_FEEDBACK_NEGATIVE_OTHER;
            case 7:
                return BOT_FEEDBACK_NEGATIVE_CAUTIOUS;
            case 8:
                return BOT_FEEDBACK_NEGATIVE_NOT_VISUALLY_APPEALING;
            case 9:
                return BOT_FEEDBACK_NEGATIVE_NOT_RELEVANT_TO_TEXT;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}

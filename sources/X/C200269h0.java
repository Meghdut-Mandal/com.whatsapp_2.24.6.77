package X;

import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/* renamed from: X.9h0  reason: invalid class name and case insensitive filesystem */
public abstract class C200269h0 {
    public static C200269h0 A01(Object obj) {
        char charAt;
        if (obj == null) {
            return B4C.A02;
        }
        if (obj instanceof C200269h0) {
            return (C200269h0) obj;
        }
        if (obj instanceof Class) {
            return new AnonymousClass8T5((Class) obj);
        }
        if (obj instanceof String) {
            String trim = obj.toString().trim();
            if (trim.length() > 0 && ((charAt = trim.charAt(0)) == '@' || charAt == '$')) {
                try {
                    C202479lz.A01(trim, new C22902AyE[0]);
                    return new AnonymousClass8T7(C202479lz.A01(obj.toString().toString(), new C22902AyE[0]), false, false);
                } catch (Exception unused) {
                }
            }
            String trim2 = obj.toString().trim();
            int length = trim2.length();
            if (length > 1) {
                char charAt2 = trim2.charAt(0);
                char charAt3 = trim2.charAt(length - 1);
                if (charAt2 != '[' ? charAt2 == '{' && charAt3 == '}' : charAt3 == ']') {
                    try {
                        new C22563Aos(-1).A0D(trim2, C197039b2.A02.A00);
                        return new AnonymousClass8TB((CharSequence) obj.toString());
                    } catch (Exception unused2) {
                    }
                }
            }
            return new AnonymousClass8T8(obj.toString(), true);
        } else if (obj instanceof Character) {
            return new AnonymousClass8T8(obj.toString(), false);
        } else {
            if (obj instanceof Number) {
                return new AnonymousClass8TC((CharSequence) obj.toString());
            }
            if (obj instanceof Boolean) {
                if (Boolean.parseBoolean(obj.toString().toString())) {
                    return B4C.A01;
                }
                return B4C.A00;
            } else if (obj instanceof Pattern) {
                return new AnonymousClass8TA((Pattern) obj);
            } else {
                if (obj instanceof OffsetDateTime) {
                    return new AnonymousClass8T9(obj.toString());
                }
                throw new C21831Ab9("Could not determine value type");
            }
        }
    }

    public AnonymousClass8TB A02() {
        if (this instanceof AnonymousClass8TB) {
            return (AnonymousClass8TB) this;
        }
        throw C173738Sv.A00("Expected json node");
    }

    public AnonymousClass8TC A03() {
        if (this instanceof AnonymousClass8T8) {
            try {
                return new AnonymousClass8TC(C165617ti.A0b(((AnonymousClass8T8) this).A01));
            } catch (NumberFormatException unused) {
                return AnonymousClass8TC.A01;
            }
        } else if (this instanceof AnonymousClass8TC) {
            return (AnonymousClass8TC) this;
        } else {
            throw C173738Sv.A00("Expected number node");
        }
    }

    public AnonymousClass8T9 A04() {
        if (this instanceof AnonymousClass8T9) {
            return (AnonymousClass8T9) this;
        }
        throw C173738Sv.A00("Expected offsetDateTime node");
    }

    public AnonymousClass8T8 A05() {
        if (this instanceof AnonymousClass8T8) {
            return (AnonymousClass8T8) this;
        }
        if (this instanceof AnonymousClass8TC) {
            return new AnonymousClass8T8(((AnonymousClass8TC) this).A00.toString(), false);
        }
        throw C173738Sv.A00("Expected string node");
    }

    public AnonymousClass8TD A06() {
        if (this instanceof AnonymousClass8TD) {
            return (AnonymousClass8TD) this;
        }
        throw C173738Sv.A00("Expected value list node");
    }
}

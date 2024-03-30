package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.88J  reason: invalid class name */
public final class AnonymousClass88J extends C53062qe {
    public final long A00;
    public final Integer A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88J) {
                AnonymousClass88J r8 = (AnonymousClass88J) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00 && AnonymousClass00C.A0J(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return C36401kF.A02(this.A02, C36321k7.A00(this.A00, (A00(num).hashCode() + num.intValue()) * 31));
    }

    public /* synthetic */ AnonymousClass88J(Integer num, long j) {
        LinkedHashMap A1G = C36431kI.A1G();
        this.A01 = num;
        this.A00 = j;
        this.A02 = A1G;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 6:
                return "STREAM_ENDS";
            case 7:
                return "STREAM_ERROR";
            case 8:
                return "TOGGLE_TO_PHONE";
            case 9:
                return "TOGGLE_TO_SG";
            case 10:
                return "PHONE_SCREEN_ON";
            case 11:
                return "PROMPT_DOUBLE_CAPTURE_PRESS";
            case 12:
                return "STREAM_ENDING";
            case 13:
                return "TOGGLE_TO_SG_PRE_LIVE";
            case 14:
                return "TOGGLE_TO_SG_WHILE_LIVE";
            case 15:
                return "STREAM_BROADCASTING";
            case 16:
                return "PHONE_VIDEO_OFF";
            case 17:
                return "PHONE_SCREEN_OFF_PRE_LIVE";
            default:
                return "PROMPT_PHONE_VIDEO_OFF_ERROR";
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LifeCycleEvent(type=");
        A0u.append(A00(this.A01));
        A0u.append(", timestamp=");
        A0u.append(this.A00);
        A0u.append(", metadata=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}

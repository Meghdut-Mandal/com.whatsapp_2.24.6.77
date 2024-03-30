package X;

/* renamed from: X.9YA  reason: invalid class name */
public final class AnonymousClass9YA {
    public final AnonymousClass3K4 A00;
    public final AnonymousClass3IE A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9YA) {
                AnonymousClass9YA r5 = (AnonymousClass9YA) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C188238zG A00() {
        AnonymousClass3IE r5 = this.A01;
        boolean z = r5.A01;
        if (z && r5.A00 == 0) {
            return C188238zG.PUSH_TO_VIDEO_CAMERA_ENTRY_POINT_NUX;
        }
        if (z && r5.A00 == 1) {
            return C188238zG.PUSH_TO_VIDEO_CAMERA_ENTRY_POINT_NUX_NEW_USER_TEXT_A;
        }
        if (z && r5.A00 == 2) {
            return C188238zG.PUSH_TO_VIDEO_CAMERA_ENTRY_POINT_NUX_NEW_USER_TEXT_B;
        }
        if (z && r5.A00 == 3) {
            return C188238zG.PUSH_TO_VIDEO_FIRST_TIME_WATCHING_EDUCATIONAL_NUX;
        }
        AnonymousClass3K4 r1 = this.A00;
        if (!r1.A05) {
            return null;
        }
        int i = r1.A01;
        if (i == 0) {
            return C188238zG.PUSH_TO_RECORD_INSTRUCTION;
        }
        if (i == 1) {
            return C188238zG.PUSH_TO_VIDEO_NUX;
        }
        if (i == 2) {
            return C188238zG.RECORDER_MODE_CHANGED_INSTRUCTION;
        }
        if (i == 3) {
            return C188238zG.LOCK_INSTRUCTION;
        }
        return null;
    }

    public final boolean A01() {
        if (this.A00.A05 || this.A01.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass9YA(AnonymousClass3K4 r1, AnonymousClass3IE r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushToRecordMediaTipControllerState(pushToRecordToolTipUiState=");
        A0u.append(this.A00);
        A0u.append(", pushToVideoCameraEntryPointToolTipUiState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}

package X;

import com.whatsapp.R;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.io.File;

/* renamed from: X.2wJ  reason: invalid class name and case insensitive filesystem */
public class C56452wJ implements AnonymousClass4SQ {
    public Object A00;
    public final int A01;

    public C56452wJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BfD(C599035s r10) {
        C64933Qa r1;
        AnonymousClass6YP r4;
        if (this.A01 != 0) {
            MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
            C602537c r2 = r10.A01;
            if (r2 != null && (r1 = r2.A01) != null && r1.equals(messageReplyActivity.A0v.A1J) && (r4 = messageReplyActivity.A1E) != null) {
                r4.A0P(r2.A02, (File) null, true, false);
                return;
            }
            return;
        }
        C70803fk r42 = (C70803fk) this.A00;
        C602537c r3 = r10.A01;
        if (r3 != null) {
            C70803fk.A0j(r42);
            AnonymousClass3T1 r12 = r10.A00;
            if (r12 != null) {
                if (!(r12.A1J.A00 instanceof C177528dw)) {
                    r42.A2x.A0a(r12);
                } else {
                    return;
                }
            }
            if (r42.A5Z != null) {
                r42.A2R(r12, false);
                AnonymousClass6YP r13 = r42.A5Z;
                File file = r3.A02;
                File file2 = r3.A00;
                r13.A0P(file, file2, true, false);
                AnonymousClass6YP r43 = r42.A5Z;
                C1492470k r32 = r43.A12;
                C36351kA.A1E(r32.A0D, r43.A18, 11);
                r32.A02();
                r32.A03(R.drawable.ic_resume_draft_preview);
                r43.A10.Boy(new AnonymousClass73N(r43, file, file2, (Object) null, 14));
            }
        }
    }
}

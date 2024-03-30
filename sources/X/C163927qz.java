package X;

import android.util.SparseArray;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7qz  reason: invalid class name and case insensitive filesystem */
public class C163927qz implements AnonymousClass026 {
    public Object A00;
    public final int A01;

    public C163927qz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                ((C17300r3) this.A00).BwE(obj);
                return;
            case 1:
                SparseArray sparseArray = ((C140456lc) this.A00).A05;
                sparseArray.put(40, "");
                sparseArray.put(35, obj);
                return;
            case 2:
                C148836zV r4 = (C148836zV) this.A00;
                List<Object> list = (List) obj;
                AnonymousClass00C.A0D(list, 1);
                ArrayList A0J = C36321k7.A0J(list);
                for (Object A03 : list) {
                    A0J.add(Byte.valueOf((byte) ((int) (C36441kJ.A03(A03) * 100.0f))));
                }
                r4.A0B = C007103b.A0l(A0J);
                return;
            default:
                C148836zV r1 = (C148836zV) this.A00;
                List list2 = (List) obj;
                AnonymousClass00C.A0D(list2, 1);
                r1.A04 = null;
                VoiceVisualizer voiceVisualizer = ((VoiceRecordingView) r1.A0H).A07;
                if (voiceVisualizer == null) {
                    throw C36331k8.A0d("previewVoiceVisualizer");
                }
                voiceVisualizer.A03(list2, 0.0f);
                C148836zV.A01(r1);
                File file = r1.A08;
                if (file != null) {
                    C115355ik r0 = r1.A0E;
                    C158567hi r10 = r1.A0I;
                    C18800tq r3 = r0.A00.A01;
                    C19630wG A0W = C36351kA.A0W(r3);
                    C20810yC A0V = C36341k9.A0V(r3);
                    AnonymousClass17Y A0M = C36351kA.A0M(r3);
                    C19700wN A0V2 = C36391kE.A0V(r3);
                    C111695ch r9 = new C111695ch();
                    C18830tt r2 = r3.A00;
                    C148856zX r32 = new C148856zX(A0V2, A0M, A0W, A0V, (C29731Xt) r3.A81.get(), r9, r10, (AnonymousClass3QH) r2.A0H.get(), C18840tu.A00(r2.A1z), file);
                    r1.A07 = r32;
                    r32.A00 = r1;
                    return;
                }
                return;
        }
    }
}
